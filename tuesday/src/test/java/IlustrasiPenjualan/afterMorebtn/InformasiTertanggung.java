package IlustrasiPenjualan.afterMorebtn;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class InformasiTertanggung {

	Screen screen;

	Pattern TitelDropdown;
	Pattern Bapak;
	Pattern Lbu;
	Pattern Namalengkap;
	Pattern TanggalLahir;
	Pattern Kategori_Dropdown;
	Pattern lbuRumah;
	Pattern PegawariNegeri;
	Pattern PegawaiSwasta;
	Pattern Pelajar_mahasiswa;
	Pattern professional;
	Pattern Tni_polri;
	Pattern lainnya;
	Pattern kelasPekerjaan_Dropdown;
	Pattern one_option;
	Pattern two_option;
	Pattern three_option;
	Pattern four_option;
	Pattern Hubungan_dropdown;
	Pattern Dirisendiri;
	Pattern suami_lstri;
	Pattern orangtua_anak;
	Pattern majikan_karyawan;
	Pattern lainnya_hubungan;

	public InformasiTertanggung()
	{
		screen = new Screen();

		TitelDropdown = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\TitelDropdown\\TitelDropdown.PNG");
		Bapak = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\TitelDropdown\\BapakOption_titelDropdown.PNG");
		Lbu = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\TitelDropdown\\LbuOption_titelDropdown.PNG");
		Namalengkap = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\NamaLengkap_textbox.PNG");
		TanggalLahir = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\TanggalLahir_tgl_bln_thn_textbox.PNG");
		Kategori_Dropdown = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KategoriPekerjaan\\KategoriPekerjaan_Dropdown.PNG");
		lbuRumah = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KategoriPekerjaan\\LbuRumahTangga_option.PNG");
		PegawariNegeri = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KategoriPekerjaan\\PegawaiNegeri_BUMN_BU__ara_PejabatPemerintah.PNG");
		PegawaiSwasta = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KategoriPekerjaan\\PegawaiSwasta_option.PNG");
		Pelajar_mahasiswa = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KategoriPekerjaan\\Pelajar_Mahasiswa_option.PNG");
		professional = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KategoriPekerjaan\\Profesional_option.PNG");
		Tni_polri = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KategoriPekerjaan\\TNI_Polri_option.PNG");
		lainnya = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KategoriPekerjaan\\Lainnya_option.PNG");
		kelasPekerjaan_Dropdown = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KelasPekerjaan\\KelasPekerjaanDropdown.PNG");
		one_option = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KelasPekerjaan\\1_option.PNG");
		two_option = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KelasPekerjaan\\2_option.PNG");
		three_option = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KelasPekerjaan\\3_option.PNG");
		four_option = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\KelasPekerjaan\\4_option.PNG");
		Hubungan_dropdown = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\Hubungan_Dropdown\\Hubungan_Dropdown.PNG");
		Dirisendiri = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\Hubungan_Dropdown\\DiriSendiri_option.PNG");
		suami_lstri = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\Hubungan_Dropdown\\Suami_lstri_option.PNG");
		orangtua_anak = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\Hubungan_Dropdown\\Orangtua_Anak_option.PNG");
		majikan_karyawan = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\Hubungan_Dropdown\\Majikan_Karyawan_option.PNG");
		lainnya_hubungan = new Pattern(".\\zurichImages\\AfterMoreBtnClick\\Hubungan_Dropdown\\Lainnya_option.PNG");


	}

	public void titelDropdownClick(int index) throws FindFailed, InterruptedException
	{
		screen.wait(TitelDropdown);
		screen.click(TitelDropdown);
		Thread.sleep(3000);

		if(screen.exists(Bapak) != null)
		{
			switch(index)
			{
			case 1 :
				screen.wait(Bapak);
				screen.click(Bapak);
				Thread.sleep(5000);
				break;

			case 2 :
				screen.wait(Lbu);
				screen.click(Lbu);
				Thread.sleep(5000);
				break;


			}
		}
	}

	public void namalengkap_textbox(String s1) throws FindFailed, InterruptedException
	{
		screen.wait(Namalengkap);
		screen.type(Namalengkap, s1);
		Thread.sleep(2000);
	}
	public void TanggalLahir_textbox(String s2) throws FindFailed, InterruptedException
	{
		screen.wait(TanggalLahir);
		screen.type(TanggalLahir, s2);
		Thread.sleep(2000);
	}

	public void Kategori_Dropdown_Click(int index) throws FindFailed, InterruptedException
	{
		screen.wait(Kategori_Dropdown);
		screen.click(Kategori_Dropdown);
		Thread.sleep(3000);

		if(screen.exists(lbuRumah) != null)
		{
			switch(index)
			{

			case 1 :
				screen.wait(lbuRumah);
				screen.click(lbuRumah);
				Thread.sleep(5000);
				break;
			case 2 :
				screen.wait(PegawariNegeri);
				screen.click(PegawariNegeri);
				Thread.sleep(5000);
				break;
			case 3 :
				screen.wait(PegawaiSwasta);
				screen.click(PegawaiSwasta);
				Thread.sleep(5000);
				break;
			case 4 :
				screen.wait(Pelajar_mahasiswa);
				screen.click(Pelajar_mahasiswa);
				Thread.sleep(5000);
				break;
			case 5 :
				screen.wait(professional);
				screen.click(professional);
				Thread.sleep(5000);
				break;
			case 6 :
				screen.wait(Tni_polri);
				screen.click(Tni_polri);
				Thread.sleep(5000);
				break;
			case 7 :
				screen.wait(lainnya);
				screen.click(lainnya);
				Thread.sleep(5000);
				break;
			}
		}
	}

	public void kelasPekerjaan_Dropdown_Click(int index) throws FindFailed, InterruptedException
	{
		screen.wait(kelasPekerjaan_Dropdown);
		screen.click(kelasPekerjaan_Dropdown);
		Thread.sleep(3000);

		if(screen.exists(one_option) != null)
		{
			switch(index)
			{
			case 1 :
				screen.wait(one_option);
				screen.click(one_option);
				Thread.sleep(5000);
				break;

			case 2 :
				screen.wait(two_option);
				screen.click(two_option);
				Thread.sleep(5000);
				break;
			case 3 :
				screen.wait(three_option);
				screen.click(three_option);
				Thread.sleep(5000);
				break;
			case 4 :
				screen.wait(four_option);
				screen.click(four_option);
				Thread.sleep(5000);
				break;


			}
		}
	}

	public void Hubungan_dropdown_Click(int index) throws FindFailed, InterruptedException
	{
		screen.wait(Hubungan_dropdown);
		screen.click(Hubungan_dropdown);
		Thread.sleep(3000);

		if(screen.exists(Dirisendiri) != null)
		{
			switch(index)
			{
			case 1 :
				screen.wait(Dirisendiri);
				screen.click(Dirisendiri);
				Thread.sleep(5000);
				break;

			case 2 :
				screen.wait(suami_lstri);
				screen.click(suami_lstri);
				Thread.sleep(5000);
				break;
			case 3 :
				screen.wait(orangtua_anak);
				screen.click(orangtua_anak);
				Thread.sleep(5000);
				break;
			case 4 :
				screen.wait(majikan_karyawan);
				screen.click(majikan_karyawan);
				Thread.sleep(5000);
				break;
			case 5 :
				screen.wait(lainnya_hubungan);
				screen.click(lainnya_hubungan);
				Thread.sleep(5000);
				break;

			}
		}
	}
}
