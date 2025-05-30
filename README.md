# Project Software Development 

#### Setup -  Microservices-Based Movie Booking System

-  Step 01 - Setting up Limits Microservice
-  Step 02 - Creating a hard coded limits service
-  Step 03 - Enhance limits service to pick up configuration from application properties
-  Step 04 - Setting up Spring Cloud Config Server
-  Step 05 - Installing Git and Creating Local Git Repository
-  Step 06 - Connect Spring Cloud Config Server to Local Git Repository
-  Step 07 - Connect Limits Service to Spring Cloud Config Server
-  Step 08 - Configuring Profiles for Limits Service
-  Step 09 - Setting up Movie Microservice
-  Step 10 - Setting up Booking Microservice
-  Step 11 - Setting up Pricing Microservice
-  Step 12 - Setting up Customer Microservice
-  Step 13 - Setting up Review and Rating Microservice
-  Step 14 - Create a JPA Repository
-  Step 15 - Using Feign REST Client for Service Invocation
-  Step 16 - Naming Server and Setting up Eureka Naming Server
-  Step 17 - Load Balancing with Eureka, Feign & Spring Cloud LoadBalancer
-  Step 18 - Setting up Spring Cloud API Gateway
-  Step 19 - Enabling Discovery Locator with Eureka for Spring Cloud Gateway

### Technologies Used

- Docker
- Kubernetes
- Spring Boot 2.4.x+ & Spring Cloud 2020.x+
  - Service Registry using Eureka Naming Server
  - Load Balancing with Spring Cloud LoadBalancer (replacing Ribbon)
  - API Gateway with Spring Cloud Gateway (instead of Zuul)
  - Distributed Tracing with Zipkin

### MainActivity Route
- *MainActivity* : (https://github.com/IUCampus/mobile-software-engineering-02/blob/main/app/src/main/java/franciswebapp/com/devquizapp/MainActivity.kt)
---
### **Creating a New MainActivity**
  
**Method:** `POST`  

**Body:**

Requirement Gathering – Collaborate with stakeholders to finalize feature requirements and system specifications.
Architecture Design – Create detailed architectural diagrams and define service interfaces (APIs) and data models.
MVP Development – Build and deploy a minimum viable product (MVP) focusing on core functionalities (user auth, movie listing, seat booking).
CI/CD Pipeline Setup – Implement automated testing, integration, and deployment workflows.
Monitoring & Logging Implementation – Set up dashboards and alerts using Micrometer and ELK to monitor system health.
Load Testing & Optimization – Conduct stress testing to ensure performance under high traffic and optimize accordingly.
Iterative Feature Expansion – Gradually integrate additional services such as review & rating, notifications, and promotional systems![image](https://github.com/user-attachments/assets/053e033f-1bef-4597-a06c-80232b30cfa8)


