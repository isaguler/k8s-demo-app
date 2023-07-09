# k8s-demo-app
Simple Kubernetes and Spring Boot example using [minikube](https://minikube.sigs.k8s.io/docs/) & [docker desktop](https://www.docker.com/products/docker-desktop/) .

### Tech stack

    spring-boot
    kubernetes
    minikube
    mongodb

### K8s manifest files (./k8s/*)

    mongo-config.yaml
    mongo-secret.yaml
    mongo.yaml
    k8s-demo-app.yaml

### Dockerize and push to DockerHub

    mvn clean install

    docker build -t k8s-demo-app:1 .
    docker images

    docker login
    docker tag k8s-demo-app:1 <your docker repository name>/k8s-demo-app:1
    docker <your docker repository name>/k8s-demo-app:1

### K8s commands
start Minikube and check status

    minikube start
    minikube status

get minikube node's ip address

    minikube ip

get basic info about k8s components

    kubectl get node
    kubectl get pod
    kubectl get svc
    kubectl get all

get extended info about components

    kubectl get pod -o wide
    kubectl get node -o wide

get detailed info about a specific component

    kubectl describe svc {svc-name}
    kubectl describe pod {pod-name}

get application logs

    kubectl logs {pod-name}

stop your Minikube cluster

    minikube stop

If you can't access the NodePort service webapp with MinikubeIP:NodePort, execute the following command:
    
    minikube service webapp-service

### Links

- [mongo image](https://hub.docker.com/_/mongo)
- [k8s-demo-app image](https://hub.docker.com/r/isaguler/k8s-demo-app)
- [k8s](https://kubernetes.io/docs/home/)







