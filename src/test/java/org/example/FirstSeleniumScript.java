package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FirstSeleniumScript {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","A:\\Axis\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.name("email")).sendKeys("astevey8@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Sarveshbk@8");
        driver.findElement(By.name("login")).click();


    }

}
