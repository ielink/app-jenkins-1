# Continouse Integration
see https://www.youtube.com/watch?v=42HAiUOJR3M&ab_channel=ZarigaTongy
* Checkout the Git
* Build and test jar file
* Build image locally on Docker desktop on mac(for others ...)
* Push to Docker registry (this is docker hub)

P.S this is Github and docker  hub 
```
properties([
  parameters([
    string(name: 'IMAGE_NAME', defaultValue: '11', description: 'Image TAG', )
   ])
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
                sh "docker pull hhssaaffii/docker-jenkins:$BUILD_NUMBER"
            }
        }
        
        stage("Echo image name") {
            steps{
                echo "Image ${params.IMAGE_NAME}"
            }
        }
        
        stage("Install helm and deploy") {
            steps{
                sh "helm install docker-jenkins helm/charts/docker-jenkins"
            }
        }
        
    }
}
```

# Continouse Deployment