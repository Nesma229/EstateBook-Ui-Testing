import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestBase {

    WebDriver driver;
    protected HomePage homePage;


    @BeforeMethod
    public void setUp(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.estatebook.com/en");

        homePage = new HomePage(driver);

    }


//    @AfterMethod
//    public void tearDown() {
//
//        driver.quit();
//    }





}
