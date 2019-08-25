import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBaseWiki {

    WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        // open site
        driver.get("https://en.wikipedia.org");
    }


    @AfterClass
    public void tearDown() throws InterruptedException {

        // pause
        Thread.sleep(5000);


        driver.quit();

    }
}
