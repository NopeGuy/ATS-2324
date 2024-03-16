/*
 * This file was automatically generated by EvoSuite
 * Thu Mar 14 17:50:08 GMT 2024
 */

package poligono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import poligono.PoligonoConvexo;
import poligono.Ponto;
import poligono.Triangulo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PoligonoConvexo_ESTest extends PoligonoConvexo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PoligonoConvexo poligonoConvexo0 = new PoligonoConvexo();
      assertNotNull(poligonoConvexo0);
      assertTrue(poligonoConvexo0.eConvexo());
      assertEquals(0.0, poligonoConvexo0.perimetro(), 0.01);
      
      Ponto ponto0 = new Ponto(0.0, 0.0);
      assertNotNull(ponto0);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertTrue(ponto0.simetrico());
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, ponto0.getY(), 0.01);
      
      poligonoConvexo0.addPonto(ponto0);
      assertTrue(poligonoConvexo0.eConvexo());
      assertTrue(poligonoConvexo0.fechada());
      assertEquals(0.0, poligonoConvexo0.perimetro(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertTrue(ponto0.simetrico());
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, ponto0.getY(), 0.01);
      
      List<Triangulo> list0 = poligonoConvexo0.triangula();
      assertNotNull(list0);
      assertTrue(poligonoConvexo0.eConvexo());
      assertTrue(poligonoConvexo0.fechada());
      assertEquals(0.0, poligonoConvexo0.perimetro(), 0.01);
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      assertNotNull(ponto0);
      assertFalse(ponto0.coordPos());
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertEquals(0.0, ponto0.getY(), 0.01);
      
      Ponto ponto1 = new Ponto(ponto0);
      assertNotNull(ponto1);
      assertFalse(ponto0.coordPos());
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto1.getY(), 0.01);
      assertTrue(ponto1.simetrico());
      assertEquals(0.0, ponto1.getX(), 0.01);
      assertFalse(ponto1.coordPos());
      assertTrue(ponto1.equals((Object)ponto0));
      
      Ponto ponto2 = new Ponto((-4941.67914556428), (-4941.67914556428));
      assertNotNull(ponto2);
      assertTrue(ponto2.simetrico());
      assertEquals((-4941.67914556428), ponto2.getY(), 0.01);
      assertEquals((-4941.67914556428), ponto2.getX(), 0.01);
      assertFalse(ponto2.coordPos());
      assertFalse(ponto2.equals((Object)ponto1));
      assertFalse(ponto2.equals((Object)ponto0));
      
      ponto1.decCoord(0.0, 3355.134579);
      assertFalse(ponto0.coordPos());
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals((-3355.134579), ponto1.getY(), 0.01);
      assertFalse(ponto1.simetrico());
      assertEquals(0.0, ponto1.getX(), 0.01);
      assertFalse(ponto1.coordPos());
      assertFalse(ponto0.equals((Object)ponto1));
      assertFalse(ponto0.equals((Object)ponto2));
      assertFalse(ponto1.equals((Object)ponto2));
      assertFalse(ponto1.equals((Object)ponto0));
      assertNotSame(ponto0, ponto1);
      assertNotSame(ponto0, ponto2);
      assertNotSame(ponto1, ponto2);
      assertNotSame(ponto1, ponto0);
      
      Triangulo triangulo0 = new Triangulo(ponto1, ponto0, ponto2);
      assertNotNull(triangulo0);
      assertFalse(ponto0.coordPos());
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals((-3355.134579), ponto1.getY(), 0.01);
      assertFalse(ponto1.simetrico());
      assertEquals(0.0, ponto1.getX(), 0.01);
      assertFalse(ponto1.coordPos());
      assertTrue(ponto2.simetrico());
      assertEquals((-4941.67914556428), ponto2.getY(), 0.01);
      assertEquals((-4941.67914556428), ponto2.getX(), 0.01);
      assertFalse(ponto2.coordPos());
      assertTrue(triangulo0.fechada());
      assertFalse(triangulo0.eConvexo());
      assertEquals(15533.841436923833, triangulo0.perimetro(), 0.01);
      assertFalse(ponto0.equals((Object)ponto1));
      assertFalse(ponto0.equals((Object)ponto2));
      assertFalse(ponto1.equals((Object)ponto2));
      assertFalse(ponto1.equals((Object)ponto0));
      assertFalse(ponto2.equals((Object)ponto1));
      assertFalse(ponto2.equals((Object)ponto0));
      
      double double0 = triangulo0.area();
      assertFalse(ponto0.coordPos());
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals((-3355.134579), ponto1.getY(), 0.01);
      assertFalse(ponto1.simetrico());
      assertEquals(0.0, ponto1.getX(), 0.01);
      assertFalse(ponto1.coordPos());
      assertTrue(ponto2.simetrico());
      assertEquals((-4941.67914556428), ponto2.getY(), 0.01);
      assertEquals((-4941.67914556428), ponto2.getX(), 0.01);
      assertFalse(ponto2.coordPos());
      assertTrue(triangulo0.fechada());
      assertFalse(triangulo0.eConvexo());
      assertEquals(15533.841436923833, triangulo0.perimetro(), 0.01);
      assertFalse(ponto0.equals((Object)ponto1));
      assertFalse(ponto0.equals((Object)ponto2));
      assertFalse(ponto1.equals((Object)ponto2));
      assertFalse(ponto1.equals((Object)ponto0));
      assertFalse(ponto2.equals((Object)ponto1));
      assertFalse(ponto2.equals((Object)ponto0));
      assertEquals(8289999.289802947, double0, 0.01);
      assertNotSame(ponto0, ponto1);
      assertNotSame(ponto0, ponto2);
      assertNotSame(ponto1, ponto2);
      assertNotSame(ponto1, ponto0);
      assertNotSame(ponto2, ponto1);
      assertNotSame(ponto2, ponto0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PoligonoConvexo poligonoConvexo0 = new PoligonoConvexo();
      assertNotNull(poligonoConvexo0);
      assertEquals(0.0, poligonoConvexo0.perimetro(), 0.01);
      assertTrue(poligonoConvexo0.eConvexo());
      
      // Undeclared exception!
      try { 
        poligonoConvexo0.triangula();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      assertNotNull(ponto0);
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertFalse(ponto0.coordPos());
      
      Triangulo triangulo0 = new Triangulo(ponto0, ponto0, ponto0);
      assertNotNull(triangulo0);
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertFalse(ponto0.coordPos());
      assertTrue(triangulo0.eConvexo());
      assertEquals(0.0, triangulo0.perimetro(), 0.01);
      assertTrue(triangulo0.fechada());
      
      Triangulo triangulo1 = triangulo0.clone();
      assertNotNull(triangulo1);
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertFalse(ponto0.coordPos());
      assertTrue(triangulo0.eConvexo());
      assertEquals(0.0, triangulo0.perimetro(), 0.01);
      assertTrue(triangulo0.fechada());
      assertTrue(triangulo1.eConvexo());
      assertEquals(0.0, triangulo1.perimetro(), 0.01);
      assertFalse(triangulo1.equals((Object)triangulo0));
      assertNotSame(triangulo0, triangulo1);
      assertNotSame(triangulo1, triangulo0);
      
      // Undeclared exception!
      try { 
        triangulo1.area();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PoligonoConvexo poligonoConvexo0 = null;
      try {
        poligonoConvexo0 = new PoligonoConvexo((List<Ponto>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("poligono.Poligono", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      assertNotNull(ponto0);
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertFalse(ponto0.coordPos());
      
      Triangulo triangulo0 = new Triangulo(ponto0, ponto0, ponto0);
      assertNotNull(triangulo0);
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, triangulo0.perimetro(), 0.01);
      assertTrue(triangulo0.fechada());
      assertTrue(triangulo0.eConvexo());
      
      Triangulo triangulo1 = triangulo0.clone();
      assertNotNull(triangulo1);
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, triangulo0.perimetro(), 0.01);
      assertTrue(triangulo0.fechada());
      assertTrue(triangulo0.eConvexo());
      assertTrue(triangulo1.eConvexo());
      assertEquals(0.0, triangulo1.perimetro(), 0.01);
      assertFalse(triangulo1.equals((Object)triangulo0));
      assertNotSame(triangulo0, triangulo1);
      assertNotSame(triangulo1, triangulo0);
      
      List<Ponto> list0 = triangulo1.getPoligono();
      assertFalse(list0.contains(ponto0));
      assertNotNull(list0);
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, triangulo0.perimetro(), 0.01);
      assertTrue(triangulo0.fechada());
      assertTrue(triangulo0.eConvexo());
      assertTrue(triangulo1.eConvexo());
      assertEquals(0.0, triangulo1.perimetro(), 0.01);
      assertTrue(list0.isEmpty());
      assertEquals(0, list0.size());
      assertFalse(triangulo0.equals((Object)triangulo1));
      assertFalse(triangulo1.equals((Object)triangulo0));
      assertNotSame(triangulo0, triangulo1);
      assertNotSame(triangulo1, triangulo0);
      
      PoligonoConvexo poligonoConvexo0 = null;
      try {
        poligonoConvexo0 = new PoligonoConvexo(list0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      assertNotNull(ponto0);
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, ponto0.getY(), 0.01);
      
      Triangulo triangulo0 = new Triangulo(ponto0, ponto0, ponto0);
      assertNotNull(triangulo0);
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, triangulo0.perimetro(), 0.01);
      assertTrue(triangulo0.eConvexo());
      assertTrue(triangulo0.fechada());
      
      List<Triangulo> list0 = triangulo0.triangula();
      assertFalse(list0.contains(triangulo0));
      assertNotNull(list0);
      assertTrue(ponto0.simetrico());
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, triangulo0.perimetro(), 0.01);
      assertTrue(triangulo0.eConvexo());
      assertTrue(triangulo0.fechada());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PoligonoConvexo poligonoConvexo0 = new PoligonoConvexo();
      assertNotNull(poligonoConvexo0);
      assertEquals(0.0, poligonoConvexo0.perimetro(), 0.01);
      assertTrue(poligonoConvexo0.eConvexo());
      
      PoligonoConvexo poligonoConvexo1 = poligonoConvexo0.clone();
      assertNotNull(poligonoConvexo1);
      assertEquals(0.0, poligonoConvexo0.perimetro(), 0.01);
      assertTrue(poligonoConvexo0.eConvexo());
      assertEquals(0.0, poligonoConvexo1.perimetro(), 0.01);
      assertTrue(poligonoConvexo1.eConvexo());
      assertFalse(poligonoConvexo1.equals((Object)poligonoConvexo0));
      assertNotSame(poligonoConvexo0, poligonoConvexo1);
      assertNotSame(poligonoConvexo1, poligonoConvexo0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      assertNotNull(ponto0);
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertTrue(ponto0.simetrico());
      
      Triangulo triangulo0 = new Triangulo(ponto0, ponto0, ponto0);
      assertNotNull(triangulo0);
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertTrue(ponto0.simetrico());
      assertTrue(triangulo0.fechada());
      assertEquals(0.0, triangulo0.perimetro(), 0.01);
      assertTrue(triangulo0.eConvexo());
      
      List<Ponto> list0 = triangulo0.getPoligono();
      assertTrue(list0.contains(ponto0));
      assertNotNull(list0);
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertTrue(ponto0.simetrico());
      assertTrue(triangulo0.fechada());
      assertEquals(0.0, triangulo0.perimetro(), 0.01);
      assertTrue(triangulo0.eConvexo());
      assertFalse(list0.isEmpty());
      assertEquals(4, list0.size());
      
      PoligonoConvexo poligonoConvexo0 = new PoligonoConvexo(list0);
      assertTrue(list0.contains(ponto0));
      assertNotNull(poligonoConvexo0);
      assertFalse(ponto0.coordPos());
      assertEquals(0.0, ponto0.getY(), 0.01);
      assertEquals(0.0, ponto0.getX(), 0.01);
      assertTrue(ponto0.simetrico());
      assertTrue(triangulo0.fechada());
      assertEquals(0.0, triangulo0.perimetro(), 0.01);
      assertTrue(triangulo0.eConvexo());
      assertFalse(list0.isEmpty());
      assertEquals(4, list0.size());
      assertEquals(0.0, poligonoConvexo0.perimetro(), 0.01);
      assertTrue(poligonoConvexo0.fechada());
      assertTrue(poligonoConvexo0.eConvexo());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Triangulo triangulo0 = new Triangulo(ponto0, ponto0, ponto0);
      double double0 = triangulo0.area();
      assertEquals(0.0, double0, 0.01);
  }
}
