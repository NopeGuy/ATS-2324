/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 23:15:31 GMT 2024
 */

package TP2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import TP2.Artigo;
import TP2.Controlador;
import TP2.GestorEncomendas;
import TP2.Gestor_Artigos;
import TP2.Gestor_Transportadoras;
import TP2.Gestor_Utilizadores;
import TP2.Menu;
import TP2.Transportadora;
import TP2.Utilizador;
import TP2.Vintage;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Controlador_ESTest extends Controlador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vintage vintage0 = Vintage.load();
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(vintage0);
      
      SystemInUtil.addInputLine("");
      Controlador controlador0 = new Controlador((Menu) null, vintage0);
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(controlador0);
      
      Vintage vintage1 = controlador0.getVintage();
      assertEquals((-1L), vintage0.getUtilizador());
      assertEquals((-1L), vintage1.getUtilizador());
      assertSame(vintage0, vintage1);
      assertSame(vintage1, vintage0);
      assertNotNull(vintage1);
      
      Controlador controlador1 = new Controlador(controlador0);
      assertEquals((-1L), vintage0.getUtilizador());
      assertFalse(controlador1.equals((Object)controlador0));
      assertNotNull(controlador1);
      
      // Undeclared exception!
      try { 
        controlador1.escolha_venda_malas();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Menu menu0 = new Menu();
      assertNotNull(menu0);
      
      Vintage vintage0 = Vintage.carregarEstado();
      assertNull(vintage0);
      
      Controlador controlador0 = new Controlador(menu0, (Vintage) null);
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.inicio_controlador();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_tipo();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vintage vintage0 = Vintage.load();
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(vintage0);
      
      Controlador controlador0 = new Controlador((Menu) null, vintage0);
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_tshit();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.inicio_controlador();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      controlador0.povoar();
      Vintage vintage0 = controlador0.getVintage();
      assertEquals(2L, vintage0.getUtilizador());
      assertNotNull(vintage0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_query();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Menu menu0 = new Menu();
      assertNotNull(menu0);
      
      Vintage vintage0 = Vintage.carregarEstado();
      assertNull(vintage0);
      
      Controlador controlador0 = new Controlador(menu0, (Vintage) null);
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.povoar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      controlador0.povoar();
      // Undeclared exception!
      try { 
        controlador0.escolha_venda_tipo();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_carrinho();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Menu menu0 = new Menu();
      assertNotNull(menu0);
      
      Vintage vintage0 = Vintage.carregarEstado();
      assertNull(vintage0);
      
      Controlador controlador0 = new Controlador(menu0, (Vintage) null);
      assertNotNull(controlador0);
      
      Controlador controlador1 = new Controlador(controlador0);
      assertFalse(controlador1.equals((Object)controlador0));
      assertNotNull(controlador1);
      
      // Undeclared exception!
      try { 
        controlador1.escolha_carrinho();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vintage vintage0 = new Vintage();
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(vintage0);
      
      Controlador controlador0 = new Controlador((Menu) null, vintage0);
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(controlador0);
      
      Boolean boolean0 = Boolean.valueOf(" n\u00E3o pode ser devolvida");
      assertFalse(boolean0);
      assertNotNull(boolean0);
      
      boolean boolean1 = Boolean.logicalOr(true, false);
      assertTrue(boolean1);
      
      String string0 = vintage0.filtraSapatilhasNovo(boolean0);
      assertEquals("", string0);
      assertEquals((-1L), vintage0.getUtilizador());
      assertFalse(boolean0.equals((Object)boolean1));
      assertNotNull(string0);
      
      // Undeclared exception!
      try { 
        controlador0.menu_venda_retirar_artigo();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Menu menu0 = new Menu();
      assertNotNull(menu0);
      
      menu0.transportadoras_premium();
      Controlador controlador0 = new Controlador(menu0, (Vintage) null);
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.salvarEstado();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      Controlador controlador1 = new Controlador(controlador0);
      assertFalse(controlador1.equals((Object)controlador0));
      assertNotNull(controlador1);
      
      Controlador controlador2 = new Controlador(controlador1);
      assertFalse(controlador0.equals((Object)controlador1));
      assertFalse(controlador1.equals((Object)controlador0));
      assertFalse(controlador2.equals((Object)controlador1));
      assertFalse(controlador2.equals((Object)controlador0));
      assertNotNull(controlador2);
      
      // Undeclared exception!
      try { 
        controlador1.escolha_pesquica();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_pesquica();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vintage vintage0 = Vintage.load();
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(vintage0);
      
      Controlador controlador0 = new Controlador((Menu) null, vintage0);
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.adicionar_artigo_carrinho();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Menu menu0 = new Menu();
      assertNotNull(menu0);
      
      Controlador controlador0 = new Controlador(menu0, (Vintage) null);
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.parsing();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Menu menu0 = new Menu();
      assertNotNull(menu0);
      
      Vintage vintage0 = Vintage.load();
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(vintage0);
      
      menu0.artigo_retirado();
      Controlador controlador0 = new Controlador(menu0, vintage0);
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_venda_tipo();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Menu menu0 = new Menu();
      assertNotNull(menu0);
      
      Vintage vintage0 = Vintage.carregarEstado();
      assertNull(vintage0);
      
      Controlador controlador0 = new Controlador(menu0, (Vintage) null);
      assertNotNull(controlador0);
      
      Controlador controlador1 = new Controlador(controlador0);
      assertFalse(controlador1.equals((Object)controlador0));
      assertNotNull(controlador1);
      
      // Undeclared exception!
      try { 
        controlador0.parsing();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vintage vintage0 = new Vintage();
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(vintage0);
      
      Controlador controlador0 = new Controlador((Menu) null, vintage0);
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.login();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_venda_tipo();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HashMap<Integer, Artigo> hashMap0 = new HashMap<Integer, Artigo>();
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertNotNull(hashMap0);
      
      Gestor_Artigos gestor_Artigos0 = new Gestor_Artigos(hashMap0);
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals(0.5, gestor_Artigos0.getTaxaNovo(), 0.01);
      assertEquals(0.25, gestor_Artigos0.getTaxaUsado(), 0.01);
      assertNotNull(gestor_Artigos0);
      
      Gestor_Utilizadores gestor_Utilizadores0 = new Gestor_Utilizadores();
      assertNotNull(gestor_Utilizadores0);
      
      Map<Long, Utilizador> map0 = gestor_Utilizadores0.getUtilizadores();
      assertTrue(map0.isEmpty());
      assertEquals(0, map0.size());
      assertNotNull(map0);
      
      HashMap<String, String> hashMap1 = new HashMap<String, String>(0);
      assertTrue(hashMap1.isEmpty());
      assertEquals(0, hashMap1.size());
      assertNotNull(hashMap1);
      
      HashMap<String, Long> hashMap2 = new HashMap<String, Long>();
      assertEquals(0, hashMap2.size());
      assertTrue(hashMap2.isEmpty());
      assertNotNull(hashMap2);
      
      HashMap<String, Long> hashMap3 = new HashMap<String, Long>(hashMap2);
      assertEquals(0, hashMap2.size());
      assertTrue(hashMap2.isEmpty());
      assertEquals(0, hashMap3.size());
      assertTrue(hashMap3.isEmpty());
      assertTrue(hashMap3.equals((Object)hashMap2));
      assertNotNull(hashMap3);
      
      Gestor_Utilizadores gestor_Utilizadores1 = new Gestor_Utilizadores(map0, hashMap1, hashMap3);
      assertTrue(map0.isEmpty());
      assertEquals(0, map0.size());
      assertTrue(hashMap1.isEmpty());
      assertEquals(0, hashMap1.size());
      assertEquals(0, hashMap2.size());
      assertTrue(hashMap2.isEmpty());
      assertEquals(0, hashMap3.size());
      assertTrue(hashMap3.isEmpty());
      assertTrue(hashMap2.equals((Object)hashMap3));
      assertTrue(hashMap3.equals((Object)hashMap2));
      assertTrue(gestor_Utilizadores1.equals((Object)gestor_Utilizadores0));
      assertNotNull(gestor_Utilizadores1);
      
      GestorEncomendas gestorEncomendas0 = new GestorEncomendas();
      assertNotNull(gestorEncomendas0);
      
      Gestor_Transportadoras gestor_Transportadoras0 = new Gestor_Transportadoras();
      assertNotNull(gestor_Transportadoras0);
      
      Gestor_Transportadoras gestor_Transportadoras1 = new Gestor_Transportadoras(gestor_Transportadoras0);
      assertTrue(gestor_Transportadoras1.equals((Object)gestor_Transportadoras0));
      assertNotNull(gestor_Transportadoras1);
      
      Map<Long, Transportadora> map1 = gestor_Transportadoras1.getTransportadoras();
      assertEquals(0, map1.size());
      assertTrue(map1.isEmpty());
      assertTrue(gestor_Transportadoras0.equals((Object)gestor_Transportadoras1));
      assertTrue(gestor_Transportadoras1.equals((Object)gestor_Transportadoras0));
      assertNotSame(gestor_Transportadoras0, gestor_Transportadoras1);
      assertNotSame(gestor_Transportadoras1, gestor_Transportadoras0);
      assertNotNull(map1);
      
      Gestor_Transportadoras gestor_Transportadoras2 = new Gestor_Transportadoras(map1);
      assertEquals(0, map1.size());
      assertTrue(map1.isEmpty());
      assertTrue(gestor_Transportadoras0.equals((Object)gestor_Transportadoras1));
      assertTrue(gestor_Transportadoras1.equals((Object)gestor_Transportadoras0));
      assertTrue(gestor_Transportadoras2.equals((Object)gestor_Transportadoras1));
      assertTrue(gestor_Transportadoras2.equals((Object)gestor_Transportadoras0));
      assertNotNull(gestor_Transportadoras2);
      
      Vintage vintage0 = new Vintage(gestor_Artigos0, gestor_Utilizadores1, gestorEncomendas0, gestor_Transportadoras2, (Menu) null, (-1026));
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals(0.5, gestor_Artigos0.getTaxaNovo(), 0.01);
      assertEquals(0.25, gestor_Artigos0.getTaxaUsado(), 0.01);
      assertTrue(map0.isEmpty());
      assertEquals(0, map0.size());
      assertTrue(hashMap1.isEmpty());
      assertEquals(0, hashMap1.size());
      assertEquals(0, hashMap2.size());
      assertTrue(hashMap2.isEmpty());
      assertEquals(0, hashMap3.size());
      assertTrue(hashMap3.isEmpty());
      assertEquals(0, map1.size());
      assertTrue(map1.isEmpty());
      assertEquals((-1026L), vintage0.getUtilizador());
      assertTrue(gestor_Utilizadores0.equals((Object)gestor_Utilizadores1));
      assertTrue(hashMap2.equals((Object)hashMap3));
      assertTrue(hashMap3.equals((Object)hashMap2));
      assertTrue(gestor_Utilizadores1.equals((Object)gestor_Utilizadores0));
      assertTrue(gestor_Transportadoras0.equals((Object)gestor_Transportadoras1));
      assertTrue(gestor_Transportadoras0.equals((Object)gestor_Transportadoras2));
      assertTrue(gestor_Transportadoras1.equals((Object)gestor_Transportadoras2));
      assertTrue(gestor_Transportadoras1.equals((Object)gestor_Transportadoras0));
      assertTrue(gestor_Transportadoras2.equals((Object)gestor_Transportadoras1));
      assertTrue(gestor_Transportadoras2.equals((Object)gestor_Transportadoras0));
      assertNotNull(vintage0);
      
      Controlador controlador0 = new Controlador((Menu) null, vintage0);
      assertTrue(hashMap0.isEmpty());
      assertEquals(0, hashMap0.size());
      assertEquals(0.5, gestor_Artigos0.getTaxaNovo(), 0.01);
      assertEquals(0.25, gestor_Artigos0.getTaxaUsado(), 0.01);
      assertTrue(map0.isEmpty());
      assertEquals(0, map0.size());
      assertTrue(hashMap1.isEmpty());
      assertEquals(0, hashMap1.size());
      assertEquals(0, hashMap2.size());
      assertTrue(hashMap2.isEmpty());
      assertEquals(0, hashMap3.size());
      assertTrue(hashMap3.isEmpty());
      assertEquals(0, map1.size());
      assertTrue(map1.isEmpty());
      assertEquals((-1026L), vintage0.getUtilizador());
      assertTrue(gestor_Utilizadores0.equals((Object)gestor_Utilizadores1));
      assertTrue(hashMap2.equals((Object)hashMap3));
      assertTrue(hashMap3.equals((Object)hashMap2));
      assertTrue(gestor_Utilizadores1.equals((Object)gestor_Utilizadores0));
      assertTrue(gestor_Transportadoras0.equals((Object)gestor_Transportadoras1));
      assertTrue(gestor_Transportadoras0.equals((Object)gestor_Transportadoras2));
      assertTrue(gestor_Transportadoras1.equals((Object)gestor_Transportadoras2));
      assertTrue(gestor_Transportadoras1.equals((Object)gestor_Transportadoras0));
      assertTrue(gestor_Transportadoras2.equals((Object)gestor_Transportadoras1));
      assertTrue(gestor_Transportadoras2.equals((Object)gestor_Transportadoras0));
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_transportadora();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_malas();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Menu menu0 = new Menu();
      assertNotNull(menu0);
      
      Vintage vintage0 = Vintage.carregarEstado();
      assertNull(vintage0);
      
      menu0.encomendas_retiradas();
      menu0.pesquisa_falhou();
      Controlador controlador0 = new Controlador(menu0, (Vintage) null);
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_venda();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_venda();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      Controlador controlador1 = new Controlador(controlador0);
      assertFalse(controlador1.equals((Object)controlador0));
      assertNotNull(controlador1);
      
      controlador1.salvarEstado();
      assertFalse(controlador0.equals((Object)controlador1));
      assertFalse(controlador1.equals((Object)controlador0));
      assertNotSame(controlador0, controlador1);
      assertNotSame(controlador1, controlador0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_sapatilhas();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_tshit();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_transportadora();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Controlador controlador0 = null;
      try {
        controlador0 = new Controlador((Controlador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_faturas();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Vintage vintage0 = new Vintage();
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(vintage0);
      
      Controlador controlador0 = new Controlador((Menu) null, vintage0);
      assertEquals((-1L), vintage0.getUtilizador());
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.registar();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      assertNotNull(controlador0);
      
      // Undeclared exception!
      try { 
        controlador0.escolha_query();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Vintage vintage0 = Vintage.load();
      Controlador controlador0 = new Controlador((Menu) null, vintage0);
      Controlador controlador1 = new Controlador(controlador0);
      // Undeclared exception!
      try { 
        controlador1.escolha_venda_malas();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP2.Controlador", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Menu menu0 = new Menu();
      Vintage.carregarEstado();
      Controlador controlador0 = new Controlador(menu0, (Vintage) null);
      // Undeclared exception!
      try { 
        menu0.pedir_tamanho_sapatilha();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Controlador controlador0 = new Controlador();
      Controlador controlador1 = new Controlador(controlador0);
      // Undeclared exception!
      try { 
        controlador0.escolha_tshit();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }
}
