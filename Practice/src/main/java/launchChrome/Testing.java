package launchChrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testing 
{
public static void main(String [] args)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gowtham\\Desktop\\chromedriver-win64/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
}
}
