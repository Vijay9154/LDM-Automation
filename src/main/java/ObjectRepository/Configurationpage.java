package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Configurationpage {
	
	WebDriver driver;
	public Configurationpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//h1[text()='Configuration']")
	private WebElement Configurationheader;
	@FindBy(xpath="//a[text()='Create Plant']")
	private WebElement Createplantlink;
	
	public WebElement Configurationheader() {
		return Configurationheader;
	}
	public WebElement Createplantlink() {
		return Createplantlink;
	}

}
