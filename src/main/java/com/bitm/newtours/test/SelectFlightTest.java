package com.bitm.newtours.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.newtours.utils.DriverManager;
import com.bitm.newtours.utils.UrlTextUtils;
import com.bitm.newtours.utils.XpathUtils;

public class SelectFlightTest {

	private WebDriver driver = null;

	@Test(priority = 1)
	public void checkSelectFlightPageTitle() throws InterruptedException {

		driver = DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.SelectFlight.RADIO_DEPART)));
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.SELECT_FLIGHT_PAGE_TITLE);

		System.out.println("Select Page Title Verified !!!");
	}

	@Test(priority = 2)
	public void checkSelectFlight() throws InterruptedException {
		driver.findElement(By.xpath(XpathUtils.SelectFlight.RADIO_DEPART)).click();
		driver.findElement(By.xpath(XpathUtils.SelectFlight.RADIO_RETURN)).click();
		driver.findElement(By.xpath(XpathUtils.SelectFlight.BUTTON_CONTINUE)).click();

		System.out.println("Successfully Selected Flights !!");
	}
}
