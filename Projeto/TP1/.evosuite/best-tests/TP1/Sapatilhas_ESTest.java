/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 16:55:30 GMT 2024
 */

package TP1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import TP1.Artigo;
import TP1.Sapatilhas;
import java.time.Clock;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.JapaneseDate;
import java.time.chrono.ThaiBuddhistDate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockJapaneseDate;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Sapatilhas_ESTest extends Sapatilhas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JapaneseDate japaneseDate0 = MockJapaneseDate.now();
      LocalDate localDate0 = MockLocalDate.from(japaneseDate0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Sapatilhas sapatilhas0 = new Sapatilhas((-200), true, "SZN|[x`N#l,u^J", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, (-200), artigo_Avaliação0, "", "", "", (-200), (-200), "SZN|[x`N#l,u^J");
      LocalDate localDate1 = MockLocalDate.ofEpochDay((-1L));
      String string0 = sapatilhas0.toString(localDate1);
      assertEquals("ID: 1\nTipo: \nEstado: NOVO\nN\u00FAmero de Donos: 0\nAvalia\u00E7\u00E3o: null\nDescri\u00E7\u00E3o: \nMarca: \nC\u00F3digo: \nPre\u00E7o Base: -200.0\nCorre\u00E7\u00E3o do Pre\u00E7o: -200.0\nTransportadora: SZN|[x`N#l,u^J\nTamanho Numerico: -200\nAtilhos: true\nCor: SZN|[x`N#l,u^J\nData de Lancamento: 2014-02-14\nTipo de Sapatilhas: PREMIUM\nPreco Final: 8600.0\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ThaiBuddhistDate thaiBuddhistDate0 = MockThaiBuddhistDate.now();
      LocalDate localDate0 = MockLocalDate.from(thaiBuddhistDate0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Sapatilhas sapatilhas0 = new Sapatilhas(45, true, "TP1.Sapatilhas", localDate0, sapatilhas_Tipos_Sapatilhas0, "TP1.Sapatilhas", artigo_Estado0, 45, artigo_Avaliação0, "TP1.Sapatilhas", ";{g+BlC$T}#B!Xt`$%", "~;/zvB`", 45, 45, "~;/zvB`");
      double double0 = sapatilhas0.precoFinal(localDate0);
      assertEquals(45.0, double0, 0.01);
      assertEquals("TP1.Sapatilhas", sapatilhas0.getCor());
      assertTrue(sapatilhas0.getAtilhos());
      assertEquals(45, sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setTransportadora("Tipo de Sapatilhas: ");
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      sapatilhas1.setTamanhoNumerico(2);
      boolean boolean0 = sapatilhas0.equals(sapatilhas1);
      assertEquals(2, sapatilhas1.getTamanhoNumerico());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(0, false, "", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, 0, artigo_Avaliação0, "", "", "\":", 0, 0, "\":");
      double double0 = sapatilhas0.precoFinal(localDate0);
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
      assertEquals("", sapatilhas0.getCor());
      assertFalse(sapatilhas0.getAtilhos());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(2);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Sapatilhas sapatilhas0 = new Sapatilhas(2, false, "", localDate0, sapatilhas_Tipos_Sapatilhas0, (String) null, artigo_Estado0, (-527), artigo_Avaliação0, (String) null, (String) null, "", 0.0, 2, (String) null);
      double double0 = sapatilhas0.precoFinal(localDate0);
      assertEquals(2, sapatilhas0.getTamanhoNumerico());
      assertFalse(sapatilhas0.getAtilhos());
      assertEquals(527.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      JapaneseDate japaneseDate0 = MockJapaneseDate.now();
      LocalDate localDate0 = MockLocalDate.from(japaneseDate0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Sapatilhas sapatilhas0 = new Sapatilhas((-200), true, "SZN|[x`N#l,u^J", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, (-200), artigo_Avaliação0, "", "", "", (-200), (-200), "SZN|[x`N#l,u^J");
      sapatilhas0.getTiposSapatilhas();
      assertEquals("SZN|[x`N#l,u^J", sapatilhas0.getCor());
      assertTrue(sapatilhas0.getAtilhos());
      assertEquals((-200), sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setTamanhoNumerico(3511);
      int int0 = sapatilhas0.getTamanhoNumerico();
      assertEquals(3511, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Sapatilhas sapatilhas0 = new Sapatilhas((-395), true, "kHtcRDvH>F.", (LocalDate) null, sapatilhas_Tipos_Sapatilhas0, "TP1.Artigo", artigo_Estado0, (-1893), artigo_Avaliação0, "TP1.Artigo", "TP1.Artigo", "\n", 0.0, (-1893), "mg");
      int int0 = sapatilhas0.getTamanhoNumerico();
      assertEquals((-395), int0);
      assertEquals("kHtcRDvH>F.", sapatilhas0.getCor());
      assertTrue(sapatilhas0.getAtilhos());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Sapatilhas sapatilhas0 = new Sapatilhas(3, false, "`,QTL4", (LocalDate) null, sapatilhas_Tipos_Sapatilhas0, "`,QTL4", artigo_Estado0, (-1), artigo_Avaliação0, "`,QTL4", "7c\"", "`,QTL4", 3, 1.0, "7c\"");
      sapatilhas0.getDataLancamento();
      assertEquals(3, sapatilhas0.getTamanhoNumerico());
      assertEquals("`,QTL4", sapatilhas0.getCor());
      assertFalse(sapatilhas0.getAtilhos());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setCor((String) null);
      sapatilhas0.getCor();
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(944);
      Clock clock0 = MockClock.tickMinutes(zoneOffset0);
      LocalDate localDate0 = MockLocalDate.now(clock0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(944, false, "D6wH7dK=Z&", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, 944, artigo_Avaliação0, "D6wH7dK=Z&", "D6wH7dK=Z&", "6_Dag 'i||q4o~W5", 944, 0.0, "");
      String string0 = sapatilhas0.getCor();
      assertEquals(944, sapatilhas0.getTamanhoNumerico());
      assertFalse(sapatilhas0.getAtilhos());
      assertEquals("D6wH7dK=Z&", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Sapatilhas sapatilhas0 = new Sapatilhas(0, false, "", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, 0, artigo_Avaliação0, (String) null, "", "", 0, (-1249.94355441), "");
      assertFalse(sapatilhas0.getAtilhos());
      
      sapatilhas0.setAtilhos(true);
      sapatilhas0.getAtilhos();
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(2564, true, (String) null, (LocalDate) null, sapatilhas_Tipos_Sapatilhas0, (String) null, artigo_Estado0, (-287), artigo_Avaliação0, (String) null, (String) null, (String) null, (-541.4185528735104), 2564, (String) null);
      sapatilhas0.setPrecoBase(2564);
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      assertEquals(2564, sapatilhas1.getTamanhoNumerico());
      assertEquals(2564, sapatilhas0.getTamanhoNumerico());
      assertTrue(sapatilhas1.getAtilhos());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(0, false, "Tipo de Sapatilhas: ", localDate0, sapatilhas_Tipos_Sapatilhas0, "ID: 1\nTipo: \nEstado: USADO\nN\u00FAmero de Donos: -182\nAvalia\u00E7\u00E3o: BOM\nDescri\u00E7\u00E3o: \nMarca: \nC\u00F3digo: \nPre\u00E7o Base: -1352.7200508161702\nCorre\u00E7\u00E3o do Pre\u00E7o: -1.0\nTransportadora: Tipo de Sapatilhas: \nTamanho Numerico: -182\nAtilhos: true\nCor: \nData de Lancamento: 2014-02-14\nTipo de Sapatilhas: NORMAL\nPreco Final: -1443.7200508161702\n", artigo_Estado0, 2332, artigo_Avaliação0, "Tipo de Sapatilhas: ", "", "R`@d?k!RqE", 0.0, (-1352.7200508161702), "ID: 1\nTipo: \nEstado: USADO\nN\u00FAmero de Donos: -182\nAvalia\u00E7\u00E3o: BOM\nDescri\u00E7\u00E3o: \nMarca: \nC\u00F3digo: \nPre\u00E7o Base: -1352.7200508161702\nCorre\u00E7\u00E3o do Pre\u00E7o: -1.0\nTransportadora: Tipo de Sapatilhas: \nTamanho Numerico: -182\nAtilhos: true\nCor: \nData de Lancamento: 2014-02-14\nTipo de Sapatilhas: NORMAL\nPreco Final: -1443.7200508161702\n");
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      assertEquals("Tipo de Sapatilhas: ", sapatilhas1.getCor());
      assertFalse(sapatilhas1.getAtilhos());
      assertEquals(0, sapatilhas1.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setId(0);
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      assertEquals(0, sapatilhas1.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(2564, true, (String) null, (LocalDate) null, sapatilhas_Tipos_Sapatilhas0, (String) null, artigo_Estado0, (-287), artigo_Avaliação0, (String) null, (String) null, (String) null, (-541.4185528735104), 2564, (String) null);
      sapatilhas0.setId((-287));
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      assertEquals(2564, sapatilhas0.getTamanhoNumerico());
      assertTrue(sapatilhas1.getAtilhos());
      assertEquals(2564, sapatilhas1.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JapaneseDate japaneseDate0 = MockJapaneseDate.now();
      LocalDate localDate0 = MockLocalDate.from(japaneseDate0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Sapatilhas sapatilhas0 = new Sapatilhas((-200), true, "SZN|[x`N#l,u^J", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, (-200), artigo_Avaliação0, "", "", "", (-200), (-200), "SZN|[x`N#l,u^J");
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      assertEquals((-200), sapatilhas0.getTamanhoNumerico());
      assertEquals("SZN|[x`N#l,u^J", sapatilhas1.getCor());
      assertTrue(sapatilhas1.getAtilhos());
      assertEquals((-200), sapatilhas1.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(2564, true, (String) null, (LocalDate) null, sapatilhas_Tipos_Sapatilhas0, (String) null, artigo_Estado0, (-287), artigo_Avaliação0, (String) null, (String) null, (String) null, (-541.4185528735104), 2564, (String) null);
      // Undeclared exception!
      try { 
        sapatilhas0.toString((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sapatilhas sapatilhas0 = null;
      try {
        sapatilhas0 = new Sapatilhas((Sapatilhas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      JapaneseDate japaneseDate0 = MockJapaneseDate.now();
      LocalDate localDate0 = MockLocalDate.from(japaneseDate0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Sapatilhas sapatilhas0 = new Sapatilhas((-200), true, "SZN|[x`N#l,u^J", localDate0, sapatilhas_Tipos_Sapatilhas0, "SZN|[x`N#l,u^J", artigo_Estado0, (-200), artigo_Avaliação0, "SZN|[x`N#l,u^J", "SZN|[x`N#l,u^J", "SZN|[x`N#l,u^J", (-200), (-200), "SZN|[x`N#l,u^J");
      double double0 = sapatilhas0.precoFinal(localDate0);
      assertEquals((-200.0), double0, 0.01);
      assertTrue(sapatilhas0.getAtilhos());
      assertEquals((-200), sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getDataLancamento();
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getAtilhos();
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getCor();
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(0, false, "", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, 0, artigo_Avaliação0, "", "", "\":", 0, 0, "\":");
      int int0 = sapatilhas0.getTamanhoNumerico();
      assertFalse(sapatilhas0.getAtilhos());
      assertEquals("", sapatilhas0.getCor());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getTiposSapatilhas();
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(2564, true, (String) null, (LocalDate) null, sapatilhas_Tipos_Sapatilhas0, (String) null, artigo_Estado0, (-287), artigo_Avaliação0, (String) null, (String) null, (String) null, (-541.4185528735104), 2564, (String) null);
      // Undeclared exception!
      try { 
        sapatilhas0.precoFinal((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.time.Period", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas((-182), true, "", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, (-182), artigo_Avaliação0, "", "", "", (-1352.7200508161702), (-1.0), "Tipo de Sapatilhas: ");
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      boolean boolean0 = sapatilhas1.equals(sapatilhas0);
      assertEquals("", sapatilhas1.getCor());
      assertTrue(sapatilhas0.equals((Object)sapatilhas1));
      assertEquals((-182), sapatilhas0.getTamanhoNumerico());
      assertTrue(sapatilhas1.getAtilhos());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas((-182), true, "", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, (-182), artigo_Avaliação0, "", "", "", (-182), (-182), "");
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      assertTrue(sapatilhas1.equals((Object)sapatilhas0));
      
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas1 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      sapatilhas1.setTiposSapatilhas(sapatilhas_Tipos_Sapatilhas1);
      boolean boolean0 = sapatilhas1.equals(sapatilhas0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setTransportadora(".i{zoTA`7J");
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      sapatilhas1.setDataLancamento(localDate0);
      boolean boolean0 = sapatilhas0.equals(sapatilhas1);
      assertEquals(0, sapatilhas1.getTamanhoNumerico());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setTransportadora("Tipo de Sapatilhas: ");
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      sapatilhas1.setCor("$mU.lb.%0D");
      boolean boolean0 = sapatilhas0.equals(sapatilhas1);
      assertFalse(boolean0);
      assertEquals(0, sapatilhas1.getTamanhoNumerico());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setTransportadora("Tipo de Sapatilhas: ");
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      sapatilhas1.setAtilhos(true);
      assertTrue(sapatilhas1.getAtilhos());
      assertFalse(sapatilhas0.getAtilhos());
      
      boolean boolean0 = sapatilhas0.equals(sapatilhas1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setTransportadora("Tipo deSapatilhas: ");
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      sapatilhas1.setTamanhoNumerico((-12));
      boolean boolean0 = sapatilhas0.equals(sapatilhas1);
      assertEquals((-12), sapatilhas1.getTamanhoNumerico());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas((-182), true, "", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, (-182), artigo_Avaliação0, "", "", "", (-1352.7200508161702), (-1.0), "Tipo de Sapatilhas: ");
      Sapatilhas sapatilhas1 = new Sapatilhas(0, false, "Tipo de Sapatilhas: ", localDate0, sapatilhas_Tipos_Sapatilhas0, "ID: 1\nTipo: \nEstado: USADO\nN\u00FAmero de Donos: -182\nAvalia\u00E7\u00E3o: BOM\nDescri\u00E7\u00E3o: \nMarca: \nC\u00F3digo: \nPre\u00E7o Base: -1352.7200508161702\nCorre\u00E7\u00E3o do Pre\u00E7o: -1.0\nTransportadora: Tipo de Sapatilhas: \nTamanho Numerico: -182\nAtilhos: true\nCor: \nData de Lancamento: 2014-02-14\nTipo de Sapatilhas: NORMAL\nPreco Final: -1443.7200508161702\n", artigo_Estado0, 2332, artigo_Avaliação0, "Tipo de Sapatilhas: ", "", "R`@d?k!RqE", 0.0, (-1352.7200508161702), "ID: 1\nTipo: \nEstado: USADO\nN\u00FAmero de Donos: -182\nAvalia\u00E7\u00E3o: BOM\nDescri\u00E7\u00E3o: \nMarca: \nC\u00F3digo: \nPre\u00E7o Base: -1352.7200508161702\nCorre\u00E7\u00E3o do Pre\u00E7o: -1.0\nTransportadora: Tipo de Sapatilhas: \nTamanho Numerico: -182\nAtilhos: true\nCor: \nData de Lancamento: 2014-02-14\nTipo de Sapatilhas: NORMAL\nPreco Final: -1443.7200508161702\n");
      boolean boolean0 = sapatilhas0.equals(sapatilhas1);
      assertFalse(boolean0);
      assertEquals((-182), sapatilhas0.getTamanhoNumerico());
      assertEquals(0, sapatilhas1.getTamanhoNumerico());
      assertFalse(sapatilhas1.getAtilhos());
      assertEquals("Tipo de Sapatilhas: ", sapatilhas1.getCor());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setTransportadora("Tipo de Sapatilhas: ");
      Sapatilhas sapatilhas1 = sapatilhas0.clone();
      // Undeclared exception!
      try { 
        sapatilhas0.equals(sapatilhas1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.Sapatilhas", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      JapaneseDate japaneseDate0 = MockJapaneseDate.now();
      LocalDate localDate0 = MockLocalDate.from(japaneseDate0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Sapatilhas sapatilhas0 = new Sapatilhas((-200), true, "SZN|[x`N#l,u^J", localDate0, sapatilhas_Tipos_Sapatilhas0, "SZN|[x`N#l,u^J", artigo_Estado0, (-200), artigo_Avaliação0, "SZN|[x`N#l,u^J", "SZN|[x`N#l,u^J", "SZN|[x`N#l,u^J", (-200), (-200), "SZN|[x`N#l,u^J");
      boolean boolean0 = sapatilhas0.equals((Object) null);
      assertEquals((-200), sapatilhas0.getTamanhoNumerico());
      assertFalse(boolean0);
      assertTrue(sapatilhas0.getAtilhos());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas((-182), true, "", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, (-182), artigo_Avaliação0, "", "", "", (-1352.7200508161702), (-1.0), "Tipo de Sapatilhas: ");
      boolean boolean0 = sapatilhas0.equals(sapatilhas0);
      assertTrue(sapatilhas0.getAtilhos());
      assertEquals((-182), sapatilhas0.getTamanhoNumerico());
      assertEquals("", sapatilhas0.getCor());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Object object0 = new Object();
      boolean boolean0 = sapatilhas0.equals(object0);
      assertEquals(0, sapatilhas0.getTamanhoNumerico());
      assertFalse(sapatilhas0.getAtilhos());
      assertFalse(boolean0);
  }
}