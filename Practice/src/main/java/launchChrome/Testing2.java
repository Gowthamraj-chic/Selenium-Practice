package launchChrome;

import org.openqa.selenium.chrome.ChromeDriver;

public class Testing2 
{
public static void main(String []args)
{
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
}
}
