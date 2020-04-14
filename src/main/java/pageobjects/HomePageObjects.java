package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.BasePage;

public class HomePageObjects extends BasePage {

	@FindBy(xpath = "//div[@id='block_top_menu']//a[@title='Women']")
	private WebElement womentab;

	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dressestab;

	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dresstab;

	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tshirttab;
	@FindBy(id = "newsletter-input")
	private WebElement enteremail;
	@FindBy(xpath = "//div//button[@name='submitNewsletter']")
	private WebElement arrowbutton;
	@FindBy(xpath = "//*[@class='alert alert-success']")
	private WebElement successmsg;
	
	@FindBy(name = "submitNewsletter")
	private WebElement arrowSubmitBtn;
	
	@FindBy(xpath = "//span[@class='cat-name']")
	private WebElement naviwomen;
	
	
	@FindBy(id = "uniform-selectProductSort")
	private WebElement navitshirt;

	@FindBy(xpath = "//div/ul[1]/li[1]/div//div[@class='right-block']//a[2]/span")
	private WebElement firstimage;
	
	@FindBy(xpath = "*//button[@class='btn btn-default btn-twitter']")
	private WebElement twtrbtn;
	
	
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);

	}
	public void clicktshirt(){
		tshirttab.click();
	}
	public void clickwomen(){
		womentab.click();
	}
	public void clickfirstimg(){
		firstimage.click();
	}
	public WebElement gettwtrbtn(){
		return twtrbtn;
	}
	
	public WebElement msgalertsub(){
		return successmsg;
	}


	public WebElement header() {
		return naviwomen;
	}

	public void setemailadress(String email) {
		setText(enteremail, email);
		// enteremail.click();

	}

	public void arrorclick() {
		arrowSubmitBtn.click();
	}

	public WebElement dresses() {
		return dressestab;
	}

	public void clickdresses() {
		dressestab.click();
	}

	public WebElement getwomen() {
		return womentab;
	}

	public WebElement getdress() {
		return dresstab;
	}

	public WebElement gettshirt() {
		return tshirttab;
	}
	
	
	
}
