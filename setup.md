# setup helm chart
# setup jenkins vars
# Setup github
# setup artifact
# setup docker registry
# setup kubernetes
* ` kubectl cluster-info
* Chech namespaces: `kubectl get namespaces`
* ` alias k="kubectl"`
* list node on cluster: `k get nodes`
* Giving ip of cluster 
Use the following command so you can see more information about the nodes.
`kubectl get nodes -o wide`
* Check which is kubernetes provider : `kubectl config get-contexts`
    * switch with : `k config use-context docker-for-desktop`
## Kubernetes and deployment part

# setup rancher
see [video](https://www.youtube.com/watch?v=WRlrA5j1g0Y)
and this [video](https://www.youtube.com/watch?v=jF5L6IgZ5To)

* run the container:
    * without volume:`docker run -d --privileged --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:latest`
    * with volume: `docker run -d --privileged --restart=unless-stopped -p 80:80 -p 443:443 -v /usr/local/opt/rancher:/var/lib/rancher  rancher/rancher:latest`
* Go to the browser/localhost
* Choose URL as : 
* see the logs: 
* Add : `curl --insecure -sfL https://192.168.178.12/v3/import/hbp4mrvqc4z5jw9hh788n996w6hkn58phn27dpl7p76xtxxl6d89fr.yaml | kubectl apply -f -`

* Then check :
    ```
    ➜  ~ kubectl get namespaces
    NAME              STATUS   AGE
    cattle-system     Active   3m6s
    default           Active   13h
    docker            Active   13h
    kube-node-lease   Active   13h
    kube-public       Active   13h
    kube-system       Active   13h
    ```
    
    