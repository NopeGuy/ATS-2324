/*
 * This file was automatically generated by EvoSuite
 * Fri May 24 09:31:07 GMT 2024
 */

package Model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Model.Artigo;
import Model.TShirt;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.Chronology;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TShirt_ESTest extends TShirt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.L;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.RISCAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, ";QvR!1uuiS09PH", artigo_Estado0, (-1754), artigo_Avalia��o0, ";QvR!1uuiS09PH", ";QvR!1uuiS09PH", "9k>0[SJ", (-1754), (-1818.2481716918523), "Model.TShirt$Padrao");
      FormatStyle formatStyle0 = FormatStyle.SHORT;
      DateTimeFormatter dateTimeFormatter0 = DateTimeFormatter.ofLocalizedDate(formatStyle0);
      Chronology chronology0 = dateTimeFormatter0.getChronology();
      LocalDate localDate0 = (LocalDate)chronology0.dateEpochDay(0L);
      String string0 = tShirt0.toString(localDate0);
      assertEquals("ID: 1\nTipo: ;QvR!1uuiS09PH\nEstado: USADO\nN\u00FAmero de Donos: -1754\nAvalia\u00E7\u00E3o: SATISFAT\u00D3RIO\nDescri\u00E7\u00E3o: ;QvR!1uuiS09PH\nMarca: ;QvR!1uuiS09PH\nC\u00F3digo: 9k>0[SJ\nPre\u00E7o Base: -1754.0\nCorre\u00E7\u00E3o do Pre\u00E7o: -1818.2481716918523\nTransportadora: Model.TShirt$Padrao\nTamanho: L\nPadrao: RISCAS\nPre\u00E7o Final: -1754.0\n", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.L;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, ")KwL%[J>Zc", artigo_Estado0, (-682), artigo_Avalia��o0, ")KwL%[J>Zc", "Pre\u00E7o Final: ", ")KwL%[J>Zc", 0.0, 2690.5124041028494, "+3C|e");
      boolean boolean0 = tShirt0.equals(tShirt0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.L;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.RISCAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.BOM;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, (String) null, artigo_Estado0, 399, artigo_Avalia��o0, (String) null, "Avalia\u00E7\u00E3o: ", (String) null, 399, 0.5, (String) null);
      double double0 = tShirt0.precoFinal((LocalDate) null);
      assertEquals(399.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.S;
      tShirt0.setTamanho(tShirt_Tamanho0);
      TShirt.Tamanho tShirt_Tamanho1 = tShirt0.getTamanho();
      assertEquals(TShirt.Tamanho.S, tShirt_Tamanho1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.XL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.BOM;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "SATISFAT\u00D3RIO", artigo_Estado0, 3, artigo_Avalia��o0, "Ex-gkDY+8L%wQoG=eHT", "Ex-gkDY+8L%wQoG=eHT", "Ex-gkDY+8L%wQoG=eHT", 1352.750832, 1104.9, "");
      TShirt.Padrao tShirt_Padrao1 = tShirt0.getPadrao();
      assertSame(tShirt_Padrao1, tShirt_Padrao0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.XL;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.LISO;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "", artigo_Estado0, (-1), artigo_Avalia��o0, "", "", "", (-1), (-1), "$_h85M-We");
      TShirt tShirt1 = tShirt0.clone();
      assertTrue(tShirt1.equals((Object)tShirt0));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.setNumeroDonos(779);
      TShirt tShirt1 = tShirt0.clone();
      assertTrue(tShirt1.equals((Object)tShirt0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.setId(0);
      TShirt tShirt1 = tShirt0.clone();
      assertNull(tShirt1.getAvaliacao());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.setId((-36));
      TShirt tShirt1 = tShirt0.clone();
      assertEquals(0, tShirt1.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.S;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.LISO;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "", artigo_Estado0, 0, artigo_Avalia��o0, "", "", "", 741.0, 741.0, "");
      TShirt tShirt1 = tShirt0.clone();
      assertTrue(tShirt1.equals((Object)tShirt0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.M;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.LISO;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.BOM;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "Descri\u00E7\u00E3o: ", artigo_Estado0, (-5902), artigo_Avalia��o0, "Tamanho: ", (String) null, "Tamanho: ", 1.0, (-1.0), "Lm6Y:|xN[^GT5KC!r");
      TShirt tShirt1 = tShirt0.clone();
      assertTrue(tShirt1.equals((Object)tShirt0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TShirt tShirt0 = null;
      try {
        tShirt0 = new TShirt((TShirt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Model.Artigo", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      double double0 = tShirt0.precoFinal((LocalDate) null);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.S;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.RISCAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "Pre\u00E7o Final: ", artigo_Estado0, 3151, artigo_Avalia��o0, "Pre\u00E7o Final: ", "rO", "Pre\u00E7o Final: ", (-1017.26952), 3151, "Pre\u00E7o Final: ");
      LocalDate localDate0 = MockLocalDate.ofEpochDay(3151);
      double double0 = tShirt0.precoFinal(localDate0);
      assertEquals((-508.63476), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.getPadrao();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.getTamanho();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.setNumeroDonos(1856);
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.RISCAS;
      tShirt0.setPadrao(tShirt_Padrao0);
      Period period0 = Period.ofYears(1856);
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      String string0 = tShirt0.toString(localDate0);
      assertEquals("ID: 1\nTipo: \nEstado: null\nN\u00FAmero de Donos: 1856\nAvalia\u00E7\u00E3o: null\nDescri\u00E7\u00E3o: \nMarca: \nC\u00F3digo: \nPre\u00E7o Base: 0.0\nCorre\u00E7\u00E3o do Pre\u00E7o: 0.0\nTransportadora: null\nTamanho: null\nPadrao: RISCAS\nPre\u00E7o Final: 0.0\n", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      tShirt0.setPadrao(tShirt_Padrao0);
      double double0 = tShirt0.precoFinal(localDate0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.XL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.BOM;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "SATISFAT\u00D3RIO", artigo_Estado0, 3, artigo_Avalia��o0, "Ex-gkDY+8L%wQoG=eHT", "Ex-gkDY+8L%wQoG=eHT", "Ex-gkDY+8L%wQoG=eHT", 3, 1104.9, "Ex-gkDY+8L%wQoG=eHT");
      TShirt.Tamanho tShirt_Tamanho1 = TShirt.Tamanho.M;
      TShirt tShirt1 = new TShirt(tShirt_Tamanho1, tShirt_Padrao0, "SATISFAT\u00D3RIO", artigo_Estado0, 3, artigo_Avalia��o0, "Ex-gkDY+8L%wQoG=eHT", "Ex-gkDY+8L%wQoG=eHT", "Ex-gkDY+8L%wQoG=eHT", 3, 3, "SATISFAT\u00D3RIO");
      boolean boolean0 = tShirt0.equals(tShirt1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      boolean boolean0 = tShirt0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      Object object0 = new Object();
      boolean boolean0 = tShirt0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.L;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avalia��o artigo_Avalia��o0 = Artigo.Avalia��o.SATISFAT�RIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, ")KwL%[J>Zc", artigo_Estado0, (-682), artigo_Avalia��o0, ")KwL%[J>Zc", "Pre\u00E7o Final: ", ")KwL%[J>Zc", 0.0, 2690.5124041028494, "+3C|e");
      TShirt tShirt1 = new TShirt(tShirt0);
      assertTrue(tShirt1.equals((Object)tShirt0));
      
      TShirt.Padrao tShirt_Padrao1 = TShirt.Padrao.LISO;
      tShirt1.setPadrao(tShirt_Padrao1);
      boolean boolean0 = tShirt0.equals(tShirt1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      TShirt tShirt1 = new TShirt();
      boolean boolean0 = tShirt0.equals(tShirt1);
      assertTrue(boolean0);
  }
}
