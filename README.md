# API Gateway Implementation in Microservices

## Overview
This project demonstrates the implementation of an API Gateway pattern in a microservices architecture. The API Gateway serves as a single entry point for clients, efficiently routing requests to appropriate microservices.

## Architecture Flow
1. Client sends a request (e.g., `api/order`)
2. Gateway receives and analyzes the request
3. Gateway routes request to appropriate microservice
4. Microservice processes the request
5. Gateway returns response to client

## Technology Stack
- Spring Boot
- Spring Cloud Gateway
- Maven
- Multiple databases (MySQL, PostgreSQL, MongoDB)

## Official Documentation
- [Spring Cloud Gateway Documentation](https://docs.spring.io/spring-cloud-gateway/docs/current/reference/html/)

## Project Components

### 1. Service Registry (Eureka Server)
- **Project Type:** Maven
- **Dependencies:**
  - Eureka Server
  - Spring Cloud Bootstrap (optional)
- **Configuration:**
  - Add `@EnableEurekaServer` annotation in main application class

### 2. API Gateway
- **Project Type:** Maven
- **Dependencies:**
  - Eureka Client
- **Purpose:** Routes requests to appropriate microservices

### 3. Microservices

#### User Service
- **Port:** 8081
- **Database:** MySQL
- **Dependencies:**
  - Spring Web
  - Spring Data JPA
  - MySQL Driver
  - Lombok

#### Order Service
- **Port:** 8082
- **Database:** PostgreSQL
- **Dependencies:**
  - Spring Web
  - Spring Data JPA
  - PostgreSQL Driver
  - Lombok

#### Product Service
- **Port:** 8083
- **Database:** MongoDB
- **Dependencies:**
  - Spring Web
  - Spring Data JPA
  - Lombok

## Setup Instructions
1. Create projects using Spring Initializer
2. Configure each service with appropriate dependencies
3. Set up respective databases
4. Configure service ports and Eureka client settings

## Running the Application
1. Start Eureka Server
2. Start API Gateway
3. Start individual microservices

## Additional Notes
- Ensure all databases are running before starting services
- Verify service registration in Eureka Dashboard