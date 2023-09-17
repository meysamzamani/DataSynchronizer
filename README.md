# Data Synchronizer Project

The Data Synchronizer project is a Java Spring Boot application that synchronizes customer data to an S3 object storage bucket. It provides RESTful APIs for managing customer data and uses scheduler to automates the synchronization process.

## Table of Contents
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Project Structure](#project-structure)
- [Configuration](#configuration)
    - [Database Configuration](#database-configuration)
    - [S3 Configuration](#s3-configuration)
- [Usage](#usage)
    - [API Endpoints](#api-endpoints)
    - [Synchronization](#synchronization)

## Getting Started

### Prerequisites
Before running this project, make sure you have the following prerequisites installed:

- Java 8 or later
- Maven
- S3 Object storage account and credentials
- PostgreSQL database

### Installation
1. Clone the repository:
   ```sh
   git clone <repository-url>
   
2. Navigate to the project directory:
   ```sh
   cd DataSynchronizer

3. Build the project using Maven:
   ```sh
   mvn clean install
   
4. Run the Spring Boot application:
   ```sh
   java -jar target/data-synchronizer-<version>.jar

## Project Structure

The project structure is organized as follows:

- com.meysamzamani.datasynchronizer.application: Contains application logic and services.
- com.meysamzamani.datasynchronizer.domain.customer: Defines customer-related domain classes.
- com.meysamzamani.datasynchronizer.infrastructure.database: Provides database repositories.
- com.meysamzamani.datasynchronizer.infrastructure.storage: Manages interaction with S3 storage.
- com.meysamzamani.datasynchronizer.presentation.controller: Contains REST API controllers.
- com.meysamzamani.datasynchronizer.scheduler: Defines scheduled tasks.
- com.meysamzamani.datasynchronizer.utils: Utility classes for CSV generation and handling exceptions.
- com.meysamzamani.datasynchronizer.presentation.dto: DTO classes for API responses.
- com.meysamzamani.datasynchronizer.presentation.exception: Exception handling and custom exceptions.
- 

## Configuration

The project uses Spring Boot configuration to manage various settings. You can customize these settings in the `application.properties` file located in the project's resources folder.

### Database Configuration

The project uses a PostgreSQL database. You can configure the database connection as follows:

```properties
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/postgres
    username: <YOUR_DATABASE_USERNAME>
    password: <YOUR_DATABASE_PASSWORD>
```

### S3 Configuration

To synchronize customer data to S3 Storage, configure your S3 credentials and bucket settings:

```properties
com:
    meysamzamani:
        data_synchronizer:
            location: /files/
            storage:
                access_key: <YOUR_ACCESS_KEY>
                secret_key: <YOUR_SECRET_KEY>
                endpoint: s3-eu-central-1.ionoscloud.com
                region: us-east-1
                bucket: customer
```

Make sure to replace <YOUR_DATABASE_USERNAME>, <YOUR_DATABASE_PASSWORD>, <YOUR_ACCESS_KEY>, and <YOUR_SECRET_KEY> with your actual database and S3-Object Storage credentials.

## Usage
### API Endpoints
- GET /api/v1.0/customers: Retrieve a list of all customers.
- GET /api/v1.0/customers/{customerId}: Retrieve details of a specific customer.
- POST /api/v1.0/customers: Create a new customer.
- DELETE /api/v1.0/customers/{customerId}: Delete a customer.

### Synchronization
The project includes a scheduled task CustomerScheduler that runs every 3 hours (configured in @Scheduled(cron = "0 */3 * * * *")). This task synchronizes new customer data to an S3 bucket. Customers with a higher ID than the last synchronized customer are selected and converted to CSV files, which are then uploaded to the S3 bucket. Each file contains information about the customers of a country.