import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GestorEncomendasTest {

    @Test
    public void testConstrutorVazio() {
        GestorEncomendas gestor = new GestorEncomendas();
        assertTrue(gestor.getEncomendas().isEmpty());
    }

    @Test
    public void testConstrutorParametrizado() {
        Map<Long, Encomenda> encomendas = new HashMap<>();
        Encomenda encomenda = new Encomenda();
        encomendas.put(1L, encomenda);
        GestorEncomendas gestor = new GestorEncomendas(encomendas);
        assertEquals(1, gestor.getEncomendas().size());
        assertEquals(encomenda, gestor.getEncomendas().get(1L));
    }

    @Test
    public void testConstrutorCopia() {
        Map<Long, Encomenda> encomendas = new HashMap<>();
        Encomenda encomenda = new Encomenda();
        encomendas.put(1L, encomenda);
        GestorEncomendas gestor1 = new GestorEncomendas(encomendas);
        GestorEncomendas gestor2 = new GestorEncomendas(gestor1);
        assertEquals(gestor1, gestor2);
        assertNotSame(gestor1, gestor2);
    }

    @Test
    public void testSetEncomendas() {
        GestorEncomendas gestor = new GestorEncomendas();
        Map<Long, Encomenda> encomendas = new HashMap<>();
        Encomenda encomenda = new Encomenda();
        encomendas.put(1L, encomenda);
        gestor.setEncomendas(encomendas);
        assertEquals(1, gestor.getEncomendas().size());
        assertEquals(encomenda, gestor.getEncomendas().get(1L));
    }

    @Test
    public void testAddEncomenda() throws EncomendaExistenteException {
        GestorEncomendas gestor = new GestorEncomendas();
        Encomenda encomenda = new Encomenda();
        gestor.adicionaEncomenda(encomenda);
        assertEquals(1, gestor.getEncomendas().size());
        assertTrue(gestor.getEncomendas().containsValue(encomenda));
    }

    @Test
    public void testRemoveEncomenda() throws EncomendaNaoEncontradaException, EncomendaExistenteException {
        GestorEncomendas gestor = new GestorEncomendas();
        Encomenda encomenda = new Encomenda();
        gestor.adicionaEncomenda(encomenda);
        gestor.removeEncomenda(encomenda.getId());
        assertFalse(gestor.getEncomendas().containsKey(encomenda.getId()));
    }

    @Test
    public void testNumeroArtigosEncomenda() throws ArtigoExistenteException, EncomendaExistenteException, EncomendaNaoEncontradaException {
        GestorEncomendas gestor = new GestorEncomendas();
        Encomenda encomenda = new Encomenda();
        encomenda.adicionaArtigo("Artigo1");
        gestor.adicionaEncomenda(encomenda);
        assertEquals(1, gestor.getEncomenda(encomenda.getId()));
    }

    @Test
    public void testEncomendaToString() throws EncomendaNaoEncontradaException, EncomendaExistenteException {
        GestorEncomendas gestor = new GestorEncomendas();
        Encomenda encomenda = new Encomenda();
        gestor.adicionaEncomenda(encomenda);
        String expected = encomenda.toString();
        assertEquals(expected, gestor.encomendaToString(encomenda.getId()));
    }

    @Test
    public void testEncomendasToString() throws EncomendaExistenteException {
        GestorEncomendas gestor = new GestorEncomendas();
        Encomenda encomenda1 = new Encomenda();
        Encomenda encomenda2 = new Encomenda();
        gestor.adicionaEncomenda(encomenda1);
        gestor.adicionaEncomenda(encomenda2);
        Set<Long> ids = new HashSet<>();
        ids.add(encomenda1.getId());
        ids.add(encomenda2.getId());
        String expected = encomenda1.toString() + "\n" + encomenda2.toString() + "\n";
        assertEquals(expected, gestor.encomendasToString(ids));
    }

    @Test
    public void testFinalizadaToExpedida() throws EncomendaNaoEncontradaException, EncomendaExistenteException {
        GestorEncomendas gestor = new GestorEncomendas();
        Encomenda encomenda = new Encomenda();
        gestor.adicionaEncomenda(encomenda);
        LocalDate data = LocalDate.of(2023, 1, 1);
        gestor.FinalizadaToExpedida(encomenda.getId(), data);
        assertEquals(Estado.Expedida, encomenda.getEstado());
        assertEquals(data, encomenda.getDataEntrega());
    }

    @Test
    public void testGetEncomenda() throws EncomendaNaoEncontradaException, EncomendaExistenteException {
        GestorEncomendas gestor = new GestorEncomendas();
        Encomenda encomenda = new Encomenda();
        gestor.adicionaEncomenda(encomenda);
        Encomenda retrieved = gestor.getEncomenda(encomenda.getId());
        assertEquals(encomenda, retrieved);
        assertNotSame(encomenda, retrieved);
    }

    @Test
    public void testTamanhoEncomenda() throws ArtigoExistenteException, EncomendaExistenteException {
        GestorEncomendas gestor = new GestorEncomendas();
        Encomenda encomenda = new Encomenda();
        encomenda.adicionaArtigo("Artigo1");
        encomenda.adicionaArtigo("Artigo2");
        gestor.adicionaEncomenda(encomenda);
        assertEquals(2, gestor.tamanhoEncomenda(encomenda.getId()));
    }
}
