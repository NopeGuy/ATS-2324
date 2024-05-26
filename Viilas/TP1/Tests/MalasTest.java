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
        Malas mala = new Malas(tipo, 15.5f, "Couro", 2021, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descrição1", "Marca1", "Código1", 100.0, 10.0, "Transportadora1");

        assertEquals(tipo, mala.getTipo_mala());
        assertEquals(15.5f, mala.getDim());
        assertEquals("Couro", mala.getMaterial());
        assertEquals(2021, mala.getAno_da_colecao());
        assertEquals("Tipo1", mala.getTipo());
        assertEquals(Artigo.Estado.NOVO, mala.getEstado());
        assertEquals(0, mala.getNumeroDonos());
        assertNull(mala.getAvaliacao());
        assertEquals("Descrição1", mala.getDescricao());
        assertEquals("Marca1", mala.getMarca());
        assertEquals("Código1", mala.getCodigo());
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

        mala.setMaterial("Sintético");
        assertEquals("Sintético", mala.getMaterial());

        mala.setAno_da_colecao(2020);
        assertEquals(2020, mala.getAno_da_colecao());
    }

    @Test
    public void testEquals() {
        Malas mala1 = new Malas(Malas.Tipos_Malas.PREMIUM, 15.5f, "Couro", 2021, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descrição1", "Marca1", "Código1", 100.0, 10.0, "Transportadora1");
        Malas mala2 = new Malas(Malas.Tipos_Malas.PREMIUM, 15.5f, "Couro", 2021, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descrição1", "Marca1", "Código1", 100.0, 10.0, "Transportadora1");
        Malas mala3 = new Malas(Malas.Tipos_Malas.NORMAL, 25.0f, "Tecido", 2019, "Tipo2", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Descrição2", "Marca2", "Código2", 200.0, 20.0, "Transportadora2");

        assertTrue(mala1.equals(mala2));
        assertFalse(mala1.equals(mala3));
    }

    @Test
    public void testToString() {
        Malas mala = new Malas(Malas.Tipos_Malas.PREMIUM, 15.5f, "Couro", 2021, "Tipo1", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Descrição1", "Marca1", "Código1", 100.0, 10.0, "Transportadora1");
        LocalDate data = LocalDate.now();
        String esperado = "ID: " + mala.getId() + "\n" +
                "Tipo: Tipo1\n" +
                "Estado: USADO\n" +
                "Número de Donos: 1\n" +
                "Avaliação: BOM\n" +
                "Descrição: Descrição1\n" +
                "Marca: Marca1\n" +
                "Código: Código1\n" +
                "Preço Base: 100.0\n" +
                "Correção do Preço: 10.0\n" +
                "Transportadora: Transportadora1\n" +
                "Tipo de mala: PREMIUM\n" +
                "Dimensões: 15.5\n" +
                "Material: Couro\n" +
                "Ano da coleção: 2021\n" +
                "Preco Final: 100.0\n";

        assertEquals(esperado, mala.toString(data));
    }

    @Test
    public void testClone() {
        Malas mala1 = new Malas(Malas.Tipos_Malas.PREMIUM, 15.5f, "Couro", 2021, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descrição1", "Marca1", "Código1", 100.0, 10.0, "Transportadora1");
        Malas mala2 = mala1.clone();

        assertEquals(mala1, mala2);
        assertNotSame(mala1, mala2);
    }

    @Test
    public void testPrecoFinal() {
        Malas mala = new Malas(Malas.Tipos_Malas.PREMIUM, 25.0f, "Couro", 2021, "Tipo1", Artigo.Estado.NOVO, 0, null, "Descrição1", "Marca1", "Código1", 100.0, 10.0, "Transportadora1");
        LocalDate data = LocalDate.now();
        int difAno = data.getYear() - mala.getAno_da_colecao();

        double precoEsperado = 100.0 + (10.0 * difAno); // Preço base mais correção de preço para dimensões entre 10 e 30

        assertEquals(precoEsperado, mala.precoFinal(data));
    }
}
