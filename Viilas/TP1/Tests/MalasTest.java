package Tests;


import Model.Artigo;
import Model.Malas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class MalasTest {

    @Test
    public void testConstrutorPadrao() {
        Malas mala = new Malas();
        assertNull(mala.getTipo_mala());
        assertEquals(0, mala.getDim());
        assertEquals("", mala.getMaterial());
        assertEquals(0, mala.getAno_da_colecao());
    }

    @Test
    public void testConstrutorComParametros() {
        Malas.Tipos_Malas tipo = Malas.Tipos_Malas.PREMIUM;
        Malas mala = new Malas(tipo, 15.5f, "Couro", 2021, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");

        assertEquals(tipo, mala.getTipo_mala());
        assertEquals(15.5f, mala.getDim());
        assertEquals("Couro", mala.getMaterial());
        assertEquals(2021, mala.getAno_da_colecao());
        assertEquals("Tipo1", mala.getTipo());
        assertEquals(Artigo.Estado.NOVO, mala.getEstado());
        assertEquals(0, mala.getNumeroDonos());
        assertNull(mala.getAvaliacao());
        assertEquals("Descri��o1", mala.getDescricao());
        assertEquals("Marca1", mala.getMarca());
        assertEquals("C�digo1", mala.getCodigo());
        assertEquals(100.0, mala.getPrecoBase());
        assertEquals(10.0, mala.getCorrecaoPreco());
        assertEquals("Transportadora1", mala.getTransportadora());
    }

    @Test
    public void testSetters() {
        Malas mala = new Malas();
        mala.setTipo_mala(Malas.Tipos_Malas.NORMAL);
        assertEquals(Malas.Tipos_Malas.NORMAL, mala.getTipo_mala());

        mala.setDim(20.0f);
        assertEquals(20.0f, mala.getDim());

        mala.setMaterial("Sint�tico");
        assertEquals("Sint�tico", mala.getMaterial());

        mala.setAno_da_colecao(2020);
        assertEquals(2020, mala.getAno_da_colecao());
    }

    @Test
    public void testEquals() {
        Malas mala1 = new Malas(Malas.Tipos_Malas.PREMIUM, 15.5f, "Couro", 2021, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");
        Malas mala2 = new Malas(Malas.Tipos_Malas.PREMIUM, 15.5f, "Couro", 2021, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");
        Malas mala3 = new Malas(Malas.Tipos_Malas.NORMAL, 25.0f, "Tecido", 2019, "Tipo2", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Descri��o2", "Marca2", "C�digo2", 200.0, 20.0, "Transportadora2");

        assertTrue(mala1.equals(mala2));
        assertFalse(mala1.equals(mala3));
    }

    @Test
    public void testToString() {
        Malas mala = new Malas(Malas.Tipos_Malas.PREMIUM, 15.5f, "Couro", 2021, "Tipo1", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");
        LocalDate data = LocalDate.now();
        String esperado = "ID: " + mala.getId() + "\n" +
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
                "Tipo de mala: PREMIUM\n" +
                "Dimens�es: 15.5\n" +
                "Material: Couro\n" +
                "Ano da cole��o: 2021\n" +
                "Preco Final: 100.0\n";

        assertEquals(esperado, mala.toString(data));
    }

    @Test
    public void testClone() {
        Malas mala1 = new Malas(Malas.Tipos_Malas.PREMIUM, 15.5f, "Couro", 2021, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");
        Malas mala2 = mala1.clone();

        assertEquals(mala1, mala2);
        assertNotSame(mala1, mala2);
    }

    @Test
    public void testPrecoFinal() {
        Malas mala = new Malas(Malas.Tipos_Malas.PREMIUM, 25.0f, "Couro", 2021, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descri��o1", "Marca1", "C�digo1", 100.0, 10.0, "Transportadora1");
        LocalDate data = LocalDate.now();
        int difAno = data.getYear() - mala.getAno_da_colecao();

        double precoEsperado = 100.0 + (10.0 * difAno); // Pre�o base mais corre��o de pre�o para dimens�es entre 10 e 30

        assertEquals(precoEsperado, mala.precoFinal(data));
    }
}
