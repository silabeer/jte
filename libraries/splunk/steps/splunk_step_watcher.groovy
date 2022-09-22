@BeforeStep({ hookContext.library == "maven" && hookContext.step == "build" })
void call(){
  println "running before step"
}

@AfterStep({ hookContext.library == "maven" && hookContext.step == "build" })
void call(){
  println "running after step"
}