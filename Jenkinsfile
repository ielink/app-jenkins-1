pipeline {
  agent any
  stages {
    stage('git checkout') {
      parallel {
        stage('git checkout') {
          steps {
            git 'https://github.com/hhammidd/app-jenkins.git'
          }
        }

        stage('stage1') {
          steps {
            echo 'Hello $dockerImage'
          }
        }

      }
    }

    stage('build-test') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('build Image') {
      steps {
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }

      }
    }

  }
  environment {
    registry = 'hhssaaffii/docker-jenkins'
    registryCredential = ''
    dockerImage = '1'
  }
}