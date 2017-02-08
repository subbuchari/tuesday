package com.tuesday.supportfiles;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class DropdownOptions {
	Robot robo;
	public void selectDropdownOption(int n) throws AWTException, InterruptedException
	{
		robo = new Robot();
		for(int i=1;i<=n;i++)
		{
			robo.keyPress(KeyEvent.VK_DOWN);
		}

		Thread.sleep(1000);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}


}
