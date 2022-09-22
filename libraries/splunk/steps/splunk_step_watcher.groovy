@BeforeStep
void before(context){
  println "Splunk: running before ${context.step} step" 
}

@AfterStep({ config.afterSteps ? (context.step in config.afterSteps) : true })
void after(context){
  println "Splunk: running after ${context.step} step" 
}

@AfterStep({ currentBuild.result.toString() == "FAILURE" })
void afterFailure(context){
  println "Splunk: running after ${context.step} step failure"  
}
