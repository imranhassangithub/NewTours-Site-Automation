package com.bitm.newtours.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.newtours.dataprovider.LoginDataProvider;
import com.bitm.newtours.dto.Login;
import com.bitm.newtours.utils.DriverManager;
import com.bitm.newtours.utils.UrlTextUtils;
import com.bitm.newtours.utils.XpathUtils;

public class HomeTest {
	private WebDriver driver = null;

	@Test(priority = 1)
	public void checkHomePageTitle() throws InterruptedException {
		driver = DriverManager.driver;
		driver.get(UrlTextUtils.BASE_URL);
		Assert.assertEquals(driver.getTitle(), UrlTextUtils.LOGIN_PAGE_TITLE);

		System.out.println("Home Page Title Verified !!!");
	}

	@Test(priority=2,dataProvider="loginData",dataProviderClass=LoginDataProvider.class)
	public void checkLogin(List<Login>logins)throws InterruptedException {

	for(Login login: logins){
		 
		    navigate("http://newtours.demoaut.com/");
			driver.findElement(By.xpath(XpathUtils.Login.INPUT_USER_NAME)).sendKeys(login.getUserName());
			driver.findElement(By.xpath(XpathUtils.Login.INPUT_PASSWORD)).sendKeys(login.getPassword());
			driver.findElement(By.xpath(XpathUtils.Login.BTN_SIGNIN)).submit();
			System.out.println("Logged In Successfully !!");
	}
	}

	private void  navigate(String url) {
		driver.navigate().to(url);
		driver.navigate().refresh();
	}

}
