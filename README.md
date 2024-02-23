
# Employee Login application

## Overview

This Employee Login application is a Spring application designed for managing employee login. It leverages Spring for its core functionality, offering a straightforward and efficient method for handling login operations.

## Features

- **Employee Credential Management:** Facilitates the management of employee usernames and passwords.
- **Login Validation:** Incorporates validation checks to ensure that username and password fields are not left empty.

## Components

1. **Employee Entity:** Defines the employee data model, including username and password fields with validation.
2. **Login Controller:** Manages HTTP request mappings for login operations.
3. **Application Entry Point:** The main class that runs the application, setting up the necessary configuration.

## Getting Started

### Prerequisites

- JDK 11 or later
- Maven 3.2+

### Running the Application

1. Clone the repository.
2. Navigate to the project directory.
3. Run the application using Maven:

```sh
mvn spring-boot:run
```

## API Endpoints

- `/login`: Endpoint for handling login requests, validating user credentials.
- `/error`: Endpoint for showing error if any.
- `/welcome`: Endpoint for showing welcome page with date.

## Development

This project utilizes Spring, making it easy to develop, test, and deploy. The application is configured to run on an embedded web server for immediate testing.

### Technologies

- **Spring**: Simplifies the bootstrapping and development of new Spring Applications.
- **Jakarta Bean Validation**: Provides a framework for validating user inputs.
