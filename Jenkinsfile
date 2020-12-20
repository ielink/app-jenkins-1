pipeline {
   agent any

   stages {
      stage('Build') {
               steps {
                  echo "$GIT_BRANCH"
               }
            }
      stage('rest') {
               steps {
                  echo "$GIT_BRANCH"
               }
            }
   }
}
pipeline {
    environment {
        registry = "hhssaaffii/docker-jenkins"
        registryCredential = ''
        dockerImage = ''
    }
    agent any
    stages {
        stage("git checkout") {
            steps{
                git 'https://github.com/hhammidd/app-jenkins.git'
            }
        }
        stage("build-test") {
            steps{
                sh "mvn clean install"
            }
        }
        stage("build Image") {
            steps{
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }

        stage("Test MkDocs") {
            agent {
                docker { image 'hhssaaffii/docker-jenkins:$BUILD_NUMBER'}
            }
            steps {
                sh 'docker docker-jenkins --version'
            }

        }
    }
}