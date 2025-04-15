
# Selenium TestNG Login Automation

This project is a Selenium-based automation test for logging into a web application using TestNG. The test navigates to a login page, enters credentials, and verifies successful login by checking the resulting URL.

## Project Structure

```
vaibha-v19/
│
├── src/
│   └── test/
│       └── java/
│           └── DemoTNG/
│               └── TestNGt.java          # TestNG test class for login automation
│
├── target/                                 # Compiled classes and build artifacts
│
├── test-output/                            # TestNG output reports
│
├── pom.xml                                 # Maven project configuration file
│
└── testng.xml                              # TestNG configuration file
```

## Prerequisites

Before running the project, ensure you have the following installed:

- **Java Development Kit (JDK)**: JDK 8 or higher.
- **Apache Maven**: For managing project dependencies and building the project.
- **Web Browser**: Chrome (or any other browser you wish to test with).

## Setup Instructions

1. **Clone the Repository**: If this project is hosted on a version control system, clone it to your local machine.

2. **Navigate to the Project Directory**:
   ```bash
   cd vaibha-v19
   ```

3. **Install Dependencies**: The project uses Maven for dependency management. Run the following command to install the required dependencies:
   ```bash
   mvn install
   ```

4. **WebDriver Setup**: The project uses WebDriverManager to automatically manage the browser driver binaries. Ensure you have an internet connection for WebDriverManager to download the necessary drivers.

## Running the Tests

1. **Using Maven**: You can run the tests using the following command:
   ```bash
   mvn test
   ```

2. **Using an IDE**: You can also run the tests directly from your IDE (e.g., Eclipse, IntelliJ IDEA) by right-clicking on the `TestNGt.java` file and selecting "Run as TestNG Test".

## Test Configuration

- The test is configured to run using TestNG. The configuration file `testng.xml` can be modified to include additional test classes or parameters if needed.

## Test Output

- After running the tests, you can find the test results in the `test-output` directory. TestNG generates an HTML report that summarizes the test execution results.

## Example Test Case

The main test case is located in `TestNGt.java` and performs the following actions:

1. Navigates to the login page.
2. Enters the username and password.
3. Clicks the login button.
4. Verifies that the URL after login matches the expected URL.

## Important Notes

- Ensure that the expected URL in the test matches the actual URL after a successful login.
- While `Thread.sleep()` is used in the test for demonstration purposes, it is recommended to use WebDriver's wait mechanisms (like `WebDriverWait`) for better reliability in production code.
