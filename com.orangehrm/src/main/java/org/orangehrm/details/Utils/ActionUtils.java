package org.orangehrm.details.Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;



public class ActionUtils {
    private WebDriver driver;

    public ActionUtils(WebDriver driver) {
        this.driver = driver;

    }

    public void loginurl(String url) {
        driver.get(url);
    }

    public void findandclick(By element) {
        driver.findElement(element).click();
    }

    public void findandsend(By element, String field) {
        driver.findElement(element).sendKeys(field);
    }

    public void wait(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.of(20, ChronoUnit.SECONDS));
        wait.until(ExpectedConditions.presenceOfElementLocated(element));


    }

    public void alert(By element) {
        Alert confirmbox = driver.switchTo().alert();
        confirmbox.dismiss();
    }
    public  byte[] screenshot(){
        byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        return screenshot;
    }
}
