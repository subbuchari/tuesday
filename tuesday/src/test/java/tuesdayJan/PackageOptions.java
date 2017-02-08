package tuesdayJan;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Reporter;

public class PackageOptions {
	Screen screen;
	Pattern PilihanPaketDropdown;

	Pattern HospitalSafe_plan250Juta_DropOption;
	Pattern HospitalsafePlan500juta_DropOption;
	Pattern Hospitalsafe_plan750jutaDropOption;
	Pattern Hospitalsafe_plan1miliar_DropOption;

	Pattern Lifestyle_plan250Juta_DropOption;
	Pattern Lifestyle_plan500juta_DropOption;
	Pattern Lifestyle_plan750juta_DropOption;
	Pattern Lifestyle_plan1miliar_DropOption;

	Pattern Dropdown_downclickbutton_pilihanPaket;

	Pattern Medicare_plan_250_juta_DropOption;
	Pattern Medicare_plan_500_juta_DropOption;
	Pattern Medicare_plan_750_juta_DropOption;
	Pattern Medicare_plan_1miliar;

	public PackageOptions()
	{
		screen = new Screen();

		PilihanPaketDropdown = new Pattern(".\\zurichImages\\PilihanPaket\\PilihanPaketDropdown.PNG");

		HospitalSafe_plan250Juta_DropOption = new Pattern(".\\zurichImages\\PilihanPaket\\HospitalSafe_plan250Juta_DropOption.PNG");
		HospitalsafePlan500juta_DropOption = new Pattern(".\\zurichImages\\PilihanPaket\\HospitalsafePlan500juta_DropOption.PNG");
		Hospitalsafe_plan750jutaDropOption = new Pattern(".\\zurichImages\\PilihanPaket\\Hospitalsafe_plan750jutaDropOption.PNG");
		Hospitalsafe_plan1miliar_DropOption = new Pattern(".\\zurichImages\\PilihanPaket\\Hospitalsafe_plan1miliar_DropOption.PNG");

		Lifestyle_plan250Juta_DropOption = new Pattern(".\\zurichImages\\PilihanPaket\\Lifestyle_plan250Juta_DropOption.PNG");
		Lifestyle_plan500juta_DropOption = new Pattern(".\\zurichImages\\PilihanPaket\\Lifestyle_plan500juta_DropOption.PNG");
		Lifestyle_plan750juta_DropOption = new Pattern(".\\zurichImages\\PilihanPaket\\Lifestyle_plan750juta_DropOption.PNG");
		Lifestyle_plan1miliar_DropOption = new Pattern(".\\zurichImages\\PilihanPaket\\Lifestyle_plan1miliar_DropOption.PNG");

		Dropdown_downclickbutton_pilihanPaket = new Pattern(".\\zurichImages\\PilihanPaket\\Dropdown_downclickbutton_pilihanPaket.PNG");

		Medicare_plan_250_juta_DropOption = new Pattern(".\\zurichImages\\PilihanPaket\\Medicare_plan_250_juta_DropOption.PNG");
		Medicare_plan_500_juta_DropOption =  new Pattern(".\\zurichImages\\PilihanPaket\\Medicare_plan_500_juta_DropOption.PNG");
		Medicare_plan_750_juta_DropOption = new Pattern(".\\zurichImages\\PilihanPaket\\Medicare_plan_750_juta_DropOption.PNG");
		Medicare_plan_1miliar = new Pattern(".\\zurichImages\\PilihanPaket\\Medicare_plan_1miliar.PNG");

	}

	public void PilihanPaketDropdownClick(int index) throws FindFailed, InterruptedException
	{
		screen.wait(PilihanPaketDropdown);
		screen.click(PilihanPaketDropdown);
		Reporter.log("PilihanPaketDropdown is clicked",true);
		Thread.sleep(4000);




		if(screen.exists(HospitalSafe_plan250Juta_DropOption) != null)
		{
			if(index > 6)
			{
				String[] loops = {"one","two","three","four"};
				for(String loop : loops)
				{
					screen.wait(Dropdown_downclickbutton_pilihanPaket);
					screen.click(Dropdown_downclickbutton_pilihanPaket);
				}
				Thread.sleep(3000);
			}

			switch(index)
			{
			case 1 :

				screen.wait(Medicare_plan_250_juta_DropOption);
				screen.click(Medicare_plan_250_juta_DropOption);
				Thread.sleep(5000);
				break;


			case 2 :
				screen.wait(Medicare_plan_500_juta_DropOption);
				screen.click(Medicare_plan_500_juta_DropOption);
				Thread.sleep(5000);
				break;

			case 3 :
				screen.wait(Medicare_plan_750_juta_DropOption);
				screen.click(Medicare_plan_750_juta_DropOption);
				Thread.sleep(5000);
				break;

			case 4 :
				screen.wait(Medicare_plan_1miliar);
				screen.click(Medicare_plan_1miliar);
				Thread.sleep(5000);
				break;



			case 5 :
				screen.wait(HospitalSafe_plan250Juta_DropOption);
				screen.click(HospitalSafe_plan250Juta_DropOption);
				Thread.sleep(5000);
				break;
			case 6 :
				screen.wait(HospitalsafePlan500juta_DropOption);
				screen.click(HospitalsafePlan500juta_DropOption);
				Thread.sleep(5000);
				break;

			case 7 :

				screen.wait(Hospitalsafe_plan750jutaDropOption);
				screen.click(Hospitalsafe_plan750jutaDropOption);
				Thread.sleep(5000);
				break;

			case 8 :
				screen.wait(Hospitalsafe_plan1miliar_DropOption);
				screen.click(Hospitalsafe_plan1miliar_DropOption);
				Thread.sleep(5000);
				break;

			case 9 :
				screen.wait(Lifestyle_plan250Juta_DropOption);
				screen.click(Lifestyle_plan250Juta_DropOption);
				Thread.sleep(5000);
				break;

			case 10 :
				screen.wait(Lifestyle_plan500juta_DropOption);
				screen.click(Lifestyle_plan500juta_DropOption);
				Thread.sleep(5000);
				break;

			case 11 :
				screen.wait(Lifestyle_plan750juta_DropOption);
				screen.click(Lifestyle_plan750juta_DropOption);
				Thread.sleep(5000);
				break;

			case 12 :
				screen.wait(Lifestyle_plan1miliar_DropOption);
				screen.click(Lifestyle_plan1miliar_DropOption);
				Thread.sleep(5000);
				break;

			}

		}
		else
		{
			Reporter.log("PilihanPaketDropdown is not able to clickable",true);
		}
	}


}
