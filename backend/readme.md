# Backend

## Project Context

The project is designed to manage IT equipment, failures, and support tickets within the ITSolutions company's system. This backend is developed using Spring Boot, providing a robust solution for equipment management and support ticket tracking.

## User Stories

### IT Equipment Management

- **Add Equipment** : As an IT administrator, I can add new equipment to the system to track its status and usage.
- **Modify Equipment** : As an IT administrator, I can modify the information of existing equipment to keep the data up to date.
- **Delete Equipment** : As an IT administrator, I can remove obsolete or out-of-service equipment to keep the system organised.
- **View Equipment List** : As an IT administrator, I can see a list of all equipment with their current status for efficient management.

### Failure Management and Monitoring

- **Add, Modify, Delete Failures** : As an IT administrator, I can manage failures (add, modify, delete).
- **View Failure History** : As an IT administrator, I can review the failure history for each piece of equipment to identify problematic assets.

### Support Ticket Management

- **Create a Support Ticket** : As a user, I can create a support ticket to report an issue and receive assistance.
- **Assign Tickets to Technicians** : As an IT administrator, I can assign support tickets to available technicians for quick resolution.
- **View Assigned Tickets** : As an IT technician, I can see the tickets assigned to me for efficient resolution.
- **Track Ticket Status** : As a user, I can track my support ticket status to know when my issue will be resolved.

### Bonus

- **Pending Ticket Notifications** : As an IT administrator, I can receive notifications for pending tickets to avoid missing important requests.
- **Failure Statistics** : As an IT administrator, I can view failure statistics to identify trends and recurring issues.
- **Equipment Status Reports** : As an IT administrator, I can generate reports on equipment status for better management.
- **Support Service Performance Reports** : As an IT administrator, I can generate reports on support service performance to improve efficiency.

## Functionality

- **Failure History** : Keeps a detailed record of all past failures for each piece of equipment.
- **Support Tickets** : Created by users to report problems with equipment.
- **Ticket Assignment** : Once a ticket is created, it is assigned to a technician for resolution.

## Technologies Used

- **Backend** : 
  - Spring Boot 3.3.2
  - Spring Data JPA
  - Spring Security
  - MapStruct 1.5.5.Final
  - Lombok 1.18.24
  - JWT (Json Web Token) 0.11.5
  - Hibernate Validator 8.0.1.Final

- **Database** : 
  - MySQL

- **Unit Testing** : 
  - JUnit

- **Containerisation** : 
  - Docker

## Security Features

### Spring Security avec JWT

This project uses **Spring Security** to secure application endpoints. The security is reinforced through the use of **JSON Web Tokens (JWT)** for user authentication and authorisation.

- **Authentication** : Users authenticate with credentials (username and password) and receive a JWT.
- **Authorisation** : Requests must include the JWT in the Authorisation header.
- **Configuration** : Managed in Spring Security configuration classes.
