import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends TestBaseWiki {


    @Test

    public void loginTest() {
        driver.findElement(By.id("pt-login")).click();

        driver.findElement(By.name("wpName")).click();
        driver.findElement(By.name("wpName")).clear();
        driver.findElement(By.name("wpName")).sendKeys("gfggfgfdgfd");

        driver.findElement(By.name("wpPassword")).click();
        driver.findElement(By.name("wpPassword")).clear();
        driver.findElement(By.name("wpPassword")).sendKeys("4645656565");

        driver.findElement(By.id("wpLoginAttempt")).click();


    }


}