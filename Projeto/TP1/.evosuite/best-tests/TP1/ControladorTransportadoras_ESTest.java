/*
 * This file was automatically generated by EvoSuite
 * Sat May 25 17:01:38 GMT 2024
 */

package TP1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import TP1.Apresentacao;
import TP1.ControladorTransportadoras;
import TP1.Transportadoras;
import TP1.Vintage;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ControladorTransportadoras_ESTest extends ControladorTransportadoras_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Apresentacao apresentacao0 = new Apresentacao();
      SystemInUtil.addInputLine("KBK");
      ControladorTransportadoras controladorTransportadoras0 = new ControladorTransportadoras();
      // Undeclared exception!
      try { 
        controladorTransportadoras0.registarTransportadoras(apresentacao0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ControladorTransportadoras controladorTransportadoras0 = new ControladorTransportadoras();
      // Undeclared exception!
      try { 
        controladorTransportadoras0.registarTransportadoras((Apresentacao) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ControladorTransportadoras controladorTransportadoras0 = new ControladorTransportadoras();
      Vintage vintage0 = new Vintage();
      Apresentacao apresentacao0 = new Apresentacao();
      // Undeclared exception!
      try { 
        controladorTransportadoras0.interpretador(vintage0, apresentacao0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ControladorTransportadoras controladorTransportadoras0 = new ControladorTransportadoras();
      Vintage vintage0 = new Vintage();
      // Undeclared exception!
      try { 
        controladorTransportadoras0.alterarTransportadora(vintage0, (Apresentacao) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.ControladorTransportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SystemInUtil.addInputLine("BDi+x)o!l#c#uBC*|F");
      Vintage vintage0 = new Vintage();
      Transportadoras transportadoras0 = new Transportadoras("BDi+x)o!l#c#uBC*|F", 0.0, 0.0, true, 0.0);
      vintage0.adicionarTransportadora(transportadoras0);
      Apresentacao apresentacao0 = new Apresentacao();
      ControladorTransportadoras controladorTransportadoras0 = new ControladorTransportadoras();
      // Undeclared exception!
      try { 
        controladorTransportadoras0.alterarTransportadora(vintage0, apresentacao0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SystemInUtil.addInputLine("Estado: ");
      ControladorTransportadoras controladorTransportadoras0 = new ControladorTransportadoras();
      Vintage vintage0 = new Vintage();
      Apresentacao apresentacao0 = new Apresentacao();
      controladorTransportadoras0.alterarTransportadora(vintage0, apresentacao0);
      assertNull(vintage0.getSessaoAtual());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ControladorTransportadoras controladorTransportadoras0 = new ControladorTransportadoras();
      Vintage vintage0 = new Vintage();
      // Undeclared exception!
      try { 
        controladorTransportadoras0.interpretador(vintage0, (Apresentacao) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("TP1.Input", e);
      }
  }
}
