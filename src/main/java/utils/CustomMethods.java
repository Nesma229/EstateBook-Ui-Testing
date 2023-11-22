package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomMethods {

    public static WebElement findElementPresence(WebDriver driver , By by){

        return wait(driver,60).until(ExpectedConditions.presenceOfElementLocated(by));
    }


    public static WebElement findDuplicationIndex(WebDriver driver, By locator, int elementIndex) {
       return wait(driver, 50).until(ExpectedConditions
               .visibilityOf(driver.findElements(locator).get(elementIndex)));

    }

    private static WebDriverWait wait(WebDriver driver, int timeOut){
        return new WebDriverWait(driver,Duration.ofSeconds(timeOut));
    }

    private static WebDriverWait wait2(WebDriver driver, int timeout){
        return new  WebDriverWait(driver,Duration.ofSeconds(timeout));
    }


}
