package tuesdayJan;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.Reporter;

public class AddIllustration {
	
	Screen screen;
	Pattern TambhaIllustrasi;
	public AddIllustration()
	{
		screen = new Screen();
		TambhaIllustrasi = new Pattern(".\\zurichImages\\TambhaIllustrasi\\TambhaIllustrasiImageLink.PNG");
	}

	public void TambhaIllustrasiImageLinkClick() throws FindFailed, InterruptedException
	{
		screen.wait(TambhaIllustrasi);
		screen.click(TambhaIllustrasi);
		Thread.sleep(4000);
		
		Assert.assertFalse(screen.exists(TambhaIllustrasi) != null, "TambhaIllustrasi image clicking status is failed.");
		System.out.println("TambhaIllustrasi image clicking status is Passed.");
		Reporter.log("TambhaIllustrasi image clicking status is Passed.");
	}
}
