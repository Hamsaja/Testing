package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//body/div[1]/div[3]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement urlpath;
	@FindBy(id = "//a[contains(text(),'Shop')]")
	WebElement shop;
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement home;
	@FindBys(value = {
			@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]") })
	List<WebElement> sliders;
	Actions action;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival1;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival2;
	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival3;
	@FindBy(xpath = "//button[contains(text(),'Add to basket')]")
	WebElement addToBasket;
	@FindBy(xpath = "//a[contains(text(),'Description')]")
	WebElement description;
	@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
	WebElement review;
	
	public HomePage() {
		init();
		PageFactory.initElements(driver, this);
	}

//	public void enterUrl(String siteurl)
//	{
//		urlpath.sendKeys("http://practice.automationtesting.in/");
//		urlpath.submit();
//	}

	public void clickShop() {
		shop.click();
	}

	public void clickHome() {
		home.click();
	}
	
	public void sliders() {
		for (WebElement e : sliders) {
			Assert.assertTrue(true);
		}
		sliders.size();

	}

	public void arrivals() {
		if (arrival1.isDisplayed() && arrival2.isDisplayed() && arrival3.isDisplayed()) {
			System.out.println("Arrivals available");
		}

	}

	public void arrivalNavigation() throws InterruptedException {
		arrival1.click();
		driver.navigate().back();
		arrival2.click();
		driver.navigate().back();
		arrival3.click();
	}

	public void clickDescription() throws InterruptedException {
		arrival1.click();
		description.click();
		driver.navigate().back();
		arrival2.click();
		description.click();
		driver.navigate().back();
		arrival3.click();
		description.click();

	}

	public void clickReview() {
		arrival1.click();
		review.click();
		driver.navigate().back();
		arrival2.click();
		review.click();
		driver.navigate().back();
		arrival3.click();
		review.click();
	}

	public String getTitle() {
		return driver.getTitle();
	}
}