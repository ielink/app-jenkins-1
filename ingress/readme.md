# infos
see course Managing Ingress Traffic Patterns for Kubernetes Services
## Service Endpoints
Endpoint API objects hold info on each of a services pods
`k get endpoints hello-deploy`
## Service API
* By default services in k8s are disconnected from customers
### NodePort Type
Test if svc is working internally

```
 k get svc
NAME                       TYPE           CLUSTER-IP       EXTERNAL-IP   PORT(S)                      AGE
echo1                      ClusterIP      10.105.107.160   <none>        80/TCP                       28h
echo2                      ClusterIP      10.111.175.14    <none>        80/TCP                       28h
hello-deploy               NodePort       10.111.108.144   <none>        80:30339/TCP                 21h
kubernetes                 ClusterIP      10.96.0.1        <none>        443/TCP                      16d
my-release-nginx-ingress   LoadBalancer   10.107.206.93    localhost     80:31162/TCP,443:31517/TCP   21h

```           
* Run a test 
 `k run -it --rm curl --restart=Never --image=nbrown/curl -- 10.111.108.144:80/lazy`
 
* You can edit svc object by : `k edit svc hello-deploy`
* Get the yaml file : `k get svc hello-deploy -o yaml`

## Proxy-based Ingress Controller
* Nginx
* Traefik
* Contour

### Nginx Ingress controller 
#### Goal
you have a single IP address 

#### Name-based Routing
* www.hello.com
* www.bye.com
#### Path-based Routing
* www.bye.com/bye
* www.bye.com/bye22