package com.BP.qa.constants;

import com.BP.qa.enums.ConfigProperties;
import com.BP.qa.utils.ReaderPropertyFile;

public class FrameworkConstants {
	private final static String CONFIGPATH = System.getProperty("user.dir")
			+ "/src/test/resources/config/config.properties";
	private final static String EXCELPATH = System.getProperty("user.dir") +"/src/test/resources/excel/testdata.xlsx";
	private final static long PAGELOAD = 10;

	public static long getPageload() {
		return PAGELOAD;
	}

	public static String getExcelpath() {
		return EXCELPATH;
	}

	private final static int EXPLICITWAIT = 10;
	private static final String EXTENTREPORTPATH = System.getProperty("user.dir") + "/extent-test-output";

	public static String getExtentreportpath() throws Exception {

		if (ReaderPropertyFile.getValue(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("yes")) {
			return EXTENTREPORTPATH + "/" + "index.html";
		} else {
			return EXTENTREPORTPATH + "/" + "index.html";
		}

	}

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getConfigPath() {
		return CONFIGPATH;
	}

}
