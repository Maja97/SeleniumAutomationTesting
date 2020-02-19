# Selenium Automation Testing

[![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://lbesson.mit-license.org/)
[![Generic badge](https://img.shields.io/badge/version-master-<COLOR>.svg)](https://shields.io/)

This project was made for the purpose of testing a website's functionality with the Selenium framework as a part of a college course. 

---
## Getting started

In order to run the tests, you need to have the following:
- [InteliJ](https://www.jetbrains.com/idea/download/#section=windows)
- [Java JDK](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html)

After installing the neccessary programs, clone this repository on your computer with the 
`git clone https://github.com/Maja97/SeleniumAutomationTesting.git` command

---
## Tools used

This project uses cross browser testing, WebDriverManager, POM (Page Object Model), Screenshots, PageFactory, Wait, Assert...

### Page Object Model
---
- a design pattern which is commonly used in Selenium for Automating the Test Cases. It acts as an interface for the page of your Application. While Automating the test cases, we create the object of Page Classes and interact with web elements by calling the methods of these classes in the tests.

Advantages: 
1. code is clean and easy to understand by keeping tests and element locators separated
2. makes test automation framework programmer friendly, more durable and comprehensive
3. Page Object Repository is Independent from Automation Tests
4. test cases are short and optimized as we are able to reuse page object methods in the POM classes
5. any change in UI can easily be implemented, updated and maintained into the Page Objects and Classes

### Screenshot
---
A screenshot is taken after a failed test and it can be found in the D:\Selenium logs\ file. If you wish to change the screenshot folder, go to the **Screenshot** class in IntelliJ and change it based on your preferences.

### WebDriverManager and cross browser testing
In order to make things easier, WebDriverManager is used to automate the management of the binary drivers (e.g. chromedriver, geckodriver, etc.) required by Selenium WebDriver.
The browser selected for this project is Chrome, but if you want to test on another browser, you can simply change the driver type of the **BaseClass** in the *initalize()* method. 
After you select the browser, you can run the tests.

## Tests 

| Class name| Description|
| ----------|:----------:|
| RegisterTest| This test uses a permanent mail copied from another website, along with other required information in order to register a new user to the website|
| LoginTest| This test is used to log in a user who already has an account in the website. The mail can be taken from a previously successful RegisterTest, i.e. the clipboard|
| ChangePasswordTest| This test uses a part of the LoginTest in the way that the user is logged in and then his password is changed.|
| NavigationAndFilterTest| The navigation and filter test is used to test searching for a category in a webshop using the drop-down list containing item categories and after selecting a category, filtering the items in order to find one specific item and adding it to the cart|
| SearchAndAddTest| This test is used to test the searchbox and choosing an item from a drop-down list after writing text in the searchbox. The test also contains adding the selected item to the card and proceeding to the cart or delivery option choice|
| ClearBasketTest| The test contains, as in a previously mentioned test, locating an item through the searchbox and adding it to the cart, but the main point of this test is to successfully delete the item from the cart|

## Running the tests

In order to run the tests, simply open the project in IntelliJ and navigate to **src > test > java > tests** and right-click the test you want to run and press **Run 'TestName'**.
If you want to run all the tests at the same time, right-click the testng.xml and press **Run**.

## License

This project is licensed under the MIT license.

## References

- [WebDriverManager](https://github.com/bonigarcia/webdrivermanager)
- [Page Object Model (POM) | Design Pattern](https://medium.com/tech-tajawal/page-object-model-pom-design-pattern-f9588630800b)
- [How to take Screenshots in Selenium?](https://www.browserstack.com/guide/take-screenshots-in-selenium)
- [Cross Browser Testing using Selenium WebDriver](https://www.guru99.com/cross-browser-testing-using-selenium.html)
