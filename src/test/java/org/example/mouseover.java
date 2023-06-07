package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class mouseover {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","A:\\Axis\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.id("fourth"))).dragAndDrop(driver.findElement(By.id("fourth")),driver.findElement(By.id("amt8"))).build().perform();



    }
}
