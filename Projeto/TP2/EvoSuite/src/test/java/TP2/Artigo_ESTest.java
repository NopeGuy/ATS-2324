/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 23:35:29 GMT 2024
 */

package TP2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import TP2.Artigo;
import TP2.Mala;
import TP2.Padrao;
import TP2.Sapatilha;
import TP2.Tamanho;
import TP2.Tshirt;
import java.time.LocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Artigo_ESTest extends Artigo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = new Double(3691.336);
      Long long0 = new Long(2360L);
      Mala mala0 = new Mala(" Estado de uso: ", " Estado de uso: ", double0, true, 2461, 0, long0, long0, 2461, (String) null, 0, true, 0);
      Mala mala1 = mala0.clone();
      mala0.setTransportadora(1283L);
      mala0.equals(mala1);
      assertEquals(1283L, mala0.getIdTransportadora());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Double double0 = new Double(3691.336);
      Long long0 = new Long(2360L);
      Mala mala0 = new Mala(" Estado de uso: ", " Estado de uso: ", double0, true, 2461, 0, long0, long0, 2461, (String) null, 0, true, 0);
      Mala mala1 = mala0.clone();
      mala0.setVendedor(2461L);
      mala0.equals(mala1);
      assertEquals(2461L, mala0.getIdVendedor());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Double double0 = new Double(3691.336);
      Long long0 = new Long(2360L);
      Mala mala0 = new Mala(" Estado de uso: ", " Estado de uso: ", double0, true, 2461, 0, long0, long0, 2461, (String) null, 0, true, 0);
      Mala mala1 = mala0.clone();
      mala1.setN_utilizadores((-1198));
      mala0.equals(mala1);
      assertEquals((-1198), mala1.getN_utilizadores());
      assertTrue(mala1.getDisponivel());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      sapatilha1.setEstado_uso(3764);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals(3764, sapatilha1.getEstado_uso());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      Tshirt tshirt1 = new Tshirt(tshirt0);
      tshirt1.setPreco_base(2L);
      tshirt0.equals(tshirt1);
      assertEquals(2.0, tshirt1.getPreco_base(), 0.01);
      assertEquals("A1", tshirt0.getCodigo_barras());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      LocalDate localDate0 = sapatilha0.getData_venda();
      double double0 = sapatilha0.preco_atual(localDate0);
      assertEquals((-1L), sapatilha0.getIdTransportadora());
      assertEquals(2L, Artigo.contador);
      assertEquals((-1), sapatilha0.getN_utilizadores());
      assertEquals((-1L), sapatilha0.getIdVendedor());
      assertEquals("Artigo invalido", sapatilha0.getMarca());
      assertEquals(0.0, sapatilha0.getPreco_base(), 0.01);
      assertEquals("Artigo invalido", sapatilha0.getDescricao());
      assertFalse(sapatilha0.getNovo());
      assertEquals((-1), sapatilha0.getEstado_uso());
      assertEquals("A1", sapatilha0.getCodigo_barras());
      assertFalse(sapatilha0.getDisponivel());
      assertEquals(0.01, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Mala mala0 = new Mala();
      LocalDate localDate0 = mala0.getData_venda();
      Tamanho tamanho0 = Tamanho.XL;
      Padrao padrao0 = Padrao.liso;
      Tshirt tshirt0 = new Tshirt("A", "A", (-437.039181501), false, (-1914182396), 70, (Long) mala0.contador, (Long) mala0.contador, tamanho0, padrao0);
      double double0 = tshirt0.preco_atual(localDate0);
      assertEquals(3L, Artigo.contador);
      assertEquals((-437.039181501), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Long long0 = new Long(1);
      Tamanho tamanho0 = Tamanho.S;
      Padrao padrao0 = Padrao.palmeiras;
      Tshirt tshirt0 = new Tshirt("(0+-", " Id da transportadora: ", 1.0, false, 1, 1, long0, long0, tamanho0, padrao0);
      double double0 = tshirt0.getPreco_base();
      assertEquals("A1", tshirt0.getCodigo_barras());
      assertEquals("(0+-", tshirt0.getDescricao());
      assertEquals(2L, Artigo.contador);
      assertEquals(" Id da transportadora: ", tshirt0.getMarca());
      assertEquals(1, tshirt0.getN_utilizadores());
      assertEquals(1.0, double0, 0.01);
      assertFalse(tshirt0.getNovo());
      assertEquals(1, tshirt0.getEstado_uso());
      assertTrue(tshirt0.getDisponivel());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double double0 = new Double((-1.0));
      Long long0 = new Long((-3783L));
      Sapatilha sapatilha0 = new Sapatilha("%S~W >-^i3@'Nc\u0011f", "%S~W >-^i3@'Nc\u0011f", double0, true, 0, 0, long0, long0, 0, true, "%S~W >-^i3@'Nc\u0011f", 0, false, (-3783L));
      double double1 = sapatilha0.getPreco_base();
      assertTrue(sapatilha0.getNovo());
      assertEquals(0, sapatilha0.getN_utilizadores());
      assertEquals(0, sapatilha0.getEstado_uso());
      assertTrue(sapatilha0.getDisponivel());
      assertEquals("%S~W >-^i3@'Nc\u0011f", sapatilha0.getMarca());
      assertEquals(2L, Artigo.contador);
      assertEquals((-1.0), double1, 0.01);
      assertEquals("A1", sapatilha0.getCodigo_barras());
      assertEquals("%S~W >-^i3@'Nc\u0011f", sapatilha0.getDescricao());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Mala mala0 = new Mala();
      boolean boolean0 = mala0.getNovo();
      assertEquals(2L, Artigo.contador);
      assertEquals((-1L), mala0.getIdVendedor());
      assertEquals("Artigo invalido", mala0.getMarca());
      assertFalse(mala0.getDisponivel());
      assertEquals((-1), mala0.getN_utilizadores());
      assertEquals((-1L), mala0.getIdTransportadora());
      assertEquals("A1", mala0.getCodigo_barras());
      assertEquals(0.0, mala0.getPreco_base(), 0.01);
      assertFalse(boolean0);
      assertEquals((-1), mala0.getEstado_uso());
      assertEquals("Artigo invalido", mala0.getDescricao());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Long long0 = new Long(0L);
      Tamanho tamanho0 = Tamanho.L;
      Padrao padrao0 = Padrao.palmeiras;
      Tshirt tshirt0 = new Tshirt("T-shirt:: {", "-:", 0.0, true, (-1561), 0, long0, long0, tamanho0, padrao0);
      int int0 = tshirt0.getN_utilizadores();
      assertEquals(0.0, tshirt0.getPreco_base(), 0.01);
      assertEquals("-:", tshirt0.getMarca());
      assertEquals((-1561), tshirt0.getEstado_uso());
      assertEquals(2L, Artigo.contador);
      assertEquals(0, int0);
      assertTrue(tshirt0.getNovo());
      assertEquals("T-shirt:: {", tshirt0.getDescricao());
      assertEquals("A1", tshirt0.getCodigo_barras());
      assertTrue(tshirt0.getDisponivel());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Double double0 = new Double(0.0);
      Long long0 = new Long(0);
      Mala mala0 = new Mala("", "d}:}h", double0, true, 0, 4776, long0, long0, 0, "", 4776, false, 3);
      int int0 = mala0.getN_utilizadores();
      assertEquals("", mala0.getDescricao());
      assertEquals(2L, Artigo.contador);
      assertTrue(mala0.getNovo());
      assertEquals(0, mala0.getEstado_uso());
      assertEquals(0.0, mala0.getPreco_base(), 0.01);
      assertTrue(mala0.getDisponivel());
      assertEquals("d}:}h", mala0.getMarca());
      assertEquals("A1", mala0.getCodigo_barras());
      assertEquals(4776, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double double0 = new Double(3006.6692);
      Long long0 = new Long((-1856));
      Mala mala0 = new Mala("3]", (String) null, double0, true, (-1971), (-1856), long0, long0, (-1971), "3]", 394, true, 1.0F);
      String string0 = mala0.getMarca();
      assertEquals((-1856), mala0.getN_utilizadores());
      assertTrue(mala0.getDisponivel());
      assertTrue(mala0.getNovo());
      assertEquals(2L, Artigo.contador);
      assertEquals((-1971), mala0.getEstado_uso());
      assertEquals(3006.6692, mala0.getPreco_base(), 0.01);
      assertNull(string0);
      assertEquals("A1", mala0.getCodigo_barras());
      assertEquals("3]", mala0.getDescricao());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      String string0 = sapatilha0.getMarca();
      assertEquals((-1), sapatilha0.getEstado_uso());
      assertEquals("A1", sapatilha0.getCodigo_barras());
      assertFalse(sapatilha0.getNovo());
      assertEquals(0.0, sapatilha0.getPreco_base(), 0.01);
      assertEquals("Artigo invalido", sapatilha0.getDescricao());
      assertEquals(2L, Artigo.contador);
      assertEquals((-1L), sapatilha0.getIdTransportadora());
      assertEquals((-1), sapatilha0.getN_utilizadores());
      assertFalse(sapatilha0.getDisponivel());
      assertEquals("Artigo invalido", string0);
      assertEquals((-1L), sapatilha0.getIdVendedor());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Long long0 = new Long(0);
      Tamanho tamanho0 = Tamanho.L;
      Padrao padrao0 = Padrao.liso;
      Tshirt tshirt0 = new Tshirt("e w1R,<d5&Q;k(e", (String) null, (-1.0), true, 0, 0, long0, long0, tamanho0, padrao0);
      long long1 = tshirt0.getIdVendedor();
      assertTrue(tshirt0.getNovo());
      assertEquals("e w1R,<d5&Q;k(e", tshirt0.getDescricao());
      assertTrue(tshirt0.getDisponivel());
      assertEquals(0, tshirt0.getEstado_uso());
      assertEquals((-1.0), tshirt0.getPreco_base(), 0.01);
      assertEquals(0L, long1);
      assertEquals("A1", tshirt0.getCodigo_barras());
      assertEquals(2L, Artigo.contador);
      assertEquals(0, tshirt0.getN_utilizadores());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Double double0 = new Double(379.1570703822325);
      Long long0 = new Long(2275L);
      Sapatilha sapatilha0 = new Sapatilha("q\"~6v(U>&6kRq+E{N", "q\"~6v(U>&6kRq+E{N", double0, true, 1712, 0, long0, long0, 0, true, "q\"~6v(U>&6kRq+E{N", 0, true, (-632.61193));
      long long1 = sapatilha0.getIdVendedor();
      assertEquals(2L, Artigo.contador);
      assertEquals(379.1570703822325, sapatilha0.getPreco_base(), 0.01);
      assertEquals(0, sapatilha0.getN_utilizadores());
      assertTrue(sapatilha0.getNovo());
      assertEquals("q\"~6v(U>&6kRq+E{N", sapatilha0.getMarca());
      assertEquals("q\"~6v(U>&6kRq+E{N", sapatilha0.getDescricao());
      assertEquals(1712, sapatilha0.getEstado_uso());
      assertEquals(2275L, long1);
      assertEquals("A1", sapatilha0.getCodigo_barras());
      assertTrue(sapatilha0.getDisponivel());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Double double0 = new Double(1.0);
      Long long0 = new Long(10);
      Mala mala0 = new Mala((String) null, "Kyodntu$YUoH ", double0, false, 10, 4784, long0, long0, (-2868), (String) null, 10, false, (-851.7361F));
      mala0.setTransportadora(0L);
      long long1 = mala0.getIdTransportadora();
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      long long0 = sapatilha0.getIdTransportadora();
      assertEquals((-1), sapatilha0.getN_utilizadores());
      assertFalse(sapatilha0.getDisponivel());
      assertEquals("Artigo invalido", sapatilha0.getDescricao());
      assertEquals((-1L), sapatilha0.getIdVendedor());
      assertEquals("Artigo invalido", sapatilha0.getMarca());
      assertEquals((-1), sapatilha0.getEstado_uso());
      assertEquals("A1", sapatilha0.getCodigo_barras());
      assertEquals(0.0, sapatilha0.getPreco_base(), 0.01);
      assertFalse(sapatilha0.getNovo());
      assertEquals(2L, Artigo.contador);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Double double0 = new Double(3691.336);
      Long long0 = new Long(2360L);
      Mala mala0 = new Mala(" Estado de uso: ", " Estado de uso: ", double0, true, 2461, 0, long0, long0, 2461, (String) null, 0, true, 0);
      int int0 = mala0.getEstado_uso();
      assertEquals(2461, int0);
      assertEquals(" Estado de uso: ", mala0.getMarca());
      assertEquals(2L, Artigo.contador);
      assertEquals("A1", mala0.getCodigo_barras());
      assertTrue(mala0.getDisponivel());
      assertEquals(3691.336, mala0.getPreco_base(), 0.01);
      assertEquals(0, mala0.getN_utilizadores());
      assertEquals(" Estado de uso: ", mala0.getDescricao());
      assertTrue(mala0.getNovo());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      int int0 = tshirt0.getEstado_uso();
      assertEquals(0.0, tshirt0.getPreco_base(), 0.01);
      assertEquals("A1", tshirt0.getCodigo_barras());
      assertEquals((-1), int0);
      assertEquals(2L, Artigo.contador);
      assertEquals((-1), tshirt0.getN_utilizadores());
      assertEquals((-1L), tshirt0.getIdVendedor());
      assertFalse(tshirt0.getDisponivel());
      assertEquals("Artigo invalido", tshirt0.getMarca());
      assertEquals((-1L), tshirt0.getIdTransportadora());
      assertEquals("Artigo invalido", tshirt0.getDescricao());
      assertFalse(tshirt0.getNovo());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      boolean boolean0 = tshirt0.getDisponivel();
      assertFalse(boolean0);
      assertEquals((-1), tshirt0.getN_utilizadores());
      assertEquals((-1L), tshirt0.getIdTransportadora());
      assertFalse(tshirt0.getNovo());
      assertEquals((-1), tshirt0.getEstado_uso());
      assertEquals("A1", tshirt0.getCodigo_barras());
      assertEquals(0.0, tshirt0.getPreco_base(), 0.01);
      assertEquals("Artigo invalido", tshirt0.getDescricao());
      assertEquals((-1L), tshirt0.getIdVendedor());
      assertEquals("Artigo invalido", tshirt0.getMarca());
      assertEquals(2L, Artigo.contador);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Long long0 = new Long((-1971));
      Tamanho tamanho0 = Tamanho.M;
      Padrao padrao0 = Padrao.palmeiras;
      Tshirt tshirt0 = new Tshirt((String) null, ".PRZ{QX8r", (-2848.356001), false, 1650, 1, long0, long0, tamanho0, padrao0);
      String string0 = tshirt0.getDescricao();
      assertEquals((-2848.356001), tshirt0.getPreco_base(), 0.01);
      assertNull(string0);
      assertEquals(2L, Artigo.contador);
      assertEquals(1, tshirt0.getN_utilizadores());
      assertEquals("A1", tshirt0.getCodigo_barras());
      assertFalse(tshirt0.getNovo());
      assertEquals(1650, tshirt0.getEstado_uso());
      assertTrue(tshirt0.getDisponivel());
      assertEquals(".PRZ{QX8r", tshirt0.getMarca());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Mala mala0 = new Mala();
      assertEquals("Artigo invalido", mala0.getDescricao());
      
      mala0.setDescricao("");
      String string0 = mala0.getDescricao();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Artigo.setContador((-3301L));
      long long0 = Artigo.getContador();
      assertEquals((-3301L), long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Mala mala0 = new Mala();
      mala0.equals(mala0);
      assertEquals((-1), mala0.getN_utilizadores());
      assertFalse(mala0.getDisponivel());
      assertEquals(2L, Artigo.contador);
      assertEquals((-1L), mala0.getIdTransportadora());
      assertEquals((-1), mala0.getEstado_uso());
      assertEquals("A1", mala0.getCodigo_barras());
      assertFalse(mala0.getNovo());
      assertEquals(0.0, mala0.getPreco_base(), 0.01);
      assertEquals("Artigo invalido", mala0.getDescricao());
      assertEquals((-1L), mala0.getIdVendedor());
      assertEquals("Artigo invalido", mala0.getMarca());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Double double0 = new Double((-1360.4807038));
      Long long0 = Long.valueOf(2469L);
      Long long1 = new Long(0);
      Sapatilha sapatilha0 = new Sapatilha(" Dimens\u00E3o: ", "\u20AC ", double0, false, 0, 0, long0, long1, 0, true, " }", 0, false, 0.0);
      Artigo artigo0 = sapatilha0.clone();
      assertEquals((-1360.4807038), sapatilha0.getPreco_base(), 0.01);
      assertEquals(2L, Artigo.contador);
      assertTrue(artigo0.getDisponivel());
      assertEquals(2469L, sapatilha0.getIdTransportadora());
      assertEquals(2469L, artigo0.getIdTransportadora());
      assertFalse(artigo0.getNovo());
      assertEquals(0, artigo0.getN_utilizadores());
      assertEquals("A1", artigo0.getCodigo_barras());
      assertEquals(" Dimens\u00E3o: ", artigo0.getDescricao());
      assertEquals("\u20AC ", artigo0.getMarca());
      assertEquals(0, artigo0.getEstado_uso());
      assertEquals(0L, artigo0.getIdVendedor());
      assertEquals((-1360.4807038), artigo0.getPreco_base(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      assertEquals((-1L), sapatilha0.getIdTransportadora());
      
      sapatilha0.setTransportadora(0L);
      sapatilha0.clone();
      assertEquals(2L, sapatilha0.getContador());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Double double0 = Double.valueOf(2.0);
      Long long0 = new Long(1L);
      Sapatilha sapatilha0 = new Sapatilha("?E$Y-|q']p_Rf", "?E$Y-|q']p_Rf", double0, true, 1, 1, long0, long0, (-519), true, "?E$Y-|q']p_Rf", 1, true, (-3169.291188));
      Artigo artigo0 = sapatilha0.clone();
      assertEquals(1, sapatilha0.getEstado_uso());
      assertEquals("A1", artigo0.getCodigo_barras());
      assertEquals(2.0, sapatilha0.getPreco_base(), 0.01);
      assertTrue(sapatilha0.getDisponivel());
      assertTrue(artigo0.equals((Object)sapatilha0));
      assertEquals(2L, Artigo.contador);
      assertEquals(1L, sapatilha0.getIdTransportadora());
      assertEquals(1, sapatilha0.getN_utilizadores());
      assertTrue(artigo0.getNovo());
      assertEquals(1L, sapatilha0.getIdVendedor());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      assertEquals(2L, Artigo.contador);
      
      Artigo.contador = 0L;
      sapatilha0.clone();
      assertEquals("A1", sapatilha0.getCodigo_barras());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Artigo.setContador((-3301L));
      Sapatilha sapatilha0 = new Sapatilha();
      Artigo artigo0 = sapatilha0.clone();
      assertEquals("A-3301", artigo0.getCodigo_barras());
      assertEquals((-1), sapatilha0.getEstado_uso());
      assertEquals(0.0, sapatilha0.getPreco_base(), 0.01);
      assertTrue(artigo0.equals((Object)sapatilha0));
      assertEquals((-1L), sapatilha0.getIdVendedor());
      assertFalse(artigo0.getNovo());
      assertEquals((-3300L), Artigo.contador);
      assertEquals((-1L), sapatilha0.getIdTransportadora());
      assertFalse(artigo0.getDisponivel());
      assertEquals((-1), sapatilha0.getN_utilizadores());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      // Undeclared exception!
      try { 
        tshirt0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Tshirt", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Double double0 = new Double(708.278751763027);
      Long long0 = Long.valueOf(0L);
      Mala mala0 = new Mala("Np=", "Np=", double0, true, (-1016), 2, long0, long0, 1102, " Data de venda: ", 1789569706, true, (-1016));
      LocalDate localDate0 = mala0.getData_venda();
      // Undeclared exception!
      mala0.preco_atual(localDate0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      LocalDate localDate0 = tshirt0.getData_venda();
      // Undeclared exception!
      try { 
        tshirt0.preco_atual(localDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Tshirt", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Double double0 = new Double(3094.701462201);
      Mala mala0 = new Mala((String) null, (String) null, double0, true, (-1969449174), (-1969449174), (Long) 4L, (Long) 4L, (-1943), "!}5;", (-1073741824), true, (-240.43573F));
      // Undeclared exception!
      mala0.mostrar(localDate0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      LocalDate localDate0 = tshirt0.getData_venda();
      // Undeclared exception!
      try { 
        tshirt0.mostrar(localDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Tshirt", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Mala mala0 = new Mala();
      Tamanho tamanho0 = Tamanho.S;
      Padrao padrao0 = Padrao.palmeiras;
      Tshirt tshirt0 = new Tshirt("A", "A", (-671.65464086), true, 0, 515, (Long) 3L, (Long) mala0.contador, tamanho0, padrao0);
      int int0 = tshirt0.getEstado_uso();
      assertEquals(3L, Artigo.contador);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      int int0 = sapatilha0.getN_utilizadores();
      assertEquals((-1L), sapatilha0.getIdVendedor());
      assertEquals("Artigo invalido", sapatilha0.getMarca());
      assertEquals((-1), sapatilha0.getEstado_uso());
      assertFalse(sapatilha0.getNovo());
      assertEquals(0.0, sapatilha0.getPreco_base(), 0.01);
      assertEquals("Artigo invalido", sapatilha0.getDescricao());
      assertEquals(2L, Artigo.contador);
      assertEquals((-1), int0);
      assertEquals((-1L), sapatilha0.getIdTransportadora());
      assertEquals("A1", sapatilha0.getCodigo_barras());
      assertFalse(sapatilha0.getDisponivel());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      String string0 = sapatilha0.getDescricao();
      assertEquals(2L, Artigo.contador);
      assertEquals((-1L), sapatilha0.getIdTransportadora());
      assertEquals((-1), sapatilha0.getN_utilizadores());
      assertFalse(sapatilha0.getDisponivel());
      assertEquals("Artigo invalido", string0);
      assertEquals("A1", sapatilha0.getCodigo_barras());
      assertEquals((-1), sapatilha0.getEstado_uso());
      assertFalse(sapatilha0.getNovo());
      assertEquals((-1L), sapatilha0.getIdVendedor());
      assertEquals("Artigo invalido", sapatilha0.getMarca());
      assertEquals(0.0, sapatilha0.getPreco_base(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Double double0 = new Double(1.0);
      Long long0 = new Long(10);
      Mala mala0 = new Mala((String) null, "Kyodntu$YUoH ", double0, false, 10, 4784, long0, long0, (-2868), (String) null, 10, false, (-851.7361F));
      long long1 = mala0.getIdTransportadora();
      assertEquals(2L, Artigo.contador);
      assertEquals("A1", mala0.getCodigo_barras());
      assertTrue(mala0.getDisponivel());
      assertEquals(10L, long1);
      assertFalse(mala0.getNovo());
      assertEquals(4784, mala0.getN_utilizadores());
      assertEquals(1.0, mala0.getPreco_base(), 0.01);
      assertEquals("Kyodntu$YUoH ", mala0.getMarca());
      assertEquals(10, mala0.getEstado_uso());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Double double0 = new Double(0.0);
      Long long0 = new Long(1);
      Mala mala0 = new Mala("", "", double0, false, 1, 1, long0, long0, 1, "31u'\"Io4]", 0, false, 0.0F);
      Sapatilha sapatilha0 = new Sapatilha("", "", double0, false, 748, 1, (Long) mala0.contador, (Long) mala0.contador, 2702, false, "", 1, true, (-1085.3685));
      String string0 = sapatilha0.getMarca();
      assertEquals(3L, Artigo.contador);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Double double0 = new Double((-3572.7433202207));
      Long long0 = new Long(0L);
      Sapatilha sapatilha0 = new Sapatilha("pdL^%Z&)HI$Q3", "0/@4(6dKZ=w", double0, true, 361, 0, long0, long0, 361, true, "pdL^%Z&)HI$Q3", 361, true, (-3572.7433202207));
      boolean boolean0 = sapatilha0.getDisponivel();
      assertTrue(boolean0);
      assertEquals("A1", sapatilha0.getCodigo_barras());
      assertEquals(2L, Artigo.contador);
      assertEquals(0, sapatilha0.getN_utilizadores());
      assertTrue(sapatilha0.getNovo());
      assertEquals("0/@4(6dKZ=w", sapatilha0.getMarca());
      assertEquals(361, sapatilha0.getEstado_uso());
      assertEquals("pdL^%Z&)HI$Q3", sapatilha0.getDescricao());
      assertEquals((-3572.7433202207), sapatilha0.getPreco_base(), 0.01);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Double double0 = new Double(1295.7613549);
      Long long0 = Long.valueOf((long) (-1069));
      Mala mala0 = new Mala((String) null, "XL", double0, true, (-1069), (-1069), long0, long0, (-1069), "m", (-1069), false, 1.0F);
      boolean boolean0 = mala0.getNovo();
      assertEquals("XL", mala0.getMarca());
      assertEquals((-1069), mala0.getN_utilizadores());
      assertEquals("A1", mala0.getCodigo_barras());
      assertTrue(mala0.getDisponivel());
      assertEquals((-1069), mala0.getEstado_uso());
      assertTrue(boolean0);
      assertEquals(2L, Artigo.contador);
      assertEquals(1295.7613549, mala0.getPreco_base(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Mala mala0 = new Mala();
      String string0 = mala0.getCodigo_barras();
      assertEquals(2L, Artigo.contador);
      assertEquals((-1L), mala0.getIdVendedor());
      assertEquals("Artigo invalido", mala0.getMarca());
      assertFalse(mala0.getDisponivel());
      assertEquals("A1", string0);
      assertEquals((-1), mala0.getN_utilizadores());
      assertEquals(0.0, mala0.getPreco_base(), 0.01);
      assertEquals("Artigo invalido", mala0.getDescricao());
      assertEquals((-1L), mala0.getIdTransportadora());
      assertFalse(mala0.getNovo());
      assertEquals((-1), mala0.getEstado_uso());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Mala mala0 = new Mala();
      double double0 = mala0.getPreco_base();
      assertEquals((-1L), mala0.getIdVendedor());
      assertFalse(mala0.getDisponivel());
      assertEquals((-1), mala0.getN_utilizadores());
      assertEquals("Artigo invalido", mala0.getMarca());
      assertEquals(0.0, double0, 0.01);
      assertEquals((-1), mala0.getEstado_uso());
      assertEquals("A1", mala0.getCodigo_barras());
      assertEquals("Artigo invalido", mala0.getDescricao());
      assertFalse(mala0.getNovo());
      assertEquals(2L, Artigo.contador);
      assertEquals((-1L), mala0.getIdTransportadora());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      String string0 = Artigo.criaCodigo();
      assertEquals("A1", string0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      long long0 = sapatilha0.getIdVendedor();
      assertEquals(0.0, sapatilha0.getPreco_base(), 0.01);
      assertFalse(sapatilha0.getNovo());
      assertEquals((-1L), long0);
      assertEquals((-1), sapatilha0.getEstado_uso());
      assertEquals("Artigo invalido", sapatilha0.getDescricao());
      assertEquals("Artigo invalido", sapatilha0.getMarca());
      assertEquals((-1), sapatilha0.getN_utilizadores());
      assertFalse(sapatilha0.getDisponivel());
      assertEquals(2L, Artigo.contador);
      assertEquals((-1L), sapatilha0.getIdTransportadora());
      assertEquals("A1", sapatilha0.getCodigo_barras());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      assertTrue(sapatilha1.equals((Object)sapatilha0));
      
      LocalDate localDate0 = MockLocalDate.now();
      sapatilha1.setData_venda(localDate0);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      sapatilha1.setDisponivel(true);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertFalse(boolean0);
      assertTrue(sapatilha1.getDisponivel());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha1.setTransportadora(2L);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals(2L, sapatilha1.getIdTransportadora());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      sapatilha1.setN_utilizadores((-1605));
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals((-1605), sapatilha1.getN_utilizadores());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      sapatilha0.setEstado_uso(994);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals(994, sapatilha0.getEstado_uso());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      sapatilha1.setNovo(true);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertFalse(boolean0);
      assertTrue(sapatilha1.getNovo());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha0.setPreco_base((-3301L));
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals((-3301.0), sapatilha0.getPreco_base(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setMarca(" re\u00E7{o~ atual: ");
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals(" re\u00E7{o~ atual: ", sapatilha0.getMarca());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha();
      boolean boolean0 = sapatilha0.equals(sapatilha1);
      assertEquals(3L, Artigo.contador);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      Tshirt tshirt1 = new Tshirt(tshirt0);
      // Undeclared exception!
      try { 
        tshirt1.equals(tshirt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Tshirt", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Double double0 = new Double(3691.336);
      Long long0 = new Long(2360L);
      Mala mala0 = new Mala(" Estado de uso: ", " Estado de uso: ", double0, true, 2461, 0, long0, long0, 2461, " Estado de uso: ", (-11), true, (-11));
      Mala mala1 = mala0.clone();
      mala0.setVendedor((-11));
      boolean boolean0 = mala0.equals(mala1);
      assertEquals((-11L), mala0.getIdVendedor());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Mala mala0 = new Mala();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(2L);
      String string0 = mala0.mostrar(localDate0);
      assertEquals((-1), mala0.getN_utilizadores());
      assertEquals(2L, Artigo.contador);
      assertEquals("Mala:: {Artigo:: { C\u00F3digo de barras: A1 Descri\u00E7\u00E3o: Artigo invalido Marca: Artigo invalido Pre\u00E7o base: 0.0 Novo: false Estado de uso: -1 N\u00FAmero de utilizadores: -1 Disponivel: false Id da transportadora: -1 Id do vendedor: -1 } Dimens\u00E3o: 0 Material:  Ano da Cole\u00E7\u00E3o: 0 Premium: false Valoriza\u00E7\u00E3o: 0.0} Pre\u00E7o atual: \uFFFD\u20AC \n", string0);
      assertEquals(0.0, mala0.getPreco_base(), 0.01);
      assertEquals((-1), mala0.getEstado_uso());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Tshirt tshirt0 = new Tshirt();
      assertEquals("A1", tshirt0.getCodigo_barras());
      
      tshirt0.setCodigo_barras("A");
      assertEquals(2L, tshirt0.getContador());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = Artigo.getCodigo();
      assertEquals("A", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Artigo.setCodigo("A");
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      long long0 = Artigo.getContador();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Double double0 = new Double(0.5);
      Long long0 = new Long(1);
      Mala mala0 = new Mala("0A(_!D#)2#jFde`}`&t", " Descri\u00E7\u00E3o: ", double0, false, 1444, 1, long0, long0, 1444, "0A(_!D#)2#jFde`}`&t", 1444, false, 517.1792F);
      LocalDate localDate0 = MockLocalDate.now();
      mala0.setData_venda(localDate0);
      String string0 = mala0.toString();
      assertEquals("Mala:: {Artigo:: { C\u00F3digo de barras: A1 Descri\u00E7\u00E3o: 0A(_!D#)2#jFde`}`&t Marca:  Descri\u00E7\u00E3o:  Pre\u00E7o base: 0.5 Novo: false Estado de uso: 1444 N\u00FAmero de utilizadores: 1 Disponivel: true Id da transportadora: 1 Id do vendedor: 1 Data de venda: 2014-02-14 } Dimens\u00E3o: 1444 Material: 0A(_!D#)2#jFde`}`&t Ano da Cole\u00E7\u00E3o: 1444 Premium: false Valoriza\u00E7\u00E3o: 517.1792}", string0);
      assertEquals(2L, Artigo.contador);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setPreco_atual(3L);
      assertEquals((-1L), sapatilha0.getIdTransportadora());
      assertEquals(2L, Artigo.contador);
      assertEquals((-1), sapatilha0.getN_utilizadores());
      assertEquals("A1", sapatilha0.getCodigo_barras());
      assertEquals((-1L), sapatilha0.getIdVendedor());
      assertFalse(sapatilha0.getDisponivel());
      assertEquals("Artigo invalido", sapatilha0.getMarca());
      assertFalse(sapatilha0.getNovo());
      assertEquals((-1), sapatilha0.getEstado_uso());
      assertEquals(0.0, sapatilha0.getPreco_base(), 0.01);
      assertEquals("Artigo invalido", sapatilha0.getDescricao());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      assertEquals("Artigo invalido", sapatilha1.getDescricao());
      
      sapatilha1.setDescricao(" <dLdo venedor");
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertFalse(boolean0);
  }
}
