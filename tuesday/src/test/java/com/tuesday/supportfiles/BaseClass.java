package com.tuesday.supportfiles;

import java.io.IOException;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import propertiesFileReader.PropertiesFile_Reader;

public class BaseClass {
	App zurichPro;
	PropertiesFile_Reader pr;

	public BaseClass() throws IOException
	{
		pr = new PropertiesFile_Reader();
	}

	@BeforeSuite
	public void runExeApplication() throws IOException, FindFailed, InterruptedException
	{
		zurichPro = App.open(pr.fileread("AppPath"));
	}

	@AfterSuite
	public void quitExeApp() throws InterruptedException
	{
		Thread.sleep(4000);
		if(zurichPro != null)
		{
			zurichPro.close();
		}

	}

}
