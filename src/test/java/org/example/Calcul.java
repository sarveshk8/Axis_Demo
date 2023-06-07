package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Calcul {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","A:\\Axis\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.calculator.net/calorie-calculator.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.linkText("BMR")).click();
        driver.findElement(By.partialLinkText("Conception")).click();
        driver.findElement(By.linkText("Macro")).click();
        driver.findElement(By.linkText("Metric Units")).click();
        driver.findElement(By.id("cage")).clear();
        driver.findElement(By.id("cage")).sendKeys("23");
        driver.findElement(By.xpath("(//span[@class='rbmark'])[1]")).click();
        driver.findElement(By.id("cheightmeter")).clear();
        driver.findElement(By.id("cheightmeter")).sendKeys("180");
        driver.findElement(By.id("ckg")).clear();
        driver.findElement(By.id("ckg")).sendKeys("55");

        Select activity = new Select(driver.findElement(By.id("cactivity")));
        activity.selectByValue("1.55");

        Select goal = new Select(driver.findElement(By.id("cgoal")));
        goal.selectByValue("g1");

        driver.findElement(By.xpath("//input[@type='image']")).click();




    }
}
