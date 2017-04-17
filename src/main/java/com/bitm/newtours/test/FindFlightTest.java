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

import com.bitm.newtours.dataprovider.FlightFinderDataProvider;
import com.bitm.newtours.dto.FlightFinder;
import com.bitm.newtours.utils.DriverManager;
import com.bitm.newtours.utils.UrlTextUtils;
import com.bitm.newtours.utils.XpathUtils;

public class FindFlightTest {

	private WebDriver driver=null;
	
	@Test(priority=1)
	public void checkFlightFindPageTitle(){
		driver=DriverManager.driver;
		WebDriverWait wait = new WebDriverWait(driver, 40);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.FindFlight.DROPDOWN_PASSENGERS)));
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.FIND_FLIGHT_PAGE_TITLE);
		
		System.out.println("Flight Find Page Title Verified !!");
	}
	@Test(priority=2,dataProvider="FlightFindData",dataProviderClass=FlightFinderDataProvider.class)
	public void checkFlightDetails(List<FlightFinder>flightFinders)throws InterruptedException{
		
		for(FlightFinder excelflightfind: flightFinders){
			
			navigate("http://newtours.demoaut.com/mercuryreservation.php");
			System.out.println("Flight Find Test Execution started --- ");
		driver.findElement(By.xpath(XpathUtils.FindFlight.RADIO_ONE_WAY)).click();
		Select passengers= new Select(driver.findElement(By.xpath(XpathUtils.FindFlight.DROPDOWN_PASSENGERS)));
		passengers.selectByValue(excelflightfind.getPassengers());
		Select departingFrom= new Select(driver.findElement(By.xpath(XpathUtils.FindFlight.DROPDOWN_DEPARTING_FROM)));
		departingFrom.selectByValue(excelflightfind.getDepartingFrom());
		
		Select departingOnMonth= new Select(driver.findElement(By.xpath(XpathUtils.FindFlight.DROPDOWN_DEPARTING_FROM_ON)));
		departingOnMonth.selectByValue(excelflightfind.getDepartingOnMonth());
		Select departingOnDate= new Select(driver.findElement(By.xpath(XpathUtils.FindFlight.DROPDOWN_DEPARTING_FROM_ON_DATE)));
		departingOnDate.selectByValue(excelflightfind.getDepartingOnDate());
		
		Select arrivingIn= new Select(driver.findElement(By.xpath(XpathUtils.FindFlight.DROPDOWN_ARRIVING_IN)));
		arrivingIn.selectByValue(excelflightfind.getArrivingIn());
		
		Select returningMonth= new Select(driver.findElement(By.xpath(XpathUtils.FindFlight.DROPDOWN_Returning_IN)));
		returningMonth.selectByValue(excelflightfind.getReturningMonth());
		Select returningDate= new Select(driver.findElement(By.xpath(XpathUtils.FindFlight.DROPDOWN_Returning_IN_DATE)));
		returningDate.selectByValue(excelflightfind.getReturningDate());
		driver.findElement(By.xpath(XpathUtils.FindFlight.RADIO_SERVICE_CLASS)).click();
		/*
		Select airlinePreference= new Select(driver.findElement(By.xpath(XpathUtils.FindFlight.DROPDOWN_AIRLINES)));
		airlinePreference.selectByValue(excelflightfind.getAirlinePreference());
		*/
		driver.findElement(By.xpath(XpathUtils.FindFlight.BUTTON_CONTINUE)).submit();
		
		System.out.println("Successfully selected data for Find Flight Page !!");
		}
	}
	private void navigate(String url) {
		driver.navigate().to(url);
		driver.navigate().refresh();
		
	}
}
