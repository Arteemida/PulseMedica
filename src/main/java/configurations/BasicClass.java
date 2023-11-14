package configurations;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
public class BasicClass {
    public static WebDriver driver;

    @BeforeClass
    public static void createDriver() {
        driver = DriversConfig.chooseBrowser(BrowsersList.CHROME);
    }

    @AfterClass
    public void af() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
}
}