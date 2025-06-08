package webproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScriptpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//driver.quit();
		//driver.close(); 
		String actualTitle=driver.getTitle();
		System.out.println("Title="+actualTitle);
		//Expected title=Facebook
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

} 
