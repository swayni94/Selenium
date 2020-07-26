package SeleniumPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {
	public WebDriver driver;
    public WebDriverWait wait;
    
    public PageBase (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    
    public void click (By elementLocation) {
        driver.findElement(elementLocation).click();
    }
   
    public void writeText (By elementLocation, String text) {
        driver.findElement(elementLocation).clear();
        driver.findElement(elementLocation).sendKeys(text);
    }
    
    public String readText (By elementLocation) {
        return driver.findElement(elementLocation).getText();
    }
    
    
    public List<WebElement> getElements(By elementLocation){
        return driver.findElements(elementLocation);
    }
    
    public WebElement getElement(By elementLocation){
        return driver.findElement(elementLocation);
    }
}
