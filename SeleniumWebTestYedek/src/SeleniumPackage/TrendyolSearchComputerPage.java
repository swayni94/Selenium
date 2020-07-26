package SeleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrendyolSearchComputerPage extends PageBase{

	public TrendyolSearchComputerPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		driver.get("https://www.trendyol.com/tum--urunler?q=bilgisayar&qt=bilgisayar&st=bilgisayar");
	}

	
	public String list="prdct-cntnr-wrppr";
	
	public String computer = "p-card-wrppr add-to-bs-card";
	
	public String btnAddBasket = "add-to-bs-tx"; 
	
	public String success = "add-to-basket-button success";
	
	private Product product;
	
	public String takeComputer(int indexComputer) throws InterruptedException 
	{
		List<WebElement> computers = getElements(By.className(list));
		Thread.sleep(500);
		computers.get(indexComputer).findElement(By.className(btnAddBasket)).click();
		Thread.sleep(10);
		
		WebElement element=computers.get(indexComputer).findElement(By.className(success));
		
		if(element!=null) 
		{
			product.setPrice(computers.get(indexComputer).findElement(By.className("prc-box-dscntd")).getText());
			return element.getClass().getName().toString();
		}
		return "failed";
	}
}
