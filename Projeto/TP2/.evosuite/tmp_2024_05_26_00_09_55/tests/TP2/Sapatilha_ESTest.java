/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 23:34:17 GMT 2024
 */

package TP2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import TP2.Artigo;
import TP2.Sapatilha;
import java.time.LocalDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sapatilha_ESTest extends Sapatilha_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Double double0 = new Double((-2032.5612600000002));
      Long long0 = new Long((-4657));
      Sapatilha sapatilha0 = new Sapatilha("?;C4i:e2Shw QkXD", "?;C4i:e2Shw QkXD", double0, true, (-4657), (-4657), long0, long0, 45, true, " Atacadores: ", 45, false, 0.01);
      assertFalse(sapatilha0.isPremium());
      
      double double1 = sapatilha0.preco_atual((LocalDate) null);
      assertEquals(0.01, double1, 0.01);
      assertEquals(45, sapatilha0.getAnoColecao());
      assertEquals(" Atacadores: ", sapatilha0.getCor());
      assertTrue(sapatilha0.isAtacadores());
      assertEquals(45, sapatilha0.getTamanho());
      assertEquals(0.01, sapatilha0.getDesconto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      
      sapatilha0.setDesconto((-1));
      double double0 = sapatilha0.preco_atual((LocalDate) null);
      assertEquals(0.01, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setPreco_base((-2258.4014));
      assertFalse(sapatilha0.isPremium());
      
      double double0 = sapatilha0.preco_atual((LocalDate) null);
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertEquals(0, sapatilha0.getAnoColecao());
      assertEquals(0, sapatilha0.getTamanho());
      assertEquals(0.01, double0, 0.01);
      assertFalse(sapatilha0.isAtacadores());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Double double0 = new Double((-339.413));
      Long long0 = new Long(1L);
      Sapatilha sapatilha0 = new Sapatilha(" Atacadores: ", "< <", double0, false, 0, 0, long0, long0, 0, true, "(KCkN;;f/n#=LN", 0, false, 0.0);
      LocalDate localDate0 = MockLocalDate.now();
      double double1 = sapatilha0.preco_atual(localDate0);
      assertEquals(0, sapatilha0.getTamanho());
      assertEquals("(KCkN;;f/n#=LN", sapatilha0.getCor());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertTrue(sapatilha0.isAtacadores());
      assertEquals(0, sapatilha0.getAnoColecao());
      assertEquals(Double.NaN, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Double double0 = new Double(3924.4);
      Long long0 = new Long(45);
      Sapatilha sapatilha0 = new Sapatilha((String) null, (String) null, double0, false, 45, (-144), long0, long0, (-144), false, (String) null, 45, true, 0.0);
      LocalDate localDate0 = MockLocalDate.now();
      sapatilha0.setData_venda(localDate0);
      double double1 = sapatilha0.preco_atual(localDate0);
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertEquals((-144), sapatilha0.getTamanho());
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(776638.7600000001, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha1.setDesconto((-2032.9));
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals((-2032.9), sapatilha1.getDesconto(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha0.setAnoColecao((-2589));
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals((-2589), sapatilha0.getAnoColecao());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha1.setTamanho((-2598));
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals((-2598), sapatilha1.getTamanho());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Double double0 = new Double((-3545.05338));
      Long long0 = new Long((-898L));
      Sapatilha sapatilha0 = new Sapatilha("CcHeKE", "CcHeKE", double0, true, 10, 45, long0, long0, 10, true, "", 10, false, 4570.24958);
      boolean boolean0 = sapatilha0.isPremium();
      assertEquals(4570.24958, sapatilha0.getDesconto(), 0.01);
      assertFalse(boolean0);
      assertEquals(10, sapatilha0.getTamanho());
      assertEquals("", sapatilha0.getCor());
      assertEquals(10, sapatilha0.getAnoColecao());
      assertTrue(sapatilha0.isAtacadores());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Double double0 = new Double((-1188.441974689968));
      Long long0 = Long.getLong(" Id da transportadora: ", (long) 1);
      Sapatilha sapatilha0 = new Sapatilha("#YP;$pnlSpD", "MP6IP6;)q<v{", double0, true, 1, 1, long0, long0, 1530, false, "MP6IP6;)q<v{", 1, false, 1);
      boolean boolean0 = sapatilha0.isAtacadores();
      assertFalse(sapatilha0.isPremium());
      assertEquals("MP6IP6;)q<v{", sapatilha0.getCor());
      assertEquals(1530, sapatilha0.getTamanho());
      assertFalse(boolean0);
      assertEquals(1.0, sapatilha0.getDesconto(), 0.01);
      assertEquals(1, sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setTamanho(3093);
      int int0 = sapatilha0.getTamanho();
      assertEquals(3093, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setTamanho((-2307));
      int int0 = sapatilha0.getTamanho();
      assertEquals((-2307), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Double double0 = new Double(0.01);
      Long long0 = new Long(10);
      Sapatilha sapatilha0 = new Sapatilha((String) null, (String) null, double0, false, 10, 10, long0, long0, 10, false, (String) null, 1, false, 1);
      double double1 = sapatilha0.getDesconto();
      assertEquals(10, sapatilha0.getTamanho());
      assertEquals(1, sapatilha0.getAnoColecao());
      assertFalse(sapatilha0.isAtacadores());
      assertFalse(sapatilha0.isPremium());
      assertEquals(1.0, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Double double0 = new Double((-3657.957));
      Long long0 = new Long(10);
      Sapatilha sapatilha0 = new Sapatilha("-muXM*", "-muXM*", double0, true, 10, 10, long0, long0, 10, true, "-muXM*", 579, true, (-2239.45144));
      double double1 = sapatilha0.getDesconto();
      assertEquals(10, sapatilha0.getTamanho());
      assertTrue(sapatilha0.isAtacadores());
      assertEquals(579, sapatilha0.getAnoColecao());
      assertEquals((-2239.45144), double1, 0.01);
      assertTrue(sapatilha0.isPremium());
      assertEquals("-muXM*", sapatilha0.getCor());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Double double0 = new Double(205.06011444);
      Long long0 = new Long(0);
      Sapatilha sapatilha0 = new Sapatilha("", "", double0, false, 0, 10, long0, long0, (-2678), false, "B}vX+((?MG", 10, false, 1.0);
      String string0 = sapatilha0.getCor();
      assertEquals((-2678), sapatilha0.getTamanho());
      assertFalse(sapatilha0.isAtacadores());
      assertEquals("B}vX+((?MG", string0);
      assertEquals(10, sapatilha0.getAnoColecao());
      assertEquals(1.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha0.isPremium());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      String string0 = sapatilha0.getCor();
      assertEquals(0, sapatilha0.getTamanho());
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(0, sapatilha0.getAnoColecao());
      assertEquals("", string0);
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha0.isPremium());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      int int0 = sapatilha0.getAnoColecao();
      assertFalse(sapatilha0.isPremium());
      assertEquals(0, sapatilha0.getTamanho());
      assertEquals(0, int0);
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Double double0 = new Double((-1188.441974689968));
      Long long0 = Long.getLong(" Id da transportadora: ", (long) 1);
      Sapatilha sapatilha0 = new Sapatilha("#YP;$pnlSpD", "MP6IP6;)q<v{", double0, true, 1, 1, long0, long0, 1530, false, "MP6IP6;)q<v{", 1, false, 1);
      sapatilha0.setAnoColecao((-564));
      int int0 = sapatilha0.getAnoColecao();
      assertEquals((-564), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Double double0 = new Double(10.0);
      Long long0 = new Long(3212);
      Sapatilha sapatilha0 = new Sapatilha(" Data da Cole\u00E7\u00E3o: ", " Disponivel: ", double0, true, 45, 3212, long0, long0, 3212, true, " Data da Cole\u00E7\u00E3o: ", 45, true, 10.0);
      sapatilha0.setTamanho((-1));
      sapatilha0.clone();
      assertEquals((-1), sapatilha0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Double double0 = new Double(10.0);
      Long long0 = new Long(3212);
      Sapatilha sapatilha0 = new Sapatilha(" Data da Cole\u00E7\u00E3o: ", " Disponivel: ", double0, true, 45, 3212, long0, long0, 3212, true, " Data da Cole\u00E7\u00E3o: ", 45, true, 10.0);
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertTrue(sapatilha1.isAtacadores());
      assertEquals(" Data da Cole\u00E7\u00E3o: ", sapatilha1.getCor());
      assertEquals(45, sapatilha0.getAnoColecao());
      assertEquals(10.0, sapatilha0.getDesconto(), 0.01);
      assertTrue(sapatilha1.isPremium());
      assertEquals(3212, sapatilha0.getTamanho());
      assertEquals(10.0, sapatilha1.getDesconto(), 0.01);
      assertEquals(45, sapatilha1.getAnoColecao());
      assertEquals(3212, sapatilha1.getTamanho());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Double double0 = new Double(0.0);
      Long long0 = new Long(0);
      Sapatilha sapatilha0 = new Sapatilha((String) null, (String) null, double0, false, 0, 0, long0, long0, 1, false, (String) null, 1, false, 0);
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertEquals(1, sapatilha1.getAnoColecao());
      assertFalse(sapatilha1.isPremium());
      assertEquals(1, sapatilha0.getTamanho());
      assertEquals(1, sapatilha1.getTamanho());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha1.isAtacadores());
      assertEquals(1, sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Double double0 = new Double((-1188.441974689968));
      Long long0 = Long.getLong(" Id da transportadora: ", (long) 1);
      Sapatilha sapatilha0 = new Sapatilha("#YP;$pnlSpD", "MP6IP6;)q<v{", double0, true, 1, 1, long0, long0, 1530, false, "MP6IP6;)q<v{", 1, false, 1);
      assertEquals(1.0, sapatilha0.getDesconto(), 0.01);
      
      sapatilha0.setDesconto((-1.0));
      sapatilha0.clone();
      assertEquals((-1.0), sapatilha0.getDesconto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Artigo.setContador(0L);
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertEquals(0, sapatilha1.getTamanho());
      assertFalse(sapatilha1.isPremium());
      assertEquals("", sapatilha1.getCor());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha1.isAtacadores());
      assertEquals(0, sapatilha1.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Artigo.setContador((-1L));
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertFalse(sapatilha1.isAtacadores());
      assertEquals(0, sapatilha1.getTamanho());
      assertFalse(sapatilha1.isPremium());
      assertEquals(0, sapatilha1.getAnoColecao());
      assertEquals("", sapatilha1.getCor());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setAnoColecao((-2589));
      sapatilha0.clone();
      assertEquals((-2589), sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setData_venda((LocalDate) null);
      // Undeclared exception!
      try { 
        sapatilha0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Double double0 = new Double(3924.4);
      Long long0 = new Long(45);
      Sapatilha sapatilha0 = new Sapatilha((String) null, (String) null, double0, true, 45, (-144), long0, long0, (-144), true, (String) null, 45, true, 0.0);
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      // Undeclared exception!
      try { 
        sapatilha0.equals(sapatilha1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Long long0 = new Long(10);
      Sapatilha sapatilha0 = null;
      try {
        sapatilha0 = new Sapatilha("ka\"", "SAw2bnOY2|r:+e?O", (Double) null, false, 10, 45, long0, long0, 45, true, "pWk+wM0I=.Y", 45, true, (-1L));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Sapatilha", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Sapatilha sapatilha0 = null;
      try {
        sapatilha0 = new Sapatilha((Sapatilha) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Double double0 = new Double((-1188.441974689968));
      Long long0 = Long.getLong(" Id da transportadora: ", (long) 1);
      Sapatilha sapatilha0 = new Sapatilha("#YP;$pnlSpD", "MP6IP6;)q<v{", double0, true, 1, 1, long0, long0, 1530, false, "MP6IP6;)q<v{", 1, false, 1);
      int int0 = sapatilha0.getAnoColecao();
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(1.0, sapatilha0.getDesconto(), 0.01);
      assertEquals(1, int0);
      assertEquals("MP6IP6;)q<v{", sapatilha0.getCor());
      assertEquals(1530, sapatilha0.getTamanho());
      assertFalse(sapatilha0.isPremium());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      double double0 = sapatilha0.getDesconto();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, sapatilha0.getTamanho());
      assertFalse(sapatilha0.isPremium());
      assertEquals(0, sapatilha0.getAnoColecao());
      assertFalse(sapatilha0.isAtacadores());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      int int0 = sapatilha0.getTamanho();
      assertEquals(0, sapatilha0.getAnoColecao());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(0, int0);
      assertFalse(sapatilha0.isPremium());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Double double0 = new Double(10.0);
      Long long0 = new Long(3212);
      Sapatilha sapatilha0 = new Sapatilha(" Data da Cole\u00E7\u00E3o: ", " Disponivel: ", double0, true, 45, 3212, long0, long0, 3212, true, " Data da Cole\u00E7\u00E3o: ", 45, true, 10.0);
      boolean boolean0 = sapatilha0.isPremium();
      assertEquals(45, sapatilha0.getAnoColecao());
      assertEquals(10.0, sapatilha0.getDesconto(), 0.01);
      assertEquals(" Data da Cole\u00E7\u00E3o: ", sapatilha0.getCor());
      assertTrue(sapatilha0.isAtacadores());
      assertTrue(boolean0);
      assertEquals(3212, sapatilha0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Double double0 = new Double(0.01);
      Long long0 = new Long(10);
      Sapatilha sapatilha0 = new Sapatilha((String) null, (String) null, double0, false, 10, 10, long0, long0, 10, false, (String) null, 1, false, 1);
      String string0 = sapatilha0.getCor();
      assertEquals(1.0, sapatilha0.getDesconto(), 0.01);
      assertEquals(1, sapatilha0.getAnoColecao());
      assertNull(string0);
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(10, sapatilha0.getTamanho());
      assertFalse(sapatilha0.isPremium());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Double double0 = new Double(3924.4);
      Long long0 = new Long(45);
      Sapatilha sapatilha0 = new Sapatilha((String) null, (String) null, double0, true, 45, (-144), long0, long0, (-144), true, (String) null, 45, true, 0.0);
      boolean boolean0 = sapatilha0.isAtacadores();
      assertEquals((-144), sapatilha0.getTamanho());
      assertTrue(sapatilha0.isPremium());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertTrue(boolean0);
      assertEquals(45, sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Double double0 = new Double((-1188.441974689968));
      Long long0 = Long.getLong("#YP;$pnlSD", (long) 8);
      Sapatilha sapatilha0 = new Sapatilha("#YP;$pnlSD", "#YP;$pnlSD", double0, true, 8, 8, long0, long0, 1530, false, "#YP;$pnlSD", 8, false, 8);
      LocalDate localDate0 = MockLocalDate.now();
      double double1 = sapatilha0.preco_atual(localDate0);
      assertFalse(sapatilha0.isPremium());
      assertEquals(8.0, sapatilha0.getDesconto(), 0.01);
      assertEquals("#YP;$pnlSD", sapatilha0.getCor());
      assertEquals(0.01, double1, 0.01);
      assertEquals(1530, sapatilha0.getTamanho());
      assertEquals(8, sapatilha0.getAnoColecao());
      assertFalse(sapatilha0.isAtacadores());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setNovo(true);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(3L);
      double double0 = sapatilha0.preco_atual(localDate0);
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha0.isPremium());
      assertEquals(0, sapatilha0.getTamanho());
      assertEquals(0.01, double0, 0.01);
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(0, sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      LocalDate localDate0 = MockLocalDate.ofYearDay(45, 45);
      sapatilha0.setData_venda(localDate0);
      assertFalse(sapatilha0.isPremium());
      
      sapatilha0.setPremium(true);
      double double0 = sapatilha0.preco_atual(localDate0);
      assertTrue(sapatilha0.isPremium());
      assertEquals(0.01, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha0.setDesconto(2L);
      boolean boolean0 = sapatilha0.equals(sapatilha1);
      assertEquals(2.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha0.setPremium(true);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertFalse(boolean0);
      assertTrue(sapatilha0.isPremium());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      sapatilha1.setAnoColecao((-1669));
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals((-1669), sapatilha1.getAnoColecao());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      assertEquals("", sapatilha1.getCor());
      
      sapatilha1.setCor("A");
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      sapatilha0.setTamanho((-832));
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertEquals((-832), sapatilha0.getTamanho());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertTrue(sapatilha0.equals((Object)sapatilha1));
      assertEquals(0, sapatilha1.getTamanho());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha1.isAtacadores());
      assertEquals(0, sapatilha1.getAnoColecao());
      assertFalse(sapatilha1.isPremium());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      boolean boolean0 = sapatilha0.equals("A");
      assertFalse(sapatilha0.isAtacadores());
      assertFalse(boolean0);
      assertEquals(0, sapatilha0.getTamanho());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha0.isPremium());
      assertEquals(0, sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      boolean boolean0 = sapatilha0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0, sapatilha0.getTamanho());
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(0, sapatilha0.getAnoColecao());
      assertFalse(sapatilha0.isPremium());
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      boolean boolean0 = sapatilha0.equals(sapatilha0);
      assertEquals(0, sapatilha0.getTamanho());
      assertTrue(boolean0);
      assertEquals(0.0, sapatilha0.getDesconto(), 0.01);
      assertFalse(sapatilha0.isPremium());
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(0, sapatilha0.getAnoColecao());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      assertFalse(sapatilha0.isAtacadores());
      
      sapatilha0.setAtacadores(true);
      assertTrue(sapatilha0.isAtacadores());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      String string0 = sapatilha0.toString();
      assertEquals("Sapatilhas:: {Artigo:: { C\u00F3digo de barras: A1 Descri\u00E7\u00E3o: Artigo invalido Marca: Artigo invalido Pre\u00E7o base: 0.0 Novo: false Estado de uso: -1 N\u00FAmero de utilizadores: -1 Disponivel: false Id da transportadora: -1 Id do vendedor: -1 } Tamanho: 0 Atacadores: false Cor:  Data da Cole\u00E7\u00E3o: 0 Premium: false Desconto: 0.0}", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = sapatilha0.clone();
      assertTrue(sapatilha1.equals((Object)sapatilha0));
      
      sapatilha0.setDisponivel(true);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertFalse(sapatilha1.equals((Object)sapatilha0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      sapatilha0.setPremium(true);
      // Undeclared exception!
      try { 
        sapatilha0.preco_atual((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Sapatilha", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Double double0 = new Double(10);
      Sapatilha sapatilha0 = new Sapatilha("A", "A", double0, true, 10, 10, (Long) 3L, (Long) 3L, 10, false, "A", 10, true, 3L);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(3L);
      double double1 = sapatilha0.preco_atual(localDate0);
      assertEquals(1970.0, double1, 0.01);
      assertFalse(sapatilha0.isAtacadores());
      assertEquals(10, sapatilha0.getTamanho());
      assertEquals(3.0, sapatilha0.getDesconto(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Sapatilha sapatilha0 = new Sapatilha();
      Sapatilha sapatilha1 = new Sapatilha(sapatilha0);
      sapatilha1.setAtacadores(true);
      boolean boolean0 = sapatilha1.equals(sapatilha0);
      assertTrue(sapatilha1.isAtacadores());
      assertFalse(boolean0);
  }
}
