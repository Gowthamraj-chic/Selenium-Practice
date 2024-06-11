package launchChrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Gowtham\\\\Desktop\\\\chromedriver-win64/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://letcode.in/");
	driver.findElementByLinkText("Log in").click();;
	driver.findElementByName("email").sendKeys("admin@gmail.com");;
	driver.findElementByName("password").sendKeys("password@12");;
	driver.findElementByXPath("//button[.=\"LOGIN\"]").click();;


	}

}
