"# WordPress Automation

## Project Overview
This project provides automated testing for WordPress plugin installation and activation using Selenium WebDriver. It specifically tests the installation and activation flow of the Everest Forms plugin on a WordPress site.

## Tools and Technologies
- **Java**: Programming language
- **Selenium WebDriver**: Browser automation framework
- **TestNG**: Testing framework for test organization and execution
- **Maven**: Dependency management and build tool
- **ChromeDriver**: WebDriver implementation for Chrome browser

## Prerequisites
- Java JDK 23 or compatible version
- Maven installed
- Chrome browser
- Local WordPress installation running at http://localhost/demoProjectForTesting/
- WordPress admin credentials (username: admin, password: admin123@#$_an62)

## Project Structure
```
WordPressAutomation/
├── src/
│   ├── main/java/
│   │   ├── base/
│   │   │   └── BaseTest.java         # Base test setup and teardown
│   │   └── pages/
│   │       ├── DashboardPage.java    # WordPress dashboard page object
│   │       ├── EverestFormsPage.java # Everest Forms plugin page object
│   │       └── LoginPage.java        # WordPress login page object
│   └── test/java/
│       └── tests/
│           └── PluginInstallTest.java # Test for plugin installation flow
└── pom.xml                           # Maven configuration file
```

## Setup Instructions
1. Clone this repository:
   ```
   git clone https://github.com/yourusername/WordPress-Automation.git
   cd WordPress-Automation
   ```

2. Install dependencies:
   ```
   mvn clean install
   ```

3. Make sure your local WordPress installation is running at http://localhost/demoProjectForTesting/

## Running the Tests
You can run the tests using Maven:

```
mvn test
```

Or directly using TestNG in your IDE by running the `PluginInstallTest` class.

## Expected Output
When the test runs successfully, you should see output similar to:

```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running tests.PluginInstallTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 25.123 s
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
```

The test performs the following steps:
1. Logs into WordPress admin
2. Navigates to the plugins section
3. Installs and activates the Everest Forms plugin
4. Verifies the plugin is successfully activated

## Troubleshooting
- Ensure ChromeDriver is compatible with your Chrome browser version
- Verify WordPress is running at the specified URL
- Check that admin credentials are correct
- Increase wait times if tests fail due to timing issues"
