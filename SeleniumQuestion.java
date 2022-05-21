Selenium Question:

1) What is Selenium? What are the different Selenium components? Explain about Selenium Webdriver.
   * Selenium is the free automated testing framework used to validate web application across different browsers and platform.
   * We can use the multiple programming languages like Java,C#,python,etc to create selenium test scripts.
   Selenium software tools:
     1.Selenium integrated development environment(IDE)
     2.Selenium remote control(RC)
     3.WebDriver
     4.Selenium Grid.

2) How does Selenium communicate with the Web browsers?
   * To communicate between server and client (browser), selenium web driver uses JSON. 
   * JSON Wire Protocol is a REST API that transfers the information between HTTP servers. 
   * Each Browser Driver has its own HTTP server.


3.What are the locators available  to find an element using Selenium?
   By CSS ID:Find the elememt by id
   By CSS classname:Find the element by classname
   By name attribute:Find the element by name
   By DOM structure or Xpath:Find the element by xpath
   By link text:Find the element by link text
   By partial link text:Find the element by partial link text
   By HTML tag name:Find the element by tag name.

4. Why ID is preferable than X-Path?
   * ID is considerable is as the unique key no element can be created with the same id.
   * While the Xpath is created using the relative path/position of the element.So we can get two or more element on the Xpath.

5.How to select value in dropdown?
   * selectByVisibleText(string args)
   * selectByValue(string args)
   * selectByIndex(string args)
   Example:
      WebElement date =driver.findElement(By.id("day"));
      Select dd1=new Select(date);
      dd1.selectByValue("23");

6) What is the difference between Absolute Path and Relative Path?
    Absolute XPath:
      It specifies the location from the root directory.
    Relative Xpath:
      It is related to the current directory.

7) How to verify if the given check box is checked or not (it is not taught but you can explore) Try here: http://leafground.com/pages/checkbox.html
    We can verify the checbox by using isSelected() method over the checkbox.
    isSelected() method returns the boolean values .

8)Difference between System.setProperty and WebDriverManager
    WebDriverManager is an API that allows user to automate handling the drivers of executable like chromedriver.
    WebDriverManager.chromedriver().setup();
    It check the version of the driver and browser.
    System.setProperty method is used to set the path.
    System.setProperty();

9) Write the syntax for preceding and following x-paths.
   Elder cousin xpath//following::Younger cousin tagname[index]
   Younger cousing xpath//preceding::tagname

10) How to get an attribute value using Selenium WebDriver?
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
