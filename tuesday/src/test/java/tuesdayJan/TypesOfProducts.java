package tuesdayJan;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Reporter;

public class TypesOfProducts {
	Screen screen;
	Pattern JenisProdukDropdown;
	Pattern traditional;
	Pattern UnitLinkDropdownOption;
	public TypesOfProducts()
	{
		screen = new Screen();
		JenisProdukDropdown = new Pattern(".\\zurichImages\\JenisProduk\\JenisProdukDropdown.PNG");
		traditional = new Pattern(".\\zurichImages\\JenisProduk\\TraditionalDropdownOption.PNG");
		UnitLinkDropdownOption = new Pattern(".\\zurichImages\\JenisProduk\\UnitLinkDropdownOption.PNG");
	}

	public void JenisProdukDropdownClick(int index) throws FindFailed, InterruptedException
	{
		screen.wait(JenisProdukDropdown);
		screen.click(JenisProdukDropdown);
		Reporter.log("JenisProdukDropdown is clicked",true);
		Thread.sleep(2000);

		if(screen.exists(traditional) != null)
		{
			switch(index)
			{
			case 1 :

				screen.wait(traditional);
				screen.click(traditional);
				Thread.sleep(5000);

				break;
				
			case 2 :

				screen.wait(UnitLinkDropdownOption);
				screen.click(UnitLinkDropdownOption);
				Thread.sleep(5000);

				break;

			}
		}
		else
		{
			Reporter.log("JenisProdukDropdown is not able to clickable",true);
		}
	}

}
