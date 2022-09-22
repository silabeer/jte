@BeforeStep
void before(hookContext){
  println "Splunk: running on $hookContext.step" 
}

@AfterStep({ hookContext.library == "maven" && hookContext.step == "build" })
void call(){
  println "running after the ${hookContext.library}'s ${hookContext.step} step"
}