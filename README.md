Tools and Technoligies Used:

1. RestAssured: is a Java library used for testing RESTful web services. It simplifies the process of sending HTTP requests and validating responses.
2. Java version 11.0.16.1: The programming language used to write the Selenium automation scripts and logic.
3. Maven version 3.9.0: A build automation tool that manages project dependencies and automates the build and testing processes.
4. TestNG: A testing framework used for managing test execution, configurations.
5. POJO class: A POJO is a simple Java object that follows basic conventions, typically used to model data.
6. Allure Reporting: A reporting tool that generates visually appealing, detailed HTML test execution reports.


Steps For Run:
1. Clone the repo
2. Open the project on Intellij
3. Put your test data in src/main/resources/(.json file)
4. Run your tests from src/test/java/(Your test) or Use command (mvn clean test)
5. Run allure report using command (allure.bat serve .\allure-results\)

Note:
You can find a demo video in /DemoVideo directory.
