package com.org.ziolek;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	public static void waitForElement(WebDriver driver, String element) {
		WebDriverWait wait = new WebDriverWait(driver, 6000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
	}

}
