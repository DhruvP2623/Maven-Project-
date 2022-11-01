//Java program to print News Comments is successfully added message in console
//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium
import org.openqa.selenium.By;
//importing a package of selenium WbDriver
import org.openqa.selenium.WebDriver;
//importing a package of ChromeDriver
import org.openqa.selenium.chrome.ChromeDriver;

public class NewComments {
    //importing selenium web driver interface using Maven dependency to perform automation task
    protected static WebDriver driver;

    public static void main(String[] args) {

        //.setProperty command is used for sets the property of the system which is indicated by a key
        System.setProperty("webdriver.chrome.driver", "src/test/java/Drivers/chromedriver.exe");
        // To communicate test scripts with Google Chrome
        driver = new ChromeDriver();
        // To maximize the browser
        driver.manage().window().maximize();
        //.get() method is used to open URL and it will wait till the whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");
        //findElement command is used to uniquely identify a web element within the web page
        //By.className for(read-more) Initializes a new instance of the By class.
        //.click() command works to simulate user click
        driver.findElement(By.className("read-more")).click();
        //findElement command is used to uniquely identify a web element within the web page
        //By.id for(AddNewComment_CommentTitle) locate a particular web element using the value of its id attribute.
        /*.sendKeys for(Books) is a method in a selenium that allows QAs to type content automatically
        into an editable field while executing any tests for form */
        driver.findElement(By.id("AddNewComment_CommentTitle")).sendKeys("Books");
        //findElement command is used to uniquely identify a web element within the web page
        //By.id for(AddNewComment_CommentText) locate a particular web element using the value of its id attribute.
        /*.sendKeys for(good news it was) is a method in a selenium that allows QAs to type content automatically
        into an editable field while executing any tests for form */
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("good news it was");
        //findElement command is used to uniquely identify a web element within the web page
        //By.className for(buttons) Initializes a new instance of the By class.
        //.click() command works to simulate user click
        driver.findElement(By.className("buttons")).click();

        //findElement command is used to uniquely identify a web element within the web page
        //By.className for(result) Initializes a new instance of the By class.
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg is local variable to store the find element through .getText command
        String regMsg = driver.findElement(By.className("result")).getText();
        //Printing output space
        System.out.println();
        //Printing output for regMsg
        System.out.println(regMsg);

        //The driver. quit() is used to quit the whole browser session along with all the associated browser windows, tabs and pop-ups.
        driver.quit();





    }
}
