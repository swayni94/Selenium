package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrendyolSepetPage extends PageBase{

	public TrendyolSepetPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
		driver.get("https://www.trendyol.com/sepetim#/basket");
	
	}

	
	public String itemPrice = "pb-basket-item-price";
	public String btnNumericCounter = "ty-numeric-counter-button";
	public String txtCounter = "counter-content";
	public String btnDel = "i-trash";
	public String btnDelete = "btn-item btn-remove";
	public String noProduct = "basketNoProductPage";
	
	public boolean tocheckPrice(String tabloPrice)  throws InterruptedException
	{
		String price = readText(By.className(itemPrice));
		if(tabloPrice==null)
		{	
			return false;
		}
		if(price == tabloPrice) 
		{
			return true;
		}
		
		return false;
	}
	
	public boolean addtoTwoProduct() throws InterruptedException
	{
		click(By.className(btnNumericCounter));
		
		int term = Integer.parseInt(readText(By.className(txtCounter)));
		
		if(term == 2) {
			return true;
		}
		
		return false;
	}
	
	public boolean deleteProduct() throws InterruptedException
	{
		click(By.className(btnDel));
		Thread.sleep(500);
		click(By.className(btnDelete));
		Thread.sleep(1000);
	

		String term=driver.findElement(By.id(noProduct)).getClass().getName();
		
		if(term==null) {
			return true;
		}
		
		return false;
	}
}
