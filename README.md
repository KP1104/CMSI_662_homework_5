# CMSI_662_homework_5

# Java Spring Boot Banking Application
This Java Spring Boot Banking Application is a simple yet secure web application designed to handle basic banking operations such as account creation, balance checks, and transfers between accounts. It demonstrates robust security practices against common vulnerabilities like SQL injection, CSRF, XSS, and more.

# Features
User Authentication: Secure login and logout processes.
Account Management: Ability to view balances, and transfer funds.
Security: Implements defenses against SQL injection, CSRF, XSS, and user enumeration.
Database Integration: Uses PostGresSQL for database management, securely handling transactions and data storage.

# Security Features
SQL Injection Protection: Uses parameterized queries to prevent SQL injection.
CSRF Protection: Spring Boot automatically implements CSRF Protection in all of it's applications.
Secure Password Storage: Utilizes BCryptPasswordEncoder utility of spring boot to encrypt password and decrypt it before using it to validate.
Error Handling: Robust error management to prevent leakage of sensitive information.

# Prerequisites
Before you can run this application, you will need the following:

JDK 17
SpringBoot
Spring Security
PostGres
Spring Web
Spring Data Jpa
Spring JDBC
