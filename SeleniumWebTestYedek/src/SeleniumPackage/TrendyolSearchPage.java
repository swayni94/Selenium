package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrendyolSearchPage extends PageBase {

	public TrendyolSearchPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		driver.get("https://www.trendyol.com/");
	}

	public String searchtxt = "search-box";
	public String searchIconClick = "search-icon";
	
	public void checkLoginMenu(String button){
	       click(By.id(button));
	}
	
	public boolean verifySearchValue(String searchvalue) throws InterruptedException
	{
		writeText(By.className(searchtxt), searchvalue);
		Thread.sleep(500);
		click(By.className(searchIconClick));
		Thread.sleep(600);
		
		if(driver.getCurrentUrl() != "https://www.trendyol.com/") 
		{
			return true;
		}
		
		return false;
	}
}
