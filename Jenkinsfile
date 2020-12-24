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

    stage('Push image') {
      steps {
        script {
          docker.withRegistry( '' ) {
            dockerImage.push()
          }
        }

      }
    }

    stage('Remove Unused docker image') {
      steps {
        sh "docker rmi $registry:$BUILD_NUMBER"
      }
    }

    stage('Pull image from docker registry') {
      steps {
        sh "docker pull hhssaaffii/docker-jenkins:${params.IMAGE_TAG}"
      }
    }

    stage('Install helm and deploy') {
      steps {
        sh " helm upgrade docker-jenkins  helm/charts/docker-jenkins --set tag=${params.IMAGE_TAG}"
      }
    }

  }
  environment {
    registry = 'hhssaaffii/docker-jenkins'
    registryCredential = ''
    dockerImage = '1'
  }
}