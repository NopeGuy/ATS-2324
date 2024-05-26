/*
 * This file was automatically generated by EvoSuite
 * Fri May 24 09:57:24 GMT 2024
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComparatorVendas_ESTest extends ComparatorVendas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ComparatorVendas comparatorVendas0 = new ComparatorVendas();
      Utilizador utilizador0 = mock(Utilizador.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(utilizador0).getId();
      doReturn(0).when(utilizador0).getN_vendidos();
      Utilizador utilizador1 = mock(Utilizador.class, new ViolatedAssumptionAnswer());
      doReturn(0L).when(utilizador1).getId();
      doReturn(0).when(utilizador1).getN_vendidos();
      int int0 = comparatorVendas0.compare(utilizador0, utilizador1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ComparatorVendas comparatorVendas0 = new ComparatorVendas();
      Utilizador utilizador0 = mock(Utilizador.class, new ViolatedAssumptionAnswer());
      doReturn(1, (-3390), 0, 0).when(utilizador0).getN_vendidos();
      int int0 = comparatorVendas0.compare(utilizador0, utilizador0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ComparatorVendas comparatorVendas0 = new ComparatorVendas();
      Utilizador utilizador0 = mock(Utilizador.class, new ViolatedAssumptionAnswer());
      doReturn((-1744), 0).when(utilizador0).getN_vendidos();
      Utilizador utilizador1 = mock(Utilizador.class, new ViolatedAssumptionAnswer());
      doReturn(1, 0).when(utilizador1).getN_vendidos();
      int int0 = comparatorVendas0.compare(utilizador0, utilizador1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ComparatorVendas comparatorVendas0 = new ComparatorVendas();
      // Undeclared exception!
      try { 
        comparatorVendas0.compare((Utilizador) null, (Utilizador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ComparatorVendas", e);
      }
  }
}