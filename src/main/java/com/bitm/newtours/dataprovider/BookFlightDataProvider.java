package com.bitm.newtours.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.newtours.utils.ExcelUtils;

public class BookFlightDataProvider {
	@DataProvider(name="BookFlightData")
	public static Object[][] getBookFlightData() {
        try {
			return new Object[][]{
					{
						ExcelUtils.getBookFlightData()
					},
				};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	        
    }
}
