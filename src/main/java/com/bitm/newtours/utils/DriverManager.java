package com.bitm.newtours.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

	static {
		System.setProperty("webdriver.gecko.driver", "E://geckodriver-v0.14.0-win64//geckodriver.exe");
	}
	public static WebDriver driver = new FirefoxDriver();

	private DriverManager() {

	}
}
