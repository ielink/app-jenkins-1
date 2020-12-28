# Overview
* The ways you can expose on app , this is mix of exposing via service

# Node port
* Service should be: svc.yml
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
* `k create -f svc.yml `
* ` k describe svc hello-svc`
```
Name:                     hello-svc
Namespace:                default
Labels:                   app=docker-jenkins
Annotations:              <none>
Selector:                 app=docker-jenkins
Type:                     NodePort
IP:                       10.100.140.124
Port:                     <unset>  8070/TCP
TargetPort:               8070/TCP
NodePort:                 <unset>  30001/TCP
Endpoints:                10.1.0.63:8070
Session Affinity:         None
External Traffic Policy:  Cluster
Events:                   <none>

```    
* go to `http://localhost:30001/lazy`

## second way



## MetalLb
If you are using the on-prem for load balancer
### test ngnix
* run ngnix: ` k run nginx --image nginx`
* expose it:  

