```
1578  ./artifactory.sh
 1579  rm -rf /opt/jfrog/artifactory/tomcat/webapps/access && systemctl restart artifactory.service
 1580  cd ..
 1581  rm -rf /opt/jfrog/artifactory/tomcat/webapps/access && systemctl restart artifactory.service
 1582  cd ..
 1583  cd app
 1584  ls
 1585  cd artifactory
 1586  ls
 1587  cd tomcat
 1588  cd webapps
 1589  cd access
 1590  rm -rf /opt/jfrog/artifactory/tomcat/webapps/access && systemctl restart artifactory.service
 1591  service artifactory start
 1592  cd ..
 1593  cd bin
 1594  service artifactory start
 1595  ps -ef | grep jenkins
 1596  sudo su jenkins
 1597  Shimash20023
 1598  sudo su jenkins
 1599  sudo service artifactory start
 1600  $ARTIFACTORY_HOME/bin/installService.sh
 1601  installService.sh
 1602  ./installService.sh
 1603  ./artifactory.sh
 1604  ng serve
 1605  cd Documents
 1606  cd gitProjects
 1607  cd v0
 1608  cd kubernetes
 1609  ls
 1610  cd src
 1611  cd main
 1612  ls
 1613  cd java
 1614  ls
 1615  cd com
 1616  ls
 1617  cd ..
 1618  la
 1619  cd ..
 1620  ls
 1621  clear
 1622  mvn spring-boot:run
 1623  curl http://localhost:8091/hello
 1624  mvn -Dmaven.repo.local=./repository clean package
 1625  tar cf repository.tar.gz ./repository
 1626  ls
 1627  docker image build -t app/gitlab-docke .
 1628  docker  image ls
 1629  docker container run -p 8092:8092 app/gitlab-docker
 1630  docker container run -p 8092:8092 app/gitlab-docke
 1631  docker  image ls
 1632  docker container run -p 8080:8080 app/gitlab-docke 
 1633  docker image build -t app/gitlab-docker .
 1634  docker container run -p 8080:8080 app/gitlab-docker 
 1635  docker  image ls
 1636  docker rm gitlab-docker-1
 1637  docker image rm gitlab-docker-1
 1638  docker rm $(docker ps -a -f status=exited -q)
 1639  docker image rm hamidapp/docker-jenkins
 1640  docker image rm docker-jenkins 
 1641  docker image rm gcr.io/ielink-stg/gitlab-docker-1
 1642  docker image rm app/gitlab-docke 
 1643  docker image rm app/gitlab-docker
 1644  docker image ls
 1645  cf2171210ce8
 1646  docker image rm cf2171210ce8
 1647  docker image rm b2ee5f325cd0
 1648  docker image rm 3410aa8aa221
 1649  docker rm $(docker ps -a -f status=exited -q)
 1650  mvn clean install
 1651  docker build -f Dockerfile -t gitlab-docker .
 1652  docker run -p 8092:8092 gitlab-docker
 1653  docker container ls
 1654  docker rm $(docker ps -a -f status=exited -q)
 1655  docker container ls
 1656  docker images ls
 1657  docker image ls
 1658  docker image rm gitlab-docker 
 1659  docker image ls
 1660  mvn clean install
 1661  docker build -f Dockerfile -t gitlab-docker .
 1662  docker run -p 8092:8092 gitlab-docker
 1663  docker container ls
 1664  container stop 68c2862c217e
 1665  docker container ls -a
 1666  docker rm $(docker ps -a -f status=exited -q)
 1667  docker image ls
 1668  clear
 1669  alias k=kubectl
 1670  k config get-contexts
 1671  k config use-context docker-for-desktop
 1672  k config get-contexts
 1673  k get svc,deployment,pods
 1674  helm ls
 1675  helm -v
 1676  helm -version
 1677  helm --version
 1678  helm --v
 1679  k config use-context docker-desktop
 1680  k get svc,deployment,pods
 1681  k config use-context minikube
 1682  k get svc,deployment,pods
 1683  k config use-context docker-for-desktop
 1684  helm version
 1685  cd Documents
 1686  ls
 1687  cd CI-CD
 1688  ls
 1689  java -jar jenkins.war
 1690  cd ..
 1691  la
 1692  cd DevOps
 1693  ls
 1694  cd artifactory-oss-7.6.2
 1695  LS
 1696  CD app
 1697  ls
 1698  cd app
 1699  LS
 1700  cd bin
 1701  ls
 1702  ./artifactory.sh
 1703  cd Documents
 1704  cd CI-CD
 1705  java -jar jenkins.war
 1706  sudo docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher
 1707  docker image ls
 1708  docker image rm 1cee13462578
 1709  kubectl cluster-info
 1710  kubectl get nodes
 1711  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:lates
 1712  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:latest
 1713  docker container rm $(docker container ls –aq)
 1714  docker container stop $(docker container ls –aq)
 1715  docker container ls -a
 1716  ip a s | less
 1717  ip a s
 1718  ip a 
 1719  kubectl apply -f https://192.168.178.12/v3/import/4kwnprs5kqkfnkftjpmnvjnm4xvfnj2h5mdk8652kbcfs2pwwvsl4d.yaml\n
 1720  to connect to the server: x509: certificate is valid for 127.0.0.1, 172.17.0.3, not 192.168.178.12\n➜  ~
 1721  to connect to the server: x509: certificate is valid for 127.0.0.1, 172.17.0.3, not 192.168.178.12\ncurl --insecure -sfL https://192.168.178.12/v3/import/4kwnprs5kqkfnkftjpmnvjnm4xvfnj2h5mdk8652kbcfs2pwwvsl4d.yaml | kubectl apply -f 
 1722  curl --insecure -sfL https://192.168.178.12/v3/import/4kwnprs5kqkfnkftjpmnvjnm4xvfnj2h5mdk8652kbcfs2pwwvsl4d.yaml | kubectl apply -f 
 1723  curl --insecure -sfL https://192.168.178.12/v3/import/4kwnprs5kqkfnkftjpmnvjnm4xvfnj2h5mdk8652kbcfs2pwwvsl4d.yaml | less
 1724  curl --insecure -sfL https://192.168.178.12/v3/import/4kwnprs5kqkfnkftjpmnvjnm4xvfnj2h5mdk8652kbcfs2pwwvsl4d.yaml | kubectl apply -f -
 1725  kubectl -n cattle-system get all
 1726  java -jar jenkins.war
 1727  docker images
 1728  kubectl get-configs
 1729  docker version
 1730  kubectl version
 1731  clear
 1732  pwd
 1733  ls
 1734  docker-compose --version
 1735  ls
 1736  docker-compose -f docker-compose.yml up
 1737  docker-compose -f docker-compose.yml down
 1738  docker-compose -f docker-compose.yml up
 1739  docker image ls
 1740  docker ps
 1741  docker-compose down
 1742  docker-compose -f docker-compose.yml up -d
 1743  docker -exec -it kafka /bin/sh
 1744  docker exec -it kafka /bin/sh
 1745  docker images
 1746  kubectl run 
 1747  kubectl run gitlab-docker --image=gitlab-docker:1.0 --port=8080 --image-pull-policy=Never
 1748  kubectl get deployments
 1749  kubectl expose deployment gitlab-docker --type=NodePort
 1750  kubectl get deployments
 1751  kubectl get services
 1752  kubectl get pods
 1753  kubectl get deployments
 1754  kubectl get pods
 1755  kubectl get pods -o wide
 1756  cd /Users/hamid/Documents/kafka-mysql/confluent-5.5.1 
 1757  ls
 1758  cd bin
 1759  ./confluent local start
 1760  curl -X POST -H "Content-Type: application/json" --data '{  \n    "name": "jdbc-source-connector",  \n    "config": {    \n        "connector.class": "io.confluent.connect.jdbc.JdbcSourceConnector",    \n        "tasks.max": 2,    \n        "connection.url": "jdbc:mysql://localhost:3306/scheduling-hazel?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",\n        "connection.user": "root",    \n        "connection.password": "password",    \n        "mode": "incrementing",\n        "table.whitelist": "test1",\n        "incrementing.column.name": "id",\n        "topic.prefix": "",\n        "timestamp.column.name": "modified",\n        "poll.interval.ms": 1000\n    }\n}' http://localhost:8083/connectors
 1761  curl -s -X GET http://localhost:8083/connectors/jdbc-source-connector/status
 1762  cd ..
 1763  bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning
 1764  cd bin
 1765  ls
 1766  cd ..
 1767  bin/kafka-console-producer.sh --broker-list localhost:9092  --topic Kafka_Example
 1768  ./confluent local start
 1769  cd bin
 1770  ./confluent local start
 1771  ./confluent local stop
 1772  ./confluent local start
 1773  ./confluent local stop
 1774  ./confluent local start
 1775  ./confluent local stop
 1776  ./confluent local start
 1777  telnet localhost 2181
 1778  ls
 1779  ./kafka-topics
 1780  ./kafka-topics --LIST
 1781  ./kafka-topics --list --zookeeper
 1782  ./confluent local stop
 1783  cd ..
 1784  ls
 1785  cd kafka_2.13-2.5.0
 1786  cd bin
 1787  ls
 1788  cd ..
 1789  ls
 1790  cd confluent-5.5.1
 1791  ./confluent local stop
 1792  cd bin
 1793  ./confluent local start
 1794  ./confluent local stop
 1795  history
 1796  java -jar jenkins.war
 1797  docker image ls
 1798  docker build -f Dockerfile -t docker-jenkins:v5 .
 1799  docker image ls
 1800  history
 1801  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:latest
 1802  alias k="kubectl"
 1803  k describe
 1804  k get pods
 1805  kubectl delete pod gitlab-docker-98dc997bd-g5p7d
 1806  k get pods
 1807  kubectl delete pod gitlab-docker-98dc997bd-pg9zn
 1808  k get pods
 1809  alias k="kubectl"
 1810  k get pods
 1811  docker images
 1812  docker image rm docker-jenkins 
 1813  docker image rm docker-jenkins:v4 
 1814  docker image rm 7b6b38a5a282
 1815  docker container rm 7e2fbc311078
 1816  docker container rm 7e2fbc311078edbb88333fed2b639ff0308618e3181cc3107b5fe932ac657ed8
 1817  ls
 1818  alias k="kubectl"
 1819  k apply -f deploy.yml --record
 1820  k rollout history deployment hello-deploy
 1821  alias kdd="k describe deploy"
 1822  kdd hello deploy
 1823  kdd hello-deploy
 1824  k get pods
 1825  kubectl config get-contexts
 1826  kubectl get nodes -o wide
 1827  k get pods
 1828  kubectl get nodes -o wide
 1829  k get svc
 1830  k get rc
 1831  k get rs
 1832  k get pods
 1833  alias kd="hubectl describe"
 1834  kd pods
 1835  alias kd="kubectl describe"
 1836  kd pods
 1837  kubectl create -f pod.yml
 1838  kubectl get pods
 1839  k get pods --all-namespaces
 1840  k get rc
 1841  k describe svc
 1842  k get service
 1843  k k delete svc gitlab-docker
 1844  k delete svc gitlab-docker
 1845  k get svc
 1846  k delete svc hello-svc
 1847  k get svc
 1848  k get pods
 1849  k delete pod hello-pod
 1850  k get pods
 1851  k delete pods gitlab-docker-98dc997bd-nrzlb 
 1852  k get pods
 1853  k delete pods gitlab-docker
 1854  k delete pods gitlab-docker-98dc997bd-lbztc
 1855  k get pods
 1856  k delete pod gitlab-docker-98dc997bd-2m6f6
 1857  k get pods
 1858  docker images
 1859  k describe svc hello-svc
 1860  k create -f deploy.yml
 1861  k get deploy
 1862  k delete deploy r   0/1     1            0           2d11h
 1863  k delete deploy gitlab-docker
 1864  k get svc
 1865  k get pods
 1866  k get rc
 1867  k delete deploy hello-deploy
 1868  k get deploy
 1869  k create -f deploy.yml
 1870  k get deploy
 1871  k describe pods | grep app
 1872  kubectl get nodes -o wide
 1873  k get svc
 1874  k describe svc
 1875  k create -f svc.yml
 1876  k describe svc
 1877  k get deploy
 1878  k delete deploy hello-deploy
 1879  k create -f deploy.yml
 1880  k get deploy
 1881  docker run -p 8070:8070 docker-jenkins
 1882  docker run -p 8070:8070 docker-jenkins:v5
 1883  mvn clean install
 1884  docker images
 1885  docker image rm docker-jenkins:v5
 1886  docker container rm e89c29fc4feb
 1887  docker container stop $(docker container ls -aq)
 1888  docker container rm $(docker container ls -aq)
 1889  docker container stop a693bbe98cf41efb6c721d1a0cab389c9e7d77597272dc0e8cbe5fa8067d1e2e.
 1890  docker container stop a693bbe98cf41efb6c721d1a0cab389c9e7d77597272dc0e8cbe5fa8067d1e2e
 1891  docker container stop 67b90d13604914cc6c675a17c69337cc1f3573df8c84a1349d2c38bf652ab88e
 1892  docker container rm $(docker container ls -aq)
 1893  docker container stop 
 1894  docker container stop  aa76ac8f8fc54329ffc8a3613d078e57a65eda12b29ea6ff77074b5faa9cedc9
 1895  docker container rm $(docker container ls -aq)
 1896  docker container rm aa76ac8f8fc54329ffc8a3613d078e57a65eda12b29ea6ff77074b5faa9cedc9
 1897  docker container ls
 1898  k get deploy
 1899  k delete deploy hello-deploy
 1900  docker container rm $(docker container ls -aq)
 1901  docker container ls
 1902  docker images ls
 1903  docker image ls
 1904  docker image rm 02bd67e0aaf4
 1905  docker image rm 651b08891705
 1906  docker image ls
 1907  docker image rm docker-jenkins:v5 docker-jenkins:v3
 1908  docker image ls
 1909  docker image rm b190ad78b520
 1910  docker image rm hhssaaffii/docker-jenkins 
 1911  docker image ls
 1912  docker build -f Dockerfile -t docker-jenkins:v1 .
 1913  docker image ls
 1914  docker run -p 8070:8070 docker-jenkins:v1
 1915  docker container stop $(docker container ls -aq)
 1916  k get nodes
 1917  kubectl config get-context
 1918  kubectl config get-contexts
 1919  k get nodes -o wide
 1920  k get pods
 1921  k get rc
 1922  k get svc
 1923  k get deploy
 1924  k create -f deploy.yml 
 1925  k get deploy
 1926  history
 1927  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:latest
 1928  history
 1929  java -jar jenkins.war
 1930  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:latest
 1931  docker image ls
 1932  docker container ps
 1933  docker container stop $(docker container ls -aq)
 1934  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:latest
 1935  docker container stop $(docker container ls -aq)
 1936  docker container rm $(docker container ls -aq)
 1937  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 -v /opt/rancher:/var/lib/rancher rancher/rancher:latest
 1938  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:latest
 1939  clear
 1940  docker ps
 1941  docker logs -f confident_euler
 1942  docker get svc
 1943  k get svc
 1944  alias k="kubectl"
 1945  k get svc
 1946  k get deploy
 1947  ip a ls
 1948  ip a s
 1949  ip a s | less
 1950  ip a
 1951  ip a s
 1952  kubectl apply -f https://192.168.178.12/v3/import/qgw85d7kclqw554flv9kj7hw7tx4hc6s9skchmmzghh8k4sz96zpml.yaml
 1953  curl --insecure -sfL https://192.168.178.12/v3/import/qgw85d7kclqw554flv9kj7hw7tx4hc6s9skchmmzghh8k4sz96zpml.yaml | kubectl apply -f -
 1954  watch kubectl get namespaces
 1955  kubectl get namespaces
 1956  kubectl -n cattle-system get all
 1957  kubectl get nodes -o wide
 1958  helm version
 1959  clear
 1960  k get deployments --all-namespace
 1961  k get deployments --all-namespaces
 1962  helm ls
 1963  brew install kubernetes-helm
 1964  brew upgrade kubernetes-helm
 1965  helm version
 1966  k config get-contexts
 1967  kubectl config get-contexts
 1968  alias k="kubectl"
 1969  alias kg="kubectl get"
 1970  helm init
 1971  helm version
 1972  k config get-contexts
 1973  k config use-context docker-for-desktop
 1974  helm init
 1975  k config use-context docker-desktop
 1976  helm list --namespace
 1977  helm list --all-namespaces
 1978  helm list
 1979  helm3 list
 1980  which helm
 1981  helm list
 1982  helm plugin list
 1983  helm3 list
 1984  helm pllugin list
 1985  helm plugin list
 1986  helm version
 1987  helm version --short
 1988  cd helm
 1989  cd charts
 1990  cd my-nginx
 1991  tree
 1992  helm install -name my-ngnix .
 1993  k get deployment
 1994  k delete -f hello-deploy
 1995  k delete -f hello-deploy 
 1996  k delete hello-deploy 
 1997  k delete deploy hello-deploy 
 1998  helm install -name my-ngnix .
 1999  helm install -name docker-jenkins .
 2000  helm install --name docker-jenkins .
 2001  helm install -name docker-jenkins .
 2002  k get deploy
 2003  helm3 install -name docker-jenkins .
 2004  helm -help
 2005  helm --help
 2006  helm install --name docker-jenkins .
 2007  helm install .
 2008  helm install --name docker-jenkins .
 2009  helm install docker-jenkins .
 2010  helm install my-nginx .
 2011  k get all
 2012  helm list
 2013  heml inspect values .
 2014  helm inspect values .
 2015  helm install docker-jenkins .
 2016  k get svc
 2017  k delete svc hello-svc
 2018  k get svc
 2019  helm install docker-jenkins .
 2020  helm list
 2021  k get all
 2022  helm list
 2023  helm upgared docker-jenkins .
 2024  helm upgrad docker-jenkins .
 2025  helm upgrade docker-jenkins .
 2026  helm list
 2027  helm delete --purge docker-jenkins
 2028  helm delete  docker-jenkins
 2029  helm list
 2030  cd ..
 2031  helm create myapp
 2032  helm list
 2033  k list
 2034  k get list
 2035  k get pods
 2036  k get svc
 2037  k create -f svc.yml
 2038  cd ..
 2039  k create -f svc.yml
 2040  k create -f deploy.yml
 2041  k get deploy
 2042  docker images
 2043  docker run -p 8070:8070 docker-jenkins:v1
 2044  k get pods
 2045  k get rc
 2046  k get svc
 2047  k delete svc hello-svc
 2048  k get deploy
 2049  k delete deploy hello deploy
 2050  k delete deploy hello-deploy
 2051  k get deploy
 2052  k create -f deploy.yml
 2053  k create -f svc.yml
 2054  k get deploy
 2055  k get svc
 2056  kubectl get nodes -o wide
 2057  K GET ALL
 2058  k get all
 2059  k describe svc hello-svc
 2060  k get ep
 2061  K GET ALL
 2062  k get all
 2063  k delete deploy hello-deploy 
 2064  k delete svc  hello-svc 
 2065  k create -f svc.yml
 2066  k create -f deploy.yml
 2067  k get deploy
 2068  k get svc
 2069  k get deploy
 2070  k get deployment
 2071  k get pods
 2072  k delete deploy hello-deploy 
 2073  k create -f deploy.yml
 2074  k get deployment
 2075  k get pods
 2076  k delete pods hello-deploy-6cbd875b8f-6p9qr
 2077  k get pods
 2078  k get deployment
 2079  k get pods
 2080  k logs hello-deploy-6cbd875b8f-kxdn4 
 2081  helm list
 2082  k delete svc, deploy
 2083  k get pods
 2084  k get deployment
 2085  k delete deply hello-deploy
 2086  k delete deploy hello-deploy 
 2087  k delete svc hello-svc
 2088  ls
 2089  cd helm
 2090  ls
 2091  cd charts
 2092  ls
 2093  cd docker-jenkins
 2094  ls
 2095  helm install docker-jenkins .
 2096  k get all
 2097  k logs pod/hello-deploy-6cbd875b8f-xlwt6 
 2098  cd /Users/hamid/Documents/DevOps/kubernetes/istio-1.6.5 
 2099  ls bin
 2100  istioctl help
 2101  open ~/.bash_profile
 2102  export PATH=$PATH:$HOME/.istioctl/bin
 2103  istioctl help
 2104  export PATH=$PATH:$HOME/.istioctl/bin
 2105  istioctl help
 2106  open ~/.bash_profile
 2107  pwd
 2108  source ~/.bash_profile
 2109  istioctl version
 2110  open ~/.bash_profile
 2111  source ~/.bash_profile .
 2112  source ~/.bash_profile 
 2113  istioctl version
 2114  open ~/.bash_profile
 2115  source ~/.bash_profile 
 2116  source ~/.bash_profile .
 2117  istioctl version
 2118  source ~/.bash_profile 
 2119  istioctl version
 2120  k delete svc hello-svc
 2121  k delete deploy hello-deploy
 2122  java -jar jenkins.war
 2123  .kube/config
 2124  vi .kube/config
 2125  k config view
 2126  helm search jenkins
 2127  k config view
 2128  alias k="kubectl"
 2129  k config view
 2130  k config view current
 2131  kubectl config view --minify
 2132  watch k get pods
 2133  k get pods
 2134  java -jar jenkins.war
 2135  k get pods
 2136  java -jar jenkins.war
 2137  k get pods
 2138  mvn archetype:generate
 2139  cd ..
 2140  ls
 2141  mkdir gatling-test1
 2142  cd gatling-test1
 2143  mvn archetype:generate
 2144  ls
 2145  cd gatling-test1
 2146  ls
 2147  mvn clean gatling:execute
 2148  mvn clean gatling:execute -X
 2149  mvn test
 2150  mvn clean gatling:execute -X
 2151  mvn gatling:test
 2152  clear
 2153  cd /Users/hamid/Documents/DevOps/gatling-charts-highcharts-bundle-3.3.1 
 2154  cd bin
 2155  ls
 2156  ./gatling.sh
 2157  ls
 2158  ./recorder.sh
 2159  cd /Users/hamid/Documents/DevOps/gatling-charts-highcharts-bundle-3.3.1 
 2160  ls
 2161  cd results
 2162  ls
 2163  cd basicsimulation-20200722155202596
 2164  ls
 2165  indent.html
 2166  index.html
 2167  ./index.html
 2168  ls
 2169  ./recorder.sh
 2170  pwd
 2171  ls
 2172  mvn gatling:test -Dgatling.simulationClass=simulations.RuntimeParametrs
 2173  mvn gatling:test -Dgatling.simulationClass=simulations.RuntimeParameters
 2174  ./start-zookeeper.sh
 2175  cd /Users/hamid/Documents/kafka-mysql/kafka_2.13-2.5.0/bin 
 2176  chmod +x zookeeper-server-start.sh\n
 2177  ./start-zookeeper.sh
 2178  ls -lr
 2179  chmod +rx zookeeper-server-start.sh
 2180  ./start-zookeeper.sh
 2181  ls -lr
 2182  chmod u+r+x zookeeper-server-start.sh
 2183  ./start-zookeeper.sh
 2184  ./zookeeper-server-start.sh
 2185  ./zookeeper-server-start.sh config/zookeeper.properties
 2186  .zookeeper-server-start.sh config/zookeeper.properties
 2187  zookeeper-server-start.sh config/zookeeper.properties
 2188  cd ..
 2189  bin/zookeeper-server-start.sh config/zookeeper.properties
 2190  cd..
 2191  cd ..
 2192  /Users/hamid/Documents/kafka-mysql/kafka_2.13-2.5.0/bin/zookeeper-server-start.sh config/zookeeper.properties\n
 2193  ./start-zookeeper.sh
 2194  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:latest
 2195  docker ps
 2196  docker logs recursing_haslett
 2197  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:latest
 2198  docker rm $(docker ps -a -q)
 2199  docker stop 9caa7125b84006743cd7f4bba031e61a26a6ad996252138a05aa0995ce97953c.
 2200  docker  ps
 2201  docker container rm recursing_haslett
 2202  docker rm 9caa7125b84006743cd7f4bba031e61a26a6ad996252138a05aa0995ce97953c.
 2203  docker ps -a
 2204  docker get pods
 2205  kubectl get pods
 2206  kubectl get svc
 2207  kubectl get 
 2208  kubectl get deplpoy
 2209  kubectl get deploy
 2210  docker kill $(docker ps -q)
 2211  docker ps -a
 2212  docker  rm container recursing_haslett
 2213  docker image ls
 2214  docker ps -a
 2215  docker ps 
 2216  docker container ls
 2217  docker container ps
 2218  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:latest
 2219  docker ps
 2220  docker log vigorous_kirch
 2221  docker logs vigorous_kirch
 2222  ipconfig
 2223  kubectl apply -f https://192.168.178.12/v3/import/hbp4mrvqc4z5jw9hh788n996w6hkn58phn27dpl7p76xtxxl6d89fr.yaml
 2224  curl --insecure -sfL https://192.168.178.12/v3/import/hbp4mrvqc4z5jw9hh788n996w6hkn58phn27dpl7p76xtxxl6d89fr.yaml | kubectl apply -f -
 2225  watch kubectl get namespaces
 2226  kubectl get namespaces
 2227  kubectl get nodes
 2228  clear
 2229  echo -n 'kubeadminC' | base64
 2230  echo -n 'kubeadmin' | base64
 2231  echo -n 'mypassword' | base64
 2232  k get secrets
 2233  alias k="kubectl"s
 2234  alias k="kubectl"
 2235  k get secrets
 2236  ls
 2237  k create -f 5-secrets.yaml
 2238  alias k="kubectl"
 2239  k create -f secrets.yaml
 2240  k get secrets
 2241  k create -f pod-secret-env.yaml
 2242  k get pods
 2243  k exec -it busybox -- sh
 2244  k get secrets
 2245  pwd
 2246  cd Documents
 2247  ls
 2248  cd kafka-mysql
 2249  ls
 2250  cd kafka_2.13-2.5.0
 2251  bin/zookeeper-server-start.sh config/zookeeper.properties
 2252  cd Documents
 2253  cd kafka-mysql
 2254  cd kafka_2.13-2.5.0
 2255  bin/zookeeper-server-start.sh config/zookeeper.properties
 2256  bin/kafka-server-start.sh config/server.properties
 2257  cd Documents
 2258  cd kafka-mysql
 2259  cd kafka_2.13-2.5.0
 2260  ls
 2261  cd config
 2262  ls
 2263  vi zookeeper.properties
 2264  cd ..
 2265  cd bin
 2266  ls
 2267  docker images
 2268  kubectl get-contexts
 2269  kubectl --help
 2270  kubectl get -h
 2271  curl -L0 https://strimzi.io/install/latest
 2272  curl -L0 https://strimzi.io/install/latest | sed 's/namespace: .*/namespace: default/' | kubectl apply -f - 
 2273  k get pods
 2274  alias k="kubectl"
 2275  k get pods
 2276  k logs strimzi-cluster-operator-9968fd8c9-m4hcj
 2277  k get pods
 2278  k get svc
 2279  k get deploy
 2280  alias k="kubectl"
 2281  k get pods
 2282  k get deploy
 2283  curl -L0 https://strimzi.io/examples/latest/kafka/kafka-persistent.yaml | vim -
 2284  curl -L0 https://strimzi.io/examples/latest/kafka/kafka-persistent.yaml | kubectl apply -f -
 2285  k get pods
 2286  k get kafka -o yaml
 2287  curl -L0 https://strimzi.io/examples/latest/topic/kafka-topic.yaml | vim -
 2288  k get pods
 2289  k get deploy
 2290  k get pods
 2291  alias k="kubectl"
 2292  k get pods
 2293  k get secret my-cluster-cluster-ca-cert -o yaml
 2294  k get secret my-cluster-cluster-ca-cert -o jsonpath='{.data.ca\.p12}' | base64 -d > ca.p12
 2295  k get secret my-cluster-cluster-ca-cert -o jsonpath='{.data.ca\.p12}' | base64 -D > ca.p12
 2296  k get secret my-cluster-cluster-ca-cert -o jsonpath='{.data.ca\.password}'
 2297  k get secret my-cluster-cluster-ca-cert -o jsonpath='{.data.ca\.password}' | base64 -D
 2298  jconsole
 2299  docker image ls
 2300  alias k=kubectl
 2301  docker version
 2302  docker ps
 2303  docker image ls
 2304  helm version
 2305  k get pods
 2306  alias k="kubectl"
 2307  k get pods
 2308  kubectl get pods
 2309  kubectl get pod
 2310  kubectl get pods
 2311  alias k="kubectl"
 2312  k config get-contexts
 2313  kubectl get nodes -o wide
 2314  helm version
 2315  helm install stable/prometheus --name prom-demo -f values.yaml
 2316  helm install stable/prometheus --generate-name prom-demo -f values.yaml
 2317  helm install stable/prometheus prom-demo -f values.yaml
 2318  helm install stable/prometheus-operator --generate-name
 2319  helm install stable/prometheus --generate-name
 2320  helm install prometheus stable/prometheus-operator
 2321  helm version
 2322  helm repo update
 2323  helm repo add charts https://kubernetes-charts.storage.googleapis.com/
 2324  helm repo update
 2325  helm install prometheus stable/prometheus-operator
 2326  helm install stable/prometheus --generate-name
 2327  helm install stable/prometheus prom-demo -f values.yaml
 2328  helm repo list
 2329  helm install stable/prometheus-operator
 2330  helm install --name my-release stable/prometheus-operato
 2331  helm install -n my-release stable/prometheus-operato
 2332  helm install stable/prometheus --generate-name
 2333  helm repo update
 2334  helm install stable/prometheus --generate-name
 2335  helm repo add --help
 2336  helm init
 2337  brew install kubernetes-helm
 2338  helm init
 2339  helm init --client-only
 2340  which helm
 2341  helm init --service-account tiller
 2342  helm install --name my-release stable/prometheus
 2343  helm install stable/prometheus
 2344  helm install stable/prometheus --generate-name
 2345  helm install prometheus-demo stable/prometheus
 2346  helm repo update
 2347  helm install prometheus-demo stable/prometheus
 2348  helm search repo myrepo/prometheus
 2349  helm search repo stable/prometheus
 2350  helm upgrade --install --namespace logmon --values ~/.kubernetes-yaml/logmon/prometheus-helm-values.yaml --version "v2.2.1" "prometheus" stable/prometheus
 2351  helm search prometheus
 2352  helm upgrade
 2353  helm install --devel stable/prometheus
 2354  helm install --devel  stable/prometheus --generate-name
 2355  helm repo list
 2356  helm repo update
 2357  helm install mymssql stable/mssql-linux --set acceptEula.value=Y --set edition.value=Developer
 2358  k config use-context docker-for-desktop
 2359  helm search repo myrepo/prometheus
 2360  helm search prometheus
 2361  helm install prometheus-demo stable/prometheus
 2362  helm install
 2363  helm repo list
 2364  git clone https://github.com/helm/charts/
 2365  cd helm/charts/stable
 2366  helm install prometheus-demo stable/prometheus
 2367  helm repo add incubator http://storage.googleapis.com/kubernetes-charts-incubator
 2368  helm install prometheus-demo stable/prometheus
 2369  helm install prometheus-demo prometheus
 2370  helm install  https://kubernetes-charts.storage.googleapis.com/  stable/prometheus
 2371  helm install stable  stable/prometheus
 2372  helm install stable/prometheus --name prom-demo -f values.yaml
 2373  helm install stable/prometheus prom-demo -f values.yaml
 2374  helm install stable/prometheus -n  prom-demo -f values.yaml
 2375  helm install stable/prometheus -n  prom-demo -f values.yaml --generate-name
 2376  k get nods
 2377  k get nodes
 2378  k version --short
 2379  k get storageclass
 2380  k -n kube-system create serviceaccount tiller
 2381  k create clusterrolebinding tiller --clusterrole cluster-admin --serviceaccount=kube-sytem:tinfs-provisioner
 2382  k -n kube-system get pods
 2383  helm init --service-account tiller
 2384  k get ns
 2385  helm search prometheus
 2386  helm search stable/prometheus
 2387  helm search grafa
 2388  helm search grafana 
 2389  helm search grafana --help
 2390  helm3 search grafana
 2391  helm3 search repo
 2392  helm search repo
 2393  helm inspect values charts/prometheus > /tmp/prometheus.values
 2394  vi  /tmp/prometheus.values
 2395  helm install charts/permetheus --name prometheus --values /tmp/prometheus.values --namespace prometheus 
 2396  helm install charts/permetheus prometheus --values /tmp/prometheus.values --namespace prometheus 
 2397  helm install charts/prometheus prometheus --values /tmp/prometheus.values --namespace prometheus 
 2398  helm repo update
 2399  helm install charts/prometheus  prometheus --values /tmp/prometheus.values --namespace prometheus 
 2400  helm install stable/prometheus  prometheus --values /tmp/prometheus.values --namespace prometheus 
 2401  helm install prometheus  prometheus --values /tmp/prometheus.values --namespace prometheus 
 2402  helm install prometheus  prometheus --values /tmp/prometheus.values --namespaAce prometheus 
 2403  helm install charts/prometheus -n  prom-demo -f values.yaml
 2404  helm install charts/prometheus --generate-name
 2405  k get all -n prometheus
 2406  k get pods
 2407  k get svc
 2408  k get ns
 2409  k get pvc
 2410  k get deplpoy
 2411  k get deploy
 2412  k get pvc
 2413  k get svc
 2414  k get configmap
 2415  k get statefulset
 2416  k get pods
 2417  k port-forward prometheus-1596981052-server-6bd78cb66b-nrk5f 9090
 2418  helm search repo
 2419  helm inspect charts/grafana > tmp/grafana.values
 2420  helm inspect values charts/grafana > tmp/grafana.values
 2421  helm inspect values charts/grafana > /tmp/grafana.values
 2422  vi /tmp/grafana.values
 2423  helm install grafana  charts/grafana  --values /tmp/grafana.values --namespace grafana
 2424  helm install grafana  charts/grafana  --values /tmp/grafana.values
 2425  helm list
 2426  k get all -n grafana
 2427  kubectl get all -n grafana
 2428  kubectl get all
 2429  helm delete grafana --purge
 2430  helm delete grafana
 2431  kubectl get all
 2432  helm list
 2433  vi /tmp/grafana.values
 2434  helm install grafana  charts/grafana  --values /tmp/grafana.values
 2435  helm list
 2436  watch kubectl get all
 2437  helm list
 2438  kubectl get svc
 2439  vi /tmp/grafana.values
 2440  kubectl get ns
 2441  kubectl cluster-info
 2442  clear
 2443  ls /opt
 2444  ls /usr/local/opt
 2445  ls /var/lib
 2446  ls /var/lib/rancher
 2447  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 -v /usr/local/opt/rancher:/var/lib/rancher  rancher/rancher:latest
 2448  docker image ls
 2449  docker ps
 2450  docker run -d --restart=unless-stopped -p 80:80 -p 443:443 rancher/rancher:latest
 2451  docker ps
 2452  docker logs eccf0ea33489
 2453  docker ps
 2454  docker logs elegant_spence
 2455  kubectl apply -f https://192.168.178.12/v3/import/xxwsbkt7s9rdvj64rhlcgjm4j7wvvt52ftbsh9nc84dlj22t5fhgmm.yaml
 2456  curl --insecure -sfL https://192.168.178.12/v3/import/xxwsbkt7s9rdvj64rhlcgjm4j7wvvt52ftbsh9nc84dlj22t5fhgmm.yaml
 2457  curl --insecure -sfL https://192.168.178.12/v3/import/xxwsbkt7s9rdvj64rhlcgjm4j7wvvt52ftbsh9nc84dlj22t5fhgmm.yaml | less
 2458  kubectl get namespaces
 2459  curl --insecure -sfL https://192.168.178.12/v3/import/xxwsbkt7s9rdvj64rhlcgjm4j7wvvt52ftbsh9nc84dlj22t5fhgmm.yaml | kubectl apply -f -
 2460  kubectl get namespaces
 2461  kubectl -n ➜  ~ kubectl -n cattle-system get all
 2462  kubectl -n ➜  ~ kubectl  cattle-system get all
 2463  kubectl -n ➜  ~ kubectl  get all
 2464  kubectl version
 2465  helm list 
 2466  helm delete prometheus-1596981052
 2467  helm delete grafana
 2468  docker image ls
 2469  cd ~/.repo/m2
 2470  ls
 2471  cd ..
 2472  ls
 2473  cd ~/.hamidshaf
 2474  cd ~./hamidshaf
 2475  cd .
 2476  cd ..
 2477  ls
 2478  cd User
 2479  cd Users
 2480  ls
 2481  cd hamid
 2482  ls
 2483  cd /Volumes/hamidshafi/repo2 
 2484  clear
 2485  ls
 2486  cd m2
 2487  cd /m2
 2488  /Volumes/hamidshafi/AllMyWork/Documents/gitProjects/pickup-point-service/docker-local-db/Dockerfile ; exit;
 2489  /Volumes/hamidshafi/AllMyWork/Documents/gitProjects/pickup-point-service/Dockerfile ; exit;
 2490  cd ..
 2491  ls
 2492  cd System
 2493  ls
 2494  cd ..
 2495  ls
 2496  cd Documents
 2497  kubectl get namespaces\n
 2498  kubectl get pods
 2499  curl -L http://strimzi.io/install/latest \\n| sed 's/namespace: .*/namespace: kafka/' \\n| kubectl apply -f - -n kafka
 2500  k get pods
 2501  alias k="kubectl"
 2502  k get pods
 2503  docker image ls
 2504  docker ps
 2505  cd /Users/hamid/Desktop/useful-projects/gis/mmasgis/spring-boot-kafka-producer/kafka-scripts/
 2506  ./start-zookeeper.sh
 2507  docker run -p 9090:9090 -v prometheus.yml prom/prometheus
 2508  docker container ps
 2509  docker stop $(docker ps -aq)
 2510  docker rm $(docker ps -aq)
 2511  docker container ps
 2512  docker rm f7995737a31a
 2513  docker stop $(docker ps -aq)
 2514  docker rm $(docker ps -aq)
 2515  docker rm 9bff28bfb8926112366a9c03a1824412bc0cdbca9adf5937ccb812a7fe2ebef6.
 2516  docker stop $(docker ps -aq)
 2517  docker rm 9bff28bfb8926112366a9c03a1824412bc0cdbca9adf5937ccb812a7fe2ebef6.
 2518  docker rm $(docker ps -aq)
 2519  docker stop $(docker ps -aq)
 2520  docker container ls
 2521  docker container -p
 2522  docker ps -aq
 2523  docker container ps
 2524  docker image prune -a
 2525  docker image ls

```