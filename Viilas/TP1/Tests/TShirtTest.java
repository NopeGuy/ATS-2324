package Tests;


import Model.Artigo;
import Model.TShirt;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class TShirtTest {

    @Test
    public void testConstrutorPadrao() {
        TShirt tshirt = new TShirt();
        assertNull(tshirt.getTamanho());
        assertNull(tshirt.getPadrao());
    }

    @Test
    public void testConstrutorComParametros() {
        TShirt.Tamanho tamanho = TShirt.Tamanho.M;
        TShirt.Padrao padrao = TShirt.Padrao.LISO;
        TShirt tshirt = new TShirt(tamanho, padrao, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");

        assertEquals(tamanho, tshirt.getTamanho());
        assertEquals(padrao, tshirt.getPadrao());
        assertEquals("Tipo1", tshirt.getTipo());
        assertEquals(Artigo.Estado.NOVO, tshirt.getEstado());
        assertEquals(0, tshirt.getNumeroDonos());
        assertNull(tshirt.getAvaliacao());
        assertEquals("Descri��o1", tshirt.getDescricao());
        assertEquals("Marca1", tshirt.getMarca());
        assertEquals("C�digo1", tshirt.getCodigo());
        assertEquals(100.0, tshirt.getPrecoBase());
        assertEquals(10.0, tshirt.getCorrecaoPreco());
        assertEquals("Transportadora1", tshirt.getTransportadora());
    }

    @Test
    public void testSetters() {
        TShirt tshirt = new TShirt();
        tshirt.setTamanho(TShirt.Tamanho.L);
        assertEquals(TShirt.Tamanho.L, tshirt.getTamanho());

        tshirt.setPadrao(TShirt.Padrao.RISCAS);
        assertEquals(TShirt.Padrao.RISCAS, tshirt.getPadrao());
    }

    @Test
    public void testEquals() {
        TShirt tshirt1 = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.LISO, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");
        TShirt tshirt2 = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.LISO, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");
        TShirt tshirt3 = new TShirt(TShirt.Tamanho.L, TShirt.Padrao.RISCAS, "Tipo2", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Descri��o2", "Marca2", "C�digo2", 200.0, 20.0, "Transportadora2");

        assertTrue(tshirt1.equals(tshirt2));
        assertFalse(tshirt1.equals(tshirt3));
    }

    @Test
    public void testToString() {
        TShirt tshirt = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.LISO, "Tipo1", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");
        LocalDate data = LocalDate.now();
        String esperado = "ID: " + tshirt.getId() + "\n" +
                "Tipo: Tipo1\n" +
                "Estado: USADO\n" +
                "N�mero de Donos: 1\n" +
                "Avalia��o: BOM\n" +
                "Descri��o: Descri��o1\n" +
                "Marca: Marca1\n" +
                "C�digo: C�digo1\n" +
                "Pre�o Base: 100.0\n" +
                "Corre��o do Pre�o: 10.0\n" +
                "Transportadora: Transportadora1\n" +
                "Tamanho: M\n" +
                "Padrao: LISO\n" +
                "Pre�o Final: 100.0\n";

        assertEquals(esperado, tshirt.toString(data));
    }

    @Test
    public void testClone() {
        TShirt tshirt1 = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.LISO, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");
        TShirt tshirt2 = tshirt1.clone();

        assertEquals(tshirt1, tshirt2);
        assertNotSame(tshirt1, tshirt2);
    }

    @Test
    public void testPrecoFinal() {
        TShirt tshirt = new TShirt(TShirt.Tamanho.M, TShirt.Padrao.RISCAS, "Tipo1", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");
        LocalDate data = LocalDate.now();
        assertEquals(50.0, tshirt.precoFinal(data));
    }
}
