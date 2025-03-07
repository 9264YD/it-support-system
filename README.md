# IT Support Management System

## Overview

The IT Support Management System is a comprehensive web application designed for managing and assigning support tickets to technicians. Built with a modern tech stack, this system streamlines the process of issue reporting, assignment, and resolution in an IT support environment.

## Features

- **User Authentication & Authorisation**
  - JWT-based secure authentication.
  - Role-based access control (Admin, Client, Technician).
- **Ticket Management**
  - Create, view, update, and delete support tickets.
  - Assign tickets to technicians using a popup interface.
  - Real-time status tracking with color-coded indicators.
- **Technician Assignment**
  - Admins can assign tickets to technicians from a user-friendly popup interface.
- **Responsive Design**
  - Mobile-first approach ensuring accessibility across all devices.
- **Interceptors & Guards**
  - HTTP Interceptor for attaching JWT tokens to API requests.
  - Route guards for securing access to different parts of the application.
- **MapStruct Integration**
  - DTO mapping for seamless data transfer between the frontend and backend.

## Technologies Used

### Frontend
- **Angular 17**: Building a dynamic and robust frontend.
- **NgRx**: For state management, handling global application state.
- **Bootstrap**: Ensuring a responsive and modern UI.
- **Boxicons**: A stylish icon library used across the application.
- **CSS Flexbox/Grid**: For designing flexible and efficient layouts.

### Backend
- **Spring Boot**: Framework for building a robust and scalable backend.
- **Spring Security**: Implementing security with JWT-based authentication.
- **Spring Data JPA**: For data persistence and interaction with MySQL.
- **Hibernate**: ORM framework for managing relational data.
- **MapStruct**: For mapping between Java objects and Data Transfer Objects (DTOs).
- **MySQL**: Database for storing application data.

## Setup Instructions

### Prerequisites

- **Node.js** and **npm**: Required for Angular CLI and package management.
- **Java 21**: Required to run the Spring Boot application.
- **MySQL**: Required to run the database.

## Usage

### Authentication

- **Login:** Users can log in using their credentials. JWT tokens are used to secure the sessions.
- **Role Management:** Admins have access to manage users and tickets. Technicians can view assigned tickets, and clients can report issues.

### Ticket Management

- **Admin Dashboard:** Admins can view all tickets, assign them to technicians, and manage user roles.
- **Client Interface:** Clients can report issues and view the status of their tickets.
- **Technician Interface:** Technicians can view tickets assigned to them and update their status.

### Interceptors & Guards

- **JWT Interceptor:** Automatically attaches JWT tokens to outgoing HTTP requests.
- **Auth Guards:** Protect routes from unauthorised access based on user roles.

### Data Mapping with MapStruct

- **DTO Mapping:** MapStruct is used to convert between entities and DTOs, ensuring efficient data transfer between layers.
