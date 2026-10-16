# Employee Management System

A RESTful backend application built using **Java, Spring Boot, Spring Data JPA, and PostgreSQL** to manage employee records through REST APIs.

## Live Demo

- **Live API:** https://employee-management-system-f8wz.onrender.com/
- **GitHub Repository:** https://github.com/Naveen0987/employee-management-system

## Features

- Create employee records
- Retrieve all employees
- Retrieve an employee by ID
- Update employee details
- Delete employee records
- Request validation using Jakarta Validation
- Centralized exception handling
- PostgreSQL database integration
- Cloud deployment using Docker and Render

## Tech Stack

- **Language:** Java
- **Framework:** Spring Boot
- **Persistence:** Spring Data JPA, Hibernate
- **Database:** PostgreSQL
- **API:** REST
- **Build Tool:** Maven
- **Testing:** Postman
- **Containerization:** Docker
- **Deployment:** Render

## Employee Details

Each employee record contains:

- `id`
- `name`
- `email`
- `phone`
- `department`
- `designation`
- `salary`

## REST API Endpoints

Base URL: `https://employee-management-system-f8wz.onrender.com`

| HTTP Method | Endpoint | Description |
|---|---|---|
| GET | `/` | API welcome message |
| POST | `/employees` | Create an employee |
| GET | `/employees` | Retrieve all employees |
| GET | `/employees/{id}` | Retrieve an employee by ID |
| PUT | `/employees/{id}` | Update an employee |
| DELETE | `/employees/{id}` | Delete an employee |

## Example Request

### Create an Employee

**POST** `/employees`

```json
{
  "name": "Ravi Kumar",
  "email": "ravi@gmail.com",
  "phone": "9876543210",
  "department": "IT",
  "designation": "Software Developer",
  "salary": 50000
}
```

Send the request with `Content-Type: application/json`.

## Validation and Exception Handling

- Validates incoming employee data.
- Returns HTTP `400 Bad Request` for validation failures.
- Returns HTTP `404 Not Found` when an employee does not exist.
- Uses centralized exception handling with `@RestControllerAdvice`.

## Run Locally

### Prerequisites

- JDK 25
- PostgreSQL
- Git

### 1. Clone the repository

```bash
git clone https://github.com/Naveen0987/employee-management-system.git
cd employee-management-system
```

### 2. Create a PostgreSQL database

Create a database in PostgreSQL and note its connection details.

### 3. Configure environment variables

Set the following environment variables before running the application:

- `DB_URL` — JDBC URL, for example `jdbc:postgresql://localhost:5432/employee_management_db`
- `DB_USERNAME` — PostgreSQL username
- `DB_PASSWORD` — PostgreSQL password

Do not commit database credentials to GitHub.

### 4. Run the application

```bash
./mvnw spring-boot:run
```

The application starts on `http://localhost:8080` by default.

## Testing

Use Postman to test the REST API endpoints, including successful CRUD operations, invalid input, and requests for nonexistent employee IDs.

## Deployment

The application is containerized using Docker and deployed on Render with a PostgreSQL database.

**Note:** The live service may take some time to respond after inactivity because of the hosting plan.

## Author

**Naveen Chintakuntla**

- GitHub: https://github.com/Naveen0987
