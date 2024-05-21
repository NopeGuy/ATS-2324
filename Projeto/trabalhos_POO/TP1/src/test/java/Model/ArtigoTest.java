import Model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testArtigo() {
        Artigo a = new Artigo("tipo", Artigo.Estado.NOVO, 0, Artigo.Avaliação.IMPECÁVEL, "descricao", "marca", "codigo", 10.0, 2.0, "transportadora");

        assertEquals("tipo", a.getTipo());
        assertEquals(Artigo.Estado.NOVO, a.getEstado());
        assertEquals(0, a.getNumeroDonos());
        assertEquals(Artigo.Avaliação.IMPECÁVEL, a.getAvaliacao());
        assertEquals("descricao", a.getDescricao());
        assertEquals("marca", a.getMarca());
        assertEquals("codigo", a.getCodigo());
        assertEquals(10.0, a.getPrecoBase(), 0.01);
        assertEquals(2.0, a.getCorrecaoPreco(), 0.01);
        assertEquals("transportadora", a.getTransportadora());
    }

    @Test
    public void testEquals() {
        Artigo a1 = new Artigo("tipo", Artigo.Estado.NOVO, 0, Artigo.Avaliação.IMPECÁVEL, "descricao", "marca", "codigo", 10.0, 2.0, "transportadora");
        Artigo a2 = new Artigo("tipo", Artigo.Estado.NOVO, 0, Artigo.Avaliação.IMPECÁVEL, "descricao", "marca", "codigo", 10.0, 2.0, "transportadora");

        assertTrue(a1.equals(a2));
    }

    @Test
    public void testToString() {
        Artigo a = new Artigo("tipo", Artigo.Estado.NOVO, 0, Artigo.Avaliação.IMPECÁVEL, "descricao", "marca", "codigo", 10.0, 2.0, "transportadora");

        String expected = "ID: 1\n" +
                          "Tipo: tipo\n" +
                          "Estado: NOVO\n" +
                          "Número de Donos: 0\n" +
                          "Avaliação: IMPECÁVEL\n" +
                          "Descrição: descricao\n" +
                          "Marca: marca\n" +
                          "Código: codigo\n" +
                          "Preço Base: 10.0\n" +
                          "Correção do Preço: 2.0\n" +
                          "Transportadora: transportadora\n";

        assertEquals(expected, a.toString(LocalDate.now()));
    }
}