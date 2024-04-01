package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Launchpage {
	
	public WebDriver driver;
	
	public Launchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//h2[text()='Sign in']")
	private WebElement LoginHeader;
	@FindBy(xpath = "//input[@id='usernameInput']")
	private WebElement Usernametextbox;
	@FindBy(xpath = "//input[@id='passwordInput']")
	private WebElement passwordtextbox;
	@FindBy(xpath = "//button[@id='loginButton']")
	private WebElement Loginbutton;

	public WebElement LoginHeader() {

		return LoginHeader;
	}

	public WebElement Usernametextbox() {

		return Usernametextbox;
	}

	public WebElement passwordtextbox() {

		return passwordtextbox;
	}

	public WebElement Loginbutton() {

		return Loginbutton;
	}
}
