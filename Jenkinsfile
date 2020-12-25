properties([
  parameters([

        booleanParam(defaultValue: false, description: 'Image TAG', name: 'deploy'),
        string(name: 'IMAGE_TAG', defaultValue: '', description: 'Image TAG', ),
        choice(choices: 'tst\nacc\nprd', description: 'environmet', name: 'env' ),
        string(name: 'branch', defaultValue: '', description: 'branch', defaultValue: 'master')
   ]),
   pipelineTriggers([])
])

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

        stage("Push image") {
            steps {
                script {
                    docker.withRegistry( '' ) {
                        dockerImage.push()
                    }
                }
            }
        }


        stage("Remove Unused docker image") {
            steps{
                sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }

        stage("Pull image from docker registry") {
            steps{
                sh "docker pull hhssaaffii/docker-jenkins:${params.IMAGE_TAG}"
            }
        }

        stage("Install helm and deploy") {
            steps{
                sh " helm upgrade docker-jenkins  helm/charts/docker-jenkins --set tag=${params.IMAGE_TAG}"
            }
        }

    }
}