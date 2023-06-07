package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

public class FridayAssign {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","A:\\Axis\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


        //Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();

        //add-to-cart
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();

        //click-on-cart
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        //remove-items
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bike-light']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']")).click();
        driver.findElement(By.xpath("//button[@id='remove-sauce-labs-onesie']")).click();
        driver.findElement(By.xpath("//button[@id='remove-test.allthethings()-t-shirt-(red)']")).click();

        //back_to_home
//        driver.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
          driver.navigate().back();

        //add-to-cart
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
        driver.findElement(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")).click();

        //cart
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();



        //scroll-down
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");



        //checkout
        driver.findElement(By.xpath("//button[text()='Checkout']")).click();


        //userdetails
        driver.findElement(By.id("first-name")).sendKeys("Sarvesh");
        driver.findElement(By.id("last-name")).sendKeys("Kulkarni");
        driver.findElement(By.name("postalCode")).sendKeys("413512");
        driver.findElement(By.name("continue")).click();


        //check_followingitems_ispresent
        System.out.println(driver.findElement(By.xpath("//*[text()='Checkout: Overview']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='QTY']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='Payment Information']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='SauceCard #31337']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='Shipping Information']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='Free Pony Express Delivery!']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='Price Total']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='Item total: $']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='129.94']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='Tax: $']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='10.40']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='Total: $']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='140.34']")).isDisplayed());


        //finish
        driver.findElement(By.xpath("//button[text()='Finish']")).click();

        //check_followingitems_ispresent
        System.out.println(driver.findElement(By.xpath("//*[text()='Thank you for your order!']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//button[text()='Back Home']")).isDisplayed());


    }
}
