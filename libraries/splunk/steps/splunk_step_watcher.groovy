@BeforeStep
void before(hookContext){
  println "Splunk: running " 
}

@AfterStep({ config.afterSteps ? (hookContext.step in config.afterSteps) : true })
void after(hookContext){
  println "Splunk: running" 
}

@AfterStep({ currentBuild.result.toString() == "FAILURE" })
void afterFailure(hookContext){
  println "Splunk: running"  
}
