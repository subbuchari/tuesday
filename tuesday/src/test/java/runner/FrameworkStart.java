package runner;

import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.tuesday.supportfiles.BaseClass;
import com.tuesday.supportfiles.DropdownOptions;

import IlustrasiPenjualan.afterMorebtn.InformasiTertanggung;
import junit.framework.Assert;
import tuesdayJan.AddIllustration;
import tuesdayJan.IllustrationSale;
import tuesdayJan.Lanjut_MoreButton;
import tuesdayJan.LoginPage;
import tuesdayJan.PackageOptions;
import tuesdayJan.ProductName;
import tuesdayJan.TypesOfProducts;

public class FrameworkStart extends BaseClass{

	LoginPage logpage;
	IllustrationSale illusale;
	AddIllustration addIllu;
	TypesOfProducts typpro;
	DropdownOptions ddo ;
	ProductName proname;
	PackageOptions paopt;
	Lanjut_MoreButton lajBtn;
	InformasiTertanggung it;

	public FrameworkStart() throws IOException
	{
		logpage = new LoginPage();
		illusale = new IllustrationSale();
		addIllu = new AddIllustration();
		typpro = new TypesOfProducts();
		ddo = new DropdownOptions();
		proname = new ProductName();
		paopt = new PackageOptions();
		lajBtn = new Lanjut_MoreButton();
		it = new InformasiTertanggung();
	}

	@Test( priority = 1)
	public void loginApp_username_type() throws FindFailed, InterruptedException, IOException
	{
		logpage.usernameType();			
	}
	@Test( priority = 2)
	public void loginApp_password_type() throws FindFailed, InterruptedException, IOException
	{
		logpage.passwordType();		
	}
	@Test( priority = 3)
	public void loginApp_loginbtn_click() throws FindFailed, InterruptedException
	{
		logpage.loginButtonClick();	
	}
	@Test( priority = 4)
	public void loginApp_verifyLogin_status() throws FindFailed, InterruptedException
	{
		boolean status = logpage.verifyLoginSatus();
		Assert.assertTrue(status);
	}
	@Test( priority = 5 , dependsOnMethods={"loginApp_verifyLogin_status"})
	public void IllustrationSale_link_click() throws FindFailed, InterruptedException
	{
		illusale.ilustrasiPenjualanClick();
	}
	@Test( priority = 6 , dependsOnMethods={"IllustrationSale_link_click"})
	public void AddIllustration_link_click() throws FindFailed, InterruptedException
	{
		addIllu.TambhaIllustrasiImageLinkClick();
	}
	@Test( priority = 7 , dependsOnMethods={"AddIllustration_link_click"})
	public void TypesOfProducts_dropdown_click() throws FindFailed, InterruptedException
	{
		typpro.JenisProdukDropdownClick(1);
	}

	@Test( priority = 8 , dependsOnMethods={"TypesOfProducts_dropdown_click"})
	public void ProductName_dropdown_click() throws FindFailed, InterruptedException
	{
		proname.NamaProdukDropdownClick(2);
	}

	@Test( priority = 9 , dependsOnMethods={"ProductName_dropdown_click"})
	public void Packageoptions_dropdown_click() throws FindFailed, InterruptedException
	{
		paopt.PilihanPaketDropdownClick(9);
	}
	@Test( priority = 10 )
	public void lanjutbutton_click() throws FindFailed, InterruptedException
	{
		lajBtn.lanjutBtn_Click();
	}

	@Test( priority = 11)
	public void titelDropDown_click() throws FindFailed, InterruptedException
	{
		it.titelDropdownClick(1);
	}

	@Test( priority = 12)
	public void namalengkap_textbox_type() throws FindFailed, InterruptedException
	{
		it.namalengkap_textbox("zurichpro");
	}
	@Test( priority = 13)
	public void TanggalLahir_textbox_type() throws FindFailed, InterruptedException
	{
		it.TanggalLahir_textbox("01/01/1990");
	}
	@Test( priority = 14)
	public void Kategori_Dropdown() throws FindFailed, InterruptedException
	{
		it.Kategori_Dropdown_Click(1);
	}
	@Test( priority = 15)
	public void kelasPekerjaan_Dropdown() throws FindFailed, InterruptedException
	{
		it.kelasPekerjaan_Dropdown_Click(2);
	}
	@Test( priority = 16)
	public void Hubungan_dropdown() throws FindFailed, InterruptedException
	{
		it.Hubungan_dropdown_Click(2);
	}


}
