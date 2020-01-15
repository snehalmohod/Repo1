package com.model;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridMavenDemo {

	public WebDriver driver;
	@Parameters({"browser"})
	@BeforeTest
	public void openBrowser(String browsernm) throws MalformedURLException
	{
		if(browsernm.equalsIgnoreCase("chrome"))
		{
			System.out.println("In chrome Browser");
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WIN10);
			
			System.setProperty("webdriver.chrome.driver", "E:\\24112019\\Seleniumgriddata\\chromedriver.exe");
			//String node="http://192.168.43.52:9890/wd/hub";
			//driver=new RemoteWebDriver(new URL(node),cap);
			//no need to write hub url here....only you have to up the hub on cmd.//its absolutely correct
			String nodec="http://192.168.43.52:9898/wd/hub";
			
			driver=new RemoteWebDriver(new URL(nodec),cap);
		     
			driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		}
		else if(browsernm.equalsIgnoreCase("ie"))
		{
			System.out.println("In IE browser");
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setBrowserName("ie");
			cap.setPlatform(Platform.WIN10);
			
			System.setProperty("webdriver.ie.driver", "E:\\24112019\\Seleniumgriddata\\IEDriverServer.exe");
		              String nodeE="http://192.168.43.52:9897/wd/hub";
		              driver=new RemoteWebDriver(new URL(nodeE), cap);
		      		driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		//wd--means webdriver
		}
		else
		{
			System.out.println("In Firefox browser");
			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WIN10);
			
			System.setProperty("webdriver.gecko.driver", "E:\\24112019\\Seleniumgriddata\\geckodriver.exe");
		                     // String hubnode="http://192.168.43.52:9890/wd/hub";
		                      String node="http://192.168.43.52:9891/wd/hub";
		                      //driver=new RemoteWebDriver(new URL(hubnode), cap);
		                      driver=new RemoteWebDriver(new URL(node), cap);
		                      
		              		driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		}
	}
	@Test
	public void enterUrl()
	{
     driver.manage().window().maximize();
     driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Snehalp1");
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword1");
     driver.findElement(By.xpath("//input[@name='login']")).click();
	}
	
	
	
	

}
