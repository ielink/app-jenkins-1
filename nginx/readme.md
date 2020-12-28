# 
# docker desktop
* Note In local you should not have the metallb atleast
* create ngnix-deployment.yml
```
apiVersion: apps/v1
kind: Deployment
metadata:
  name: nginx-deployment
  labels:
    app: nginx
spec:
  replicas: 1
  selector:
    matchLabels:
      app: nginx
  template:
    metadata:
      labels:
        app: nginx
    spec:
      containers:
      - name: nginx
        image: nginx:latest
        ports:
        - containerPort: 80apiVersion: apps/v1
                           kind: Deployment
                           metadata:
                             name: nginx-deployment
                             labels:
                               app: nginx
                           spec:
                             replicas: 1
                             selector:
                               matchLabels:
                                 app: nginx
                             template:
                               metadata:
                                 labels:
                                   app: nginx
                               spec:
                                 containers:
                                 - name: nginx
                                   image: nginx:latest
                                   ports:
                                   - containerPort: 80
```
* d  `k create -f nginx-deployment.yml`
* `kubectl expose deployments webserver --type=LoadBalancer`
*  `k get svc`
   ```
   ➜  app-jenkins git:(master) ✗ k get svc                                                      
   NAME               TYPE           CLUSTER-IP       EXTERNAL-IP   PORT(S)          AGE
   hello-svc          NodePort       10.100.140.124   <none>        8070:30001/TCP   107m
   kubernetes         ClusterIP      10.96.0.1        <none>        443/TCP          14d
   nginx-deployment   LoadBalancer   10.108.10.128    localhost     80:31108/TCP     8s

    ```     
* Go to `localhost` , 
* Bingo with Ngnix
