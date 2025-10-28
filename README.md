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
### app1: Eureka server (Service Registery)
* maven project
> dependencies: Eureka Server, cloud bootstrap(optional)

* add @enableEurekaServer annotation in main app.java file
### app2: Api Gateway (Single Entry Point)
* maven project
> dependencies: Eureka Client

### Microservice 1: User Service
* Maven Project
* Database: MySql
* Running Port: 8081
> Dependencies: Spring web, Spring Data JPA, Mysql driver, Lombok


### Microservice 2: Order Service
* Maven Project
* Database: Postgres
* Running Port: 8082
> Dependencies: Spring Web, Spring Data JPA, Postgres Driver, Lombok

### Microservice 3: Product Service
* Maven Project
* Database: Mongo Db
* Running Port: 8083
> Dependencies : Spring Web, Spring Data JPA, Lombok