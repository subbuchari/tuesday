package tuesdayJan;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;
import org.testng.Reporter;

public class IllustrationSale {

	Screen screen;

	Pattern submitBtn_sinkronasasi;
	Pattern ilustrasiPenjualan;
	Pattern ok_button_submit;
	
	public IllustrationSale()
	{
		screen = new Screen();

		submitBtn_sinkronasasi = new Pattern(".\\zurichImages\\LoginPage\\Sinkronisasi_submitbutton.PNG");
		ilustrasiPenjualan = new Pattern(".\\zurichImages\\IllustrasiPenjualan\\illustrasiPenjualanImageLink.PNG");
		ok_button_submit = new Pattern(".\\zurichImages\\IllustrasiPenjualan\\Ok_btn_afrsubmit.PNG");
		
	}

	public void ilustrasiPenjualanClick() throws FindFailed, InterruptedException
	{
		if(screen.exists(submitBtn_sinkronasasi) != null)
		{
			screen.wait(submitBtn_sinkronasasi);
			screen.click(submitBtn_sinkronasasi);
			Reporter.log("sinkronasasi button is clicked ", true);
			Thread.sleep(10000);
			
			screen.wait(ok_button_submit);
			screen.click(ok_button_submit);
			Reporter.log("'ok_button_submit' button is clicked ", true);
			Thread.sleep(5000);
		}
		screen.wait(ilustrasiPenjualan);
		screen.click(ilustrasiPenjualan);
		Thread.sleep(4000);

		Assert.assertFalse(screen.exists(ilustrasiPenjualan) != null, "ilustrasiPenjualan image clicking status is failed.");
		System.out.println("ilustrasiPenjualan image clicking status is Passed.");
		Reporter.log("ilustrasiPenjualan image clicking status is Passed.");
	}


}
