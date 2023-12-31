# Master Microservices with Spring Boot, Docker, Kubernetes

[![Image](https://github.com/eazybytes/microservices/blob/main/Microservice.png "Master Microservices with Java, Spring, Docker, Kubernetes")](https://www.udemy.com/course/master-microservices-with-spring-docker-kubernetes/?referralCode=9365DB9B7EE637F629A9)

Learn how to create enterprise and production ready Microservices with Spring, Spring Cloud, Docker and Kubernetes.

## Topics covered in the course
* Section 1 - Introduction to Microservices Architecture
* Section 2- Building microservices using Spring Boot
* Section 3 - How do we right size our microservices & identify boundaries
* Section 4 - Handle deployment, portability &  scalability of microservices using Docker
* Section 5 - Deep Dive on Cloud Native Apps & 15-Factor methodology
* Section 6 - Configurations Management in Microservices
* Section 7 - Using MySQL DBs inside microservices
* Section 8 - Service Discovery & Service Registration in microservices
* Section 9 - Gateway, Routing & Cross cutting concerns in Microservices
* Section 10 - Making Microservices Resilient
* Section 11 - Observability and monitoring of microservices
* Section 12 - Microservices Security
* Section 13 - Event Driven microservices using RabbitMQ,Spring Cloud Functions & Stream
* Section 14 - Event Driven microservices using Kafka,Spring Cloud Functions & Stream
* Section 15 - Container Orchestration using Kubernetes
* Section 16 - Deep dive on Helm
* Section 17 - Server-side service discovery and load balancing using Kubernetes
* Section 18 - Deploying microservices into cloud K8s cluster
* Section 19 - Introduction to K8s Ingress, Service Mesh (Istio) & mTLS
* Section 20 - Congratulations & Thank You

## Pre-requisite for the course
- Good understanding on Java and Spring concepts
- Basic understanding on SpringBoot & REST services is a bonus but not mandatory
- Interest to learn and explore about Microservices

# Important Links
- Spring Boot - https://spring.io/projects/spring-boot
- Create SpringBoot project - https://start.spring.io
- DTO pattern blog - https://martinfowler.com/eaaCatalog/dataTransferObject.html
- Model Mapper - http://modelmapper.org/
- Map Struct - https://mapstruct.org/
- Spring Doc - https://springdoc.org/
- Open API - https://www.openapis.org/
- Lucidchart Blog - https://www.lucidchart.com/blog/ddd-event-storming
- Docker website - https://www.docker.com
- Docker hub website - https://hub.docker.com
- Buildpacks website - https://buildpacks.io
- Google Jib website - https://github.com/GoogleContainerTools/jib
- Docker compose website - https://docs.docker.com/compose/
- Twelve-Factor methodology - https://12factor.net
- Beyond the Twelve-Factor App book - https://www.oreilly.com/library/view/beyond-the-twelve-factor/9781492042631/
- Spring Cloud website - https://spring.io/projects/spring-cloud
- Spring Cloud Config website - https://spring.io/projects/spring-cloud-config
- Spring Cloud Bus website - https://spring.io/projects/spring-cloud-bus
- RabbitMQ website - https://www.rabbitmq.com
- Hookdeck website- https://hookdeck.com
- Spring Cloud Netflix website - https://spring.io/projects/spring-cloud-netflix
- Spring Cloud OpenFeign - https://spring.io/projects/spring-cloud-openfeign
- Netflix Blog - https://netflixtechblog.com/netflix-oss-and-spring-boot-coming-full-circle-4855947713a0
- Resilience4j website - https://resilience4j.readme.io
- Spring Cloud Gateway website - https://spring.io/projects/spring-cloud-gateway
- Stripe RateLimitter pattern blog - https://stripe.com/blog/rate-limiters
- Apache Benchmark website - https://httpd.apache.org
- Grafana website - https://grafana.com
- Grafana Loki setup - https://grafana.com/docs/loki/latest/getting-started/
- Micrometer website - https://micrometer.io
- Prometheus website - https://prometheus.io/
- Grafana Dashboards - https://grafana.com/grafana/dashboards/
- OpenTelemetry website - https://opentelemetry.io/
- OpenTelemetry automatic instrumentation - https://opentelemetry.io/docs/instrumentation/java/automatic/
- Keycloak website - https://www.keycloak.org/
- Apache Kafka website - https://kafka.apache.org
- Docker compose file for Kafka - https://github.com/bitnami/containers/blob/main/bitnami/kafka/docker-compose.yml
- Local Kubernetes Cluster with Docker Desktop - https://docs.docker.com/desktop/kubernetes/
- Kubernetes Dashboard - https://kubernetes.io/docs/tasks/access-application-cluster/web-ui-dashboard/
- Helm website - https://helm.sh
- Chocolatey website - https://chocolatey.org/
- Bitnami Helm charts GitHub repo - https://github.com/bitnami/charts
- Spring Cloud Kubernetes website - https://spring.io/projects/spring-cloud-kubernetes
- Spring Cloud Kubernetes Blog - https://spring.io/blog/2021/10/26/new-features-for-spring-cloud-kubernetes-in-spring-cloud-2021-0-0-m3
- GCP website - https://cloud.google.com
- GCP SDK installation - https://cloud.google.com/sdk/docs/install
- Kubernetes Ingress - https://kubernetes.io/docs/concepts/services-networking/ingress/
- Ingress Controllers - https://kubernetes.io/docs/concepts/services-networking/ingress-controllers/
- Istio (Service mesh) - https://istio.io


## Maven Commands used in the course

|     Maven Command       |     Description          |
| ------------- | ------------- |
| "mvn clean install -Dmaven.test.skip=true" | To generate a jar inside target folder |
| "mvn spring-boot:run" | To start a springboot maven project |
| "mvn spring-boot:build-image" | To generate a docker image using Buildpacks. No need of Dockerfile |
| "mvn compile jib:dockerBuild" | To generate a docker image using Google Jib. No need of Dockerfile |

## Docker Commands used in the course

|     Docker Command       |     Description          |
| ------------- | ------------- |
| "docker build . -t eazybytes/accounts:s4" | To generate a docker image based on a Dockerfile |
| "docker run  -p 8080:8080 eazybytes/accounts:s4" | To start a docker container based on a given image |
| "docker images" | To list all the docker images present in the Docker server |
| "docker image inspect image-id" | To display detailed image information for a given image id |
| "docker image rm image-id" | To remove one or more images for a given image ids |
| "docker image push docker.io/eazybytes/accounts:s4" | To push an image or a repository to a registry |
| "docker image pull docker.io/eazybytes/accounts:s4" | To pull an image or a repository from a registry |
| "docker ps" | To show all running containers |
| "docker ps -a" | To show all containers including running and stopped |
| "docker container start container-id" | To start one or more stopped containers |
| "docker container pause container-id" | To pause all processes within one or more containers |
| "docker container unpause container-id" | To unpause all processes within one or more containers |
| "docker container stop container-id" | To stop one or more running containers |
| "docker container kill container-id" | To kill one or more running containers instantly |
| "docker container restart container-id" | To restart one or more containers |
| "docker container inspect container-id" | To inspect all the details for a given container id |
| "docker container logs container-id" | To fetch the logs of a given container id |
| "docker container logs -f container-id" | To follow log output of a given container id |
| "docker container rm container-id" | To remove one or more containers based on container ids |
| "docker container prune" | To remove all stopped containers |
| "docker compose up" | To create and start containers based on given docker compose file |
| "docker compose down" | To stop and remove containers |
| "docker compose start" | To start containers based on given docker compose file |
| "docker compose down" | To stop the running containers |
| "docker run -p 3306:3306 --name accountsdb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=accountsdb -d mysql" | To create a MySQL DB container |
| "docker run -p 6379:6379 --name eazyredis -d redis" | To create a Redis Container |
| "docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.3 start-dev" | To create Keycloak Container|


## Apache Benchmark command used in the course

|     Apache Benchmark command      |     Description          |
| ------------- | ------------- |
| "ab -n 10 -c 2 -v 3 http://localhost:8072/eazybank/cards/api/contact-info" | To perform load testing on API by sending 10 requests |

## Kubernetes Commands used in the course

|     Kubernetes Command       |     Description          |
| ------------- | ------------- |
| "kubectl apply -f filename" | To create a deployment/service/configmap based on a given YAML file |
| "kubectl get all" | To get all the components inside your cluster |
| "kubectl get pods" | To get all the pods details inside your cluster |
| "kubectl get pod pod-id" | To get the details of a given pod id |
| "kubectl describe pod pod-id" | To get more details of a given pod id |
| "kubectl delete pod pod-id" | To delete a given pod from cluster |
| "kubectl get services" | To get all the services details inside your cluster |
| "kubectl get service service-id" | To get the details of a given service id |
| "kubectl describe service service-id" | To get more details of a given service id |
| "kubectl get nodes" | To get all the node details inside your cluster |
| "kubectl get node node-id" | To get the details of a given node |
| "kubectl get replicasets" | To get all the replica sets details inside your cluster |
| "kubectl get replicaset replicaset-id" | To get the details of a given replicaset |
| "kubectl get deployments" | To get all the deployments details inside your cluster |
| "kubectl get deployment deployment-id" | To get the details of a given deployment |
| "kubectl get configmaps" | To get all the configmap details inside your cluster |
| "kubectl get configmap configmap-id" | To get the details of a given configmap |
| "kubectl get events --sort-by=.metadata.creationTimestamp" | To get all the events occured inside your cluster |
| "kubectl scale deployment accounts-deployment --replicas=1" | To set the number of replicas for a deployment inside your cluster |
| "kubectl set image deployment gatewayserver-deployment gatewayserver=eazybytes/gatewayserver:s11 --record" | To set a new image for a deployment inside your cluster |
| "kubectl rollout history deployment gatewayserver-deployment" | To know the rollout history for a deployment inside your cluster |
| "kubectl rollout undo deployment gatewayserver-deployment --to-revision=1" | To rollback to a given revision for a deployment inside your cluster |
| "kubectl get pvc" | To list the pvcs inside your cluster |
| "kubectl delete pvc data-happy-panda-mariadb-0" | To delete a pvc inside your cluster |

## Helm Commands used in the course

|     Helm Command       |     Description          |
| ------------- | ------------- |
| "helm create [NAME]" | Create a default chart with the given name |
| "helm dependencies build" | To recompile the given helm chart |
| "helm install [NAME] [CHART]" | Install the given helm chart into K8s cluster |
| "helm upgrade [NAME] [CHART]" | Upgrades a specified release to a new version of a chart |
| "helm history [NAME]" | Display historical revisions for a given release |
| "helm rollback [NAME] [REVISION]" | Roll back a release to a previous revision |
| "helm uninstall [NAME]" | Uninstall all of the resources associated with a given release |
| "helm template [NAME] [CHART]" | Render chart templates locally along with the values |
| "helm list" | Lists all of the helm releases inside a K8s cluster |


## My Notes

External variables can be provided in multiple ways.

Please refer the below image for syntax

if all three are provided prority is
1. Command line arguements i.e (--build.version)
2. JVM args i.e (-Dbuild.version)
3. Environment Variables i.e (BUILD_VERSION)

Remember all these variables should be in applications.yml and should be overridded

![Alt text](assets/MultipleWaysToProvideExternalVariable.png)

I am adding config server now so had to remove application_qa.yml and application_prod.yaml 
please refer to this repository for the same code https://github.com/eazybytes/microservices/tree/main/section6/v1-springboot

## To run rabbit mq
docker run -d -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.12-management
https://www.rabbitmq.com/download.html

## To run redis
docker run -p 6379:6379 --name eazyredis -d redis

## To create webhooks
https://hookdeck.com/ for documentation
https://console.hookdeck.com/ to create webhook
this should be setup using /monitor api which is in config server

## Useful links
H2 Db console :- http://localhost:8080/h2-console
Swagger ui :- http://localhost:8080/swagger-ui/index.html
Eureka for all apps :- http://localhost:8070/eureka/apps (To get the response in json send Accept :- application/json)
Eureka for individual apps :- http://localhost:8070/eureka/apps/loans (To get the response in json send Accept :- application/json)



## To check liveness and readiness healthpoints
http://localhost:8071/actuator/health
http://localhost:8071/actuator/health/liveness
http://localhost:8071/actuator/health/readiness

## Gateway links
http://192.168.1.189:8072/actuator/gateway/routes

## Circuit Breaker links
http://192.168.1.189:8072/actuator/circuitbreakers

## Prometheus
http://localhost:8080/actuator/prometheus
http://localhost:9090/targets

## Grafana

http://localhost:3000

https://grafana.com/grafana/dashboards/4701-jvm-micrometer/ configured this dashboard in grafana

## keycloak

docker run -d -p 7080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:22.0.1 start-dev

## Application start sequence

Make sure all rabbitmq,keyclock is started
configserver --> eureka server --> all other ms --> gateway server

## k8s dashboard config
https://kubernetes.io/docs/tasks/access-application-cluster/web-ui-dashboard/

run kubectl proxy and access http://localhost:8001

## Setting up helm 

### Step1 Installing keycloak

```t
helm dependency build keycloak
helm install keyclock keycloak

Setup client and roles and assign these roles to client

Note:- Remember to delete pvc when deleting chart


username: user
password: password

http://localhost:80

get the access token and update in postman and remember to change port
```


### Step2 Installing kafka
```t
I have used rabbitmq instead of kafka for messaging
helm dependency build rabbitmq/

helm dependency build kafka
helm install kafka kafka
```

### Step3 Installing prometheus
```t
helm dependency build kube-prometheus
helm install prometheus kube-prometheus

echo "Prometheus URL: http://127.0.0.1:9090/"                                 
    kubectl port-forward --namespace default svc/prometheus-kube-prometheus-prometheus 9090:9090

http://localhost:9090

Note:- Configured microservices details in values.yaml under additionalScrapeConfigs
```
### Step4 Installing Grafana components
```t

1st setup grafana loki (log aggregator)

helm dependency build grafana-loki
helm install loki grafana-loki/

2nd setup grafana tempo

helm dependency build grafana-tempo
helm install tempo grafana-tempo

3rd setup grafana
Note:- Configured Prometheus loki and tempo  details in values.yaml under secretDefinition

helm dependency build grafana/
helm install grafana grafana/

echo "Browse to http://127.0.0.1:8080"
kubectl port-forward svc/grafana 3000:3000


echo "User: admin"
echo "Password: $(kubectl get secret grafana-admin --namespace default -o jsonpath="{.data.GF_SECURITY_ADMIN_PASSWORD}" | base64 -d)"
```

### Step5 Installing microservices
```t
helm dependency build environments/dev-env 
helm install eazybank environments/dev-env 

If you make any changes in common config you have to run helm dependency build to all microservices and build environment

if you make any changes in microservices then you have to run helm dependency build in respective env folder
```

### Step6 Test

Take the gateway server ip and test the functionality

To test the config server changes in cloud 
1. setup a webhook in hook deck
2. hookdeck logout
3. hookdeck login --cli-key 0yjr1v1apqf3ofytgvaxqef6vuaesa5kftvi5un7921k18k9ro
4. hookdeck listen 8071 Source (use /monitor for api)
5. I have enabled rabbit mq config in configserver
6. k port-forward svc/configserver 8071:8071
7. Now if you make changes on github it will automatically reflect

