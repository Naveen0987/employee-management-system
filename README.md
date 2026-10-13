# Employee Management System

A RESTful backend application built using Java, Spring Boot, Spring Data JPA, and MySQL to manage employee records efficiently.

## Features

- Create new employee records
- Retrieve all employees
- Retrieve an employee by ID
- Update employee details
- Delete employee records
- Validate request data using Jakarta Validation
- Handle exceptions centrally using Spring REST Controller Advice
- Persist employee information in MySQL

## Tech Stack

- **Language:** Java
- **Backend Framework:** Spring Boot
- **Data Access:** Spring Data JPA, Hibernate
- **Database:** MySQL
- **API Style:** REST API
- **Build Tool:** Maven
- **API Testing:** Postman
- **IDE:** Spring Tools Suite (STS)

## Employee Fields

Each employee record contains:

- ID
- Name
- Email
- Phone
- Department
- Designation
- Salary

## API Endpoints

Base URL: `http://localhost:8080`

| Method | Endpoint | Description |
|---|---|---|
| POST | `/` | Create an employee |
| GET | `/employees` | Get all employees |
| GET | `/employees/{id}` | Get an employee by ID |
| PUT | `/employees/{id}` | Update an employee |
| DELETE | `/employees/{id}` | Delete an employee |

## Validation and Error Handling

- Validates employee input fields.
- Returns HTTP 400 for invalid request data.
- Returns HTTP 404 when an employee does not exist.
- Uses centralized exception handling for consistent error responses.

## Prerequisites

- Java Development Kit (JDK)
- MySQL Server
- Git
- Postman (for API testing)

## Setup and Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Naveen0987/employee-management-system.git
   ```

2. Open the project directory:

   ```bash
   cd employee-management-system
   ```

3. Create a MySQL database:

   ```sql
   CREATE DATABASE employee_management_db;
   ```

4. Configure database settings in `src/main/resources/application.properties`.

   Set your database URL and username, and configure the `DB_PASSWORD` environment variable with your MySQL password. Do not commit actual credentials to GitHub.

5. Run the application from Spring Tools Suite, or use the Maven wrapper:

   ```bash
   ./mvnw spring-boot:run
   ```

6. Test the endpoints using Postman.

## Future Improvements

- Standardize HTTP status codes for all operations
- Add pagination and sorting
- Add automated tests for REST endpoints
- Deploy the application to a cloud platform

## Author

**Naveen Chintakuntla**

- GitHub: [Naveen0987](https://github.com/Naveen0987)
- Portfolio: [My Portfolio](https://naveen098-portfolio.vercel.app/)
- LinkedIn: [My LinkedIn Profile](https://www.linkedin.com/in/naveen-ch-705965240/)
