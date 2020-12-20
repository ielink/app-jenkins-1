# Steps of deployment
## App build part
0. Check you have docker and kubernetes up/running 
    * Kubectl is installed: `kubectl version`
    * docker installed
        * docker desktop
        * docker hub
    * kubernetes: 
        * minikube
        * docker desktop
        * google
        * Azur
        
1. create a finalName for app <app-name>
2. Create a new version of app or change it
3. Create a build : `mvn clean install` >> Artifactory

## Image and docker part
4. Check docker images : `docker image ls`
5. Create a `Dockerfile` to generate app image : 
```
FROM openjdk:8
EXPOSE 8070
ADD target/docker-jenkins.jar docker-jenkins.jar
ENTRYPOINT ["java","-jar","/docker-jenkins.jar"]
``` 
6. Build an image from Dockerfile with version :`docker build -f Dockerfile -t <app-name>:<app-version> .`
    * check image exist : `docker image ls`
    * Check image is correct before deploy to kubernetes by build container: `docker run -p <port>:<port> <app-name>`
    * stop container :`docker container stop $(docker container ls -aq)`

## Kubernetes and deployment part
7. Check the kubernetes objects:
    * Check which is kubernetes provider : `kubectl config get-contexts`
        * Possible: minikube, google-cloud/aws/azur/docker-desktop
        * switch with : k config use-context docker-for-desktop
    * nodes will be ready : `kubectl get nodes -o wide`
    * `alias k=kubectl`
    * Pods: `k get pods` , in case of no pods:
        ```
        No resources found in default namespace.
        ```    
    * Replication: `k get rc`
    * Service: `k get svc`
    * Deploy: `k get deploy`
8. In case everything is clean , create a service `svc.yml`:
    * create file :
    
    ```
    apiVersion: v1
    kind: Service
    metadata:
      name: hello-svc
      labels:
        app: docker-jenkins
    spec:
      type: NodePort
      ports:
      - port: 8070
        nodePort: 30001
        protocol: TCP
      selector:
        app: docker-jenkins
    ``` 
    
    * Create it in k8s: `k create -f svc.yml`
9. create a deploy with the same version as image:
    * Create `deploy.yml`:
    
    ```
    apiVersion: apps/v1
    kind: Deployment
    metadata:
      name: hello-deploy
    spec:
      selector:
        matchLabels:
          app: docker-jenkins
      replicas: 2
      minReadySeconds: 10
      strategy:
        type: RollingUpdate
        rollingUpdate:
          maxUnavailable: 1
          maxSurge: 1
      template:
          metadata:
            labels:
              app: docker-jenkins
          spec:
            containers:
            - name: docker-jenkins
              image: docker-jenkins:v5
              ports:
              - containerPort: 8070
    ```    
    
    * Create deploy in kubernetes: `k create -f deploy.yml`
    * See that deploy is Available and UP/RUNNING:
    
     ```
     ➜  app-jenkins git:(master) ✗ k get deploy
     NAME           READY   UP-TO-DATE   AVAILABLE   AGE
     hello-deploy   2/2     2            2           37s
     ```
     
* Go to the: `localhost:30001/lazy`
* Hoooray
# helm
https://www.youtube.com/watch?v=3GPpm2nZb2s&ab_channel=JustmeandOpensource
## Installation
* `brew install kubernetes-helm`
* version: `helm version`
* Create `Chart.yaml`
    ```
    apiVersion: v1
    name: docker-jenkins
    version: 0.1.0
    appVersion: 1.0
    description: My custom ngnix chart
    ```
* Create `templates/deployment.yaml`
    ```
    apiVersion: apps/v1
    kind: Deployment
    metadata:
      name: hello-deploy
    spec:
      selector:
        matchLabels:
          app: docker-jenkins
      replicas: 2
      minReadySeconds: 10
      strategy:
        type: RollingUpdate
        rollingUpdate:
          maxUnavailable: 1
          maxSurge: 1
      template:
        metadata:
          labels:
            app: docker-jenkins
        spec:
          containers:
          - name: docker-jenkins
            image: docker-jenkins:v1
            ports:
            - containerPort: 8070
    ```
* Create `templates/service.yaml`
    ```
    apiVersion: v1
    kind: Service
    metadata:
      name: hello-svc
      labels:
        app: docker-jenkins
    spec:
      type: NodePort
      ports:
      - port: 8070
        nodePort: 30001
        protocol: TCP
      selector:
        app: docker-jenkins
    ```        
* `helm install <app-name or directory name> . ` in our example:
`helm install docker-jenkins .`
* `k get all`
* after change, change the version oh helm : ` helm upgrade docker-jenkins .`
* `helm list`
```
➜  my-nginx git:(master) ✗ helm list
NAME            NAMESPACE       REVISION        UPDATED                                 STATUS          CHART                   APP VERSION
docker-jenkins  default         2               2020-07-19 14:32:19.839219 +0200 CEST   deployed        docker-jenkins-0.2.0    1          
```

* you can roll back to previous version `helm rollback <app-deploy> <REVISION 1>`

* delete the chart `helm delete <app-name>`
    *  `helm delete docker-jenkins`
### Parametrized the chart
* Create `values.yaml`
    ```
    replicaCount: 1
    ```
you just controll the replica
* you can find value parametr: `helm inspect values .`
    

### Create helm 
If you need to have a whole helm chart prepared, but it is better you create your own
* `helm create myapp`
    
    