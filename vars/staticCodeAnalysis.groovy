def call(credentialsId){

    // withSonarQubeEnv(credentialsId: credentialsId) {
    withSonarQubeEnv(credentialsId: 'sonar-api') {
         sh 'mvn clean package sonar:sonar'
    }
}