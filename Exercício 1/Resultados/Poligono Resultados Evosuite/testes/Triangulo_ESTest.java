/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 16 17:20:04 GMT 2024
 */

package poligono;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import poligono.Ponto;
import poligono.Triangulo;

@RunWith(EvoRunner.class)
@EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Triangulo_ESTest extends Triangulo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Ponto ponto0 = new Ponto();
      Ponto ponto1 = new Ponto(ponto0);
      ponto1.somaPonto((-655.022), 1238.6609295649014);
      Ponto ponto2 = new Ponto(908.1910908611, 908.1910908611);
      Triangulo triangulo0 = new Triangulo(ponto1, ponto0, ponto2);
      double double0 = triangulo0.areaTriangulo();
      assertTrue(triangulo0.fechada());
      assertEquals(859912.9827732957, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Triangulo triangulo0 = null;
      try {
        triangulo0 = new Triangulo((Ponto) null, (Ponto) null, (Ponto) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("poligono.Triangulo", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Triangulo triangulo0 = new Triangulo();
      // Undeclared exception!
      try { 
        triangulo0.areaTriangulo();
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
      Ponto ponto0 = new Ponto((-1060.898672252766), (-1060.898672252766));
      Triangulo triangulo0 = new Triangulo(ponto0, ponto0, ponto0);
      Triangulo triangulo1 = triangulo0.clone();
      assertTrue(triangulo1.eConvexo());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Ponto ponto0 = new Ponto((-1060.898672252766), (-1060.898672252766));
      Triangulo triangulo0 = new Triangulo(ponto0, ponto0, ponto0);
      double double0 = triangulo0.areaTriangulo();
      assertEquals(0.0, double0, 0.01);
  }
}
