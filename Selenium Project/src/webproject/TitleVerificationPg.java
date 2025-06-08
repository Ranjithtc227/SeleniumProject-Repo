package webproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerificationPg {
    ChromeDriver driver;
    
	@Before
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void titleVerification()
	{
		String actualTitle=driver.getTitle();
		System.out.println("Title="+actualTitle);
		
	 	String exp="Facebook";
		
		if(exp.equals(actualTitle))
		{
			System.out.println("Title are same");
		}
		else
		{
			System.out.println("Not same");
		}
	}
		@After
		public void tearDown()
		{
			driver.quit();
		}
	}

