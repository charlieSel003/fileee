package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utility.BasePage;

public class DressesPageObjects extends BasePage {
	
	WebElement el = driver.findElement(By.id(""));
	
	@FindBy(xpath = "//li[2]/div//h5//a[@title='Printed Dress']")
	private WebElement Dress;
	
	@FindBy(xpath = "//div/a[@title='Proceed to checkout']")
	private WebElement prcdchckout;

	@FindBys(@FindBy(xpath = "//ul[@class='product_list grid row']/li"))
	private List<WebElement> matrialdresses;

	@FindBy(id = "layered_id_attribute_group_1")
	private WebElement stab;
	@FindBy(id = "layered_id_attribute_group_2")
	private WebElement mtab;
	@FindBy(id = "layered_id_attribute_group_3")
	private WebElement ltab;

	@FindBy(xpath = "//span[@class='cat-name']")
	private WebElement naviwomen;

	@FindBy(xpath = "//*[@id='center_column']/ul/li[2]/div/div[2]/div[2]/a[1]/span")
	private WebElement addtocart;

	@FindBy(xpath = "//div[@id='layer_cart']//div//div[@class='button-container']/a/span")
	private WebElement prd2chckout;

	@FindBy(xpath = "//ul[@class='product_list grid row']/li[1]//img")
	private WebElement firstimage;

	@FindBy(xpath = "*//button[@class='btn btn-default btn-twitter']")
	private WebElement twtbtn;

	public DressesPageObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement verifychckout() {
		return prcdchckout;
	}

	public WebElement printeddress() {
		return Dress;
	}

	public void clickprdchckout() {
		addtocart.click();
	}

	public void clickprd2proceed() {
		prd2chckout.click();
	}

	public WebElement header() {
		return naviwomen;
	}

	public WebElement smalltab() {
		return stab;
	}

	public WebElement mediumtab() {
		return mtab;

	}

	public WebElement largetab() {
		return ltab;
	}

	public void clickimage1() {
		firstimage.click();
	}

	public WebElement twitterbtn() {
		return twtbtn;

	}

	public void clickproductcartbtn(String name) {
		for (WebElement product : matrialdresses) {
			String prdname = product.findElement(By.xpath(".//a[@class='product-name']")).getText();
			if (prdname.equals(name)) {
				mouseOver(product);
				product.findElement(By.xpath(".//a[@title='Add to cart']")).click();
			}

		}
	}

}
