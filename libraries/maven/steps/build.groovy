void call(){
    stage("Maven: Build"){
        withMaven(maven: '3.8.6',  mavenSettingsConfig: 'my-project', mavenOpts: '${ADDITIONAL_MVN_OPTS}', options: [artifactsPublisher(disabled: true)]) {
            withSonarQubeEnv(installationName: 'sq') {
                sh 'mvn clean install -DskipTests=true'
            }
        } 
    }
}
