package com.bitm.newtours.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.newtours.utils.ExcelUtils;

public class FlightFinderDataProvider {

	@DataProvider(name="FlightFindData")
	public static Object[][] getFlightFindData() {
        try {
			return new Object[][]{
					{
						ExcelUtils.getFlightFindData()
					},
				};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	        
    }
}
