import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.*;

public class VintageTest {

    @Test
    public void testConstrutorVazio() {
        Vintage vintage = new Vintage();
        assertNull(vintage.getSessaoAtual());
        assertTrue(vintage.getUtilizadores().isEmpty());
        assertTrue(vintage.getEncomendas().isEmpty());
        assertTrue(vintage.getTransportadoras().isEmpty());
        assertEquals(LocalDate.now(), vintage.getDataPrograma());
    }

    @Test
    public void testConstrutorParametrizado() {
        Map<String, Utilizador> utilizadores = new HashMap<>();
        utilizadores.put("user1", new Utilizador("user1", "password"));

        List<Encomenda> encomendas = new ArrayList<>();
        Encomenda encomenda = new Encomenda();
        encomendas.add(encomenda);

        Map<String, Transportadoras> transportadoras = new HashMap<>();
        Transportadoras transportadora = new Transportadoras("Transportadora1", true);
        transportadoras.put("Transportadora1", transportadora);

        LocalDate dataPrograma = LocalDate.of(2023, 1, 1);

        Vintage vintage = new Vintage("user1", utilizadores, encomendas, transportadoras, dataPrograma);

        assertEquals("user1", vintage.getSessaoAtual());
        assertEquals(utilizadores, vintage.getUtilizadores());
        assertEquals(encomendas, vintage.getEncomendas());
        assertEquals(transportadoras, vintage.getTransportadoras());
        assertEquals(dataPrograma, vintage.getDataPrograma());
    }

    @Test
    public void testGetSetSessaoAtual() {
        Vintage vintage = new Vintage();
        vintage.SetSessaoAtual("user1");
        assertEquals("user1", vintage.getSessaoAtual());
    }

    @Test
    public void testGetSetUtilizadores() {
        Vintage vintage = new Vintage();
        Map<String, Utilizador> utilizadores = new HashMap<>();
        utilizadores.put("user1", new Utilizador("user1", "password"));
        vintage.setUtizadores(utilizadores);
        assertEquals(utilizadores, vintage.getUtilizadores());
    }

    @Test
    public void testGetSetEncomendas() {
        Vintage vintage = new Vintage();
        List<Encomenda> encomendas = new ArrayList<>();
        Encomenda encomenda = new Encomenda();
        encomendas.add(encomenda);
        vintage.setEncomendas(encomendas);
        assertEquals(encomendas, vintage.getEncomendas());
    }

    @Test
    public void testGetSetTransportadoras() {
        Vintage vintage = new Vintage();
        Map<String, Transportadoras> transportadoras = new HashMap<>();
        Transportadoras transportadora = new Transportadoras("Transportadora1", true);
        transportadoras.put("Transportadora1", transportadora);
        vintage.setTransportadoras(transportadoras);
        assertEquals(transportadoras, vintage.getTransportadoras());
    }

    @Test
    public void testGetSetDataPrograma() {
        Vintage vintage = new Vintage();
        LocalDate dataPrograma = LocalDate.of(2023, 1, 1);
        vintage.setDataPrograma(dataPrograma);
        assertEquals(dataPrograma, vintage.getDataPrograma());
    }

    @Test
    public void testEquals() {
        Map<String, Utilizador> utilizadores = new HashMap<>();
        utilizadores.put("user1", new Utilizador("user1", "password"));

        List<Encomenda> encomendas = new ArrayList<>();
        Encomenda encomenda = new Encomenda();
        encomendas.add(encomenda);

        Map<String, Transportadoras> transportadoras = new HashMap<>();
        Transportadoras transportadora = new Transportadoras("Transportadora1", true);
        transportadoras.put("Transportadora1", transportadora);

        LocalDate dataPrograma = LocalDate.of(2023, 1, 1);

        Vintage vintage1 = new Vintage("user1", utilizadores, encomendas, transportadoras, dataPrograma);
        Vintage vintage2 = new Vintage("user1", utilizadores, encomendas, transportadoras, dataPrograma);

        assertEquals(vintage1, vintage2);
    }

    @Test
    public void testAddUtilizador() {
        Vintage vintage = new Vintage();
        Utilizador user = new Utilizador("user1", "password");
        vintage.adicionaUtilizador(user);
        assertEquals(user, vintage.getUtilizadores().get("user1"));
    }

    @Test
    public void testAdicionarTransportadora() {
        Vintage vintage = new Vintage();
        Transportadoras transportadora = new Transportadoras("Transportadora1", true);
        vintage.adicionarTransportadora(transportadora);
        assertEquals(transportadora, vintage.getTransportadoras().get("Transportadora1"));
    }

    @Test
    public void testAdicionarEncomenda() {
        Vintage vintage = new Vintage();
        Encomenda encomenda = new Encomenda();
        vintage.addEncomenda(encomenda);
        assertTrue(vintage.getEncomendas().contains(encomenda));
    }

    @Test
    public void testAvancarTempo() {
        Vintage vintage = new Vintage();
        Encomenda encomenda = new Encomenda();
        encomenda.setPrazoLimite(LocalDate.now().minusDays(1));
        vintage.addEncomenda(encomenda);
        vintage.setDataPrograma(LocalDate.now().plusDays(1));
        vintage.avancarTempo();
        assertEquals(Estado_Encomenda.FINALIZADA, encomenda.getEstado());
    }

    @Test
    public void testDevolverEncomenda() {
        Vintage vintage = new Vintage();
        Encomenda encomenda = new Encomenda();
        encomenda.setId(1);
        encomenda.setDono("user1");
        vintage.addEncomenda(encomenda);
        vintage.setDataPrograma(LocalDate.now());
        vintage.devolverEncomenda(1);
        assertEquals(Estado_Encomenda.DEVOLVIDA, encomenda.getEstado());
    }

    @Test
    public void testCalculaCustoExpedicao() {
        Vintage vintage = new Vintage();
        Transportadoras transportadora = new Transportadoras("Transportadora1", true);
        transportadora.setPrecoExpedicao(10.0);
        vintage.adicionarTransportadora(transportadora);
        Artigo artigo = new Artigo();
        artigo.setTransportadora("Transportadora1");
        List<Artigo> artigosEncomenda = new ArrayList<>();
        artigosEncomenda.add(artigo);
        double custo = vintage.calculaCustoExpedicao(artigosEncomenda);
        assertEquals(10.0, custo);
    }

    @Test
    public void testTop10Vendedores() {
        Vintage vintage = new Vintage();
        Utilizador user = new Utilizador("user1", "password");
        vintage.adicionaUtilizador(user);
        Artigo artigo = new Artigo();
        artigo.setPrecoBase(100.0);
        user.adicionaVenda(artigo);
        Map<String, Double> top10 = vintage.top10Vendedores(LocalDate.now().minusDays(1));
        assertEquals(1, top10.size());
        assertTrue(top10.containsKey("user1"));
        assertEquals(100.0, top10.get("user1"));
    }

    @Test
    public void testTop10Compradores() {
        Vintage vintage = new Vintage();
        Utilizador user = new Utilizador("user1", "password");
        vintage.adicionaUtilizador(user);
        Artigo artigo = new Artigo();
        artigo.setPrecoBase(100.0);
        user.adicionaCompra(artigo);
        Map<String, Double> top10 = vintage.top10Compradores(LocalDate.now().minusDays(1));
        assertEquals(1, top10.size());
        assertTrue(top10.containsKey("user1"));
        assertEquals(100.0, top10.get("user1"));
    }
}
