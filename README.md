# SauceDemo QA Automation Project (Serenity BDD + Cucumber + Allure)

This project demonstrates the automation of a complete purchasing flow in the SauceDemo application, utilizing the Screenplay pattern (Serenity BDD) and Java. It generates interactive reports using Allure Reports.

## Objective

The main objective is to verify the complete e-commerce flow (login, add to cart, and checkout), in addition to validating negative login scenarios.

## Technologies Used

* **Language:** Java
* **Framework:** Serenity BDD 3.x (Screenplay Pattern)
* **BDD:** Cucumber (Gherkin Syntax)
* **Dependency Manager:** Gradle
* **Reporting:** Allure Reports

## Prerequisites

To run this project locally, you need:

1.  **Java Development Kit (JDK):** Version 23.
2.  **Git:** To clone the repository.
3.  **Allure CLI:** (Command Line Interface tool) Must be globally installed and added to the Windows PATH for the `allure serve` command to work.

## Configuration and Installation

1.  **Clone the Repository:**
    ```bash
    git clone https://github.com/stephanyromeros/SauceDemo-QA-Challenge.git
    cd SauceDemo-QA-Challenge
    ```

2.  **Sync Gradle:** Open the project in your IDE (IntelliJ) so that Gradle can download all dependencies.

## Test Execution

To execute the complete flow and generate the interactive Allure report, follow these two commands in sequence from your terminal (CMD or PowerShell) in the project's root folder:

### Step 1: Execute Tests and Generate Results

This command executes all scenarios defined in the `.feature` files.

```bash
# Use the Gradle wrapper
.\gradlew clean test
```

Step 2: Generate and Visualize the Report
```bash
allure serve
