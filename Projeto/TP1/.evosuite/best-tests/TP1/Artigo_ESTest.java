/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 16:54:20 GMT 2024
 */

package TP1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import TP1.Artigo;
import TP1.Malas;
import TP1.Sapatilhas;
import TP1.TShirt;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Artigo_ESTest extends Artigo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setCorrecaoPreco(4686.7864722);
      sapatilhas0.equals(sapatilhas1);
      assertEquals(4686.7864722, sapatilhas1.getCorrecaoPreco(), 0.01);
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setPrecoBase(2353.0);
      sapatilhas0.equals(sapatilhas1);
      assertEquals(2353.0, sapatilhas1.getPrecoBase(), 0.01);
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setNumeroDonos(1);
      sapatilhas0.equals(sapatilhas1);
      assertEquals(1, sapatilhas1.getNumeroDonos());
      assertEquals(0, sapatilhas0.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas();
      assertEquals(2, sapatilhas1.getId());
      
      sapatilhas1.setId(0);
      sapatilhas0.equals(sapatilhas1);
      assertEquals(1, sapatilhas0.getId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Malas malas0 = new Malas();
      LocalDate localDate0 = MockLocalDate.ofEpochDay((-850L));
      String string0 = malas0.toString(localDate0);
      assertEquals("ID: 1\nTipo: \nEstado: null\nN\u00FAmero de Donos: 0\nAvalia\u00E7\u00E3o: null\nDescri\u00E7\u00E3o: \nMarca: \nC\u00F3digo: \nPre\u00E7o Base: 0.0\nCorre\u00E7\u00E3o do Pre\u00E7o: 0.0\nTransportadora: null\nTipo de mala: null\nDimens\u00F5es: 0.0\nMaterial: \nAno da cole\u00E7\u00E3o: 0\nPreco Final: 0.0\n", string0);
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      double double0 = sapatilhas0.precoFinal((LocalDate) null);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0, sapatilhas0.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Month month0 = Month.AUGUST;
      LocalDate localDate0 = MockLocalDate.of(1, month0, 1);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Sapatilhas sapatilhas0 = new Sapatilhas(1, true, "M", localDate0, sapatilhas_Tipos_Sapatilhas0, "M", artigo_Estado0, 1, artigo_Avaliação0, (String) null, "", "M", 1, 1, "");
      double double0 = sapatilhas0.precoFinal(localDate0);
      assertEquals("M", sapatilhas0.getCodigo());
      assertEquals("", sapatilhas0.getMarca());
      assertEquals(1, sapatilhas0.getId());
      assertEquals("", sapatilhas0.getTransportadora());
      assertEquals(0.5, double0, 0.01);
      assertEquals("M", sapatilhas0.getTipo());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Period period0 = Period.ofMonths(0);
      IsoChronology isoChronology0 = period0.getChronology();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0, (ZoneId) zoneOffset0);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(0, false, "", localDate0, sapatilhas_Tipos_Sapatilhas0, ",Y0@", artigo_Estado0, 0, artigo_Avaliação0, "", "", "", (-1.0), 0, "ErRnt=tE5B");
      double double0 = sapatilhas0.precoFinal(localDate0);
      assertEquals("ErRnt=tE5B", sapatilhas0.getTransportadora());
      assertEquals(1, sapatilhas0.getId());
      assertEquals("", sapatilhas0.getDescricao());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals((-1.0), double0, 0.01);
      assertEquals("", sapatilhas0.getCodigo());
      assertEquals("", sapatilhas0.getMarca());
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals(",Y0@", sapatilhas0.getTipo());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.L;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.LISO;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "", artigo_Estado0, 3775, artigo_Avaliação0, "Atilhos: ", "Tipo de Sapatilhas: ", "", 3775, 3775, "Dimens\u00F5es: ");
      String string0 = tShirt0.getTransportadora();
      assertEquals("Atilhos: ", tShirt0.getDescricao());
      assertEquals("", tShirt0.getCodigo());
      assertEquals(3775, tShirt0.getNumeroDonos());
      assertEquals(1, tShirt0.getId());
      assertEquals(3775.0, tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals("Tipo de Sapatilhas: ", tShirt0.getMarca());
      assertEquals("Dimens\u00F5es: ", string0);
      assertEquals(3775.0, tShirt0.getPrecoBase(), 0.01);
      assertEquals("", tShirt0.getTipo());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setTransportadora("");
      sapatilhas0.getTransportadora();
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(0, sapatilhas0.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setTipo((String) null);
      sapatilhas0.getTipo();
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.L;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.LISO;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "TP1.Malas", artigo_Estado0, 0, artigo_Avaliação0, "TP1.Malas", "TP1.Malas", "TP1.Malas", 0, 0.0, "p?)e^^eQ(oN0>tclg");
      String string0 = tShirt0.getTipo();
      assertEquals("TP1.Malas", tShirt0.getCodigo());
      assertEquals("TP1.Malas", tShirt0.getDescricao());
      assertEquals("p?)e^^eQ(oN0>tclg", tShirt0.getTransportadora());
      assertEquals(0, tShirt0.getNumeroDonos());
      assertEquals(0.0, tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals("TP1.Malas", tShirt0.getMarca());
      assertEquals("TP1.Malas", string0);
      assertEquals(1, tShirt0.getId());
      assertEquals(0.0, tShirt0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      double double0 = tShirt0.getPrecoBase();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, tShirt0.getNumeroDonos());
      assertEquals(1, tShirt0.getId());
      assertEquals(0.0, tShirt0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.S;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.LISO;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "Tamanho Numerico: ", artigo_Estado0, (-1616), artigo_Avaliação0, (String) null, "", "Pw+s8uCCHbom", 1079.498944222, 2436.1129663597794, "Tamanho Numerico: ");
      double double0 = tShirt0.getPrecoBase();
      assertEquals(1, tShirt0.getId());
      assertEquals("Tamanho Numerico: ", tShirt0.getTransportadora());
      assertEquals(1079.498944222, double0, 0.01);
      assertEquals("", tShirt0.getMarca());
      assertEquals((-1616), tShirt0.getNumeroDonos());
      assertEquals("Pw+s8uCCHbom", tShirt0.getCodigo());
      assertEquals("Tamanho Numerico: ", tShirt0.getTipo());
      assertEquals(2436.1129663597794, tShirt0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Malas malas0 = new Malas();
      int int0 = malas0.getNumeroDonos();
      assertEquals(0, int0);
      assertEquals(1, malas0.getId());
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setNumeroDonos((-2379));
      int int0 = malas0.getNumeroDonos();
      assertEquals((-2379), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.S;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "dO._MT+P+.X'r5wc", artigo_Estado0, 3, artigo_Avaliação0, "dO._MT+P+.X'r5wc", "PREMIUM", "Descri\u00E7\u00E3o: ", 2071.8, 3, "-d");
      String string0 = tShirt0.getMarca();
      assertEquals("Descri\u00E7\u00E3o: ", tShirt0.getCodigo());
      assertEquals(3.0, tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals("PREMIUM", string0);
      assertEquals(1, tShirt0.getId());
      assertEquals(0, tShirt0.getNumeroDonos());
      assertEquals(2071.8, tShirt0.getPrecoBase(), 0.01);
      assertEquals("-d", tShirt0.getTransportadora());
      assertEquals("dO._MT+P+.X'r5wc", tShirt0.getTipo());
      assertEquals("dO._MT+P+.X'r5wc", tShirt0.getDescricao());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getMarca();
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setId((-1793));
      int int0 = sapatilhas0.getId();
      assertEquals((-1793), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.getEstado();
      assertEquals(1, tShirt0.getId());
      assertEquals(0.0, tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals(0.0, tShirt0.getPrecoBase(), 0.01);
      assertEquals(0, tShirt0.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, (String) null, 0, (String) null, artigo_Estado0, 1133, artigo_Avaliação0, (String) null, "?Dq#I%6WK1rP&Q9YG[z", "?Dq#I%6WK1rP&Q9YG[z", 0.0, 0.0F, (String) null);
      String string0 = malas0.getDescricao();
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
      assertNull(string0);
      assertEquals(1133, malas0.getNumeroDonos());
      assertEquals(1, malas0.getId());
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.getDescricao();
      assertEquals(1, tShirt0.getId());
      assertEquals(0, tShirt0.getNumeroDonos());
      assertEquals(0.0, tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals(0.0, tShirt0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Malas malas0 = new Malas(malas_Tipos_Malas0, (-2659.44F), (String) null, 754, (String) null, artigo_Estado0, 754, artigo_Avaliação0, "", "Xnp$C2%;'R^!`0q", "Xnp$C2%;'R^!`0q", 754, 390.6867951423249, "TP1.Artigo");
      double double0 = malas0.getCorrecaoPreco();
      assertEquals(1, malas0.getId());
      assertEquals(754.0, malas0.getPrecoBase(), 0.01);
      assertEquals("Xnp$C2%;'R^!`0q", malas0.getCodigo());
      assertEquals(754, malas0.getNumeroDonos());
      assertEquals("", malas0.getDescricao());
      assertEquals("Xnp$C2%;'R^!`0q", malas0.getMarca());
      assertEquals(390.6867951423249, double0, 0.01);
      assertEquals("TP1.Artigo", malas0.getTransportadora());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Malas malas0 = new Malas();
      malas0.setCorrecaoPreco((-0.05571229996469097));
      double double0 = malas0.getCorrecaoPreco();
      assertEquals((-0.05571229996469097), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      Sapatilhas sapatilhas0 = new Sapatilhas(1177, false, (String) null, localDate0, sapatilhas_Tipos_Sapatilhas0, "Marca: ", artigo_Estado0, 412, artigo_Avaliação0, "SATISFAT\u00D3RIO", (String) null, (String) null, 412, 1177, "SATISFAT\u00D3RIO");
      String string0 = sapatilhas0.getCodigo();
      assertEquals(1, sapatilhas0.getId());
      assertEquals("SATISFAT\u00D3RIO", sapatilhas0.getTransportadora());
      assertNull(string0);
      assertEquals(412.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals("Marca: ", sapatilhas0.getTipo());
      assertEquals("SATISFAT\u00D3RIO", sapatilhas0.getDescricao());
      assertEquals(1177.0, sapatilhas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.getCodigo();
      assertEquals(0.0, tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals(1, tShirt0.getId());
      assertEquals(0.0, tShirt0.getPrecoBase(), 0.01);
      assertEquals(0, tShirt0.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getAvaliacao();
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0, sapatilhas0.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      tShirt0.equals(tShirt0);
      assertEquals(1, tShirt0.getId());
      assertEquals(0.0, tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals(0, tShirt0.getNumeroDonos());
      assertEquals(0.0, tShirt0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.M;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.RISCAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "q3<", artigo_Estado0, (-2993), artigo_Avaliação0, "", "q3<", "", (-2993), (-2993), "");
      Artigo artigo0 = tShirt0.clone();
      assertEquals((-2993), artigo0.getNumeroDonos());
      assertEquals(1, artigo0.getId());
      assertEquals((-2993.0), tShirt0.getPrecoBase(), 0.01);
      assertEquals((-2993.0), artigo0.getPrecoBase(), 0.01);
      assertEquals(1, tShirt0.getId());
      assertEquals((-2993), tShirt0.getNumeroDonos());
      assertEquals((-2993.0), tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals("q3<", artigo0.getMarca());
      assertEquals("q3<", artigo0.getTipo());
      assertEquals("", artigo0.getCodigo());
      assertEquals("", artigo0.getTransportadora());
      assertEquals("", artigo0.getDescricao());
      assertEquals((-2993.0), artigo0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Malas.Tipos_Malas malas_Tipos_Malas0 = Malas.Tipos_Malas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Malas malas0 = new Malas(malas_Tipos_Malas0, 0.0F, "B5.~]", (-940), "Preco Final: ", artigo_Estado0, (-940), artigo_Avaliação0, "Preco Final: ", "Preco Final: ", "S", (-1730.41), (-1.0), "zppu=H~2U_%X");
      assertEquals(1, malas0.getId());
      
      malas0.setId(0);
      malas0.clone();
      assertEquals(0, malas0.getId());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setId((-1824));
      sapatilhas0.clone();
      assertEquals((-1824), sapatilhas0.getId());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.L;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "", artigo_Estado0, 1635, artigo_Avaliação0, "", "Descri\u00E7\u00E3o: ", (String) null, 1635, 1530.747181811, "");
      Artigo artigo0 = tShirt0.clone();
      assertEquals(1, artigo0.getId());
      assertEquals(1635.0, artigo0.getPrecoBase(), 0.01);
      assertEquals(1530.747181811, tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals(1, tShirt0.getId());
      assertEquals(0, artigo0.getNumeroDonos());
      assertEquals("Descri\u00E7\u00E3o: ", artigo0.getMarca());
      assertEquals("", artigo0.getTipo());
      assertEquals("", artigo0.getDescricao());
      assertEquals(1530.747181811, artigo0.getCorrecaoPreco(), 0.01);
      assertEquals(1635.0, tShirt0.getPrecoBase(), 0.01);
      assertEquals("", artigo0.getTransportadora());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1236);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Sapatilhas sapatilhas0 = new Sapatilhas(1236, false, ")5_K", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, 1236, artigo_Avaliação0, "", "", "N", 1236, (-833.135793211689), "");
      Artigo artigo0 = sapatilhas0.clone();
      assertEquals(1, artigo0.getId());
      assertEquals(1236.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals((-833.135793211689), sapatilhas0.getCorrecaoPreco(), 0.01);
      assertTrue(artigo0.equals((Object)sapatilhas0));
      assertEquals(1, sapatilhas0.getId());
      assertEquals(1236.0, artigo0.getPrecoBase(), 0.01);
      assertEquals("", artigo0.getMarca());
      assertEquals("", artigo0.getDescricao());
      assertEquals(1236, artigo0.getNumeroDonos());
      assertEquals("", artigo0.getTransportadora());
      assertEquals("", artigo0.getTipo());
      assertEquals("N", artigo0.getCodigo());
      assertEquals(1236, sapatilhas0.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      sapatilhas0.setTiposSapatilhas(sapatilhas_Tipos_Sapatilhas0);
      // Undeclared exception!
      try { 
        sapatilhas0.toString((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // temporal
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(0, true, "[jJh7", (LocalDate) null, sapatilhas_Tipos_Sapatilhas0, "[jJh7", artigo_Estado0, 0, artigo_Avaliação0, "m=$! +[", "[jJh7", "[jJh7", 0, 1.0, "m=$! +[");
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas1 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      sapatilhas0.setTiposSapatilhas(sapatilhas_Tipos_Sapatilhas1);
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
  public void test35()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      // Undeclared exception!
      try { 
        sapatilhas0.equals(sapatilhas1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Malas malas0 = new Malas();
      int int0 = malas0.getId();
      assertEquals(0, malas0.getNumeroDonos());
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
      assertEquals(0.0, malas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(1385, false, "", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, 4317, artigo_Avaliação0, "", "", "", 1358.0, 1385, "");
      int int0 = sapatilhas0.getNumeroDonos();
      assertEquals(1, sapatilhas0.getId());
      assertEquals(1385.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(4317, int0);
      assertEquals(1358.0, sapatilhas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1109);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Sapatilhas sapatilhas0 = new Sapatilhas(1109, false, "Tipo: ", localDate0, sapatilhas_Tipos_Sapatilhas0, "Tipo: ", artigo_Estado0, 1109, artigo_Avaliação0, (String) null, (String) null, (String) null, 0.0, 0.0, "");
      sapatilhas0.getAvaliacao();
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals("", sapatilhas0.getTransportadora());
      assertEquals(1109, sapatilhas0.getNumeroDonos());
      assertEquals("Tipo: ", sapatilhas0.getTipo());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(1, sapatilhas0.getId());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Sapatilhas sapatilhas0 = new Sapatilhas(0, true, "!", localDate0, sapatilhas_Tipos_Sapatilhas0, "!", artigo_Estado0, 0, artigo_Avaliação0, "!", "!", "TP1.Malas$Tipos_Malas", (-3141.058864638), 0, "TP1.Malas$Tipos_Malas");
      double double0 = sapatilhas0.getPrecoBase();
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals("TP1.Malas$Tipos_Malas", sapatilhas0.getCodigo());
      assertEquals("!", sapatilhas0.getMarca());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas0.getId());
      assertEquals((-3141.058864638), double0, 0.01);
      assertEquals("TP1.Malas$Tipos_Malas", sapatilhas0.getTransportadora());
      assertEquals("!", sapatilhas0.getTipo());
      assertEquals("!", sapatilhas0.getDescricao());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Month month0 = Month.SEPTEMBER;
      LocalDate localDate0 = MockLocalDate.of(2, month0, 2);
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.PREMIUM;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas(2, true, "ID: 1\nTipo: \nEstado: null\nN\u00FAmero de Donos: 0\nAvalia\u00E7\u00E3o: null\nDescri\u00E7\u00E3o: \nMarca: \nC\u00F3digo: \nPre\u00E7o Base: 0.0\nCorre\u00E7\u00E3o do Pre\u00E7o: 0.0\nTransportadora: null\nTipo de mala: null\nDimens\u00F5es: 0.0\nMaterial: \nAno da cole\u00E7\u00E3o: 0\nPreco Final: 0.0\n", localDate0, sapatilhas_Tipos_Sapatilhas0, "", artigo_Estado0, 2, artigo_Avaliação0, "C\u00F3digo: ", "C\u00F3digo: ", "", 2175.8230795, 2, "IMPEC\u00C1VEL");
      String string0 = sapatilhas0.getDescricao();
      assertEquals("C\u00F3digo: ", string0);
      assertEquals("IMPEC\u00C1VEL", sapatilhas0.getTransportadora());
      assertEquals(2175.8230795, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(2.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas0.getId());
      assertEquals("C\u00F3digo: ", sapatilhas0.getMarca());
      assertEquals(2, sapatilhas0.getNumeroDonos());
      assertEquals("", sapatilhas0.getTipo());
      assertEquals("", sapatilhas0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getTipo();
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      Sapatilhas sapatilhas0 = new Sapatilhas(0, true, "", localDate0, sapatilhas_Tipos_Sapatilhas0, "> O/^v+)$mO\"'F", artigo_Estado0, 0, artigo_Avaliação0, "> O/^v+)$mO\"'F", "N\u00FAmero de Donos: ", "<E2oRDw@L'>=tS]+.\"", 563.72, 0, "PbeqvN=kX~y");
      sapatilhas0.getEstado();
      assertEquals("> O/^v+)$mO\"'F", sapatilhas0.getDescricao());
      assertEquals("N\u00FAmero de Donos: ", sapatilhas0.getMarca());
      assertEquals("> O/^v+)$mO\"'F", sapatilhas0.getTipo());
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(563.72, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals("<E2oRDw@L'>=tS]+.\"", sapatilhas0.getCodigo());
      assertEquals(0, sapatilhas0.getNumeroDonos());
      assertEquals("PbeqvN=kX~y", sapatilhas0.getTransportadora());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.getTransportadora();
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(0, sapatilhas0.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Malas malas0 = new Malas();
      double double0 = malas0.getCorrecaoPreco();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, malas0.getPrecoBase(), 0.01);
      assertEquals(0, malas0.getNumeroDonos());
      assertEquals(1, malas0.getId());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.M;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.RISCAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, (String) null, artigo_Estado0, (-1), artigo_Avaliação0, (String) null, (String) null, "Estado: ", (-1), (-860.1659), "Estado: ");
      String string0 = tShirt0.getCodigo();
      assertEquals((-860.1659), tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals((-1.0), tShirt0.getPrecoBase(), 0.01);
      assertNotNull(string0);
      assertEquals(0, tShirt0.getNumeroDonos());
      assertEquals(1, tShirt0.getId());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.M;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.RISCAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, (String) null, artigo_Estado0, (-1), artigo_Avaliação0, (String) null, (String) null, "Estado: ", (-1), (-860.1659), "Estado: ");
      String string0 = tShirt0.getMarca();
      assertNull(string0);
      assertEquals((-1.0), tShirt0.getPrecoBase(), 0.01);
      assertEquals(1, tShirt0.getId());
      assertEquals(0, tShirt0.getNumeroDonos());
      assertEquals((-860.1659), tShirt0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      sapatilhas0.setTransportadora("boZs;#vY4br\"?6.7dQ");
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
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
  public void test48()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas0.setTransportadora("sy8:>+.E%");
      sapatilhas0.equals(sapatilhas1);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(1, sapatilhas1.getId());
      assertEquals(0, sapatilhas1.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas0.setCorrecaoPreco(3623);
      sapatilhas0.equals(sapatilhas1);
      assertEquals(3623.0, sapatilhas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setPrecoBase((-38));
      sapatilhas0.equals(sapatilhas1);
      assertEquals((-38.0), sapatilhas1.getPrecoBase(), 0.01);
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas0.setCodigo("TP1.TShirt");
      sapatilhas0.equals(sapatilhas1);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0, sapatilhas1.getNumeroDonos());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas1.getId());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setMarca("#l#");
      sapatilhas0.equals(sapatilhas1);
      assertEquals(0, sapatilhas1.getNumeroDonos());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(1, sapatilhas1.getId());
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas0.setDescricao("G");
      sapatilhas0.equals(sapatilhas1);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(0, sapatilhas1.getNumeroDonos());
      assertEquals(1, sapatilhas1.getId());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas0.setNumeroDonos(524);
      sapatilhas0.equals(sapatilhas1);
      assertEquals(524, sapatilhas0.getNumeroDonos());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setEstado(artigo_Estado0);
      sapatilhas0.equals(sapatilhas1);
      assertEquals(1, sapatilhas0.getId());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(1, sapatilhas1.getId());
      assertEquals(0, sapatilhas1.getNumeroDonos());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas();
      sapatilhas0.equals(sapatilhas1);
      assertEquals(2, sapatilhas1.getId());
      assertEquals(0, sapatilhas1.getNumeroDonos());
      assertEquals(0.0, sapatilhas1.getCorrecaoPreco(), 0.01);
      assertEquals(0.0, sapatilhas1.getPrecoBase(), 0.01);
      assertEquals(1, sapatilhas0.getId());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Sapatilhas sapatilhas0 = new Sapatilhas();
      Sapatilhas sapatilhas1 = new Sapatilhas(sapatilhas0);
      sapatilhas1.setTipo("g;Xq>o`UWzF9s5LS");
      sapatilhas0.equals(sapatilhas1);
      assertEquals(1, sapatilhas1.getId());
      assertEquals(0.0, sapatilhas0.getPrecoBase(), 0.01);
      assertEquals(0, sapatilhas1.getNumeroDonos());
      assertEquals(0.0, sapatilhas0.getCorrecaoPreco(), 0.01);
      assertEquals(1, sapatilhas0.getId());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      TShirt tShirt0 = new TShirt();
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.IMPECÁVEL;
      tShirt0.setAvaliacao(artigo_Avaliação0);
      assertEquals(0.0, tShirt0.getCorrecaoPreco(), 0.01);
      assertEquals(0.0, tShirt0.getPrecoBase(), 0.01);
      assertEquals(1, tShirt0.getId());
      assertEquals(0, tShirt0.getNumeroDonos());
  }
}
