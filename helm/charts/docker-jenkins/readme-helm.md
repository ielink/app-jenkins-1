# Overview


# Installation
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
* `helm install <app-name or directory name> . `
* `k get all`
* after change, change the version oh helm : ` helm upgrade docker-jenkins .`
* `helm list`
```
➜  my-nginx git:(master) ✗ helm list
NAME            NAMESPACE       REVISION        UPDATED                                 STATUS          CHART                   APP VERSION
docker-jenkins  default         2               2020-07-19 14:32:19.839219 +0200 CEST   deployed        docker-jenkins-0.2.0    1          
```

* you can roll back to previous version `helm rollback <app-deploy> <REVISION 1>`

* delete the chart `helm delete --purge <app-name>`
## Parametrized the chart
* Create `values.yaml`
    ```
    replicaCount: 1
    ```
you just controll the replica
* you can find value parametr: `helm inspect values .`
    

## Create helm 
If you need to have a whole helm chart prepared, but it is better you create your own
* `helm create myapp`
    
