@BeforeStep
void before(hookContext){
  println "Splunk: running before the ${hookContext.step} step" 
}

@AfterStep({ config.afterSteps ? (context.step in config.afterSteps) : true })
void after(hookContext){
  println "Splunk: running after the ${hookContext.step} step" 
}

@AfterStep({ currentBuild.result.toString() == "FAILURE" })
void afterFailure(hookContext){
  println "Splunk: running after the ${hookContext.step} step failure"  
}
