import logging.Utility

void call(){
    def mavenCredentials = config.mavenCredentials ?: "maven"
    stage("Maven: Build"){
        script {
            Utility u = new Utility()
            u.doThing(steps)
        }
        withMaven(maven: '3.8.6') {
                sh 'mvn clean install -DskipTests=true'
                println mavenCredentials
        } 
    }
}
