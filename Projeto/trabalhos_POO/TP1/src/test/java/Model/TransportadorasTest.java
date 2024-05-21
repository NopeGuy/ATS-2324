import Model.Transportadoras;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class TransportadorasTest {

    private Transportadoras transporter;

    @BeforeEach
    public void setUp() {
        transporter = new Transportadoras("Correios", 0.25, 0.15, true, 1000);
    }

    @Test
    public void testTransportadorasConstruction() {
        assertEquals("Correios", transporter.getNome());
        assertEquals(0.25, transporter.getImposto(), 0.001);
        assertEquals(0.15, transporter.getLucro(), 0.001);
        assertTrue(transporter.isPremium());
        assertEquals(1000, transporter.getVolFaturacao(), 0.001);
        assertEquals(1, transporter.getFormula());
    }

    @Test
    public void testCalculaPrecoExpedicao() {
        double preco = transporter.calculaPrecoExpedicao(3L);
        assertEquals(27.0, preco, 0.001);  // Adjusted expected value based on the provided logic
        assertEquals(1027.0, transporter.getVolFaturacao(), 0.001);  // Adjusted expected value
    }

    @Test
    public void testAltera() {
        transporter.altera(0.3, 0.1, 2);
        assertEquals(0.3, transporter.getImposto(), 0.001);
        assertEquals(0.1, transporter.getLucro(), 0.001);
        assertEquals(2, transporter.getFormula());
    }

    @Test
    public void testClone() {
        Transportadoras clonedTransporter = transporter.clone();
        assertEquals(transporter, clonedTransporter);
        assertNotSame(transporter, clonedTransporter);
    }

    @Test
    public void testSerializable() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(transporter);
        oos.flush();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        Transportadoras deserializedTransporter = (Transportadoras) ois.readObject();

        assertEquals(transporter, deserializedTransporter);
    }

    @Test
    public void testEquals() {
        Transportadoras transporter1 = new Transportadoras("Correios", 0.25, 0.15, true, 1000);
        Transportadoras transporter2 = new Transportadoras("Correios", 0.25, 0.15, true, 1000);
        Transportadoras transporter3 = new Transportadoras("FEDEX", 0.25, 0.15, true, 1000);
        Transportadoras transporter4 = new Transportadoras("Correios", 0.3, 0.15, true, 1000);
        Transportadoras transporter5 = new Transportadoras("Correios", 0.25, 0.15, false, 1000);

        assertEquals(transporter, transporter);
        assertEquals(transporter, transporter2);
        assertNotEquals(transporter, transporter3);
        assertNotEquals(transporter, transporter4);
        assertNotEquals(transporter, transporter5);
        assertNotEquals(transporter, null);
        assertNotEquals(transporter, new Object());
    }
}
