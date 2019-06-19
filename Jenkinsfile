def MVN_HOME

pipeline {
    agent any
  
    stages {
        stage('Initialize') {
            steps {
                script {
                    MVN_HOME = tool name: 'maven_361', type: 'maven'
                    echo MVN_HOME
                    sh "${MVN_HOME}/bin/mvn clean package"
                }
            }
        }

        stage ('Build') {
            steps {
                echo 'This is step build'
            }
        }

    }
}
