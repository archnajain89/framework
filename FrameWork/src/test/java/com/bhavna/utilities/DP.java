package com.bhavna.utilities;

import org.testng.annotations.DataProvider;

public class DP {

	@DataProvider(name = "DP1")
	public Object[][] getData1() throws Exception {

		Object[][] retObjArr = ReadExcel.getTableArray(
				"C:\\Users\\arrchnnajaiin\\gitframework\\FrameWork\\src\\test\\java\\testdata\\", "testdata.xlsx",
				"Sheet1", "TC_001");
		return (retObjArr);
	}

	@DataProvider(name = "DP2")
	public Object[][] getData2() throws Exception {

		Object[][] retObjArr = ReadExcel.getTableArray(
				"C:\\Users\\arrchnnajaiin\\gitframework\\FrameWork\\src\\test\\java\\testdata\\", "testdata.xlsx",
				"Sheet1", "TC_002");
		return (retObjArr);
	}

	@DataProvider(name = "DP3")
	public Object[][] getData3() throws Exception {

		Object[][] retObjArr = ReadExcel.getTableArray(
				"C:\\Users\\arrchnnajaiin\\gitframework\\FrameWork\\src\\test\\java\\testdata\\", "testdata.xlsx",
				"Sheet1", "TC_003");
		return (retObjArr);
	}

	@DataProvider(name = "DP4")
	public Object[][] getData4() throws Exception {

		Object[][] retObjArr = ReadExcel.getTableArray(
				"C:\\Users\\arrchnnajaiin\\gitframework\\FrameWork\\src\\test\\java\\testdata\\", "testdata.xlsx",
				"Sheet1", "TC_004");
		return (retObjArr);
	}
}
