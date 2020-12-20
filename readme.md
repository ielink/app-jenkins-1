# Overview
# App 
* `curl http://localhost:8070/lazy`
# Docker workflow
there are 3 components involve in docker workflow:

* client host
* server host
* registry
## Client host
Where you can Download an image
* CI/CD 
* Docker CLI

## Server host
Images are downloaded or container

## Registry
Stateless, highly skilled server side application that stored and distributed docker images
Some examples are :
* Docker  hub
* Amazon docker registry
* gitlab registry
Or it can be inside firewall like JFrog artifactory
* MyAPP
* OpenJDK
* NGINX


see [this](https://gitlab.com/hhammidd/unit-test/-/wikis/CI-CD/Jenkins2) for more info
* `mvn clean install`
* Create image : ` docker build -f Dockerfile -t docker-jenkins:<app-version> .` 
* Jenkins is in main directory directory
* `cd jenkins/workspace` is workspace 
* Take a backup from jenkins:
`tar -czf jenkins_home_end_m4.tgz .jenkins/`

* Giving ip of cluster 
Use the following command so you can see more information about the nodes.

`kubectl get nodes -o wide`


## services
* ` alias k="kubectl"`
* `kubectl delete svc hello-svc`
* `k get svc`
* `k create -f svc.yml`
* Go to `localhost:30001/lazy`

## Deployments
### Command
* remove replication controllers first: `k delete rc hello-rc`
* Check if they are terminate: `k get pods`,
```
NAME             READY   STATUS        RESTARTS   AGE
hello-rc-9kmrb   1/1     Terminating   0          2d14h
hello-rc-qqfgt   1/1     Terminating   0          2d14h

```
* `k describe svc hello-svc`
* Create `deploy.yml` file
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
  template:
      metadata:
        labels:
          app: docker-jenkins
      spec:
        containers:
        - name: docker-jenkins
          image: docker-jenkins:v3
          ports:
          - containerPort: 8070

```
* `k create -f deploy.yml`
* will show created message 
* look at the result : `k describe deploy deploy-hello`
* Show the replica set `k get rs`
* more detail : `k describe rs`


## see app logs
* `k get pods`
    *  
    
    ```
    app-jenkins git:(feature/course1) ✗ k get pods
    NAME                            READY   STATUS    RESTARTS   AGE
    hello-deploy-789fdcb656-lqvxw   1/1     Running   0          13m

    ```
    
* ` k logs hello-deploy-789fdcb656-lqvxw`
#### Update deployment:
After change on the code
1. `mvn clean install`
2. `docker build -f Dockerfile -t docker-jenkins:<appNewVersion> .`
    2. run the docker image: see [this page](Docker/Overview)
3. change the app version in `deploy.yml`
```
...
 containers:
        - name: docker-jenkins
          image: docker-jenkins:<newAppVesrion>
          ...
```
4. `k apply -f deploy.yml --record`
5. ` k rollout history deployment hello-deploy `
6. `k describe deploy hello-deploy`
7. see: `localhost:30001/lazy` new version is deployed

8. roll back : `k rollout undo deployment hello-deploy --to-revision=1`
9. `k get deploy`
10. check the node: `kubectl get nodes -o wide`
11. check logs of pods: `k logs <pod-name>`

# Jenkins config
## Connecting to Github

## Scripted Pipeline Syntax
* Create a `Jenkinsfile` and put below code 
```
pipeline {
    agent any
    stages {
        stage('Hello World') {
            steps {
                echo 'Hello World'
            }
        }
    }
}
```

### Run the script Jenkinsfile

# prometheus
* ` docker run -p 9090:9090 -v prometheus.yml prom/prometheus`

# Docker
## Volume
`docker run -p 3000:8070 -v $(pwd):/var/www -w "/var/www/" app-jenkins` run n port
