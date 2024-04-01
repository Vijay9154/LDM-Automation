package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Plantpage {

	WebDriver driver;

	public Plantpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Plant']")
	private WebElement PlantHeader;
	@FindBy(xpath = "//button[text()='New']")
	private WebElement Newbutton;
	@FindBy(xpath = "//label[text()='Plant Code']/..//input")
	private WebElement plantpopupPlantcodetextbox;
	@FindBy(xpath = "//label[text()='Plant Name']/..//input")
	private WebElement plantpopupPlantnametextbox;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement Savebutton;
	@FindBy(xpath = "//div[@class='mx-grid-toolbar']//button[text()='Search']")
	private WebElement Searchbutton;
	@FindBy(xpath = "//label[text()='Plant Code']/../..//input")
	private WebElement Plantcodesearchbox;
	@FindBy(xpath = "//label[text()='Plant Name']/../..//input")
	private WebElement PlantNamesearchbox;
	@FindBy(xpath = "//button[@class='btn mx-button btn-default mx-name-search mx-grid-search-button']")
	private WebElement Plantsearchbutton;
	@FindBy(xpath = "(//div[@class='mx-datagrid-data-wrapper'])[1]")
	private WebElement Plantsearchresult;
	@FindBy(xpath = "//button[text()='Delete']")
	private WebElement Deletebutton;
	@FindBy(xpath = "//div[@class='modal-body mx-dialog-body']//p")
	private WebElement Deleteplantconfirmationtext;
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement Proceedbutton;

	public WebElement PlantHeader() {
		return PlantHeader;
	}

	public WebElement Newbutton() {
		return Newbutton;
	}

	public WebElement plantpopupPlantcodetextbox() {
		return plantpopupPlantcodetextbox;
	}

	public WebElement plantpopupPlantnametextbox() {
		return plantpopupPlantnametextbox;
	}

	public WebElement Savebutton() {
		return Savebutton;
	}

	public WebElement Searchbutton() {
		return Searchbutton;
	}

	public WebElement Plantcodesearchbox() {
		return Plantcodesearchbox;
	}

	public WebElement PlantNamesearchbox() {
		return PlantNamesearchbox;
	}

	public WebElement Plantsearchbutton() {
		return Plantsearchbutton;
	}
	public WebElement Plantsearchresult() {
		return Plantsearchresult;
	}
	public WebElement Deletebutton() {
		return Deletebutton;
	}
	public WebElement Deleteplantconfirmationtext() {
		return Deleteplantconfirmationtext;
	}
	public WebElement Proceedbutton() {
		return Proceedbutton;
	}

}
