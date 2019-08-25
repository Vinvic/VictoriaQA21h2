import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class WebSearchTest extends TestBaseWiki {


    @Test

    public void WebSearchWikiTest() {

        // type java
        driver.findElement(By.name("search")).click();
        driver.findElement(By.name("search")).clear();
        driver.findElement(By.name("search")).sendKeys("java");
        // start search
        driver.findElement(By.name("go")).click();


    }


}
