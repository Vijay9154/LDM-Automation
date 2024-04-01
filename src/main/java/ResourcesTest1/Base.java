package ResourcesTest1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public WebDriver driver;
    public Properties prop;
   
    public WebDriver launchthebrowser() throws InterruptedException, IOException {
        prop = new Properties();
        String propath = System.getProperty("user.dir") + "\\src\\main\\java\\ResourcesTest1\\testdata2.properties";
        FileInputStream fis = new FileInputStream(propath);
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        if (browserName == null) {
            throw new RuntimeException("Browser name is not specified in the properties file.");
        }
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("IE")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Invalid browser name specified in the properties file: " + browserName);
        }
        driver.manage().window().maximize();
        // Consider using explicit waits instead of Thread.sleep(2000);
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("someId")));
        Thread.sleep(2000);
        return driver;
    }

}
