import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumtest {

    WebDriver driver;

    @Before
    public void setup()
    {
        driver = new FirefoxDriver();
        long time;
        driver.manage().timeouts().implicitlyWait(time 10,
        )
        driver.get ("https://www.google.com")
    }

    @After
    public void quitBrowser()
    {
        driver.quit();
    }


    @Test
    public void test1() throws InterruptedException {
        WebElement barreRecherche = driver.findElement(By.id("lst-ib"));
        ((WebElement) barreRecherche).sendKeys("canelé");

        WebElement buttonRecherche = driver.findElement(By.className("lsb"));
        buttonRecherche.click();

        Thread.sleep(1000);
    }


    @Test
    public void testClick() throws InterruptedException {
        String expected = "French language - Wikipedia";

        WebElement barreRecherche = driver.findElement(By.id("lst-ib"));
        barreRecherche.sendKeys(..keysToSend: ("french);

        WebElement buttonRecherche = driver.findElement(By.className("lsb"));

        WebElement premierResultat = driver.findElement(By.xpath())


        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.google.com");

        WebElement barreRecherche = driver.findElement(By.id("lst-ib"));
        ((WebElement) barreRecherche).sendKeys("canelé");
        barreRecherche.sendKeys(Keys.ENTER);

        WebElement buttonRecherche = driver.findElement(By.name())

        barreRecherche.sendKeys(Keys.ENTER);


        Thread.sleep(1000);
    }


}
