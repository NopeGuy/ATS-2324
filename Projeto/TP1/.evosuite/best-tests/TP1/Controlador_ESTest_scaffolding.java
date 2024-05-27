/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat May 25 16:45:21 GMT 2024
 */

package TP1;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Controlador_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "TP1.Controlador"; 
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
    org.evosuite.runtime.util.SystemInUtil.getInstance().initForTestCase(); 
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
    java.lang.System.setProperty("user.dir", "/home/lufe/Documents/Uni Projects/ATS-2324/Projeto/TP1"); 
    java.lang.System.setProperty("user.home", "/home/lufe"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "lufe"); 
    java.lang.System.setProperty("user.timezone", "Europe/Lisbon"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Controlador_ESTest_scaffolding.class.getClassLoader() ,
      "TP1.TShirt$Padrao",
      "TP1.Malas$Tipos_Malas",
      "TP1.Apresentacao",
      "TP1.Controlador",
      "TP1.Encomenda",
      "TP1.ViewMain",
      "TP1.TShirt$Tamanho",
      "TP1.Output",
      "TP1.ControladorEncomenda",
      "TP1.TShirt",
      "TP1.Vintage",
      "TP1.Transportadoras",
      "TP1.Artigo",
      "TP1.Estados",
      "TP1.Encomenda$Estado_Encomenda",
      "TP1.Sapatilhas",
      "TP1.Artigo$Estado",
      "TP1.Sapatilhas$Tipos_Sapatilhas",
      "TP1.ControladorTransportadoras",
      "TP1.Input",
      "TP1.Encomenda$Dimensao_Embalagem",
      "TP1.Utilizador",
      "TP1.ControladorArtigo",
      "TP1.ViewLogin",
      "TP1.Artigo$Avaliação",
      "TP1.Malas",
      "TP1.ControladorUtilizador"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Controlador_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "TP1.Controlador",
      "TP1.Input",
      "TP1.ControladorArtigo",
      "TP1.ControladorUtilizador",
      "TP1.ControladorTransportadoras",
      "TP1.ControladorEncomenda",
      "TP1.Vintage",
      "TP1.Apresentacao",
      "TP1.ViewMain",
      "TP1.Output",
      "TP1.ViewLogin",
      "TP1.Estados",
      "TP1.Utilizador",
      "TP1.Encomenda",
      "TP1.Encomenda$Estado_Encomenda",
      "TP1.Artigo",
      "TP1.Sapatilhas",
      "TP1.TShirt",
      "TP1.Malas",
      "TP1.Transportadoras"
    );
  }
}
