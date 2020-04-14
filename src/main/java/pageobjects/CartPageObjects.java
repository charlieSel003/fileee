package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BasePage;


public class CartPageObjects extends BasePage {
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[1]/a")
	private WebElement womTab;
	@FindBy(xpath = "//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement cartbtn;
	@FindBy(xpath = "//div[@id='layer_cart']//div[@class='button-container']//a/span")
	private WebElement prcdbtn;
	@FindBy(xpath="//*[@class='icon-plus']")
	private WebElement plusbtn;
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
	private WebElement imgover;

	public CartPageObjects() {
		PageFactory.initElements(driver, this);
	}

	public void clickwom() {
		womTab.click();
	}

	public void clickcart() {
		cartbtn.click();
	}
	public void clickprcd(){
		prcdbtn.click();
		
	}
	public void clickplusbt(){
		plusbtn.click();
	}
	public WebElement imghover(){
		return imgover;
	}
	

}
