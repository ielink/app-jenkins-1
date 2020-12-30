# Overview

##  Install minikube:
Refrence : see pluralsight Getting Started with Kubernetes by Nigel!
release on [github](https://github.com/kubernetes/minikube/releases)
 1. `brew install minikube`
 2. `brew install docker-machine-driver-xhyve`
3.  `sudo chown root:wheel /usr/local/opt/docker-machine-driver-xhyve/bin/docker-machine-driver-xhyve`
4. `sudo chmod u+s /usr/local/opt/docker-machine-driver-xhyve/bin/docker-machine-driver-xhyve`
5. `minikube start` note ,  you can mentin the version as well: `kebernetes-version="v1.6.0"`
6. `k get current-context`
7. list node on cluster: `k get nodes`
8. you can stop minikube with : `minikube stop`
9. you can delete minikube : `minikube delete`
10 Go to the dashboard: `minikube dashboard`

# If already installed
* check exists
`kubectl config get-contexts`
* 

