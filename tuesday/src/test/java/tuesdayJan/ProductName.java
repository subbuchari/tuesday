package tuesdayJan;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Reporter;

public class ProductName {
	Screen screen;
	Pattern NamaProdukDropdown;
	Pattern ZiagaLife ;
	Pattern ZiagaProteskiPlus;
	public ProductName()
	{
		screen = new Screen();
		NamaProdukDropdown = new Pattern(".\\zurichImages\\NamaProduk\\NamaProdukDropdown.PNG");
		ZiagaLife = new Pattern(".\\zurichImages\\NamaProduk\\ZiagaLifeDropdownOption.PNG");
		ZiagaProteskiPlus = new Pattern(".\\zurichImages\\NamaProduk\\ZiagaProteskiPlusDropdownOption.PNG");
	}

	public void NamaProdukDropdownClick(int index) throws FindFailed, InterruptedException
	{
		screen.wait(NamaProdukDropdown);
		screen.click(NamaProdukDropdown);
		Reporter.log("NamaProdukDropdown is clicked",true);
		Thread.sleep(3000);

		if(screen.exists(ZiagaProteskiPlus) != null)
		{

			switch(index)
			{
			case 1 :
				screen.wait(ZiagaLife);
				screen.click(ZiagaLife);
				Thread.sleep(5000);
				break;

			case 2 :
				screen.wait(ZiagaProteskiPlus);
				screen.click(ZiagaProteskiPlus);
				Thread.sleep(5000);
				break;

			}
		}
		else
		{
			Reporter.log("NamaProdukDropdown is not able to clickable",true);
		}
	}


}
