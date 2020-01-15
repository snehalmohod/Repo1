package com.model;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {
public static void main(String[] args) throws MalformedURLException {
	//define DesiredCapabilities
	DesiredCapabilities cap=new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WIN10);
//define ChromeOptions
	ChromeOptions option=new ChromeOptions();
	//option.merge(cap);
	String hburl="http://192.168.43.52:9851/wd/hub";
	WebDriver driver=new RemoteWebDriver(new URL(hburl),cap);
	driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Snehalp1");
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("P@ssword1");
    driver.findElement(By.xpath("//input[@name='login']")).click();
	
}
}
