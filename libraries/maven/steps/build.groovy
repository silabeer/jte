void call(){
    stage("Maven: Build"){
        withMaven(maven: '3.8.6') {
                sh 'mvn clean install -DskipTests=true'
        } 
    }
}
