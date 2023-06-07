package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class guru99 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","A:\\Axis\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //radio button
        driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();

        //checkbox
        driver.findElement(By.xpath("//input[@value='checkbox1']")).click();

    }

}
