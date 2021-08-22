import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class GoogleChromeEasySetup {

    WebDriver driver;

    public void openBrowsers() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test1(){
        openBrowsers();
    }

    @AfterClass
    public void afterClass() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
