package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","A:\\Axis\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
//        driver.findElement(By.id("nav-search-submit-button")).click();
//        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

//        String parent = driver.getWindowHandle();
//        System.out.println(parent);

//        Set<String> windowID = driver.getWindowHandles();
//        Iterator<String> it = windowID.iterator();

//        while(it.hasNext()){
//
//            String child = it.next();
//            if (!parent.equals(child)){
//                driver.switchTo().window(child);
//            }
//        }
//
//        driver.findElement(By.id("buy-now-button")).click();

        System.out.println(driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).isDisplayed());
        driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[text()='Mobiles, Computers']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='/gp/browse.html?node=1389401031&ref_=nav_em_sbc_mobcomp_all_mobiles_0_2_8_2']")).click();
        System.out.println(driver.findElement(By.xpath("//a[@href='/b/?_encoding=UTF8&node=1389401031&ref_=sv_top_elec_mega_1']")).isDisplayed());
        driver.close();



    }
}
