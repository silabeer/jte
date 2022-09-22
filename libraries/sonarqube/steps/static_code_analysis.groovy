void call(){
    stage("SonarQube: Static Code Analysis"){
        withMaven(maven: '3.8.6',  mavenSettingsConfig: 'my-project', mavenOpts: '${ADDITIONAL_MVN_OPTS}', options: [artifactsPublisher(disabled: true)]) {
            withSonarQubeEnv(installationName: servername) {
                sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.0.2155:sonar -Dsonar.java.binaries=target/**'
            }
        } 
    }
}
