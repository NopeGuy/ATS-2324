/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 23:31:56 GMT 2024
 */

package TP2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import TP2.Dimensao;
import TP2.Encomenda;
import TP2.Estado;
import java.nio.charset.Charset;
import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import java.time.chrono.ThaiBuddhistDate;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Encomenda_ESTest extends Encomenda_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("O artigo ");
      linkedHashSet0.add((String) null);
      Dimensao dimensao0 = Dimensao.Medio;
      Period period0 = Period.ofWeeks((-1));
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      linkedHashSet0.addAll(set0);
      linkedHashSet0.add("Grande");
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      Encomenda encomenda0 = new Encomenda(linkedHashSet0, 23L, dimensao0, localDate0);
      encomenda0.defineTamanho();
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals(23L, encomenda0.getIdComprador());
      assertEquals(Dimensao.Medio, encomenda0.getDimensao());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda.setDiasDevolver(0);
      LocalDate localDate0 = MockLocalDate.ofEpochDay(2L);
      encomenda0.setDataEntrega(localDate0);
      boolean boolean0 = encomenda0.podeDevolver(localDate0);
      assertEquals(0, encomenda0.getDiasDevolver());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      encomenda0.setId(1632L);
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertEquals(1632L, encomenda0.getId());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.adicionaArtigo("MyL3P=Ko+oF(#|bJ1l");
      encomenda0.removeArtigo("MyL3P=Ko+oF(#|bJ1l");
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Dimensao dimensao0 = Dimensao.Grande;
      Period period0 = Period.ofMonths(3220);
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      Encomenda encomenda0 = new Encomenda(set0, 0L, dimensao0, localDate0);
      encomenda0.adicionaArtigo("");
      encomenda0.removeArtigo("");
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.adicionaArtigo("");
      encomenda0.numeroArtigos();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      Dimensao dimensao0 = Dimensao.Medio;
      Encomenda encomenda0 = new Encomenda(set0, 0L, dimensao0, (LocalDate) null);
      encomenda0.getIdComprador();
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Locale locale0 = Locale.KOREA;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Dimensao dimensao0 = Dimensao.Grande;
      LocalDate localDate0 = MockLocalDate.now();
      Encomenda encomenda0 = new Encomenda(set0, 2193L, dimensao0, localDate0);
      long long0 = encomenda0.getIdComprador();
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals(2193L, long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      assertEquals(1L, encomenda0.getId());
      
      encomenda0.setId(0);
      encomenda0.getId();
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setId((-497L));
      long long0 = encomenda0.getId();
      assertEquals((-497L), long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setDimensao((Dimensao) null);
      encomenda0.getDimensao();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Encomenda.setDiasDevolver(0);
      int int0 = Encomenda.getDiasDevolver();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Encomenda.setDiasDevolver((-3178));
      int int0 = Encomenda.getDiasDevolver();
      assertEquals((-3178), int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LocalDate localDate0 = MockLocalDate.now();
      encomenda0.setDataEntrega(localDate0);
      encomenda0.getDataEntrega();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getData();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Encomenda.setCodigo(0L);
      long long0 = Encomenda.getCodigo();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Encomenda.setCodigo((-1967L));
      long long0 = Encomenda.getCodigo();
      assertEquals((-1967L), long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Encomenda.setCodigo(0L);
      long long0 = Encomenda.criaCodigo();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Encomenda.setCodigo((-1778L));
      long long0 = Encomenda.criaCodigo();
      assertEquals((-1778L), long0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      encomenda0.setEncomenda(set0);
      Encomenda encomenda1 = encomenda0.clone();
      assertEquals(2L, encomenda1.getCodigo());
      assertEquals(1L, encomenda1.getId());
      assertEquals((-1L), encomenda1.getIdComprador());
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(1L, encomenda0.getId());
      assertEquals(Dimensao.Pequeno, encomenda0.getDimensao());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Dimensao dimensao0 = Dimensao.Pequeno;
      LocalDate localDate0 = MockLocalDate.now();
      Encomenda encomenda0 = new Encomenda(set0, 0L, dimensao0, localDate0);
      Encomenda encomenda1 = encomenda0.clone();
      assertNotSame(encomenda1, encomenda0);
      assertEquals(1L, encomenda0.getId());
      assertEquals(1L, encomenda1.getId());
      assertEquals(2L, encomenda1.getCodigo());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Dimensao dimensao0 = Dimensao.Medio;
      Period period0 = Period.ofWeeks((-1));
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      Encomenda encomenda0 = new Encomenda(linkedHashSet0, 23L, dimensao0, localDate0);
      Encomenda encomenda1 = encomenda0.clone();
      assertEquals(23L, encomenda0.getIdComprador());
      assertEquals(1L, encomenda0.getId());
      assertEquals(1L, encomenda1.getId());
      assertEquals(23L, encomenda1.getIdComprador());
      assertEquals(2L, encomenda1.getCodigo());
      assertEquals(Dimensao.Medio, encomenda0.getDimensao());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      assertEquals(1L, encomenda0.getId());
      
      encomenda0.setId(0L);
      encomenda0.clone();
      assertEquals((-1L), encomenda0.getIdComprador());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setId((-2002));
      encomenda0.clone();
      assertEquals((-2002L), encomenda0.getId());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda.setDiasDevolver(0);
      encomenda0.clone();
      assertEquals(0, encomenda0.getDiasDevolver());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda.setDiasDevolver((-3118));
      encomenda0.clone();
      assertEquals((-3118), encomenda0.getDiasDevolver());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      assertEquals(2L, encomenda0.getCodigo());
      
      Encomenda.setCodigo(0);
      encomenda0.clone();
      assertEquals((-1L), encomenda0.getIdComprador());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda.setCodigo((-1778L));
      encomenda0.clone();
      assertEquals((-1778L), encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.adicionaArtigo("");
      encomenda0.getEncomenda();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      Dimensao dimensao0 = Dimensao.Grande;
      Encomenda encomenda0 = new Encomenda(set0, 1L, dimensao0, (LocalDate) null);
      // Undeclared exception!
      try { 
        encomenda0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      // Undeclared exception!
      try { 
        encomenda0.setEncomenda((Set<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      Dimensao dimensao0 = Dimensao.Medio;
      Encomenda encomenda0 = new Encomenda(set0, (-2964L), dimensao0, (LocalDate) null);
      // Undeclared exception!
      try { 
        encomenda0.podeDevolver((LocalDate) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Dimensao dimensao0 = Dimensao.Pequeno;
      LocalDate localDate0 = MockLocalDate.now();
      Encomenda encomenda0 = null;
      try {
        encomenda0 = new Encomenda((Set<String>) null, 1055L, dimensao0, localDate0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Encomenda encomenda0 = null;
      try {
        encomenda0 = new Encomenda((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.defineTamanho();
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals((-1L), encomenda0.getIdComprador());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      Dimensao dimensao0 = Dimensao.Pequeno;
      Period period0 = Period.ofYears(0);
      IsoChronology isoChronology0 = period0.getChronology();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(0, 0);
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0, (ZoneId) zoneOffset0);
      Encomenda encomenda0 = new Encomenda(set0, (-1L), dimensao0, localDate0);
      encomenda0.getEstado();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      long long0 = encomenda0.getId();
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      long long0 = Encomenda.criaCodigo();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getDataEntrega();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Set<String> set0 = charset0.aliases();
      Dimensao dimensao0 = Dimensao.Medio;
      Encomenda encomenda0 = new Encomenda(set0, (-2964L), dimensao0, (LocalDate) null);
      encomenda0.getData();
      assertEquals((-2964L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getDimensao();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getEncomenda();
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals((-1L), encomenda0.getIdComprador());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      long long0 = encomenda0.getIdComprador();
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Set<String> set0 = ZoneId.getAvailableZoneIds();
      encomenda0.setEncomenda(set0);
      encomenda0.defineTamanho();
      assertEquals(Dimensao.Grande, encomenda0.getDimensao());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      Clock clock0 = MockClock.tickSeconds(zoneOffset0);
      ThaiBuddhistDate thaiBuddhistDate0 = MockThaiBuddhistDate.now(clock0);
      LocalDate localDate0 = MockLocalDate.from(thaiBuddhistDate0);
      encomenda0.setDataEntrega(localDate0);
      boolean boolean0 = encomenda0.podeDevolver(localDate0);
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals((-1L), encomenda0.getIdComprador());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      encomenda0.setDataEntrega(localDate0);
      LocalDate localDate1 = MockLocalDate.now();
      boolean boolean0 = encomenda0.podeDevolver(localDate1);
      assertEquals(2L, encomenda0.getCodigo());
      assertFalse(boolean0);
      assertEquals((-1L), encomenda0.getIdComprador());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.adicionaArtigo((String) null);
      encomenda0.removeTudo();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.adicionaArtigo((String) null);
      encomenda0.removeArtigo((String) null);
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals((-1L), encomenda0.getIdComprador());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      try { 
        encomenda0.removeArtigo("Encomenda:: { Artigos: java.util.HashSet@0000000002 C\u00F3digo: 1 Dimens\u00E3o: Pequeno Estado: Pendente Data de cria\u00E7\u00E3o: N/A  Data de entrega: N/A}");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // O artigo Encomenda:: { Artigos: java.util.HashSet@0000000002 C\u00F3digo: 1 Dimens\u00E3o: Pequeno Estado: Pendente Data de cria\u00E7\u00E3o: N/A  Data de entrega: N/A} n\u00E3o existe na encomenda
         //
         verifyException("TP2.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.adicionaArtigo(" Data de cria\u00E7\u00E3o: ");
      try { 
        encomenda0.adicionaArtigo(" Data de cria\u00E7\u00E3o: ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // O artigo  Data de cria\u00E7\u00E3o:  j\u00E1 existe na encomenda
         //
         verifyException("TP2.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      Clock clock0 = MockClock.tickSeconds(zoneOffset0);
      ThaiBuddhistDate thaiBuddhistDate0 = MockThaiBuddhistDate.now(clock0);
      LocalDate localDate0 = MockLocalDate.from(thaiBuddhistDate0);
      encomenda0.setDataEntrega(localDate0);
      encomenda0.toString();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.toString();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      encomenda0.setDataEntrega(localDate0);
      Encomenda encomenda1 = new Encomenda(encomenda0);
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertEquals(1L, encomenda0.getId());
      assertEquals((-1L), encomenda1.getIdComprador());
      assertEquals(2L, encomenda1.getCodigo());
      assertTrue(boolean0);
      assertEquals((-1L), encomenda0.getIdComprador());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      encomenda0.setDataEntrega(localDate0);
      LocalDate localDate1 = MockLocalDate.now();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      assertTrue(encomenda1.equals((Object)encomenda0));
      
      encomenda1.setDataEntrega(localDate1);
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LocalDate localDate0 = MockLocalDate.ofEpochDay(1L);
      Encomenda encomenda1 = new Encomenda(encomenda0);
      encomenda1.setData(localDate0);
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertEquals(2L, encomenda1.getCodigo());
      assertEquals((-1L), encomenda1.getIdComprador());
      assertEquals(1L, encomenda1.getId());
      assertEquals(1L, encomenda0.getId());
      assertFalse(boolean0);
      assertEquals((-1L), encomenda0.getIdComprador());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = encomenda0.clone();
      Estado estado0 = Estado.Finalizada;
      encomenda1.setEstado(estado0);
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertFalse(boolean0);
      assertEquals(1L, encomenda1.getId());
      assertEquals(1L, encomenda0.getId());
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda1.getCodigo());
      assertEquals((-1L), encomenda1.getIdComprador());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Locale locale0 = Locale.CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Dimensao dimensao0 = Dimensao.Medio;
      LocalDate localDate0 = MockLocalDate.now();
      Encomenda.setCodigo(1L);
      Encomenda encomenda1 = new Encomenda(set0, 1L, dimensao0, localDate0);
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertEquals(1L, encomenda1.getIdComprador());
      assertEquals(2L, encomenda1.getCodigo());
      assertEquals((-1L), encomenda0.getIdComprador());
      assertFalse(boolean0);
      assertEquals(1L, encomenda1.getId());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Dimensao dimensao0 = Dimensao.Grande;
      LocalDate localDate0 = MockLocalDate.ofYearDay(1, 1);
      linkedHashSet0.add("");
      Encomenda encomenda0 = new Encomenda(linkedHashSet0, 1L, dimensao0, localDate0);
      Encomenda encomenda1 = new Encomenda();
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertEquals(3L, encomenda0.getCodigo());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Dimensao dimensao0 = Dimensao.Grande;
      boolean boolean0 = encomenda0.equals(dimensao0);
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals((-1L), encomenda0.getIdComprador());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals((Object) null);
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals((-1L), encomenda0.getIdComprador());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals(encomenda0);
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals((-1L), encomenda0.getIdComprador());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setIdComprador(982L);
      assertEquals(982L, encomenda0.getIdComprador());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      LocalDate localDate0 = MockLocalDate.now();
      encomenda0.setDataEntrega(localDate0);
      Estado estado0 = Estado.Expedida;
      encomenda0.setEstado(estado0);
      boolean boolean0 = encomenda0.podeDevolver(localDate0);
      assertEquals(2L, encomenda0.getCodigo());
      assertEquals((-1L), encomenda0.getIdComprador());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      long long0 = Encomenda.getCodigo();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      int int0 = Encomenda.getDiasDevolver();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Set<String> set0 = encomenda0.removeTudo();
      encomenda0.setEncomenda(set0);
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = encomenda0.clone();
      // Undeclared exception!
      try { 
        encomenda1.equals(encomenda0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Locale locale0 = Locale.CHINESE;
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      Dimensao dimensao0 = Dimensao.Medio;
      LocalDate localDate0 = MockLocalDate.now();
      Encomenda encomenda1 = new Encomenda(set0, 1L, dimensao0, localDate0);
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertEquals(3L, encomenda0.getCodigo());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.numeroArtigos();
      assertEquals((-1L), encomenda0.getIdComprador());
      assertEquals(2L, encomenda0.getCodigo());
  }
}
