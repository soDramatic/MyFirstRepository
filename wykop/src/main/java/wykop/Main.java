package wykop;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	@Test
	
	public void main() {
	System.setProperty("webdriver.chrome.driver", "E:\\Programowanie\\Projekty_Java\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	driver.get("http:\\www.wp.pl");
			//driver.findElement(arg0)
	}

}
