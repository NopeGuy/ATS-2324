/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat May 25 23:26:26 GMT 2024
 */

package TP2;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Vintage_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "TP2.Vintage"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/lufe/Documents/Uni Projects/ATS-2324/Projeto/TP2"); 
    java.lang.System.setProperty("user.home", "/home/lufe"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "lufe"); 
    java.lang.System.setProperty("user.timezone", "Europe/Lisbon"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Vintage_ESTest_scaffolding.class.getClassLoader() ,
      "TP2.Gestor_Utilizadores",
      "TP2.CarrinhoVazioException",
      "TP2.Transportadora",
      "TP2.ArtigoNaoEncontradoException",
      "TP2.Dimensao",
      "TP2.Vintage",
      "TP2.EncomendaExistenteException",
      "TP2.Fatura",
      "TP2.ArtigoExistenteException",
      "TP2.Padrao",
      "TP2.Artigo",
      "TP2.Estado",
      "TP2.Menu",
      "TP2.Gestor_Transportadoras",
      "TP2.Utilizador",
      "TP2.Tshirt",
      "TP2.Sapatilha",
      "TP2.Tamanho",
      "TP2.EncomendaNaoEncontradaException",
      "TP2.GestorEncomendas",
      "TP2.Encomenda",
      "TP2.Gestor_Artigos",
      "TP2.Mala",
      "TP2.EncomendaDevolucaoImpossivelException",
      "TP2.ComparatorVendas",
      "TP2.TransportadoraNaoEncontradaException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Vintage_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "TP2.Vintage",
      "TP2.Gestor_Artigos",
      "TP2.Artigo",
      "TP2.Encomenda",
      "TP2.Fatura",
      "TP2.Transportadora",
      "TP2.Utilizador",
      "TP2.Gestor_Utilizadores",
      "TP2.Gestor_Transportadoras",
      "TP2.GestorEncomendas",
      "TP2.ArtigoNaoEncontradoException",
      "TP2.Menu",
      "TP2.EncomendaNaoEncontradaException",
      "TP2.Dimensao",
      "TP2.Estado",
      "TP2.Sapatilha",
      "TP2.ComparatorVendas",
      "TP2.Tshirt",
      "TP2.Mala",
      "TP2.TransportadoraNaoEncontradaException",
      "TP2.CarrinhoVazioException"
    );
  }
}
