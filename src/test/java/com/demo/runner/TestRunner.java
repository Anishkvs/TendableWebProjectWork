package com.demo.runner;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.demo.base.AutomationBase;
import com.demo.keywords.Keywords;
import com.demo.reporting.AutomationReports;

@Listeners(AutomationReports.class)

public class TestRunner extends AutomationBase {
	@BeforeClass
	@Parameters({ "browserName" })
	public void setUp(String browserName) throws IOException {
		startBrowserSession(browserName);
		String applicationurl = new Keywords().getPropertyValue("Config", "applicationurl");
		new Keywords().loadUrl(driver, applicationurl);

	}

}
