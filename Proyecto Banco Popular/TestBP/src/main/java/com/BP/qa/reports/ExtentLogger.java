package com.BP.qa.reports;

import com.BP.qa.enums.ConfigProperties;
import com.BP.qa.utils.ReaderPropertyFile;
import com.BP.qa.utils.ScreenshotsUtils;
import com.aventstack.extentreports.MediaEntityBuilder;

public class ExtentLogger {
	private ExtentLogger() {
	}

	public static void pass(String message) {
		ExtentManager.getExtentTest().pass(message);
	}

	public static void fail(String message) {
		ExtentManager.getExtentTest().fail(message);
	}

	public static void skip(String message) {
		ExtentManager.getExtentTest().skip(message);
	}

	public static void warning(String message) {
		ExtentManager.getExtentTest().warning(message);
	}

	public static void pass(String message, boolean isScreenshotNeeded) throws Exception {
		if (ReaderPropertyFile.getValue(ConfigProperties.PASSEDSTEPSCREENSHOTS).equalsIgnoreCase("yes")
				&& isScreenshotNeeded) {
			ExtentManager.getExtentTest().pass(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotsUtils.getBase64Image()).build());

		} else {
			pass(message);
		}
	}

	public static void fail(String message, boolean isScreenshotNeeded) throws Exception {
		if (ReaderPropertyFile.getValue(ConfigProperties.FAILEDSTEPSCREENSHOTS).equalsIgnoreCase("yes")
				&& isScreenshotNeeded) {
			ExtentManager.getExtentTest().fail(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotsUtils.getBase64Image()).build());

		} else {
			fail(message);
		}
	}

	public static void skip(String message, boolean isScreenshotNeeded) throws Exception {
		if (ReaderPropertyFile.getValue(ConfigProperties.SKIPPEDSTEPSCREENSHOTS).equalsIgnoreCase("yes")
				&& isScreenshotNeeded) {
			ExtentManager.getExtentTest().skip(message,
					MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotsUtils.getBase64Image()).build());

		} else {
			skip(message);
		}
	}


}
