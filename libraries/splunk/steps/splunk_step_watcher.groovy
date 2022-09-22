@BeforeStep
void before(hookContext){
  println "Splunk: running on $hookContext.step" 
}

@AfterStep({ config.afterSteps ? (hookContext.step in config.afterSteps) : true })
void after(hookContext){
  println "Splunk: running on $hookContext.step" 
}

@AfterStep({ currentBuild.result.toString() == "FAILURE" })
void afterFailure(hookContext){
  println "Splunk: running on $hookContext.step"  
}
