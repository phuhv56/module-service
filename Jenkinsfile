pipeline {
    agent any

    stages {
        stage('Compile and Install State') {
            withMaven(maven: 'maven_361') {
                sh 'mvn clean package'
            }
        }
    }
}