package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","A:\\Axis\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByValue("ANTARCTICA");
        country.selectByIndex(19);
        country.selectByVisibleText("INDIA");


    }
}
