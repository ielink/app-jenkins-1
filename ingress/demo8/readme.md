https://www.youtube.com/watch?v=_pUXOn_VRdQ&ab_channel=AntonPutra
* minikube addons enable ingress
* Verify : `k get pods -n kube-system`
```
➜  app-jenkins git:(master) ✗ k get pods -n kube-system
NAME                                        READY   STATUS      RESTARTS   AGE
coredns-66bff467f8-9nhgd                    1/1     Running     6          200d
coredns-66bff467f8-ws7tl                    1/1     Running     6          200d
etcd-minikube                               1/1     Running     5          200d
ingress-nginx-admission-create-ch6vj        0/1     Completed   0          24h
ingress-nginx-admission-patch-wtw4f         0/1     Completed   0          24h
ingress-nginx-controller-7bb4c67d67-zhtlh   1/1     Running     24         24h
kube-apiserver-minikube                     1/1     Running     6          200d
kube-controller-manager-minikube            1/1     Running     19         200d
kube-proxy-4v5bs                            1/1     Running     5          200d
kube-scheduler-minikube                     1/1     Running     19         200d
storage-provisioner                         1/1     Running     8          200d

```