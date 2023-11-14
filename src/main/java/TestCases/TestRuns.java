package TestCases;

import configurations.BasicClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestRuns extends BasicClass {
    @Test
    public void testGoogleSignIn() {
        driver.get("https://api.cloudmedi.ca/signin");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement googleSignInButton = driver.findElement(By.xpath("/html/body/div/div/div[1]"));
        googleSignInButton.click();

        try {
            WebElement popup = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("initialView")));

            WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
            emailInput.sendKeys("diana@redleafsolutions.ca");
            emailInput.sendKeys(Keys.ENTER);

            WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
            passwordInput.sendKeys("-------");
            passwordInput.sendKeys(Keys.ENTER);

            // WebElement CloudPortal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
            // assertTrue(CloudPortal.isDisplayed());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed authorization");
        }
    }
}
