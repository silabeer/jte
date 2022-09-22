@AfterStep({ hookContext.library == "gradle" && hookContext.step == "build" })
void call(){
  println "running after the ${hookContext.library}'s ${hookContext.step} step"
}