package com.bitm.newtours.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.newtours.utils.ExcelUtils;



public class LoginDataProvider {
	
	@DataProvider(name="loginData")
	public static Object[][] getLoginData() {
        try {
			return new Object[][]{
					{
						ExcelUtils.getLoginData()
					},
				};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	        
    }
}
