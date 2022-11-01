//Java class to see the list of the all Categories which are mention on the HomePage it will print in console
//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium
import org.openqa.selenium.By;//Importing selenium.By package
//importing a package of selenium WbDriver
import org.openqa.selenium.WebDriver;
//importing a package of ChromeDriver
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageCategories {
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
        /*.xpath function for(computers) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg is local variable to store the find element through .getText command
        String regMsg = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).getText();
        //findElement command is used to uniquely identify a web element within the web page
        /*.xpath function for(electronics) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg1 is local variable to store the find element through .getText command
        String regMsg1 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/electronics\"]")).getText();
        //findElement command is used to uniquely identify a web element within the web page
        /*.xpath function for(apparel) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.getText() command is used for helps retrieve the text for a specific web element
        String regMsg2 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/apparel\"]")).getText();
        //findElement command is used to uniquely identify a web element within the web page
        /*.xpath function for(digital-downloads) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg3 is local variable to store the find element through .getText command
        String regMsg3 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/digital-downloads\"]")).getText();
        //findElement command is used to uniquely identify a web element within the web page
        /*.xpath function for(books) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg4 is local variable to store the find element through .getText command
        String regMsg4 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/books\"]")).getText();
        //findElement command is used to uniquely identify a web element within the web page
        /*.xpath function for(jewelry) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg5 is local variable to store the find element through .getText command
        String resMsg5 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/jewelry\"]")).getText();
        //findElement command is used to uniquely identify a web element within the web page
        /*.xpath function for(gift-cards) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg6 is local variable to store the find element through .getText command
        String resMsg6 = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/gift-cards\"]")).getText();

        //Printing output space
        System.out.println();
        //Printing output for regMsg
        System.out.println(regMsg);
        //Printing output for regMsg1
        System.out.println(regMsg1);
        //Printing output for regMsg2
        System.out.println(regMsg2);
        //Printing output for regMsg3
        System.out.println(regMsg3);
        //Printing output for regMsg4
        System.out.println(regMsg4);
        //Printing output for regMsg5
        System.out.println(resMsg5);
        //Printing output for regMsg6
        System.out.println(resMsg6);

        //The driver. quit() is used to quit the whole browser session along with all the associated browser windows, tabs and pop-ups.
        driver.quit();


    }
}