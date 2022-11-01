//Java program to see output of product name in the console
//A package in Java is used to group related classes.
package org.example;
//importing a package of selenium
import org.openqa.selenium.By;
//importing a package of selenium WbDriver
import org.openqa.selenium.WebDriver;
//importing a package of ChromeDriver
import org.openqa.selenium.chrome.ChromeDriver;

public class Products {
    //importing selenium web driver interface using Maven dependency to perform automation task
    protected static WebDriver driver;

    public static void main(String[] args) {

        //.setProperty command is used for sets the property of the system which is indicated by a key
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");
        // To communicate test scripts with Google Chrome
        driver = new ChromeDriver();
        // To maximize the browser
        driver.manage().window().maximize();
        //.get() method is used to open URL and it will wait till the whole page gets loaded
        driver.get("https://demo.nopcommerce.com/");
        //findElement command is used to uniquely identify a web element within the web page
        /*.xpath function for(computers) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.click() command works to simulate user click
        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).click();
        //findElement command is used to uniquely identify a web element within the web page
        /*.xpath function for(Show products in category Desktops) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.click() command works to simulate user click
        driver.findElement(By.xpath("//h2[@class=\"title\"]//a[@title=\"Show products in category Desktops\"]")).click();

        //findElement command is used to uniquely identify a web element within the web page
        /*.xpath function for(build-your-own-computer) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg is local variable to store the find element through .getText command
        String regMsg = driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/build-your-own-computer\"]")).getText();
        //findElement command is used to uniquely identify a web element within the web page
        /*.xpath function for(digital-storm-vanquish-3-custom-performance-pc) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg1 is local variable to store the find element through .getText command
        String regMs1 = driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/digital-storm-vanquish-3-custom-performance-pc\"]")).getText();
        //findElement command is used to uniquely identify a web element within the web page
        /*.xpath function for(lenovo-ideacentre-600-all-in-one-pc) is a built-in function of selenium webdriver which is used to locate
        elements based on text of a web element.*/
        //.getText() command is used for helps retrieve the text for a specific web element
        //regMsg2 is local variable to store the find element through .getText command
        String regMsg2 = driver.findElement(By.xpath("//h2[@class=\"product-title\"]//a[@href=\"/lenovo-ideacentre-600-all-in-one-pc\"]")).getText();

        //Printing output space
        System.out.println();
        //Printing output for regMsg
        System.out.println(regMsg);
        //Printing output for regMsg1
        System.out.println(regMs1);
        //Printing output for regMsg2
        System.out.println(regMsg2);


        //The driver. quit() is used to quit the whole browser session along with all the associated browser windows, tabs and pop-ups.
        driver.quit();



    }

}
