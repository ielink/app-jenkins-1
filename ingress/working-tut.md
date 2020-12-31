# this 
https://www.youtube.com/watch?v=_pUXOn_VRdQ&ab_channel=AntonPutra
https://github.com/devops-by-example/tutorials/blob/master/lessons/010/REAME.md
```
 4151  minikube start --vm=true --kubernetes-version=v1.20.0 --cni=calico
 4152  k apply -f ingress.yaml
 4153  kubectl delete -A ValidatingWebhookConfiguration ingress-nginx-admission
 4154  k apply -f ingress.yaml
 4155  k get ing
 4156  brew install dnsmask
 4157* sudo brew services start dnsmasq
 4158  k get svc
 4159  minikube service hello-app-service --url
 4160  k get ing
 4161  cat << EOF > /usr/local/etc/dnsmasq.d/development.conf\naddress=/.pvt/192.168.64.4
 4162  cat << EOF > /usr/local/etc/dnsmasq.d/development.conf\naddress=/.pvt/192.168.64.2\nEOF
 4163  cat /usr/local/etc/dnsmasq.d/development.conf
 4164  sudo brew services restart dnsmasq
 4165  sudo mkdir /etc/resolver
 4166  sudo vim /etc/resolver/pvt
 4167  scutil --dns
 4168  sudo vim /etc/resolver/pvt
 4169  scutil --dns
 4170  dig hello-world.pvt @127.0.0.1

```