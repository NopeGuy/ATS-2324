import Model.Artigo;
import Model.Sapatilhas;
import org.junit.Test;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class SapatilhasTest {

    @Test
    public void testSapatilhasConstruction() {
        Sapatilhas sneakers = new Sapatilhas(42, true, "black", LocalDate.of(2021, 1, 1), Sapatilhas.Tipos_Sapatilhas.NORMAL, null, null, 0, 0, null, 0, 0, "N");
        assertEquals(42, sneakers.getTamanhoNumerico());
        assertEquals(true, sneakers.getAtilhos());
        assertEquals("black", sneakers.getCor());
        assertEquals(LocalDate.of(2021, 1, 1), sneakers.getDataLancamento());
        assertEquals(Sapatilhas.Tipos_Sapatilhas.NORMAL, sneakers.getTiposSapatilhas());
    }

    @Test
    public void testPrecoFinal() {
        Sapatilhas sneakers = new Sapatilhas(42, true, "black", LocalDate.of(2021, 1, 1), Sapatilhas.Tipos_Sapatilhas.PREMIUM, null, null, 0, 0, null, 0, 0, "N");
        LocalDate data = LocalDate.of(2023, 1, 1);
        double precoFinal = sneakers.precoFinal(data);
        assertEquals(102.0, precoFinal, 0.01); // assuming the base price is 100
    }

    @Test
    public void testEquals() {
        Sapatilhas sneakers1 = new Sapatilhas(42, true, "black", LocalDate.of(2021, 1, 1), Sapatilhas.Tipos_Sapatilhas.NORMAL, null, null, 0, 0, null, 0, 0, "N");
        Sapatilhas sneakers2 = new Sapatilhas(42, true, "black", LocalDate.of(2021, 1, 1), Sapatilhas.Tipos_Sapatilhas.NORMAL, null, null, 0, 0, null, 0, 0, "N");
        Sapatilhas sneakers3 = new Sapatilhas(43, true, "black", LocalDate.of(2021, 1, 1), Sapatilhas.Tipos_Sapatilhas.NORMAL, null, null, 0, 0, null, 0, 0, "N");
        assertEquals(sneakers1, sneakers2);
        assertEquals(sneakers2, sneakers1);
        assertEquals(sneakers1.hashCode(), sneakers2.hashCode());
        assertFalse(sneakers1.equals(sneakers3));
        assertFalse(sneakers1.equals(null));
        assertFalse(sneakers1.equals(new Object()));
    }

    @Test
    public void testToString() {
        Sapatilhas sapatilha = new Sapatilhas(42, true, "Azul", LocalDate.of(2021, Month.JANUARY, 1), Sapatilhas.Tipos_Sapatilhas.NORMAL, "Sapatilha", Artigo.Estado.NOVO, 0, null, "Sapatilha de teste", "Marca XYZ", "5678", 60.0, 0.0, "TransportadoraA");
        String expected = "ID: 1\n" +
                          "Tipo: Sapatilha\n" +
                          "Estado: NOVO\n" +
                          "Número de Donos: 0\n" +
                          "Avaliação: null\n" +
                          "Descrição: Sapatilha de teste\n" +
                          "Marca: Marca XYZ\n" +
                          "Código: 5678\n" +
                          "Preço Base: 60.0\n" +
                          "Correção do Preço: 0.0\n" +
                          "Transportadora: TransportadoraA\n" +
                          "\n" +
                          "Tamanho Numerico: 42\n" +
                          "Atilhos: true\n" +
                          "Cor: Azul\n" +
                          "Data de Lancamento: 2021-01-01\n" +
                          "Tipo de Sapatilhas: NORMAL\n" +
                          "Preco Final: 60.0\n";
        assertEquals(expected, sapatilha.toString(LocalDate.now()));
    }
}