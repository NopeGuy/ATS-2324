/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 16 17:18:33 GMT 2024
 */

package poligono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import poligono.Ponto;

@RunWith(EvoRunner.class) 
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)

public class Ponto_ESTest extends Ponto_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Ponto ponto1 = new Ponto(0.0, 1449.5649442);
      boolean boolean0 = ponto0.equals(ponto1);
      assertEquals(1449.5649442, ponto1.getY(), 0.01);
      assertFalse(boolean0);
      assertFalse(ponto1.equals((Object)ponto0));
      assertEquals(0.0, ponto1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      ponto0.setY((-1525.092522885318));
      ponto0.incCoord(1155.255459838, 1.0);
      boolean boolean0 = ponto0.coordPos();
      assertEquals((-1524.092522885318), ponto0.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      boolean boolean0 = ponto0.coordPos();
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, ponto0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ponto ponto0 = new Ponto(107.17709, (-1.0));
      Ponto ponto1 = new Ponto((-2717.93), 225.9);
      ponto0.somaPonto(ponto1);
      assertEquals((-2610.7529099999997), ponto0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ponto ponto0 = new Ponto(1.0, 1.0);
      ponto0.decCoord(0.0, 0.0);
      assertTrue(ponto0.coordPos());
      assertTrue(ponto0.simetrico());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Ponto ponto1 = ponto0.somaPonto(0.0, 0.0);
      assertTrue(ponto1.simetrico());
      assertEquals(0.0, ponto1.getX(), 0.01);
      assertEquals(0.0, ponto0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ponto ponto0 = new Ponto((-1.0), (-1.0));
      ponto0.somaPonto((-2.5282866312255465), (-1.0));
      assertFalse(ponto0.simetrico());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ponto ponto0 = new Ponto(471.124, 471.124);
      ponto0.somaPonto(942.248, (-3759.2151438440974));
      assertFalse(ponto0.simetrico());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      double double0 = ponto0.getY();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ponto ponto0 = new Ponto((-1.0), (-1.0));
      double double0 = ponto0.getY();
      assertEquals((-1.0), double0, 0.01);
      assertEquals((-1.0), ponto0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      double double0 = ponto0.getX();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, ponto0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ponto ponto0 = new Ponto(1.0, 1.0);
      double double0 = ponto0.getX();
      assertEquals(1.0, double0, 0.01);
      assertTrue(ponto0.coordPos());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      double double0 = ponto0.distancia(ponto0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertEquals(0.0, ponto0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ponto ponto0 = new Ponto((-1.0), (-1.0));
      Ponto ponto1 = new Ponto();
      double double0 = ponto0.distancia(ponto1);
      assertEquals(1.4142135623730951, double0, 0.01);
      assertEquals(0.0, ponto1.getX(), 0.01);
      assertEquals(0.0, ponto1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Ponto ponto0 = new Ponto((-1569.0), (-2089.496967));
      Ponto ponto1 = ponto0.clone();
      assertEquals((-2089.496967), ponto0.getY(), 0.01);
      assertEquals((-2089.496967), ponto1.getY(), 0.01);
      assertEquals((-1569.0), ponto1.getX(), 0.01);
      assertEquals((-1569.0), ponto0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      ponto0.clone();
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Ponto ponto0 = new Ponto(1.0, 1.0);
      Ponto ponto1 = ponto0.clone();
      ponto0.somaPonto(1012.4141, 325.0);
      boolean boolean0 = ponto0.equals(ponto1);
      assertFalse(ponto0.simetrico());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ponto ponto0 = new Ponto(0.0, 0.0);
      // Undeclared exception!
      try { 
        ponto0.somaPonto((Ponto) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("poligono.Ponto", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Ponto ponto0 = null;
      try {
        ponto0 = new Ponto((Ponto) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("poligono.Ponto", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Ponto ponto0 = new Ponto(1.0, 1.0);
      double double0 = ponto0.getY();
      assertEquals(1.0, double0, 0.01);
      assertEquals(1.0, ponto0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Ponto ponto0 = new Ponto((-128.4162), 3318.524);
      double double0 = ponto0.getX();
      assertEquals(3318.524, ponto0.getY(), 0.01);
      assertEquals((-128.4162), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Ponto ponto1 = new Ponto(ponto0);
      boolean boolean0 = ponto1.equals(ponto0);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Ponto ponto0 = new Ponto((-128.4162), 3318.524);
      Ponto ponto1 = new Ponto();
      boolean boolean0 = ponto0.equals(ponto1);
      assertFalse(boolean0);
      assertEquals(3318.524, ponto0.getY(), 0.01);
      assertEquals((-128.4162), ponto0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Ponto ponto0 = new Ponto(1.0, 1.0);
      boolean boolean0 = ponto0.equals("x : 4002.761677438072 y: 984.5");
      assertFalse(boolean0);
      assertTrue(ponto0.coordPos());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      boolean boolean0 = ponto0.equals((Object) null);
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, ponto0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      boolean boolean0 = ponto0.equals(ponto0);
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      ponto0.incCoord(1702.600114134402, 0.0);
      ponto0.setY(1702.600114134402);
      boolean boolean0 = ponto0.coordPos();
      assertEquals(1702.600114134402, ponto0.getY(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      ponto0.incCoord(1702.600114134402, 0.0);
      boolean boolean0 = ponto0.coordPos();
      assertEquals(1702.600114134402, ponto0.getX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Ponto ponto0 = new Ponto((-128.4162), 3318.524);
      boolean boolean0 = ponto0.coordPos();
      assertEquals(3318.524, ponto0.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Ponto ponto0 = new Ponto((-128.4162), 3318.524);
      boolean boolean0 = ponto0.simetrico();
      assertEquals(3318.524, ponto0.getY(), 0.01);
      assertFalse(boolean0);
      assertFalse(ponto0.coordPos());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Ponto ponto0 = new Ponto((-128.4162), 3318.524);
      ponto0.setY(0.0);
      boolean boolean0 = ponto0.simetrico();
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Ponto ponto0 = new Ponto((-128.4162), 3318.524);
      ponto0.decCoord((-128.4162), (-2424.60463655));
      assertEquals(5743.12863655, ponto0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Ponto ponto0 = new Ponto((-128.4162), 3318.524);
      // Undeclared exception!
      try { 
        ponto0.distancia((Ponto) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("poligono.Ponto", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Ponto ponto0 = new Ponto((-128.4162), 3318.524);
      ponto0.setX((-2424.60463655));
      assertEquals((-2424.60463655), ponto0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Ponto ponto0 = new Ponto((-128.4162), 3318.524);
      String string0 = ponto0.toString();
      assertEquals("x : -128.4162 y: 3318.524", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      ponto0.incCoord(1702.600114134402, 0.0);
      ponto0.setY(1702.600114134402);
      boolean boolean0 = ponto0.simetrico();
      assertEquals(1702.600114134402, ponto0.getY(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Ponto ponto1 = new Ponto(ponto0);
      ponto0.setY(1702.600114134402);
      boolean boolean0 = ponto0.equals(ponto1);
      assertEquals(1702.600114134402, ponto0.getY(), 0.01);
      assertFalse(boolean0);
  }
}
