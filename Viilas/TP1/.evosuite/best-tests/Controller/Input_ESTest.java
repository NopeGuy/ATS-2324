/*
 * This file was automatically generated by EvoSuite
 * Fri May 24 09:30:59 GMT 2024
 */

package Controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import Controller.Input;
import View.Apresentacao;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Input_ESTest extends Input_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      SystemInUtil.addInputLine("");
      int int0 = input0.lerInt(apresentacao0, "", (-1512), 2351);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      SystemInUtil.addInputLine("og^eAH:)&5tNW BoI|");
      double double0 = input0.lerDouble(apresentacao0, "t(Q By u1C@*&NaUx", (-2150), 619);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Input input0 = new Input();
      SystemInUtil.addInputLine("0 | VlwGtar atr\u00E1s");
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      String string0 = input0.lerString(apresentacao0, "RI");
      assertEquals("0 | VlwGtar atr\u00E1s", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Input input0 = new Input();
      SystemInUtil.addInputLine("");
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      String string0 = input0.lerString(apresentacao0, "C");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Input input0 = new Input();
      SystemInUtil.addInputLine("0 | VlwGtar atr\u00E1s");
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      input0.lerFloat(apresentacao0, "", (-2005.9467F), (-3000.3281F));
      Apresentacao apresentacao1 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        input0.lerString(apresentacao1, "aVJ7KkV]a");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Input input0 = new Input();
      // Undeclared exception!
      try { 
        input0.lerSN((Apresentacao) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Controller.Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Input input0 = new Input();
      // Undeclared exception!
      try { 
        input0.lerInt((Apresentacao) null, "I3nEQh5h|1L!| Phj", (-1), 3205);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Controller.Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        input0.lerFloat(apresentacao0, "K)", 0.0F, 0.0F);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Input input0 = new Input();
      // Undeclared exception!
      try { 
        input0.lerFloat((Apresentacao) null, "vUAkAZ", 1412.94F, 1412.94F);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Controller.Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Input input0 = new Input();
      // Undeclared exception!
      try { 
        input0.lerDouble((Apresentacao) null, "", 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Controller.Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        input0.lerData(apresentacao0, "");
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Input input0 = new Input();
      // Undeclared exception!
      try { 
        input0.lerData((Apresentacao) null, "7)_<@_ 8a");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Controller.Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Input input0 = new Input();
      SystemInUtil.addInputLine("+------------------------------+\n|        Transportadoras       |\n+------------------------------+");
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        input0.lerData(apresentacao0, "@m,:Hw#}ULU");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("Controller.Input", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SystemInUtil.addInputLine("_@ ");
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        input0.lerInt(apresentacao0, "Shg", (-5815), (-5815));
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SystemInUtil.addInputLine("Logout");
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      int int0 = input0.lerInt(apresentacao0, "Logout", (-1), (-1));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      SystemInUtil.addInputLine("Dimens\u00E3o da embalagem: ");
      // Undeclared exception!
      try { 
        input0.lerInt(apresentacao0, (String) null, 2168, 2168);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      SystemInUtil.addInputLine("");
      // Undeclared exception!
      try { 
        input0.lerDouble(apresentacao0, "S", (-22), (-1803));
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
      SystemInUtil.addInputLine("Logout");
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      double double0 = input0.lerDouble(apresentacao0, "Data inv\u00E1lida", (-8), (-1));
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Input input0 = new Input();
      SystemInUtil.addInputLine("_H=d\"r]pa(xW{");
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        input0.lerDouble(apresentacao0, "", 392, 392);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      SystemInUtil.addInputLine("GYT");
      // Undeclared exception!
      try { 
        input0.lerSN(apresentacao0, "eLWq'A1qMP3H");
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
      SystemInUtil.addInputLine("N");
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = input0.lerSN(apresentacao0, (String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SystemInUtil.addInputLine("S");
      Input input0 = new Input();
      Apresentacao apresentacao0 = mock(Apresentacao.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = input0.lerSN(apresentacao0, "Controller.Input");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Input input0 = new Input();
      // Undeclared exception!
      try { 
        input0.lerString((Apresentacao) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Controller.Input", e);
      }
  }
}