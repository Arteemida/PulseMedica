package configurations;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class DriversConfig {
    private static WebDriver driver;

    public static WebDriver chooseBrowser(BrowsersList browsers) {
        switch (browsers) {
            case CHROME:
                createChrome();
                break;
            case FIREFOX:
                createFirefox();
                break;
            case EDGE:
                createEdge();
        }
        return driver;
    }

    public static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void createFirefox() {
    }
    public static void createEdge() {
    }
}

