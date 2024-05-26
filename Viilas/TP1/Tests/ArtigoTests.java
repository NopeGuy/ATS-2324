package Tests;

import Model.Artigo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class ArtigoTests {

    @Test
    public void testConstrutorPadrao() {
        Artigo artigo = new ArtigoImpl();
        assertEquals(1, artigo.getId());
        assertEquals("", artigo.getTipo());
        assertNull(artigo.getEstado());
        assertEquals(0, artigo.getNumeroDonos());
        assertNull(artigo.getAvaliacao());
        assertEquals("", artigo.getDescricao());
        assertEquals("", artigo.getMarca());
        assertEquals("", artigo.getCodigo());
        assertEquals(0, artigo.getPrecoBase());
        assertEquals(0, artigo.getCorrecaoPreco());
        assertNull(artigo.getTransportadora());
    }

    @Test
    public void testConstrutorComParametros() {
        Artigo.Estado estado = Artigo.Estado.USADO;
        Artigo.Avaliacao avaliacao = Artigo.Avaliacao.BOM;
        Artigo artigo = new ArtigoImpl("Tipo1", estado, 2, avaliacao, "Descrição1", "Marca1", "Código1", 100.0, 10.0, "Transportadora1");

        assertEquals(2, artigo.getId()); // Pressupondo que é o segundo artigo a ser criado
        assertEquals("Tipo1", artigo.getTipo());
        assertEquals(estado, artigo.getEstado());
        assertEquals(2, artigo.getNumeroDonos());
        assertEquals(avaliacao, artigo.getAvaliacao());
        assertEquals("Descrição1", artigo.getDescricao());
        assertEquals("Marca1", artigo.getMarca());
        assertEquals("Código1", artigo.getCodigo());
        assertEquals(100.0, artigo.getPrecoBase());
        assertEquals(10.0, artigo.getCorrecaoPreco());
        assertEquals("Transportadora1", artigo.getTransportadora());
    }

    @Test
    public void testSetters() {
        Artigo artigo = new ArtigoImpl();
        artigo.setTipo("NovoTipo");
        assertEquals("NovoTipo", artigo.getTipo());

        artigo.setEstado(Artigo.Estado.NOVO);
        assertEquals(Artigo.Estado.NOVO, artigo.getEstado());

        artigo.setNumeroDonos(1);
        assertEquals(1, artigo.getNumeroDonos());

        artigo.setAvaliacao(Artigo.Avaliacao.IMPECÁVEL);
        assertEquals(Artigo.Avaliacao.IMPECÁVEL, artigo.getAvaliacao());

        artigo.setDescricao("NovaDescrição");
        assertEquals("NovaDescrição", artigo.getDescricao());

        artigo.setMarca("NovaMarca");
        assertEquals("NovaMarca", artigo.getMarca());

        artigo.setCodigo("NovoCódigo");
        assertEquals("NovoCódigo", artigo.getCodigo());

        artigo.setPrecoBase(200.0);
        assertEquals(200.0, artigo.getPrecoBase());

        artigo.setCorrecaoPreco(20.0);
        assertEquals(20.0, artigo.getCorrecaoPreco());

        artigo.setTransportadora("NovaTransportadora");
        assertEquals("NovaTransportadora", artigo.getTransportadora());
    }

    @Test
    public void testEquals() {
        Artigo artigo1 = new ArtigoImpl("Tipo1", Artigo.Estado.NOVO, 0, null, "Descrição1", "Marca1", "Código1", 100.0, 10.0, "Transportadora1");
        Artigo artigo2 = new ArtigoImpl("Tipo1", Artigo.Estado.NOVO, 0, null, "Descrição1", "Marca1", "Código1", 100.0, 10.0, "Transportadora1");
        Artigo artigo3 = new ArtigoImpl("Tipo2", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Descrição2", "Marca2", "Código2", 200.0, 20.0, "Transportadora2");

        assertTrue(artigo1.equals(artigo2));
        assertFalse(artigo1.equals(artigo3));
    }

    @Test
    public void testToString() {
        Artigo artigo = new ArtigoImpl("Tipo1", Artigo.Estado.USADO, 1, Artigo.Avaliacao.BOM, "Descrição1", "Marca1", "Código1", 100.0, 10.0, "Transportadora1");
        LocalDate data = LocalDate.now();
        String esperado = "ID: " + artigo.getId() + "\n" +
                "Tipo: Tipo1\n" +
                "Estado: USADO\n" +
                "Número de Donos: 1\n" +
                "Avaliação: BOM\n" +
                "Descrição: Descrição1\n" +
                "Marca: Marca1\n" +
                "Código: Código1\n" +
                "Preço Base: 100.0\n" +
                "Correção do Preço: 10.0\n" +
                "Transportadora: Transportadora1\n";

        assertEquals(esperado, artigo.toString(data));
    }

    // Classe auxiliar para permitir testes de uma classe abstrata
    private static class ArtigoImpl extends Artigo {
        public ArtigoImpl() {
            super();
        }

        public ArtigoImpl(String tipo, Estado estado, int numeroDonos, Avaliacao avaliacao, String descricao, String marca, String codigo, double precoBase, double correcaoPreco, String transportadora) {
            super(tipo, estado, numeroDonos, avaliacao, descricao, marca, codigo, precoBase, correcaoPreco, transportadora);
        }

        @Override
        public double precoFinal(LocalDate data) {
            return 0;
        }

        @Override
        public Artigo clone() {
            return new ArtigoImpl(getTipo(), getEstado(), getNumeroDonos(), getAvaliacao(), getDescricao(), getMarca(), getCodigo(), getPrecoBase(), getCorrecaoPreco(), getTransportadora());
        }
    }
}
