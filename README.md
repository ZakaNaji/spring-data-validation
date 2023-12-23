# Spring Validation Demo

## Project Overview

This Spring Boot project demonstrates the use of validation and exception handling in a simple RESTful API. It provides basic functionalities for creating and retrieving user information while ensuring data integrity through extensive validation checks.

## Key Features

- RESTful API to manage user data.
- Extensive use of Spring Validation for input data validation.
- Custom exception handling for robust error management.
- Entity to DTO conversion and vice versa.

## Technologies Used

- Spring Boot 3.2.1
- Spring Data JPA
- Spring Boot Validation
- Spring Web
- MySQL Connector Java (Runtime)
- Lombok (Optional)
- Java 17

## Getting Started

### Prerequisites

- Java JDK 17
- Maven
- MySQL Database

### Running the Application

1. Clone the repository:
   git clone https://github.com/ZakaNaji/spring-data-validation/
2. Navigate to the project directory:
   cd spring-validation-demo
3. Configure MySQL database settings in `application.properties`.
4. Run the application:
   mvn spring-boot:run

## API Endpoints

### Create User

- **URL**: `/api/user`
- **Method**: `POST`
- **Body**:
```json
{
   "name": "John Doe",
   "email": "john.doe@example.com",
   "mobile": "1234567890",
   "gender": "Male",
   "age": 30,
   "nationality": "American"
}
```
Success Response: 201 CREATED

### Get All Users

- **URL**: `/api/user`
- **Method**: `GET`
- **Success Response**: `200 OK`

### Get User by ID

- **URL**: `/api/user/{id}`
- **Method**: `GET`
- **Success Response**: `302 FOUND`

## Contributing

Contributions, issues, and feature requests are welcome. Feel free to check [issues page](https://github.com/ZakaNaji/spring-data-validation/issues) if you want to contribute.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
