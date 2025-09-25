pipeline{
    agent any
        tools{
            maven 'Maven3'
        }
    stages{
     stage('checking'){
        steps {
            git branch:'main', url: 'https://github.com/PhongLe7de/week6-inclass.git'
        }
     }
     stage('build'){
        steps {
            sh 'mnv clean install'
        }
     }
      stage('Checkout') {
                 steps {
                     git 'https://github.com/your-username/your-repo.git'
                 }
             }
             stage('Build') {
                 steps {
                     bat 'mvn clean install' // sh for linux and ios
                 }
             }
             stage('Test') {
                 steps {
                     bat 'mvn test'
                 }
             }
             stage('Code Coverage') {
                 steps {
                     bat 'mvn jacoco:report'
                 }
             }
             stage('Publish Test Results') {
                 steps {
                     junit '**/target/surefire-reports/*.xml'
                 }
             }
             stage('Publish Coverage Report') {
                 steps {
                     jacoco()
                 }
             }
}