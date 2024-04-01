package SystemAdmin;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import ObjectRepository.AdminDashboardpage;
import ObjectRepository.Configurationpage;
import ObjectRepository.Launchpage;
import ObjectRepository.Plantpage;
import ResourcesTest1.Base;

public class Creatingplantandmappinigwithplanttype extends Base {

	public static String Plantname;
	public static String plantcode;

	@BeforeSuite
		public void login() {
		driver.get(prop.getProperty("url"));
		Launchpage launchpage = new Launchpage(driver);
		Assert.assertTrue(launchpage.LoginHeader().isDisplayed());
		launchpage.Usernametextbox().sendKeys(prop.getProperty("username"));
		launchpage.passwordtextbox().sendKeys(prop.getProperty("password"));
		launchpage.Loginbutton().click();
	}

	@Test(priority = 1)
	public void CreatingthePlant() throws InterruptedException {

		Thread.sleep(10000);

		AdminDashboardpage adminpage = new AdminDashboardpage(driver);
		Assert.assertTrue(adminpage.Admindashboardheader().isDisplayed());

		adminpage.Configurationlink().click();
		Thread.sleep(5000);
		Configurationpage configuraionpage = new Configurationpage(driver);
		Assert.assertTrue(configuraionpage.Configurationheader().isDisplayed());

		configuraionpage.Createplantlink().click();
		Thread.sleep(10000);
		Plantpage plantpage = new Plantpage(driver);
		Assert.assertTrue(plantpage.PlantHeader().isDisplayed());
		Thread.sleep(1000);

		plantpage.Newbutton().click();
		Thread.sleep(1000);

		double randomValue = Math.random();
		System.out.println(randomValue);
		int randomIntInRange = (int) (Math.random() * 1010);
		plantcode = Integer.toString(randomIntInRange);
		System.out.println(randomIntInRange);
		plantpage.plantpopupPlantcodetextbox().sendKeys(plantcode);
		int length = 5;
		String Suffix = "CTO ";
		String randomString = RandomStringUtils.randomAlphabetic(length);
		Plantname = Suffix + randomString;
		plantpage.plantpopupPlantnametextbox().sendKeys(Plantname);
		Thread.sleep(2000);
		plantpage.Savebutton().click();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void Mappingplanttypetotheplant() throws InterruptedException {

		AdminDashboardpage adminpage = new AdminDashboardpage(driver);
		adminpage.Homelink().click();
		Thread.sleep(2000);
		adminpage.Planttypebutton().click();
		Thread.sleep(2000);
		adminpage.Planttypeplusicon().click();
		Thread.sleep(1000);
//		adminpage.ActivatePlantSavebutton().click();
//		String ActualErrortext = adminpage.ActivateplantErrortext().getText();
//		String ExpectedErrortext = prop.getProperty("ExpectedActivateplantErrortext");
//		Assert.assertEquals(ActualErrortext, ExpectedErrortext);
//		adminpage.ActivatePlantErrorOKbutton().click();
		Thread.sleep(3000);
		Select dropdown = new Select(adminpage.Activateplantplantdropdown());
		dropdown.selectByVisibleText(Plantname);
		Thread.sleep(3000);
		adminpage.ActivatePlantSavebutton().click();
		Thread.sleep(1000);
	}
	@AfterSuite
	public void closebrowser() {
		driver.close();
	}

}
