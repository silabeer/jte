@BeforeStep
void before(hookContext){
  println "Splunk: running before the library's ${hookContext.step} step" 
}

@AfterStep({ config.afterSteps ? (hookContext.step in config.afterSteps) : true })
void after(hookContext){
  println "Splunk: running after the library's ${hookContext.step} step" 
}

@AfterStep({ currentBuild.result.toString() == "FAILURE" })
void afterFailure(hookContext){
  println "Splunk: running after the library's ${hookContext.step} step failure"  
}
