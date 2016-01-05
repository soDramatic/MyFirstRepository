package com.org.ziolek;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class WykopPostTest {

	String login = "nickname123";
	String password = "passWORD007";
	private static WebDriver driver;
	private static final String LOGIN_TEXTBOX = "//input[@id='text1']";
	private static final String PASSWORD_TEXTBOX = "//input[@id='text2']";
	private static final String LOGIN_BUTTON = "//input[@class='submit']";
	private static final String AVATAR = "//img[@class='avatar']";
	private static final String ERROR_LOGIN_MESSAGE = "//div[@class='wblock']";
	private static final String LOGOUT_BUTTON = "//li/a/span[contains(text(),'wyloguj')]";
	private static final String HEADS = "//ul[@id='itemsStream']/li/div/div[3]/h2/a";
	private static final String PLUS = "//i[contains(@class,'fa-plus')]";

	@FindBy(xpath = LOGIN_TEXTBOX)
	private WebElement loginTextbox;

	@FindBy(xpath = PASSWORD_TEXTBOX)
	private WebElement passwordTextbox;

	@FindBy(xpath = LOGIN_BUTTON)
	private WebElement loginButton;

	@FindBy(xpath = AVATAR)
	private static WebElement avatarMenu;

	@FindBy(xpath = ERROR_LOGIN_MESSAGE)
	private WebElement errorLabel;

	@FindBy(xpath = LOGOUT_BUTTON)
	private static WebElement logoutButton;

	@FindBy(xpath = HEADS)
	private WebElement heads;

	@FindBy(xpath = PLUS)
	private WebElement plus;

	@BeforeClass
	public static void setUpBeforeClass() {
		// System.setProperty("webdriver.chrome.driver",
		// "E:\\Programowanie\\Projekty_Java\\chromedriver.exe");
		driver = new FirefoxDriver();
		// driver = new ChromeDriver();
		driver.get("http://www.wykop.pl/zaloguj");
	}

	@Before
	public void setUp() {
		driver.manage().window().maximize();
		loginTextbox = driver.findElement(By.xpath(LOGIN_TEXTBOX));
		passwordTextbox = driver.findElement(By.xpath(PASSWORD_TEXTBOX));
		loginButton = driver.findElement(By.xpath(LOGIN_BUTTON));

		loginTextbox.sendKeys(login);
		passwordTextbox.sendKeys(password);
		loginButton.click();
	}

	@Test
	@Ignore
	public void enterRandomPostInMainPageTest() throws InterruptedException {

		List<WebElement> listOfTitles = new ArrayList<WebElement>();
		List<WebElement> list = new ArrayList<WebElement>();

		// Zapisanie nagłówków do listy, wylosowanie jednego i przejście do
		// nagłówka
		listOfTitles = driver.findElements(By.xpath(HEADS));
		for (WebElement webElement : listOfTitles) {
			System.out.println(webElement.getText());
		}
		Thread.sleep(1000);

		Random random = new Random();
		int wylosowana = random.nextInt(listOfTitles.size());
		WebElement index = listOfTitles.get(wylosowana);
		System.out.println(index.getText());

		Thread.sleep(2000);
		driver.get(index.getAttribute("href"));

		// Zapisanie plusów z komentarzy do listy, oraz wylosowanie jednego

		list = driver.findElements(By.xpath(PLUS));
		for (WebElement webElement : list) {
			webElement.click();
		}

		int wylosowana1 = random.nextInt(list.size());
		WebElement index1 = list.get(wylosowana1);
		list.get(1).click();
		driver.get(index1.getAttribute("href"));
		index1.click();
		System.out.println(wylosowana1);
	}

	@Test
	@Ignore
	public void enterFirstPostInMainPageAndPlusFirstComment() throws InterruptedException {

		List<WebElement> listOfTitles = driver.findElements(By.xpath(HEADS));

		Thread.sleep(2000);
		listOfTitles.get(0).click();

		Actions actions = new Actions(driver);
		// actions.keyDown(Keys.PAGE_DOWN);
		// actions.click(plusButton);
		plus = driver.findElement(By.xpath(PLUS));
		plus.click();

	}

	@Test
	@Ignore
	public void enterRandomPostInMainPageAndPlusFirstComment() {
		// klikanie w losowy nagłówek + pierwszy plus

		List<WebElement> listOfTitles = new ArrayList<WebElement>();

		listOfTitles = driver.findElements(By.xpath(HEADS));
		Random random = new Random();
		int wylosowana = random.nextInt(listOfTitles.size());
		WebElement element = listOfTitles.get(wylosowana);
		element.click();
	}

	@Test
	@Ignore
	public void enterRandomPostInMainPageAndPlusRandomComment() {
		// klikanie w losowy nagłówek + losowy plus

	}

	@AfterClass
	public static void tearDown() throws InterruptedException {

		// avatarMenu = driver.findElement(By.xpath(AVATAR));
		//
		// logoutButton = driver.findElement(By.xpath(LOGOUT_BUTTON));
		//
		// Actions builder = new Actions(driver);
		// Actions hoverOverRegistrar = builder.moveToElement(avatarMenu);
		// hoverOverRegistrar.perform();
		// Utils.waitForElement(driver, LOGOUT_BUTTON);
		//
		// logoutButton.click();
		//
		// driver.close();
		// driver.quit();
//		System.out.println("@AfterClass");
	}

}
