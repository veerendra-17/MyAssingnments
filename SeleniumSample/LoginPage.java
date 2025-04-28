package SeleniumSample;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{

	public static void main(String[] args) 
	{
		// Open browser and launch loginpage
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

	}

}
