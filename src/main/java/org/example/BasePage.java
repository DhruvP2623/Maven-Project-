//Java program to see the registration page by filling all details for the user
//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium
import org.openqa.selenium.By;
//importing a package of selenium WbDriver
import org.openqa.selenium.WebDriver;
//importing a package of ChromeDriver
import org.openqa.selenium.chrome.ChromeDriver;
//It allows for formatting (date -> text), parsing (text -> date), and normalization.
import java.text.SimpleDateFormat;

public class BasePage {
    //importing selenium web driver interface using Maven dependency to perform automation task
    protected static WebDriver driver;

    public static void main(String[] args) {
        //.setProperty command is used for sets the property of the system which is indicated by a key
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        // To communicate test scripts with Google Chrome
       driver = new ChromeDriver();
       //set the path of the driver for the chrome Browser
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
        //Printing Output for timeStamp
        System.out.println(timeStamp);

        // To maximize the browser
        driver.manage().window().maximize();
        //.get() method is used to open URL and it will wait till the whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");
        //findElement command is used to uniquely identify a web element within the web page
        //By.className for(ico-register) Initializes a new instance of the By class.
        //.click() command works to simulate user click
        driver.findElement(By.className("ico-register")).click();
        //findElement command is used to uniquely identify a web element within the web page
        //By.id for(FirstName) locate a particular web element using the value of its id attribute.
        /*.sendKeys for(Rajesh) is a method in a selenium that allows QAs to type content automatically
        into an editable field while executing any tests for form */
        driver.findElement(By.id("FirstName")).sendKeys("Rajesh");
        //findElement command is used to uniquely identify a web element within the web page
        //By.id for(LastName) locate a particular web element using the value of its id attribute.
        /*.sendKeys for(Patel) is a method in a selenium that allows QAs to type content automatically
        into an editable field while executing any tests for form */
        driver.findElement(By.id("LastName")).sendKeys("Patel");
        //findElement command is used to uniquely identify a web element within the web page
        //By.id for(Email) locate a particular web element using the value of its id attribute.
        /*.sendKeys for(Rajesh@gmail.com) is a method in a selenium that allows QAs to type content automatically
        into an editable field while executing any tests for form */
        driver.findElement(By.id("Email")).sendKeys("Rajesh"+timeStamp+"@gmail.com");
        //findElement command is used to uniquely identify a web element within the web page
        //By.id for(Password) locate a particular web element using the value of its id attribute.
        /*.sendKeys for(rajesh) is a method in a selenium that allows QAs to type content automatically
        into an editable field while executing any tests for form */
        driver.findElement(By.id("Password")).sendKeys("rajesh");
        //findElement command is used to uniquely identify a web element within the web page
        //By.id for(ConfirmPassword) locate a particular web element using the value of its id attribute.
        /*.sendKeys for(rajesh) is a method in a selenium that allows QAs to type content automatically
        into an editable field while executing any tests for form */
        driver.findElement(By.id("ConfirmPassword")).sendKeys("rajesh");
        //findElement command is used to uniquely identify a web element within the web page
        //By.id for(register-button) locate a particular web element using the value of its id attribute.
        //.click() command works to simulate user click
        driver.findElement(By.id("register-button")).click();

        //findElement command is used to uniquely identify a web element within the web page
        //By.className for(result) Initializes a new instance of the By class.
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg is local variable to store the find element through .getText command
        String regMsg = driver.findElement(By.className("result")).getText();
        //Printing output for regMsg
        System.out.println(regMsg);

        //The driver. quit() is used to quit the whole browser session along with all the associated browser windows, tabs and pop-ups.
        driver.quit();

    }


}
