package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoflip {
	
	WebDriver driver;
    public demoflip(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

}
    
    @FindBy(xpath = "//button[text()='✕']")
    WebElement closepopup;

    @FindBy(xpath = "(//img[@class=\"_396cs4\"])[2]")
    WebElement mobile;

    @FindBy(xpath = "//div[text()='SAMSUNG']")
    WebElement samsung;

    @FindBy(xpath = "//div[text()='APPLE']")
    WebElement apple;

    @FindBy(xpath = "//div[text()='realme']")
    WebElement realme;
    
    @FindBy(xpath = "//div[@class=\"_3ztiZO\"][1]")
    WebElement removeapp;
    
    @FindBy(xpath = "//div[@class=\"_3ztiZO\"][1]")
    WebElement removesam;
    
    @FindBy(xpath = "//div[@class=\"_3ztiZO\"][1]")
    WebElement removereal;
    
    public void flipkart() throws InterruptedException {
    	
    	closepopup.click();
    	mobile.click();
    	samsung.click();
    	Thread.sleep(2000);
    	apple.click();
    	Thread.sleep(2000);
    	realme.click();
    	removeapp.click();
    	Thread.sleep(2000);
    	removesam.click();
    	Thread.sleep(2000);
    	removereal.click();
    	
    	
    	
    	
    }
    
    
}

