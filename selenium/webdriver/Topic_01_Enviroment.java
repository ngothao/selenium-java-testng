package webdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Topic_01_Enviroment
{
    WebDriver driver;

    @Test
    public void TC_01_Run_On_FireFox1()
    {
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        driver.quit();
    }
    @Test
    public void TC_02_Run_On_Chrome1()
    {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.quit();
    }
}
