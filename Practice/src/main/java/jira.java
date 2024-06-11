import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class jira {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://webomates.atlassian.net/");
		driver.manage().window().maximize();
		//driver.findElementByXPath("//input[@id=\"username\"]").sendKeys("webo@gmai.com");
		driver.findElementByXPath("//span[text()='Continue']").click();
		
		
	}

}
