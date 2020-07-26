package SeleniumPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TrenyolHomeTest extends TestBase {
////// Giris 
	@Test
	public void valid_UsernameAndPassword()throws   InterruptedException
	{
		TrendyolHomePage homepage = new TrendyolHomePage(driver, wait);
		
		assertEquals(homepage.verifyUsernameAndPassword("sercanwayni@gmail.com", "sercan1994"),true);
		
	}
	
	@Test
	public void invalid_UsernameAndPassword() throws InterruptedException
	{
		TrendyolHomePage homepage = new TrendyolHomePage(driver, wait);
		
		assertEquals(homepage.verifyUsernameAndPassword("sercanwayni@gmail.com", "sercan1881"), false);
	}
	
	@Test
	public void emply_UsernameAndPassword() throws InterruptedException
	{
		TrendyolHomePage homepage = new TrendyolHomePage(driver, wait);
		
		assertEquals(homepage.verifyUsernameAndPassword("", ""), false);
	}
	
////// Bilgisayar Arama	
	@Test
	public void valid_SearchComputer()throws   InterruptedException
	{
		TrendyolSearchPage searchpage = new TrendyolSearchPage(driver, wait);
		
		assertEquals(searchpage.verifySearchValue("bilgisayar"), true);
	}
	
	@Test
	public void emply_SearchComputer() throws InterruptedException
	{
		TrendyolSearchPage searchpage = new TrendyolSearchPage(driver, wait);
		
		assertEquals(searchpage.verifySearchValue(""), false);
	}
	
////// 1 Bilgisayar seçme
	
	@Test
	public void valid_TakeComputer() throws InterruptedException
	{
		TrendyolSearchComputerPage searchcomputerpage = new TrendyolSearchComputerPage(driver, wait);
		
		assertEquals(searchcomputerpage.takeComputer(5), "add-to-basket-button success");
	}
	
	@Test
	public void invalid_TakeComputer() throws InterruptedException
	{
		TrendyolSearchComputerPage searchcomputerpage = new TrendyolSearchComputerPage(driver, wait);
		
		assertNotEquals(searchcomputerpage.takeComputer(5), "failed");
	}
//////// Sepet
	@Test
	public void valid_checkPrice() throws InterruptedException
	{
		TrendyolSepetPage sepetpage = new TrendyolSepetPage(driver, wait);
		
		assertEquals(sepetpage.tocheckPrice(Product.price), true);
	}
	
	@Test
	public void invalid_checkPrice() throws InterruptedException
	{
		TrendyolSepetPage sepetpage = new TrendyolSepetPage(driver, wait);
		
		assertNotEquals(sepetpage.tocheckPrice(Product.price), false);
	}
	
	@Test
	public void emply_checkPrice() throws InterruptedException
	{	
		assertNotEquals(Product.price ==null , false);
	}
	
	@Test
	public void valid_addtoTwoProduct() throws InterruptedException
	{
		TrendyolSepetPage sepetpage = new TrendyolSepetPage(driver, wait);
		
		assertEquals(sepetpage.addtoTwoProduct(), true);
	}
	
	@Test
	public void invalid_addtoTwoProduct() throws InterruptedException
	{
		TrendyolSepetPage sepetpage = new TrendyolSepetPage(driver, wait);
		
		assertNotEquals(sepetpage.addtoTwoProduct(), false);
	}

	@Test
	public void valid_deleteProduct() throws InterruptedException
	{
		TrendyolSepetPage sepetpage = new TrendyolSepetPage(driver, wait);
		
		assertEquals(sepetpage.deleteProduct(), true);
	}
	
	@Test
	public void invalid_deleteProduct() throws InterruptedException
	{
		TrendyolSepetPage sepetpage = new TrendyolSepetPage(driver, wait);
		
		assertNotEquals(sepetpage.deleteProduct(), false);
	}
}
