package DemoTesting.Flipkart;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PageObject.demoflip;

public class TestGrid1 extends BaseConfigGrid{
	
	demoflip demoflipobj;
	
	WebDriver driver;
	@Parameters({"Port"})
	@BeforeMethod
	public void initializeSetup(String Port) throws MalformedURLException {
		driver = setup(Port);
		demoflipobj = new demoflip(driver);
	}
	
	@Test
	public void test1() throws InterruptedException {
		
		demoflipobj.flipkart();
		
	}

}
