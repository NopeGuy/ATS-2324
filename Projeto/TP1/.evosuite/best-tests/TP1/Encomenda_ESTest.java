/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 16:50:26 GMT 2024
 */

package TP1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import TP1.Artigo;
import TP1.Encomenda;
import TP1.Malas;
import TP1.Sapatilhas;
import TP1.TShirt;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.IsoChronology;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockIsoChronology;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Encomenda_ESTest extends Encomenda_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = encomenda0.clone();
      encomenda1.setCustosExpedicao((-665.01));
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertEquals((-665.01), encomenda1.getCustosExpedicao(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      encomenda1.setPrecoFinal(1599);
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertEquals(1599.0, encomenda1.getPrecoFinal(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda();
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertEquals(0, encomenda1.getTamanho());
      assertEquals(2, encomenda1.getId());
      assertEquals(0.0, encomenda1.getPrecoFinal(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, encomenda1.getCustosExpedicao(), 0.01);
      assertFalse(encomenda1.equals((Object)encomenda0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      hashMap0.put((Integer) null, "==========  Encomenda  ==========\nID da Encomenda: 1\nEncomenda criada em: 2014-02-14\nPrazo Limite: 2014-02-16\n==========   Artigos   ==========\n========== Fim Artigos ==========\nDimens\u00E3o da embalagem: MEDIO\nCusto Expedi\u00E7\u00E3o: 0.0\nPre\u00E7o final: 0.0\nEstado da encomenda: PENDENTE\n");
      encomenda0.setVendedores(hashMap0);
      encomenda0.getVendedores();
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(1, encomenda0.getId());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setTamanho(3);
      int int0 = encomenda0.getTamanho();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setTamanho((-756));
      int int0 = encomenda0.getTamanho();
      assertEquals((-756), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      LocalDate localDate0 = MockLocalDate.ofYearDay(1, 1);
      Encomenda encomenda0 = new Encomenda("IMPEC\u00C1VEL", linkedList0, 383.158897, localDate0, (Map<Integer, String>) null);
      double double0 = encomenda0.getPrecoFinal();
      assertEquals(1, encomenda0.getId());
      assertEquals(383.158897, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      List<Artigo> list0 = encomenda0.getArtigos();
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Encomenda encomenda1 = new Encomenda("Encomenda criada em: ", list0, (-116.05867246), localDate0, hashMap0);
      double double0 = encomenda1.getPrecoFinal();
      assertEquals(2, encomenda1.getId());
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals((-116.05867246), double0, 0.01);
      assertEquals(0, encomenda0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(2, 2);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      Encomenda encomenda0 = new Encomenda("", linkedList0, 0.0, localDate0, (Map<Integer, String>) null);
      encomenda0.setPrazoLimite((LocalDate) null);
      encomenda0.getPrazoLimite();
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(1, encomenda0.getId());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      assertEquals(1, encomenda0.getId());
      
      encomenda0.setId(0);
      int int0 = encomenda0.getId();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setId((-734));
      int int0 = encomenda0.getId();
      assertEquals((-734), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda.Dimensao_Embalagem encomenda_Dimensao_Embalagem0 = Encomenda.Dimensao_Embalagem.GRANDE;
      encomenda0.setEmbalagem(encomenda_Dimensao_Embalagem0);
      encomenda0.getEmbalagem();
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(1, encomenda0.getId());
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      encomenda1.getDono();
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals(0, encomenda1.getTamanho());
      assertEquals(1, encomenda1.getId());
      assertTrue(encomenda0.equals((Object)encomenda1));
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(1, encomenda0.getId());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      Period period0 = Period.of((-781), (-781), (-781));
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Encomenda encomenda0 = new Encomenda("TP1.Sapatilhas$Tipos_Sapatilhas", linkedList0, 0.0, localDate0, hashMap0);
      encomenda0.getDono();
      assertEquals(1, encomenda0.getId());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      LocalDate localDate0 = MockLocalDate.ofYearDay(1, 1);
      Encomenda encomenda0 = new Encomenda("IMPEC\u00C1VEL", linkedList0, 383.158897, localDate0, (Map<Integer, String>) null);
      double double0 = encomenda0.getCustosExpedicao();
      assertEquals(383.158897, double0, 0.01);
      assertEquals(1, encomenda0.getId());
      assertEquals(383.158897, encomenda0.getPrecoFinal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setCustosExpedicao((-763.5199));
      double double0 = encomenda0.getCustosExpedicao();
      assertEquals((-763.5199), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setTamanho(3021);
      encomenda0.clone();
      assertEquals(3021, encomenda0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      Period period0 = Period.of((-781), (-781), (-781));
      IsoChronology isoChronology0 = period0.getChronology();
      LocalDate localDate0 = MockIsoChronology.dateNow(isoChronology0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Encomenda encomenda0 = new Encomenda("TP1.Sapatilhas$Tipos_Sapatilhas", linkedList0, 0.0, localDate0, hashMap0);
      encomenda0.setTamanho((-781));
      encomenda0.clone();
      assertEquals((-781), encomenda0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setPrecoFinal(1553);
      encomenda0.clone();
      assertEquals(1553.0, encomenda0.getPrecoFinal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      LocalDate localDate0 = MockLocalDate.now();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Encomenda encomenda0 = new Encomenda("TP1.Encomenda$Dimensao_Embalagem", linkedList0, (-1362.885860671195), localDate0, hashMap0);
      Encomenda encomenda1 = encomenda0.clone();
      assertEquals((-1362.885860671195), encomenda0.getPrecoFinal(), 0.01);
      assertEquals(1, encomenda1.getId());
      assertEquals(0, encomenda1.getTamanho());
      assertEquals((-1362.885860671195), encomenda1.getPrecoFinal(), 0.01);
      assertTrue(encomenda1.equals((Object)encomenda0));
      assertEquals(1, encomenda0.getId());
      assertEquals((-1362.885860671195), encomenda0.getCustosExpedicao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      assertEquals(1, encomenda0.getId());
      
      encomenda0.setId(0);
      encomenda0.clone();
      assertEquals(0, encomenda0.getId());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setId((-734));
      encomenda0.clone();
      assertEquals((-734), encomenda0.getId());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      
      encomenda0.setCustosExpedicao(1.0);
      encomenda0.clone();
      assertEquals(1, encomenda0.getId());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      // Undeclared exception!
      try { 
        encomenda0.setVendedores((Map<Integer, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      // Undeclared exception!
      try { 
        encomenda0.setArtigos((List<Artigo>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      // Undeclared exception!
      try { 
        encomenda1.getVendedores();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      encomenda1.setDataCriacao((LocalDate) null);
      // Undeclared exception!
      try { 
        encomenda1.equals(encomenda0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      List<Artigo> list0 = encomenda0.getArtigos();
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Encomenda encomenda1 = null;
      try {
        encomenda1 = new Encomenda("", list0, (-3189.0896805440207), (LocalDate) null, hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Encomenda encomenda0 = null;
      try {
        encomenda0 = new Encomenda((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      int int0 = encomenda0.getTamanho();
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals(0, int0);
      assertEquals(1, encomenda0.getId());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getEmbalagem();
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals(1, encomenda0.getId());
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getDataCriacao();
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals(1, encomenda0.getId());
      assertEquals(0, encomenda0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getEstado();
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(1, encomenda0.getId());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getPrazoLimite();
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(1, encomenda0.getId());
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      double double0 = encomenda0.getCustosExpedicao();
      assertEquals(1, encomenda0.getId());
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      double double0 = encomenda0.getPrecoFinal();
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(1, encomenda0.getId());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      int int0 = encomenda0.getId();
      assertEquals(1, int0);
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      Malas malas0 = new Malas();
      linkedList0.add((Artigo) malas0);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(2, 2);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      Encomenda encomenda0 = new Encomenda("", linkedList0, 0.0, localDate0, (Map<Integer, String>) null);
      String string0 = encomenda0.toString();
      assertEquals("==========  Encomenda  ==========\nID da Encomenda: 1\nEncomenda criada em: 2014-02-14\nPrazo Limite: 2014-02-16\n==========   Artigos   ==========\nID: 1\nTipo: \nEstado: null\nN\u00FAmero de Donos: 0\nAvalia\u00E7\u00E3o: null\nDescri\u00E7\u00E3o: \nMarca: \nC\u00F3digo: \nPre\u00E7o Base: 0.0\nCorre\u00E7\u00E3o do Pre\u00E7o: 0.0\nTransportadora: null\nTipo de mala: null\nDimens\u00F5es: 0.0\nMaterial: \nAno da cole\u00E7\u00E3o: 0\nPreco Final: 0.0\n\n========== Fim Artigos ==========\nDimens\u00E3o da embalagem: PEQUENO\nCusto Expedi\u00E7\u00E3o: 0.0\nPre\u00E7o final: 0.25\nEstado da encomenda: EXPEDIDA\n", string0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      assertTrue(encomenda1.equals((Object)encomenda0));
      
      encomenda1.setDataCriacao((LocalDate) null);
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals(0, encomenda1.getTamanho());
      assertFalse(boolean0);
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(1, encomenda0.getId());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      assertTrue(encomenda1.equals((Object)encomenda0));
      
      Encomenda.Estado_Encomenda encomenda_Estado_Encomenda0 = Encomenda.Estado_Encomenda.DEVOLVIDA;
      encomenda1.setEstado(encomenda_Estado_Encomenda0);
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = encomenda0.clone();
      encomenda1.setCustosExpedicao(1559);
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertEquals(1559.0, encomenda1.getCustosExpedicao(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      assertTrue(encomenda1.equals((Object)encomenda0));
      
      Encomenda.Dimensao_Embalagem encomenda_Dimensao_Embalagem0 = Encomenda.Dimensao_Embalagem.MEDIO;
      encomenda0.setEmbalagem(encomenda_Dimensao_Embalagem0);
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      assertTrue(encomenda1.equals((Object)encomenda0));
      
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas.Tipos_Sapatilhas sapatilhas_Tipos_Sapatilhas0 = Sapatilhas.Tipos_Sapatilhas.NORMAL;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.USADO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.BOM;
      Sapatilhas sapatilhas0 = new Sapatilhas((-824), false, "K", localDate0, sapatilhas_Tipos_Sapatilhas0, "K", artigo_Estado0, (-824), artigo_Avaliação0, "K", "K", "K", (-824), (-824), "K");
      linkedList0.add((Artigo) sapatilhas0);
      encomenda1.setArtigos(linkedList0);
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda();
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertEquals(0.0, encomenda1.getPrecoFinal(), 0.01);
      assertEquals(0.0, encomenda1.getCustosExpedicao(), 0.01);
      assertFalse(encomenda0.equals((Object)encomenda1));
      assertFalse(boolean0);
      assertEquals(0, encomenda1.getTamanho());
      assertEquals(2, encomenda1.getId());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = new Encomenda(encomenda0);
      boolean boolean0 = encomenda0.equals(encomenda1);
      assertEquals(1, encomenda0.getId());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertTrue(boolean0);
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0, encomenda1.getTamanho());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals((Object) null);
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals(1, encomenda0.getId());
      assertEquals(0, encomenda0.getTamanho());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      boolean boolean0 = encomenda0.equals(encomenda0);
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertTrue(boolean0);
      assertEquals(1, encomenda0.getId());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals(0, encomenda0.getTamanho());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      LocalDate localDate0 = MockLocalDate.ofYearDay(1, 1);
      Encomenda encomenda0 = new Encomenda("IMPEC\u00C1VEL", linkedList0, 383.158897, localDate0, (Map<Integer, String>) null);
      boolean boolean0 = encomenda0.equals(linkedList0);
      assertFalse(boolean0);
      assertEquals(1, encomenda0.getId());
      assertEquals(383.158897, encomenda0.getPrecoFinal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      Malas malas0 = new Malas();
      linkedList0.add((Artigo) malas0);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(2, 2);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      Encomenda encomenda0 = new Encomenda("", linkedList0, 0.0, localDate0, (Map<Integer, String>) null);
      List<Artigo> list0 = encomenda0.getArtigos();
      assertEquals(1, encomenda0.getId());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertFalse(list0.isEmpty());
      assertEquals(0.25, encomenda0.getPrecoFinal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      LocalDate localDate0 = MockLocalDate.now();
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.L;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.RISCAS;
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "\n", artigo_Estado0, 1558, artigo_Avaliação0, "", "\n", "TP1.Encomenda$Dimensao_Embalagem", 1524L, 0.0, "TP1.Encomenda$Dimensao_Embalagem");
      linkedList0.add((Artigo) tShirt0);
      HashMap<Integer, String> hashMap0 = new HashMap<Integer, String>();
      Encomenda encomenda0 = new Encomenda("TP1.Encomenda$Dimensao_Embalagem", linkedList0, (-1362.885860671195), localDate0, hashMap0);
      assertEquals(1, encomenda0.getId());
      assertEquals(161.6141393288051, encomenda0.getPrecoFinal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      Malas malas0 = new Malas();
      linkedList0.add((Artigo) malas0);
      LocalDate localDate0 = MockLocalDate.now();
      Sapatilhas sapatilhas0 = new Sapatilhas();
      linkedList0.addFirst(sapatilhas0);
      Encomenda encomenda0 = new Encomenda("R||:", linkedList0, (-0.12084540800825494), localDate0, (Map<Integer, String>) null);
      assertEquals(1, encomenda0.getId());
      assertEquals(0.37915459199174506, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(Encomenda.Dimensao_Embalagem.MEDIO, encomenda0.getEmbalagem());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      LinkedList<Artigo> linkedList0 = new LinkedList<Artigo>();
      Malas malas0 = new Malas();
      linkedList0.add((Artigo) malas0);
      linkedList0.add((Artigo) malas0);
      linkedList0.add((Artigo) malas0);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutes(2, 2);
      LocalDate localDate0 = MockLocalDate.now((ZoneId) zoneOffset0);
      TShirt.Tamanho tShirt_Tamanho0 = TShirt.Tamanho.S;
      TShirt.Padrao tShirt_Padrao0 = TShirt.Padrao.PALMEIRAS;
      linkedList0.add((Artigo) malas0);
      Artigo.Estado artigo_Estado0 = Artigo.Estado.NOVO;
      Artigo.Avaliação artigo_Avaliação0 = Artigo.Avaliação.SATISFATÓRIO;
      TShirt tShirt0 = new TShirt(tShirt_Tamanho0, tShirt_Padrao0, "3[)D1GOjM", artigo_Estado0, 2, artigo_Avaliação0, (String) null, "S*u^72?:}w~H~B`-", "Encomenda criada em: ", 0.0, 2, "");
      linkedList0.offer(malas0);
      linkedList0.add((Artigo) tShirt0);
      Encomenda encomenda0 = new Encomenda("", linkedList0, 0.0, localDate0, (Map<Integer, String>) null);
      assertEquals(1, encomenda0.getId());
      assertEquals(Encomenda.Dimensao_Embalagem.GRANDE, encomenda0.getEmbalagem());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
      assertEquals(1.75, encomenda0.getPrecoFinal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setDataCriacao((LocalDate) null);
      encomenda0.getDataCriacao();
      assertEquals(1, encomenda0.getId());
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.setDono("\n");
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(1, encomenda0.getId());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getVendedores();
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(1, encomenda0.getId());
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      encomenda0.getDono();
      assertEquals(0.0, encomenda0.getPrecoFinal(), 0.01);
      assertEquals(1, encomenda0.getId());
      assertEquals(0, encomenda0.getTamanho());
      assertEquals(0.0, encomenda0.getCustosExpedicao(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Encomenda encomenda0 = new Encomenda();
      Encomenda encomenda1 = encomenda0.clone();
      encomenda0.setPrecoFinal(1559);
      boolean boolean0 = encomenda1.equals(encomenda0);
      assertEquals(1559.0, encomenda0.getPrecoFinal(), 0.01);
      assertFalse(boolean0);
  }
}