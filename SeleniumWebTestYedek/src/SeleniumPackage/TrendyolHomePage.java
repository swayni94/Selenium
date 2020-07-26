package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrendyolHomePage extends PageBase {

	public TrendyolHomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

		driver.get("https://www.trendyol.com/");
	
	}
	
	public String btnLoginMenu = "accountBtn";
	public String txtEmail = "email";
	public String txtPassword = "password";
	public String btnLogin = "loginSubmit";
	
	
	public void checkLoginMenu(String button){
	       click(By.id(button));
	}
	
	public boolean verifyUsernameAndPassword(String email, String password) throws InterruptedException
	{
		writeText(By.id(txtEmail), email);
		Thread.sleep(500);
		writeText(By.id(txtPassword), password);
		Thread.sleep(500);
		click(By.id(btnLogin));
		
		if(driver.getCurrentUrl() != "https://www.trendyol.com/") 
		{
			return true;
		}
		
		return false;
		
	}
}
