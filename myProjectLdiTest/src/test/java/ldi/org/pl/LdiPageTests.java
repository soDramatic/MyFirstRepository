package ldi.org.pl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LdiPageTests {

	private static WebDriver driver;
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

	@BeforeClass
	public static void setUpBeforeClass() {
		driver = new FirefoxDriver();
		driver.get("http://ldi.org.pl/");
	}

	@Before
	public void setUp() {
		driver.manage().window().maximize();
	}

	@Test
	public void loginTest() throws InterruptedException {
		// WebElement element = (new WebDriverWait(driver, 5))
		// .until(ExpectedConditions.elementToBeClickable(loginPage.getPopupLoginButton()));
		// element.click();
		assertTrue("PopupLoginButton is not displayed", loginPage.getPopupLoginButton().isDisplayed());
		loginPage.getPopupLoginButton().click();
		
		Utils.wait(2000);
		loginPage.setLoginTextbox("ziolkowski.marcin@windowslive.com");
		assertEquals("Incorrect login!","ziolkowski.marcin@windowslive.com", loginPage.getLoginTextbox().getAttribute("value"));
		
		loginPage.setPasswordTexbox("a2575263952c2a2");
		assertEquals("Incorrect password!", "a2575263952c2a2", loginPage.getPasswordTextbox().getAttribute("value"));
		
		assertTrue("LoginButton is not displayed", loginPage.getLoginButton().isDisplayed());
		loginPage.getLoginButton().click();  
	}

	@After
	public void tearDown() {
		// driver.quit();
	}
}