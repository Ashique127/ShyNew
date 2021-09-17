package com.hy.shy.stepdef;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hy.shy.utility.PropertiesFileReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefHomePagee {

	public static WebDriver driver;
	PropertiesFileReader obj = new PropertiesFileReader();

	@Given("^open chrome browser and enter url$")
	public void open_chrome_browser_and_enter_url() throws Throwable {
		Properties properties = obj.getProperty();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashique\\eclipse\\java-2021-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window();
		driver.manage().deleteAllCookies();
		driver.get(properties.getProperty("browser.baseURL"));
	}

	@Then("^enter serach criteria$")
	public void enter_serach_criteria() throws Throwable {
		driver.findElement(By.id("search")).sendKeys("selenium c# by bakkappa n");
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		driver.findElement(By.cssSelector("#search-icon-legacy")).click();
		driver.quit();

	}

}
