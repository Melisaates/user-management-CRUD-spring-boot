# User Management System - Backend

This project contains a backend application used for managing users. It stores user information, updates it, and retrieves it through RESTful APIs.

## Getting Started

To run this application on your local machine, follow the steps below:

1. Resolve the required dependencies using the `pom.xml` file in the project.

2. Configure the database connection in the `application.properties` file.

3. Run the `UserManagementApplication.java` class to start the application.

You can verify that the application is running by visiting `http://localhost:8080` in your browser.

## API Endpoints

This application provides the following API endpoints:

- Create a user: POST `/api/users`
- Get all users: GET `/api/users`
- Get a specific user: GET `/api/users/{id}`
- Update a user: PUT `/api/users/{id}`
- Delete a user: DELETE `/api/users/{id}`

## License

This project is licensed under the MIT License. For more information, please see the `LICENSE` file.
