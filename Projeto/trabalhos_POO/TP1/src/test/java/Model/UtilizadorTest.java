import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.Artigo;
import Model.Utilizador;

public class UtilizadorTest {

    private Utilizador utilizador;

    @BeforeEach
    public void setUp() {
        utilizador = new Utilizador("test@example.com", "password", "Test User", "Test Address", 123456789,
                new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new HashMap<>());
    }

    @Test
    public void testConstructorAndGetters() {
        assertEquals("test@example.com", utilizador.getEmail());
        assertEquals("password", utilizador.getPassword());
        assertEquals("Test User", utilizador.getNome());
        assertEquals("Test Address", utilizador.getMorada());
        assertEquals(123456789, utilizador.getNif());
        assertNotNull(utilizador.getCompras());
        assertNotNull(utilizador.getPorVender());
        assertNotNull(utilizador.getVendas());
        assertNotNull(utilizador.getFaturacao());
    }

    @Test
    public void testSetters() {
        utilizador.setEmail("new@example.com");
        assertEquals("new@example.com", utilizador.getEmail());

        utilizador.setPassword("newpassword");
        assertEquals("newpassword", utilizador.getPassword());

        utilizador.setNome("New User");
        assertEquals("New User", utilizador.getNome());

        utilizador.setMorada("New Address");
        assertEquals("New Address", utilizador.getMorada());

        utilizador.setNif(987654321);
        assertEquals(987654321, utilizador.getNif());

        List<Artigo> compras = new ArrayList<>();
        compras.add(new Artigo());
        utilizador.setCompras(compras);
        assertEquals(compras, utilizador.getCompras());

        List<Artigo> porVender = new ArrayList<>();
        porVender.add(new Artigo());
        utilizador.setPorVender(porVender);
        assertEquals(porVender, utilizador.getPorVender());

        List<Artigo> vendas = new ArrayList<>();
        vendas.add(new Artigo());
        utilizador.setVendas(vendas);
        assertEquals(vendas, utilizador.getVendas());

        Map<LocalDate, Double> faturacao = new HashMap<>();
        faturacao.put(LocalDate.now(), 100.0);
        utilizador.setFaturacao(faturacao);
        assertEquals(faturacao, utilizador.getFaturacao());
    }

    @Test
    public void testClone() {
        Utilizador clone = utilizador.clone();
        assertEquals(utilizador, clone);
        assertNotSame(utilizador, clone);
    }

    @Test
    public void testEquals() {
        Utilizador sameUtilizador = new Utilizador("test@example.com", "password", "Test User", "Test Address",
                123456789, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new HashMap<>());
        Utilizador differentUtilizador = new Utilizador("different@example.com", "password", "Different User",
                "Different Address", 987654321, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),
                new HashMap<>());

        assertEquals(utilizador, utilizador);
        assertEquals(utilizador, sameUtilizador);
        assertNotEquals(utilizador, differentUtilizador);
        assertNotEquals(utilizador, null);
        assertNotEquals(utilizador, new Object());
    }

    @Test
    public void testRemovePorVender() {
        Artigo artigo = new Artigo();
        utilizador.adicionarPorVender(artigo);
        assertEquals(1, utilizador.getPorVender().size());
        assertEquals(artigo, utilizador.removePorVender(artigo.getId()));
        assertEquals(0, utilizador.getPorVender().size());
    }

    @Test
    public void testRemoveVenda() {
        Artigo artigo = new Artigo();
        utilizador.adicionaVendas(artigo);
        assertEquals(1, utilizador.getVendas().size());
        utilizador.removeVenda(artigo.getId());
        assertEquals(0, utilizador.getVendas().size());
    }

    @Test
    public void testAdicionaCompra() {
        Artigo artigo = new Artigo();
        utilizador.adicionaCompra(artigo);
        assertEquals(1, utilizador.getCompras().size());
        assertTrue(utilizador.getCompras().contains(artigo));
    }

    @Test
    public void testAdicionaFaturacao() {
        LocalDate date = LocalDate.now();
        double valor = 100.0;
        utilizador.adicionaFaturacao(date, valor);
        assertTrue(utilizador.getFaturacao().containsKey(date));
        assertEquals(valor, utilizador.getFaturacao().get(date));
    }

    @Test
    public void testRemoveFaturacao() {
        LocalDate date = LocalDate.now();
        double valor = 100.0;
        utilizador.adicionaFaturacao(date, valor);
        assertTrue(utilizador.getFaturacao().containsKey(date));
        utilizador.removeFaturacao(date, valor);
        assertFalse(utilizador.getFaturacao().containsKey(date));
    }

    @Test
    public void testCalculaFaturacaoSempre() {
        Map<LocalDate, Double> faturacao = new HashMap<>();
        faturacao.put(LocalDate.now(), 100.0);
        faturacao.put(LocalDate.now().minusDays(1), 200.0);
        faturacao.put(LocalDate.now().minusDays(2), 300.0);
        utilizador.setFaturacao(faturacao);
        assertEquals(600.0, utilizador.calculaFaturacaoSempre());
    }

    @Test
    public void testCalculaFaturacaoIntervalo() {
        Map<LocalDate, Double> faturacao = new HashMap<>();
        faturacao.put(LocalDate.now(), 100.0);
        faturacao.put(LocalDate.now().minusDays(1), 200.0);
        faturacao.put(LocalDate.now().minusDays(2), 300.0);
        utilizador.setFaturacao(faturacao);
        LocalDate before = LocalDate.now().minusDays(3);
        LocalDate after = LocalDate.now().minusDays(1);
        assertEquals(500.0, utilizador.calculaFaturacaoIntervalo(before, after));
    }
}

