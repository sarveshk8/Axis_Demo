package DemoTesting.Flipkart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObject.demoflip;



public class TestFlip extends BaseConfig{
	
	public demoflip demoflipobj;
	
	WebDriver driver;
	
	@BeforeClass
	public void setup(){

        driver = getDemoDriver();
        demoflipobj = new demoflip(driver);
}
	
	@Test
    public void Scenario() throws InterruptedException{
        
	demoflipobj.flipkart();	
	

    }
	
	
}
