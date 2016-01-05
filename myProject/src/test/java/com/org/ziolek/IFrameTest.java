package com.org.ziolek;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IFrameTest {

	private static WebDriver driver;
	private static final String IFRAME_MENU = "//iframe[contains(@src,'http://www.umich.edu')]";
	private static final String MENU = "//div//h3";
	private static final String HOME = "//div[contains(@id,'secondnav')]//ul[contains(@class, 'clear')]//li[1]//a";
	private static final String ABOUT = "//div[contains(@id,'secondnav')]//ul[contains(@class, 'clear')]//li[2]//a";
	private static final String INITIATIVES = "//div[contains(@id,'secondnav')]//ul[contains(@class, 'clear')]//li[8]//a";
	private static final String ARTS = "//i[contains(@class,'fa-arrow-circle-right')]";

	@FindBy(xpath = MENU)
	private WebElement menu;

	@FindBy(xpath = HOME)
	private WebElement home;

	@FindBy(xpath = ABOUT)
	private WebElement about;

	@FindBy(xpath = INITIATIVES)
	private WebElement initiatives;

	@FindBy(xpath = ARTS)
	private WebElement arts;

	@BeforeClass
	public static void setUpBeforeClass() {
		driver = new FirefoxDriver();
		driver.get("http://sitemaker.umich.edu/iframe.example/the__iframe__lives_here");
	}

	@Before
	public void setUp() {
		driver.manage().window().maximize();
		
	}

	@Test
	@Ignore
	public void enterFirstElementMenu() throws InterruptedException {

		Thread.sleep(20000);
		driver.switchTo().frame(0);
		menu = driver.findElement(By.xpath(MENU));
		menu.click();

		// Thread.sleep(2000);
		// home = driver.findElement(By.xpath(HOME));
		// home.click();

		// Thread.sleep(2000);
		// about = driver.findElement(By.xpath(ABOUT));
		// about.click();

		Thread.sleep(2000);
		initiatives = driver.findElement(By.xpath(INITIATIVES));
		initiatives.click();
		

		Thread.sleep(2000);
		arts = driver.findElement(By.xpath(ARTS));
		arts.click();

	}

	@After
	public void tearDown() {
		System.out.println("@AfterClass");
	}

}