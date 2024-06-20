/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 16:57:46 GMT 2024
 */

package TP1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import TP1.Artigo;
import TP1.Malas;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Malas_ESTest extends Malas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "Preco Final: ", 1704, "Preco Final: ", artigo_Estado0, 1704, artigo_Avaliação0, "Preco Final: ", "Preco Final: ", "Preco Final: ", 1704, (-3568.91194), "Preco Final: ");
      Instant instant0 = MockInstant.ofEpochMilli((-1048L));
      ZoneOffset zoneOffset0 = ZoneOffset.ofTotalSeconds(1568);
      Clock clock0 = MockClock.fixed(instant0, zoneOffset0);
      LocalDate localDate0 = MockLocalDate.now(clock0);
      double double0 = malas0.precoFinal(localDate0);
      assertEquals((-472961.28802), double0, 0.01);
      assertEquals(0.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 10.0F, (String) null, 2146366053, (String) null, artigo_Estado0, 2146366053, artigo_Avaliação0, (String) null, (String) null, "7s", 2146366053, 2146366053, "7s");
      LocalDate localDate0 = MockLocalDate.now();
      double double0 = malas0.precoFinal(localDate0);
      assertEquals((-4.6068829085432023E18), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas malas1 = new Malas(malas0);
      malas1.setAno_da_colecao((-1227));
      boolean boolean0 = malas1.equals(malas0);
      assertEquals((-1227), malas1.getAno_da_colecao());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-1418.7422F), "", 2617, "m_<XQl[EN;ql4k", artigo_Estado0, 0, artigo_Avaliação0, "m_<XQl[EN;ql4k", "TP1.Malas", "", (-1.0), (-927.4921488212774), "!cMRs;bYY0%7");
      Malas malas1 = new Malas();
      malas1.setTipo_mala(malas_Tipos_Malas0);
      boolean boolean0 = malas0.equals(malas1);
      assertEquals("", malas0.getMaterial());
      assertEquals(2617, malas0.getAno_da_colecao());
      assertFalse(boolean0);
      assertEquals(0, malas1.getAno_da_colecao());
      assertEquals(0.0F, malas1.getDim(), 0.01F);
      assertEquals((-1418.7422F), malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 30.0F, (String) null, (-1437), "Preco Final: ", artigo_Estado0, 549, artigo_Avaliação0, (String) null, "TP1.Malas", "TP1.Malas", (-1437), 549, "Preco Final: ");
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      double double0 = malas0.precoFinal(localDate0);
      assertEquals(2840461.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 270.0F, "elGq~S-O6j", (-2916), "elGq~S-O6j", artigo_Estado0, (-2916), artigo_Avaliação0, "elGq~S-O6j", "Avalia\u00E7\u00E3o: ", "", 270.0F, 0.0, "");
      malas0.getTipo_mala();
      assertEquals(270.0F, malas0.getDim(), 0.01F);
      assertEquals("elGq~S-O6j", malas0.getMaterial());
      assertEquals((-2916), malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setMaterial((String) null);
      malas0.getMaterial();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1204.6F, "", 0, "", artigo_Estado0, 384, artigo_Avaliação0, "", "Wf[\":ySZ+v=3W(wH;", "Ano da cole\u00E7\u00E3o: ", (-547.751204855), 0.0, "9iwt^I!]5b,");
      String string0 = malas0.getMaterial();
      assertEquals(0, malas0.getAno_da_colecao());
      assertEquals("", string0);
      assertEquals(1204.6F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Malas malas0 = new Malas();
      float float0 = malas0.getDim();
      assertEquals(0, malas0.getAno_da_colecao());
      assertEquals(0.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-48.3289F), "Tipo: ", (-1824), "k{sM,/{Y~ZVh5<1/g", artigo_Estado0, 0, artigo_Avaliação0, "0~2]\u0002{/1c[d_", "k{sM,/{Y~ZVh5<1/g", "k{sM,/{Y~ZVh5<1/g", (-90.7259790295), (-90.7259790295), "Tipo: ");
      float float0 = malas0.getDim();
      assertEquals((-48.3289F), float0, 0.01F);
      assertEquals("Tipo: ", malas0.getMaterial());
      assertEquals((-1824), malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "", 668, "Material: ", artigo_Estado0, 668, artigo_Avaliação0, "}?0`+s:5", "Dimens\u00F5es: ", "\"# KXl7\"yRXn{T/tI", 0.0, (-1.0), "%P3fR");
      int int0 = malas0.getAno_da_colecao();
      assertEquals(668, int0);
      assertEquals("", malas0.getMaterial());
      assertEquals(0.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1204.6F, "", 0, "", artigo_Estado0, 384, artigo_Avaliação0, "", "Wf[\":ySZ+v=3W(wH;", "Ano da cole\u00E7\u00E3o: ", (-547.751204855), 0.0, "9iwt^I!]5b,");
      malas0.setAno_da_colecao((-1737));
      int int0 = malas0.getAno_da_colecao();
      assertEquals((-1737), int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1461.6343F, "Evf]", (-3175), "c0+H", artigo_Estado0, (-3175), artigo_Avaliação0, "c0+H", "c0+H", "c0+H", 1461.6343F, (-3175), (String) null);
      malas0.setNumeroDonos(1);
      Malas malas1 = malas0.clone();
      assertEquals(1461.6343F, malas0.getDim(), 0.01F);
      assertTrue(malas1.equals((Object)malas0));
      assertEquals((-3175), malas1.getAno_da_colecao());
      assertEquals("Evf]", malas1.getMaterial());
      assertEquals((-3175), malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setId(0);
      Malas malas1 = malas0.clone();
      assertEquals(0, malas1.getAno_da_colecao());
      assertEquals(0.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-1016.27F), "", (-547), "", artigo_Estado0, (-547), artigo_Avaliação0, (String) null, "", (String) null, (-1.0), (-1016.27F), "$VALUES");
      malas0.setId((-547));
      Malas malas1 = malas0.clone();
      assertEquals((-547), malas0.getAno_da_colecao());
      assertEquals((-1016.27F), malas1.getDim(), 0.01F);
      assertEquals((-547), malas1.getAno_da_colecao());
      assertTrue(malas1.equals((Object)malas0));
      assertEquals("", malas1.getMaterial());
      assertEquals((-1016.27F), malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1461.6343F, "Evf]", (-3175), "c0+H", artigo_Estado0, (-3175), artigo_Avaliação0, "c0+H", "c0+H", "c0+H", 1461.6343F, (-3175), (String) null);
      Malas malas1 = malas0.clone();
      assertTrue(malas1.equals((Object)malas0));
      assertEquals(1461.6343F, malas0.getDim(), 0.01F);
      assertEquals((-3175), malas0.getAno_da_colecao());
      assertEquals("Evf]", malas1.getMaterial());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1.0F, "", 2140, "", artigo_Estado0, 2140, artigo_Avaliação0, "", "$VALUES", "JsO|P5p_lGK8^$", 1.0F, 1.0, "j#_N%K}%&\"!xyh_m3;");
      Malas malas1 = malas0.clone();
      assertEquals(1.0F, malas0.getDim(), 0.01F);
      assertEquals("", malas1.getMaterial());
      assertTrue(malas1.equals((Object)malas0));
      assertEquals(2140, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1705.8376F, " ", (-2330), "0J", artigo_Estado0, (-66), artigo_Avaliação0, " ", " ", " ", (-695.0), 1364.2, "0J");
      // Undeclared exception!
      try { 
        malas0.precoFinal((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.Malas", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 10.0F, (String) null, 2146366053, (String) null, artigo_Estado0, 2146366053, artigo_Avaliação0, (String) null, (String) null, "7s", 2146366053, 2146366053, "7s");
      Malas malas1 = new Malas(malas0);
      // Undeclared exception!
      try { 
        malas0.equals(malas1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Malas malas0 = null;
      try {
        malas0 = new Malas((Malas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1204.6F, "", 0, "", artigo_Estado0, 384, artigo_Avaliação0, "", "Wf[\":ySZ+v=3W(wH;", "Ano da cole\u00E7\u00E3o: ", (-547.751204855), 0.0, "9iwt^I!]5b,");
      Clock clock0 = MockClock.systemUTC();
      LocalDate localDate0 = MockLocalDate.now(clock0);
      double double0 = malas0.precoFinal(localDate0);
      assertEquals(0, malas0.getAno_da_colecao());
      assertEquals(1204.6F, malas0.getDim(), 0.01F);
      assertEquals((-547.751204855), double0, 0.01);
      assertEquals("", malas0.getMaterial());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Malas malas0 = new Malas();
      Period period0 = Period.ZERO;
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      double double0 = malas0.precoFinal(localDate0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals(0, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1204.6F, "", 0, "", artigo_Estado0, 384, artigo_Avaliação0, "", "Wf[\":ySZ+v=3W(wH;", "Ano da cole\u00E7\u00E3o: ", (-547.751204855), 0.0, "9iwt^I!]5b,");
      float float0 = malas0.getDim();
      assertEquals(0, malas0.getAno_da_colecao());
      assertEquals(1204.6F, float0, 0.01F);
      assertEquals("", malas0.getMaterial());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1204.6F, "", 0, "", artigo_Estado0, 384, artigo_Avaliação0, "", "Wf[\":ySZ+v=3W(wH;", "Ano da cole\u00E7\u00E3o: ", (-547.751204855), 0.0, "9iwt^I!]5b,");
      int int0 = malas0.getAno_da_colecao();
      assertEquals("", malas0.getMaterial());
      assertEquals(0, int0);
      assertEquals(1204.6F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.getTipo_mala();
      assertEquals(0, malas0.getAno_da_colecao());
      assertEquals(0.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "$ceB@n3{", 1, "'xJ_h*Q%?1b~:JZ)", artigo_Estado0, 1, artigo_Avaliação0, "$ceB@n3{", "+[(U", (String) null, 435.3, 435.3, "PREMIUM");
      String string0 = malas0.getMaterial();
      assertEquals(1, malas0.getAno_da_colecao());
      assertNotNull(string0);
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertEquals("$ceB@n3{", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1900.4937F, "k!a;", 1543, "k!a;", artigo_Estado0, 1543, artigo_Avaliação0, "k!a;", "k!a;", "k!a;", 1900.4937F, 1543, "k!a;");
      LocalDate localDate0 = MockLocalDate.of(1, 1, 1);
      String string0 = malas0.toString(localDate0);
      assertEquals("ID: 1\nTipo: k!a;\nEstado: USADO\nN\u00FAmero de Donos: 1543\nAvalia\u00E7\u00E3o: BOM\nDescri\u00E7\u00E3o: k!a;\nMarca: k!a;\nC\u00F3digo: k!a;\nPre\u00E7o Base: 1900.49365234375\nCorre\u00E7\u00E3o do Pre\u00E7o: 1543.0\nTransportadora: k!a;\nTipo de mala: PREMIUM\nDimens\u00F5es: 1900.4937\nMaterial: k!a;\nAno da cole\u00E7\u00E3o: 1543\nPreco Final: -3567058.5063476562\n", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas malas1 = new Malas(malas0);
      boolean boolean0 = malas0.equals(malas1);
      assertTrue(boolean0);
      assertEquals(0, malas1.getAno_da_colecao());
      assertEquals(0.0F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 10.502717F, (String) null, 2146366053, (String) null, artigo_Estado0, 2146366053, artigo_Avaliação0, (String) null, (String) null, "f", 2146366053, 2146366053, "f");
      Malas malas1 = new Malas(malas0);
      malas0.setMaterial("d");
      boolean boolean0 = malas0.equals(malas1);
      assertEquals(10.502717F, malas1.getDim(), 0.01F);
      assertEquals(2146366053, malas1.getAno_da_colecao());
      assertFalse(boolean0);
      assertEquals(2146366053, malas0.getAno_da_colecao());
      assertEquals(10.502717F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1133.647F, "n^am@cjBz", 42, "n^am@cjBz", artigo_Estado0, 42, artigo_Avaliação0, "n^am@cjBz", "n^am@cjBz", "n^am@cjBz", 42, 42, "n^am@cjBz");
      Malas malas1 = new Malas(malas_Tipos_Malas0, 42, "n^am@cjBz", 42, "n^am@cjBz", artigo_Estado0, 42, artigo_Avaliação0, "n^am@cjBz", "n^am@cjBz", "n^am@cjBz", 42, 42, "n^am@cjBz");
      boolean boolean0 = malas0.equals(malas1);
      assertFalse(malas1.equals((Object)malas0));
      assertEquals(42, malas1.getAno_da_colecao());
      assertFalse(boolean0);
      assertEquals(42.0F, malas1.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-3072.78F), "]", (-11), "]", artigo_Estado0, (-78), artigo_Avaliação0, "lZOrnOymm+Z$_R9", "lZOrnOymm+Z$_R9", "]", (-78), (-11), "lZOrnOymm+Z$_R9");
      Malas malas1 = new Malas();
      boolean boolean0 = malas0.equals(malas1);
      assertEquals((-11), malas0.getAno_da_colecao());
      assertEquals("]", malas0.getMaterial());
      assertEquals(0.0F, malas1.getDim(), 0.01F);
      assertFalse(boolean0);
      assertEquals((-3072.78F), malas0.getDim(), 0.01F);
      assertEquals(0, malas1.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 1900.4937F, "k!a;", 1543, "k!a;", artigo_Estado0, 1543, artigo_Avaliação0, "k!a;", "k!a;", "k!a;", 1900.4937F, 1543, "k!a;");
      boolean boolean0 = malas0.equals("ID: 1\nTipo: k!a;\nEstado: USADO\nN\u00FAmero de Donos: 1543\nAvalia\u00E7\u00E3o: BOM\nDescri\u00E7\u00E3o: k!a;\nMarca: k!a;\nC\u00F3digo: k!a;\nPre\u00E7o Base: 1900.49365234375\nCorre\u00E7\u00E3o do Pre\u00E7o: 1543.0\nTransportadora: k!a;\nTipo de mala: PREMIUM\nDimens\u00F5es: 1900.4937\nMaterial: k!a;\nAno da cole\u00E7\u00E3o: 1543\nPreco Final: -3567058.5063476562\n");
      assertEquals(1543, malas0.getAno_da_colecao());
      assertFalse(boolean0);
      assertEquals(1900.4937F, malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 10.502717F, (String) null, 2146366053, (String) null, artigo_Estado0, 2146366053, artigo_Avaliação0, (String) null, (String) null, "f", 2146366053, 2146366053, "f");
      boolean boolean0 = malas0.equals((Object) null);
      assertEquals(2146366053, malas0.getAno_da_colecao());
      assertEquals(10.502717F, malas0.getDim(), 0.01F);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Malas malas0 = new Malas();
      boolean boolean0 = malas0.equals(malas0);
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      assertTrue(boolean0);
      assertEquals(0, malas0.getAno_da_colecao());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Malas malas0 = new Malas();
      assertEquals(0.0F, malas0.getDim(), 0.01F);
      
      malas0.setDim((-1L));
      malas0.clone();
      assertEquals((-1.0F), malas0.getDim(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Malas malas0 = new Malas();
      // Undeclared exception!
      try { 
        malas0.toString((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.Malas", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Malas malas0 = new Malas();
      Malas malas1 = malas0.clone();
      malas0.setAno_da_colecao((-392));
      boolean boolean0 = malas1.equals(malas0);
      assertEquals((-392), malas0.getAno_da_colecao());
      assertFalse(boolean0);
  }
}