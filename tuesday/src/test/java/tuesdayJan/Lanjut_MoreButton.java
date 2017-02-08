package tuesdayJan;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Reporter;

public class Lanjut_MoreButton {
	Screen screen;
	Pattern LanjutBtn;
	public Lanjut_MoreButton()
	{
		screen = new Screen();
		LanjutBtn = new Pattern(".\\zurichImages\\LanjutButton\\LanjutBtn.PNG");

	}

	public void lanjutBtn_Click() throws FindFailed, InterruptedException
	{
		screen.wait(LanjutBtn);
		screen.click(LanjutBtn);
		Thread.sleep(4000);
		Reporter.log("Lanjut Button is clicked");
	}

}
