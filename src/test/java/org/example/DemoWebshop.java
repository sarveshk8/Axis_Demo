package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class DemoWebshop {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","A:\\Axis\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        System.out.println(driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//a[text()='Register']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//a[text()='Log in']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//span[text()='Shopping cart']")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//span[text()='Wishlist']")).isDisplayed());

        Actions act = new Actions(driver);
        WebElement comp = driver.findElement(By.xpath("//a[@href='/computers']"));
        WebElement desktop = driver.findElement(By.xpath("(//a[@href='/desktops'])[1]"));
        act.moveToElement(comp).click(desktop).build().perform();

        driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
        System.out.println(driver.findElement(By.id("add-to-cart-button-72")).isDisplayed());


    }
}
