package tuesdayJan;

import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.Reporter;

import com.tuesday.supportfiles.BaseClass;

import propertiesFileReader.PropertiesFile_Reader;


public class LoginPage extends BaseClass{

	Screen screen;


	Pattern uname;
	Pattern password;
	Pattern loginBtn;
	PropertiesFile_Reader pr;
	
	boolean loginStatus;

	public LoginPage() throws IOException
	{
		screen = new Screen();
		pr = new PropertiesFile_Reader();

		uname = new Pattern(".\\zurichImages\\LoginPage\\uname.PNG");
		password = new Pattern(".\\zurichImages\\LoginPage\\password.PNG");
		loginBtn = new Pattern(".\\zurichImages\\LoginPage\\loginbtn.PNG");	
	}



	public void usernameType() throws FindFailed, InterruptedException, IOException
	{

		screen.wait(uname, 20);
		screen.type(uname, pr.fileread("loginpage.username"));
		Reporter.log("username is given", true);
		Thread.sleep(500);
	}


	public void passwordType() throws FindFailed, InterruptedException, IOException
	{
		screen.wait(password, 5);
		screen.type(password, pr.fileread("loginpage.password"));
		Reporter.log("password is given", true);
		Thread.sleep(1000);
	}

	public void loginButtonClick() throws FindFailed, InterruptedException
	{
		screen.wait(loginBtn,10);
		screen.click(loginBtn);
		Reporter.log("login button is clicked",true);
		Thread.sleep(10000);
	}


	public boolean verifyLoginSatus() throws FindFailed, InterruptedException
	{
		loginStatus = true;
		
		if(screen.exists(loginBtn) != null)
		{
			Reporter.log("login status is failed.",true);
			loginStatus = false;
		}
		else
		{
			Reporter.log("login status is pass.",true);
		}
		return loginStatus;
	}

}
