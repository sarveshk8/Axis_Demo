package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class amazonmouseover {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","A:\\Axis\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        Actions act = new Actions(driver);
        WebElement account = driver.findElement(By.xpath("//*[text()='Account & Lists']"));
        WebElement youracc = driver.findElement(By.xpath("//span[text()='Your Account']"));

        act.moveToElement(account).contextClick(youracc).build().perform();


    }
}
