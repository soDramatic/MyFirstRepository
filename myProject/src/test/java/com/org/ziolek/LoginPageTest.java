package com.org.ziolek;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.Button;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginPageTest {

	String login = "nickname123";
	String password = "passWORD007";
	private static WebDriver driver;
	private static final String LOGIN_TEXTBOX = "//input[@id='text1']";
	private static final String PASSWORD_TEXTBOX = "//input[@id='text2']";
	private static final String LOGIN_BUTTON = "//input[@class='submit']";
	private static final String LOGOUT_BUTTON = "//li/a/span[contains(text(),'wyloguj')]";
	private static final String AVATAR = "//img[@class='avatar']";
	private static final String ERROR_LOGIN_MESSAGE = "//div[@class='wblock']";

	@FindBy(xpath = LOGIN_TEXTBOX)
	private WebElement loginTextbox;

	@FindBy(xpath = PASSWORD_TEXTBOX)
	private WebElement passwordTextbox;

	@FindBy(xpath = LOGOUT_BUTTON)
	private static WebElement logoutButton;

	@FindBy(xpath = AVATAR)
	private static WebElement avatarMenu;

	@FindBy(xpath = LOGIN_BUTTON)
	private static WebElement loginButton;

	@FindBy(xpath = ERROR_LOGIN_MESSAGE)
	private static WebElement errorLabel;

	@BeforeClass
	public static void setUpBeforeClass() {
		System.setProperty("webdriver.chrome.driver", "E:\\Programowanie\\Projekty_Java\\chromedriver.exe");
		driver = new FirefoxDriver();
		// driver = new ChromeDriver();
		driver.get("http://www.wykop.pl/zaloguj");
		// System.out.println("@BeforeClass");
	}

	@Before
	public void setUp() {
		// driver.get("http://www.wykop.pl/zaloguj");
		System.out.println("@Before - Method: 'setUp'");
	}

	@Test
	@Ignore
	public void checkForEmptyLoginAndPassword() {

		System.out.println("Start method: 'checkForEmptyLoginAndPassword'");

		loginTextbox = driver.findElement(By.xpath(LOGIN_TEXTBOX));
		passwordTextbox = driver.findElement(By.xpath(PASSWORD_TEXTBOX));
		loginButton = driver.findElement(By.xpath(LOGIN_BUTTON));

		assertTrue("Login textBox is not displayed", loginTextbox.isDisplayed());
		assertTrue("Password textBox is not displayed", passwordTextbox.isDisplayed());
		assertTrue("Login button is not displayed.", loginButton.isDisplayed());

		loginButton.click();

		System.out.println("Method 'checkForEmptyLoginAndPassword' PASS");

	}

	@Test
	@Ignore
	public void checkForWrongLogin() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("Start method: 'checkForWrongLogin'");

		loginTextbox = driver.findElement(By.xpath(LOGIN_TEXTBOX));
		passwordTextbox = driver.findElement(By.xpath(PASSWORD_TEXTBOX));
		loginButton = driver.findElement(By.xpath(LOGIN_BUTTON));

		assertTrue("Login textBox is not displayed.", loginTextbox.isDisplayed());
		assertTrue("Password textBox is not displayed.", passwordTextbox.isDisplayed());
		assertTrue("Login button is not displayed", loginButton.isDisplayed());

		loginTextbox.sendKeys("Wrong_login");
		// assertEquals("Wrong login", login,
		// loginTextbox.getAttribute("value"));

		passwordTextbox.sendKeys(password);
		// assertEquals(password, passwordTextbox.getAttribute("value"));
		Thread.sleep(2000);

		loginButton.click();

		errorLabel = driver.findElement(By.xpath(ERROR_LOGIN_MESSAGE));

		Thread.sleep(2000);
		if (errorLabel.isDisplayed()) {
			System.out.println("Wrong login!");
		}

		System.out.println("Method: 'checkForValidation' PASS");
	}

	@Test
	@Ignore
	public void checkForWrongPassword() throws InterruptedException {

		System.out.println("Start method: 'checkForWrongPassword'");

		loginTextbox = driver.findElement(By.xpath(LOGIN_TEXTBOX));
		passwordTextbox = driver.findElement(By.xpath(PASSWORD_TEXTBOX));
		loginButton = driver.findElement(By.xpath(LOGIN_BUTTON));

		assertTrue("Login textBox is not displayed.", loginTextbox.isDisplayed());
		assertTrue("Password textBox is not displayed.", passwordTextbox.isDisplayed());
		assertTrue("Login button is not displayed", loginButton.isDisplayed());

		loginTextbox.sendKeys(login);
		assertEquals("Wrong login", login, loginTextbox.getAttribute("value"));

		passwordTextbox.sendKeys("Wrong_password");
		// assertEquals("Wrong password", "wrong_pass",
		// passwordTextbox.getAttribute("value"));

		loginButton.click();
		assertTrue("Login button is not displayed.", loginButton.isDisplayed());
		errorLabel = driver.findElement(By.xpath(ERROR_LOGIN_MESSAGE));

		Thread.sleep(2000);

		if (errorLabel.isDisplayed()) {
			System.out.println("Worng password!");
		}

		System.out.println("Method: 'checkForWrongPassword' PASS");
	}

	@Test
	@Ignore
	public void checkForSpecialCharacters() throws InterruptedException {

		System.out.println("Start method: 'checkForValidation'");

		loginTextbox = driver.findElement(By.xpath(LOGIN_TEXTBOX));
		passwordTextbox = driver.findElement(By.xpath(PASSWORD_TEXTBOX));
		loginButton = driver.findElement(By.xpath(LOGIN_BUTTON));

		assertTrue("Login textBox is not displayed.", loginTextbox.isDisplayed());
		assertTrue("Password textBox is not displayed.", passwordTextbox.isDisplayed());
		assertTrue("Login button is not displayed.", loginButton.isDisplayed());

		loginTextbox.sendKeys("!@#$%^&*()");
		assertTrue("Login textBox is not enabled.", loginTextbox.isEnabled());

		passwordTextbox.sendKeys("!@#$%^&*()");
		assertTrue("Password textBox is not enabled.", passwordTextbox.isEnabled());
		// assertEquals("Password ", password,
		// passwordTextbox.getAttribute("value"));

		loginButton.click();

		Thread.sleep(3000);
		loginTextbox = driver.findElement(By.xpath(LOGIN_TEXTBOX));
		passwordTextbox = driver.findElement(By.xpath(PASSWORD_TEXTBOX));
		loginButton = driver.findElement(By.xpath(LOGIN_BUTTON));
		errorLabel = driver.findElement(By.xpath(ERROR_LOGIN_MESSAGE));

		assertTrue("Login textBox is not displayed.", loginTextbox.isDisplayed());
		assertTrue("Password textBox not is displayed.", passwordTextbox.isDisplayed());
		assertTrue("Login button is not displayed.", loginButton.isDisplayed());
		assertTrue("Error label is not displayed.", errorLabel.isDisplayed());

		System.out.println("Method: 'checkForValidation' PASS");
	}

	@Test
	@Ignore
	public void loginToAccount() throws InterruptedException {

		System.out.println("Start method: 'checkSubmit'");

		loginTextbox = driver.findElement(By.xpath(LOGIN_TEXTBOX));
		passwordTextbox = driver.findElement(By.xpath(PASSWORD_TEXTBOX));
		loginButton = driver.findElement(By.xpath(LOGIN_BUTTON));

		Thread.sleep(2000);

		loginTextbox.sendKeys("nickname123");
		passwordTextbox.sendKeys("passWORD007");

		assertTrue("Login button is not displayed.", loginButton.isDisplayed());
		// assertEquals("Wrong login", "nickname123", loginTextbox.getText());

		loginButton.click();
		System.out.println("Method: 'checkSubmit' PASS");
	}

	@AfterClass
	public static void tearDownAfterClass() throws InterruptedException {

		// Thread.sleep(1000);
		// avatarMenu = driver.findElement(By.xpath(AVATAR));
		// assertTrue("Avatar is not displayed.", avatarMenu.isDisplayed());
		//
		// logoutButton = driver.findElement(By.xpath(LOGOUT_BUTTON));
		//
		// Actions builder = new Actions(driver);
		// Actions hoverOverRegistrar = builder.moveToElement(avatarMenu);
		// hoverOverRegistrar.perform();
		// Utils.waitForElement(driver, LOGOUT_BUTTON);
		//
		// assertTrue("Logout button is not displayed.",
		// logoutButton.isDisplayed());
		// logoutButton.click();

		// driver.quit();
		System.out.println("@AfterClass");
	}
}
