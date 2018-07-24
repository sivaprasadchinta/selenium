package maven.selenium.maven.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class WriteExcel {
	private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
    	System.setProperty("webdriver.gecko.driver", "D:\\Selenium Projects\\SeleniumPractice\\browsers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(3,TimeUnit.MINUTES);
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    @Test
    public void verifySearchButton() {
    	driver.get("https://www.google.com");
       System.out.println("Testing");
    }
}
