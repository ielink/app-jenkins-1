# Create Minikube on PC linux 

# Create SSH tunnel from mac to PC
* `ssh hamid@<local-pc-ip>`
    * `ssh hamid@192.168.178.19`
    * local pc ip can be found with `ifconfig -a` under inet in Local PC
* Put the password 

* Install helm : 
    * ``
    * ` helm repo add stable https://charts.helm.sh/stable`
* install ingress ngnix `helm install my-nginx stable/nginx-ingress --set rbac.create=true`
```
WARNING: This chart is deprecated
NAME: my-nginx
LAST DEPLOYED: Sat Dec 19 22:10:11 2020
NAMESPACE: default
STATUS: deployed
REVISION: 1
TEST SUITE: None
NOTES:
*******************************************************************************************************
* DEPRECATED, please use https://github.com/kubernetes/ingress-nginx/tree/master/charts/ingress-nginx *
*******************************************************************************************************


The nginx-ingress controller has been installed.
It may take a few minutes for the LoadBalancer IP to be available.
You can watch the status by running 'kubectl --namespace default get services -o wide -w my-nginx-nginx-ingress-controller'

An example Ingress that makes use of the controller:

  apiVersion: extensions/v1beta1
  kind: Ingress
  metadata:
    annotations:
      kubernetes.io/ingress.class: nginx
    name: example
    namespace: foo
  spec:
    rules:
      - host: www.example.com
        http:
          paths:
            - backend:
                serviceName: exampleService
                servicePort: 80
              path: /
    # This section is only required if TLS is to be enabled for the Ingress
    tls:
        - hosts:
            - www.example.com
          secretName: example-tls

If TLS is enabled for the Ingress, a Secret containing the certificate and key must also be provided:

  apiVersion: v1
  kind: Secret
  metadata:
    name: example-tls
    namespace: foo
  data:
    tls.crt: <base64 encoded cert>
    tls.key: <base64 encoded key>
  type: kubernetes.io/tls
```   

* `sudo docker run --privileged -d --restart=unless-stopped -p 80:80 -p 443:443 -v /opt/rancher:/var/lib/rancher rancher/rancher`
* to be able to see minikube dashboard `kubectl proxy --address='0.0.0.0' --disable-filter=true`
# Swager
* `http://192.168.178.19:8090/swagger-ui.html#/geo-controller/getAllPostalCodeContainingUsingGET`
# jenkins
* `http://192.168.178.19:8080/`