package com.bitm.newtours.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.newtours.dataprovider.BookFlightDataProvider;
import com.bitm.newtours.dto.BookFlight;
import com.bitm.newtours.utils.DriverManager;
import com.bitm.newtours.utils.UrlTextUtils;
import com.bitm.newtours.utils.XpathUtils;

public class BookFlightTest {
	private WebDriver driver = null;
	
	@Test(priority=1)
	public void checkBookFlightPageTitle() throws InterruptedException {

		driver = DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.BookFlight.Passenger1_Fname)));
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.BOOK_FLIGHT_PAGE_TITLE);

		System.out.println("Book Flight Page Title Verified !!!");
	}
	
	@Test(priority = 2,dataProvider="BookFlightData",dataProviderClass=BookFlightDataProvider.class)
	public void checkBookFlight(List<BookFlight>bookFlights) throws InterruptedException {
		
		
		for(BookFlight excelbookflight:bookFlights){
		
			
			System.out.println("Book Flight Data Executing !!");
		driver.findElement(By.xpath(XpathUtils.BookFlight.Passenger1_Fname)).sendKeys(excelbookflight.getPassenger1Fname());
		driver.findElement(By.xpath(XpathUtils.BookFlight.Passenger1_Lname)).sendKeys(excelbookflight.getPassenger1Lname());
		driver.findElement(By.xpath(XpathUtils.BookFlight.Passenger2_Fname)).sendKeys(excelbookflight.getPassenger2Fname());
		driver.findElement(By.xpath(XpathUtils.BookFlight.Passenger2_Lname)).sendKeys(excelbookflight.getPassenger2Lname());
		
		Select cardtype= new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.DROPDOWN_CARD_TYPE)));
		cardtype.selectByValue(excelbookflight.getCcCardType());
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_NUMBER)).sendKeys(excelbookflight.getCcNumber());
		
		Select ccMonth= new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.DROPDOWN_EXPIRATION_MONTH)));
		ccMonth.selectByIndex(3);
		Select ccYear= new Select(driver.findElement(By.xpath(XpathUtils.BookFlight.DROPDOWN_EXPIRATION_YEAR)));
		ccYear.selectByIndex(5);
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_CARD_FIRST_NAME)).sendKeys(excelbookflight.getCcFname());
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_CARD_MIDDLE_NAME)).sendKeys(excelbookflight.getCcMiddleName());
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_CARD_LAST_NAME)).sendKeys(excelbookflight.getCcLastName());
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.Button_TICKETLESS_Travel)).click();
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_BILLING_ADDRESS)).sendKeys(excelbookflight.getBillingAddress());
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_BILLING_CITY)).sendKeys(excelbookflight.getBillingCity());
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_BILLING_STATE)).sendKeys(excelbookflight.getBillingState());
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_BILLING_POSTAL)).sendKeys(excelbookflight.getBillingPostalCode());
		driver.findElement(By.xpath(XpathUtils.BookFlight.INPUT_BILLING_COUNTRY)).sendKeys(excelbookflight.getBillingCountry());
		
		driver.findElement(By.xpath(XpathUtils.BookFlight.BUTTON_SECURE_PURCHASE)).submit();
		
		System.out.println("Successfully Submitted and Purchased Tickets !!!!");
		
		}
	}

	
	
}
