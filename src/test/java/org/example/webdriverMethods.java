package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","A:\\Axis\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();

        //URL
        System.out.println(driver.getCurrentUrl());

        //TITLE
        System.out.println(driver.getTitle());

        //ISDISPLAYED
        System.out.println(driver.findElement(By.xpath("//input[@id='vfb-7-1']")).isDisplayed());


    }
}
