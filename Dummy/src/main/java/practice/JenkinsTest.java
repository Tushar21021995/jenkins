package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsTest 
{
	@Test
	public void JenkinsTest() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis = new FileInputStream("./data/CommonProperty.properties");
		Properties prob = new Properties();
		prob.load(fis);
		String Url = prob.getProperty("url");
		driver.get(Url);
		System.out.println("Welcome to jenkins");
		System.out.println("Dummy Project");
		System.out.println("welcome ");
		
	}
}

