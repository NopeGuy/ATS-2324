import Model.TShirt;
import Model.Artigo;
import Model.Estado;
import Model.Avaliação;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class TShirtTest {

    @Test
    public void testTShirtConstruction() {
        TShirt tShirt = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.RISCAS, "Camiseta", Estado.NOVO, 0, Avaliação.BOM, "Descrição", "Marca", "123", 20.0, 0.1, "T");
        assertEquals(TShirt.Tamanho.M, tShirt.getTamanho());
        assertEquals(TShirt.Padrao.RISCAS, tShirt.getPadrao());
        assertEquals("Camisa", tShirt.getTipo());
        assertEquals(Estado.NOVO, tShirt.getEstado());
        assertEquals(0, tShirt.getNumeroDonos());
        assertEquals(Avaliação.BOM, tShirt.getAvaliacao());
        assertEquals("Descrição", tShirt.getDescricao());
        assertEquals("Marca", tShirt.getMarca());
        assertEquals("COD001", tShirt.getCodigo());
        assertEquals(20.0, tShirt.getPrecoBase(), 0.001);
        assertEquals(0.1, tShirt.getCorrecaoPreco(), 0.001);
        assertEquals("T-SHIRT", tShirt.getT());
    }

    @Test
    public void testPrecoFinalWithoutDiscount() {
        TShirt tShirt = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.LISO, "Camiseta", Estado.NOVO, 0, Avaliação.BOM, "Descrição", "Marca", "123", 20.0, 0.1, "T");
        assertEquals(20.0, tShirt.precoFinal(null), 0.001);
    }

    @Test
    public void testPrecoFinalWithDiscount() {
        TShirt tShirt = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.RISCAS, "Camiseta", Estado.NOVO, 1, Avaliação.BOM, "Descrição", "Marca", "123", 20.0, 0.1, "T");
        assertEquals(10.0, tShirt.precoFinal(null), 0.001);
    }

    @Test
    public void testEquals() {
        TShirt tShirt1 = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.RISCAS, "Camiseta", Estado.NOVO, 0, Avaliação.BOM, "Descrição", "Marca", "123", 20.0, 0.1, "T");
        TShirt tShirt2 = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.RISCAS, "Camiseta", Estado.NOVO, 0, Avaliação.BOM, "Descrição", "Marca", "123", 20.0, 0.1, "T");
        TShirt tShirt3 = new TShirt(TShirt.Tamanho.L, TShirt.Padrao.LISO, "Camiseta", Estado.NOVO, 0, Avaliação.BOM, "Descrição", "Marca", "123", 20.0, 0.1, "T");

        assertEquals(tShirt1, tShirt1);
        assertEquals(tShirt1, tShirt2);
        assertNotEquals(tShirt1, tShirt3);
        assertNotEquals(tShirt1, null);
        assertNotEquals(tShirt1, new Object());
    }

    @Test
    public void testClone() {
        TShirt tShirt = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.RISCAS, "Camiseta", Estado.NOVO, 0, Avaliação.BOM, "Descrição", "Marca", "123", 20.0, 0.1, "T");
        TShirt clonedTShirt = tShirt.clone();
        assertEquals(tShirt, clonedTShirt);
        assertNotSame(tShirt, clonedTShirt);
    }

    @Test
    public void testSerializable() throws IOException, ClassNotFoundException {
        TShirt tShirt = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.RISCAS, "Camiseta", Estado.NOVO, 0, Avaliação.BOM, "Descrição", "Marca", "123", 20.0, 0.1, "T");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(tShirt);
        oos.flush();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        TShirt deserializedTShirt = (TShirt) ois.readObject();

        assertEquals(tShirt, deserializedTShirt);
    }
}
