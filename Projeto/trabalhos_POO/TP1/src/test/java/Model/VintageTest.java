import Model.*;
import org.junit.jupiter.api.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class VintageTest {

    private Vintage vintage;

    @BeforeEach
    public void setUp() {
        vintage = new Vintage();
    }

    @Test
    public void testGettersAndSetters() {
        String sessaoAtual = "sessao1";
        Map<String, Utilizador> utilizadores = new HashMap<>();
        List<Encomenda> encomendas = new ArrayList<>();
        Map<String, Transportadoras> transportadoras = new HashMap<>();
        LocalDate dataPrograma = LocalDate.now();

        vintage.setSessaoAtual(sessaoAtual);
        vintage.setUtilizadores(utilizadores);
        vintage.setEncomendas(encomendas);
        vintage.setTransportadoras(transportadoras);
        vintage.setDataPrograma(dataPrograma);

        assertEquals(sessaoAtual, vintage.getSessaoAtual());
        assertEquals(utilizadores, vintage.getUtilizadores());
        assertEquals(encomendas, vintage.getEncomendas());
        assertEquals(transportadoras, vintage.getTransportadoras());
        assertEquals(dataPrograma, vintage.getDataPrograma());
    }

    @Test
    public void testAddUtilizador() {
        Utilizador user = new Utilizador("user1", "password1", "User One", "user1@example.com", "Rua 1", 123456789);
        vintage.adicionaUtilizador(user);

        assertTrue(vintage.getUtilizadores().containsKey(user.getEmail()));
    }

    @Test
    public void testAddTransportadora() {
        Transportadoras transp = new Transportadoras("Transportadora One", "Cidade 1", 123456789, 10.0, 1.0, 1);
        vintage.adicionarTransportadora(transp);

        assertTrue(vintage.getTransportadoras().containsKey(transp.getNome()));
    }

    @Test
    public void testGetTransportadora() {
        Transportadoras transp = new Transportadoras("Transportadora One", "Cidade 1", 123456789, 10.0, 1.0, 1);
        vintage.adicionarTransportadora(transp);

        assertEquals(transp, vintage.getTransportadora(transp.getNome()));
    }

    @Test
    public void testGetArtigosVenda() {
        Utilizador user1 = new Utilizador("user1", "password1", "User One", "user1@example.com", "Rua 1", 123456789);
        Utilizador user2 = new Utilizador("user2", "password2", "User Two", "user2@example.com", "Rua 2", 987654321);
        Artigo artigo1 = new Artigo("Artigo 1", "Descricao 1", 10.0, user1);
        Artigo artigo2 = new Artigo("Artigo 2", "Descricao 2", 20.0, user2);

        user1.adicionarPorVender(artigo1);
        user2.adicionarPorVender(artigo2);

        vintage.adicionaUtilizador(user1);
        vintage.adicionaUtilizador(user2);

        List<Artigo> artigos = vintage.getArtigosVenda();

        assertEquals(2, artigos.size());
        assertTrue(artigos.contains(artigo1));
        assertTrue(artigos.contains(artigo2));
    }

    @Test
    void testEqualsDifferentSessaoAtual() {
        Vintage vintage2 = new Vintage();
        vintage2.setUtizadores(new HashMap<>());
        vintage2.setEncomendas(new ArrayList<>());
        vintage2.setTransportadoras(new HashMap<>());
        vintage2.setDataPrograma(LocalDate.now());

        vintage.setSessaoAtual("test");
        vintage2.setSessaoAtual("test2");

        assertFalse(vintage.equals(vintage2));
    }

    @Test
    void testEqualsDifferentUtizadores() {
        Vintage vintage2 = new Vintage();
        vintage2.setUtizadores(new HashMap<>());
        vintage2.setEncomendas(new ArrayList<>());
        vintage2.setTransportadoras(new HashMap<>());
        vintage2.setDataPrograma(LocalDate.now());

        Map<String, Utilizador> users = new HashMap<>();
        users.put("test", new Utilizador());
        vintage.setUtizadores(users);

        assertFalse(vintage.equals(vintage2));
    }

    @Test
    void testEqualsDifferentEncomendas() {
        Vintage vintage2 = new Vintage();
        vintage2.setUtizadores(new HashMap<>());
        vintage2.setEncomendas(new ArrayList<>());
        vintage2.setTransportadoras(new HashMap<>());
        vintage2.setDataPrograma(LocalDate.now());

        List<Encomenda> encomendas = new ArrayList<>();
        encomendas.add(new Encomenda());
        vintage.setEncomendas(encomendas);

        assertFalse(vintage.equals(vintage2));
    }

    @Test
    void testEqualsDifferentTransportadoras() {
        Vintage vintage2 = new Vintage();
        vintage2.setUtizadores(new HashMap<>());
        vintage2.setEncomendas(new ArrayList<>());
        vintage2.setTransportadoras(new HashMap<>());
        vintage2.setDataPrograma(LocalDate.now());

        Map<String, Transportadoras> transportadoras = new HashMap<>();
        transportadoras.put("test", new Transportadoras());
        vintage.setTransportadoras(transportadoras);

        assertFalse(vintage.equals(vintage2));
    }

    @Test
    void testEqualsDifferentDataPrograma() {
        Vintage vintage2 = new Vintage();
        vintage2.setUtizadores(new HashMap<>());
        vintage2.setEncomendas(new ArrayList<>());
        vintage2.setTransportadoras(new HashMap<>());
        vintage2.setDataPrograma(LocalDate.now());

        LocalDate date = LocalDate.now();
        vintage.setDataPrograma(date);

        assertFalse(vintage.equals(vintage2));
    }

    @Test
    void testHashCode() {
        Vintage vintage2 = new Vintage();
        vintage2.setUtizadores(new HashMap<>());
        vintage2.setEncomendas(new ArrayList<>());
        vintage2.setTransportadoras(new HashMap<>());
        vintage2.setDataPrograma(LocalDate.now());

        assertEquals(vintage.hashCode(), vintage2.hashCode());

        vintage2.setSessaoAtual("test");
        assertNotEquals(vintage.hashCode(), vintage2.hashCode());
    }
    
}
