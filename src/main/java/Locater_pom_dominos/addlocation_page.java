package Locater_pom_dominos;

import org.openqa.selenium.By;

import b_ClassDominos.B_Class_daminos;

public class addlocation_page extends B_Class_daminos {
	
	public By Dontallow = By.xpath("//*[@onclick='moeRemoveBanner()']");
	public By location = By.xpath("//input[@placeholder='Enter your delivery address']");
	public By clickarea = By.xpath("//*[@placeholder='Enter Area / Locality']");
	public By enterarea = By.xpath("//*[@placeholder='Enter Area / Locality']");
	public By clicklocation = By.xpath("(//*[@data-label='location_[object Object]'])[2]");
	public By pizza1 = By.xpath("(//*[@class='img-wrpr__img'])[1]");
	public By clickAddPizza = By.xpath("//*[@data-label='customiseAddToCart']");
	public By pizza2 = By.xpath("(//*[@class='img-wrpr__img'])[2]");
	public By ClickAddPizza2 = By.xpath("//*[@data-label='customiseAddToCart']");
	public By pizza3 = By.xpath("(//*[@class='img-wrpr__img'])[3]");
	public By clickAddPizza3 = By.xpath("//*[@data-label='customiseAddToCart']");
	public By clickcheout = By.xpath("//button[@data-label='miniCartCheckout']");
	public By addpepsi = By.xpath("(//div[@class='upsell__add'])[6]");
	public By addpepsi12 = By.xpath("(//div[@data-label='increase'])[4]");
	public By addpepsi7 = By.xpath("(//div[@data-label='increase'])[4]");
	
	
	
	public void aleart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(Dontallow).click();	
	}
	public void locate() throws InterruptedException {
		driver.findElement(location).click();
		Thread.sleep(2000);
		driver.findElement(clickarea).click();
		driver.findElement(enterarea).sendKeys("cuddalore");
		Thread.sleep(2000);
		driver.findElement(clicklocation).click();	
		Thread.sleep(2000);
	}
	public void AddPizza() throws InterruptedException {
		driver.findElement(pizza1).click();
		Thread.sleep(2000);
		driver.findElement(clickAddPizza).click();
		Thread.sleep(2000);
		driver.findElement(pizza2).click();
		Thread.sleep(2000);
		driver.findElement(ClickAddPizza2).click();
		Thread.sleep(2000);
		driver.findElement(pizza3).click();
		Thread.sleep(2000);
		driver.findElement(clickAddPizza3).click();
		Thread.sleep(2000);
	}
	public void checkout() {
		driver.findElement(clickcheout).click();

	}
	public void addpepsi() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(addpepsi).click();
		Thread.sleep(2000);
		//int pepsi = 12;
		for(int i=0;i<6;i++) { driver.findElement(addpepsi12).click(); }
//		int pepsid = 7;
//		for(int i=0;i<pepsid;i++) { driver.findElement(addpepsi7).click(); }
		

	}
	
	
	
}
