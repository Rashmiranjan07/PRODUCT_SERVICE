# 🚀 PRODUCT_SERVICE

<div align="center">

### Modern E-Commerce Product Microservice Backend  
Built with **Java • Spring Boot • Spring Security • JWT • MySQL • REST APIs**

Scalable, secure, production-ready backend service for managing products in an e-commerce ecosystem.

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-brightgreen?style=for-the-badge)
![JWT](https://img.shields.io/badge/Auth-JWT-blue?style=for-the-badge)
![MySQL](https://img.shields.io/badge/Database-MySQL-00758F?style=for-the-badge)
![Status](https://img.shields.io/badge/Build-Active-success?style=for-the-badge)

</div>

# 📌 Overview

**PRODUCT_SERVICE** is a modern backend system designed for e-commerce platforms to handle product operations efficiently.

It provides secure REST APIs for:

- Product creation & management  
- Inventory handling  
- Category-based filtering  
- JWT authentication  
- Validation & exception handling  
- Clean scalable architecture  

Perfect for integration with **React / Angular / Next.js / Mobile Apps**.
---

# ✨ Core Features

## 🔐 Security First
- JWT Authentication
- Spring Security Integration
- Password Encryption
- Protected APIs
- Role-Based Authorization Ready

## 📦 Product Engine
- Add Products
- Update Product Info
- Delete Products
- View All Products
- Search by ID
- Category Filtering
- Brand Filtering

## 📊 Inventory Logic
- Stock Quantity Tracking
- Price Precision using BigDecimal
- Validation Rules

## ⚡ Developer Friendly
- Swagger UI
- Clean REST APIs
- DTO Pattern
- Exception Handling
- Layered Architecture
- Reusable Code Structure

---

# 🧠 Tech Stack

| Layer | Technology |
|------|------------|
| Language | Java 21 |
| Backend | Spring Boot 3 |
| Security | Spring Security + JWT |
| ORM | Hibernate / JPA |
| Database | MySQL |
| Build Tool | Maven |
| Docs | Swagger / OpenAPI |
| Utility | Lomk |

---

# 🏗️ Architecture

```bash
Controller  →  Service  →  Repository  →  Database
        ↓
   DTO / Validation
        ↓
 Security / JWT
```

# 📁 Project Structure
```bash id="11s0va"
src/main/java/com/product
├── controller
├── service
├── serviceimpl
├── repository
├── entity
├── dto
├── config
├── security
├── exception
└── util
```
# ⚙️ Quick Start
## 1️⃣ Clone Repo

```bash
git clone https://github.com/Rashmiranjan07/PRODUCT_SERVICE.git
cd PRODUCT_SERVICE
```
## 2️⃣ Configure Database
Update application.properties
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
## 3️⃣ Run Application
```bash
mvn spring-boot:run
```

#📘 API Documentation
After running:
```bash
http://localhost:8080/swagger-ui/index.html
```
Interactive testing supported.

# 🔥 Modern Upgrade Ideas
- Dockerize the Service 🐳
- Redis Cache ⚡
- Kafka Event Streaming 📡
- CI/CD Pipeline 🚀
- Kubernetes Deployment ☸️
- Payment Microservice 💳
- Order Service 📦
- API Gateway 🌐
- Observability (Prometheus + Grafana) 📊

# 👨‍💻 Developer
## Rashmiranjan Shaw
🔗 GitHub: https://github.com/Rashmiranjan07

## 📄 License

This project is licensed under the MIT License 
