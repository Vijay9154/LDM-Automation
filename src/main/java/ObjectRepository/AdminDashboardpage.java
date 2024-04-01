package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardpage {

	public WebDriver driver;

	public AdminDashboardpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h3[contains(@class,'pageheader-title spacing-outer-bottom-none')]")
	private WebElement Admindashboardheader;
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-cog']")
	private WebElement Configurationlink;
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-home']")
	private WebElement Homelink;
	@FindBy(xpath = "//button[text()='Plant Type']")
	private WebElement Planttypebutton;
	@FindBy(xpath = "(//span[@class='glyphicon glyphicon-plus'])[2]")
	private WebElement Planttypeplusicon;
	@FindBy(xpath = "//div[@class='mx-compound-control']//select")
	private WebElement Activateplantplantdropdown;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement ActivatePlantSavebutton;
	@FindBy(xpath = "//div[@class='modal-body mx-dialog-body']//p")
	private WebElement ActivateplantErrortext;
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement ActivatePlantErrorOKbutton;
	@FindBy(xpath = "//button[text()='< Back To Admin DashBoard']")
	private WebElement Backtoadmindashboardlink;
	@FindBy(xpath = "//span[text()='Plant Name']/../..//input")
	private WebElement Plantnamesearchbox;
	@FindBy(xpath = "(//span[@class='glyphicon glyphicon-plus-sign'])[1]")
	private WebElement PlantAdminplusicon;
	@FindBy(xpath = "//span[@class='select2-selection__arrow']")
	private WebElement AddMultipleAdmindropdownArrowicon;
	@FindBy(xpath = "(//div[@class='autoCompleteResult'])[last()]")
	private WebElement Adminoption;
	@FindBy(xpath = "//button[text()='Assign']")
	private WebElement Addmultipleadminassignbutton;
	@FindBy(xpath = "//a[text()='View']")
	private WebElement Plantviewlink;
	@FindBy(xpath = "(//span[text()='Name']/../../../..//span[not(contains(@class,'overview'))])[1]")
	private WebElement PlantAdminname;
	@FindBy(xpath = "//button[@class='close']")
	private WebElement closeicon;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	private WebElement Addmultipledropdowntextbox;

	public WebElement Admindashboardheader() {
		return Admindashboardheader;
	}

	public WebElement Configurationlink() {
		return Configurationlink;
	}

	public WebElement Homelink() {
		return Homelink;
	}

	public WebElement Planttypebutton() {
		return Planttypebutton;
	}

	public WebElement Planttypeplusicon() {
		return Planttypeplusicon;
	}

	public WebElement Activateplantplantdropdown() {
		return Activateplantplantdropdown;
	}

	public WebElement ActivatePlantSavebutton() {
		return ActivatePlantSavebutton;
	}

	public WebElement ActivateplantErrortext() {
		return ActivateplantErrortext;
	}

	public WebElement ActivatePlantErrorOKbutton() {
		return ActivatePlantErrorOKbutton;
	}

	public WebElement Backtoadmindashboardlink() {
		return Backtoadmindashboardlink;
	}

	public WebElement Plantnamesearchbox() {
		return Plantnamesearchbox;
	}

	public WebElement PlantAdminplusicon() {
		return PlantAdminplusicon;
	}

	public WebElement AddMultipleAdmindropdownArrowicon() {
		return AddMultipleAdmindropdownArrowicon;
	}

	public WebElement Adminoption() {
		return Adminoption;
	}

	public WebElement Addmultipleadminassignbutton() {
		return Addmultipleadminassignbutton;

	}

	public WebElement Plantviewlink() {
		return Plantviewlink;

	}

	public WebElement PlantAdminname() {
		return PlantAdminname;

	}

	public WebElement closeicon() {
		return closeicon;

	}

	public WebElement Addmultipledropdowntextbox() {
		return Addmultipledropdowntextbox;

	}

}
