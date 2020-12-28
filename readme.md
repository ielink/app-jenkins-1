# Overview
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
* if you have `svc.yaml` like belo go to : `http://20.73.200.130:8070/lazy`
```
apiVersion: v1
kind: Service
metadata:
  name: hello-svc
  labels:
    app: docker-jenkins
spec:
  type: LoadBalancer
  ports:
  - name: http
    port: 8070
    protocol: TCP
    targetPort: 8070
  selector:
    app: docker-jenkins
```
* what you see on `k get svc`:
```
NAME         TYPE           CLUSTER-IP   EXTERNAL-IP     PORT(S)          AGE
hello-svc    LoadBalancer   10.0.66.76   20.73.200.130   8070:30702/TCP   6s
kubernetes   ClusterIP      10.0.0.1     <none>          443/TCP          43h

```

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

## namespace

* `kubectl get namespaces`
### What is inside namespace
* `k get all -n metallb-system`

# ingress
* `k get secrets`
* `k delete secret my-release-ingress-nginx-admission`
* ` k delete serviceaccounts my-ngnix-nginx-ingress`
* ` kubectl -n ingress-nginx get pod -o wide`
* ` kubectl -n ingress-nginx get svc`
* `kubectl get ingress -o wide`
* `kubectl get serviceaccounts `
* `kubectl get serviceaccounts/my-ngnix-nginx-ingress -o yaml   `
* run nginx` kubectl run nginx --image=nginx --restart=Never `
* `kubectl -n ingress-nginx get svc`
* `curl -D- http://92.168.65.200 -H 'Host: hello-world.info'`
*`kubectl -n ingress-nginx get pod -o wide`
* ` kubectl get pods -n ingress-nginx  `
* `k create -f ingress-resource-1.yaml`
* ` alias k="kubectl"`
* `k describe ing ingress-resource-1` 
* delete :  k delete -f ingress-resource-1.yaml
* if you have problrm : `kubectl delete -A ValidatingWebhookConfiguration ingress-nginx-admission`
* add host: `sudo vi /etc/hosts`
*        


# Configmap
* `kubectl describe configmap <configName> -n <namespace>`
    * `kubectl describe configmap config -n metallb-system`
    
    
# Remove
* helm list : ` helm delete <my-release>`
* Remove deploy
* remove ns
* remove secret
* remove pods

