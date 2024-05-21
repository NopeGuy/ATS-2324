import Model.Malas;
import org.junit.Test;
import java.time.LocalDate;
import static org.junit.Assert.assertEquals;

public class MalasTest {

    @Test
    public void testMalasConstructor() {
        Malas.Tipos_Malas tipo_mala = Malas.Tipos_Malas.PREMIUM;
        float dim = 15.5f;
        String material = "Cuir";
        int ano_da_colecao = 2020;
        Malas mala = new Malas(tipo_mala, dim, material, ano_da_colecao, "tipo", Malas.Estado.DISPONIVEL, 0, null, "", "", 100, 0.1, "t");
        assertEquals(tipo_mala, mala.getTipo_mala());
        assertEquals(dim, mala.getDim(), 0.0);
        assertEquals(material, mala.getMaterial());
        assertEquals(ano_da_colecao, mala.getAno_da_colecao());
    }

    @Test
    public void testMalasGetterSetter() {
        Malas.Tipos_Malas tipo_mala = Malas.Tipos_Malas.PREMIUM;
        float dim = 15.5f;
        String material = "Cuir";
        int ano_da_colecao = 2020;
        Malas mala = new Malas();
        mala.setTipo_mala(tipo_mala);
        mala.setDim(dim);
        mala.setMaterial(material);
        mala.setAno_da_colecao(ano_da_colecao);
        assertEquals(tipo_mala, mala.getTipo_mala());
        assertEquals(dim, mala.getDim(), 0.0);
        assertEquals(material, mala.getMaterial());
        assertEquals(ano_da_colecao, mala.getAno_da_colecao());
    }

    @Test
    public void testMalasEquals() {
        Malas.Tipos_Malas tipo_mala = Malas.Tipos_Malas.PREMIUM;
        float dim = 15.5f;
        String material = "Cuir";
        int ano_da_colecao = 2020;
        Malas mala1 = new Malas(tipo_mala, dim, material, ano_da_colecao, "tipo", Malas.Estado.DISPONIVEL, 0, null, "", "", 100, 0.1, "t");
        Malas mala2 = new Malas(tipo_mala, dim, material, ano_da_colecao, "tipo", Malas.Estado.DISPONIVEL, 0, null, "", "", 100, 0.1, "t");
        assertEquals(mala1, mala2);
    }

    @Test
    public void testPrecoFinal() {
        Malas.Tipos_Malas tipo_mala = Malas.Tipos_Malas.PREMIUM;
        float dim = 25.5f;
        String material = "Cuir";
        int ano_da_colecao = 2018;
        Malas mala = new Malas(tipo_mala, dim, material, ano_da_colecao, "tipo", Malas.Estado.DISPONIVEL, 0, null, "", "", 100, 0.1, "t");
        LocalDate data = LocalDate.of(2022, 1, 1);
        double precoFinal = mala.precoFinal(data);
        assertEquals(130.5, precoFinal, 0.0);
    }
}