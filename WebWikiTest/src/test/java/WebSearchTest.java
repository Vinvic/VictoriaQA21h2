import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebSearchTest {
    WebDriver driver ;

    @Test

    public void WebSearchWikiTest() throws InterruptedException {
        driver = new ChromeDriver();
        // open site
        driver.get("https://en.wikipedia.org");
        // type java
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("java");
        // start search
        driver.findElement(By.name("go")).click();

      // pause
        Thread.sleep(5000);


        driver.quit();

    }
}
