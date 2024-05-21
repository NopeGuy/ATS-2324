import Model.Artigo.Estado;
import Model.Artigo.TShirt;
import Model.Encomenda.Dimensao_Embalagem;
import Model.Encomenda.Estado_Encomenda;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class EncomendaTest {

    private Encomenda encomenda;
    private List<Artigo> artigos;
    private Map<Integer, String> vendedores;

    @BeforeEach
    public void setUp() {
        artigos = new ArrayList<>();
        artigos.add(new TShirt("T-Shirt 1", Estado.NOVO, 1, null, "Descrição 1", "Marca 1", "Código 1", 10.0, 2.0));
        artigos.add(new TShirt("T-Shirt 2", Estado.USADO, 2, null, "Descrição 2", "Marca 2", "Código 2", 20.0, 3.0));
        vendedores = new HashMap<>();
        vendedores.put(1, "Vendedor 1");
        vendedores.put(2, "Vendedor 2");
        encomenda = new Encomenda("Dono", artigos, 5.0, LocalDate.now(), vendedores);
    }

    @Test
    public void testGetId() {
        assertEquals(1, encomenda.getId());
    }

    @Test
    public void testGetDono() {
        assertEquals("Dono", encomenda.getDono());
    }

    @Test
    public void testGetArtigos() {
        List<Artigo> expectedArtigos = new ArrayList<>();
        expectedArtigos.add(artigos.get(0).clone());
        expectedArtigos.add(artigos.get(1).clone());
        assertEquals(expectedArtigos, encomenda.getArtigos());
    }

    @Test
    public void testGetEmbalagem() {
        assertEquals(Dimensao_Embalagem.MEDIO, encomenda.getEmbalagem());
    }

    @Test
    public void testGetPrecoFinal() {
        assertEquals(40.5, encomenda.getPrecoFinal(), 0.01);
    }

    @Test
    public void testGetCustosExpedicao() {
        assertEquals(5.0, encomenda.getCustosExpedicao(), 0.01);
    }

    @Test
    public void testGetEstado() {
        assertEquals(Estado_Encomenda.EXPEDIDA, encomenda.getEstado());
    }

    @Test
    public void testGetDataCriacao() {
        assertEquals(LocalDate.now(), encomenda.getDataCriacao());
    }

    @Test
    public void testGetPrazoLimite() {
        LocalDate expectedPrazoLimite = LocalDate.now().plusDays(2);
        assertEquals(expectedPrazoLimite, encomenda.getPrazoLimite());
    }

    @Test
    public void testGetVendedores() {
        Map<Integer, String> expectedVendedores = new HashMap<>();
        expectedVendedores.put(1, "Vendedor 1");
        expectedVendedores.put(2, "Vendedor 2");
        assertEquals(expectedVendedores, encomenda.getVendedores());
    }

    @Test
    public void testEquals() {
        Encomenda otherEncomenda = new Encomenda("Dono", artigos, 5.0, LocalDate.now(), vendedores);
        assertEquals(encomenda, otherEncomenda);
    }
}
