## Implementation of API Gateway in Microservices

Basically It provides a single entry point for clients routing requests to the appropriete microservices. It acts as a single entry point between the client and the balanced services.

### How it works?
* client sends a req ex: api/order.
* gateway receives it and determine which microservice should handle it.
* the gateway forward the req to the correct microservices.
* the microservice processes the req and sends a response.
* the gateway returns the response to the client.

> using spring boot maven

Docs: https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/

> user spring initializer to build the initial setup of the project
### app1: Eureka server
maven project
> dependencies: 
    * Eureka Server
    * cloud bootstrap(optional)
> add @enableEurekaServer annotation in main app.java file
### app2: Api Gateway
maven project
> dependencies: 
    * Eureka Client
    *

### app3: User Service
Maven Project
> Dependencies: Spring web, Spring Data JPA, Mysql driver, Lombok

### app4: Order Service

### app5: Product Service
