package steps;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.DressesPageObjects;

public class DressesPageSteps {
	
	DressesPageObjects dp;
	
	public DressesPageSteps(){
		dp = new DressesPageObjects();
		
	}
	

	
	@Then("^User should see the same number of products count matching with the product header count displayed$")
	public void user_should_see_the_same_number_of_products_count_matching_with_the_product_header_count_displayed()
			throws Throwable {
		
		

	}

	@When("^the click on Add to cart button for the product \"(.*?)\"$")
	public void the_click_on_Add_to_cart_button_for_the_product(String arg1) throws Throwable {
		dp.clickproductcartbtn(arg1);
		

	}

	@Then("^the product should added to cart page$")
	public void the_product_should_added_to_cart_page() throws Throwable {
		Assert.assertTrue("failed to add", dp.verifychckout().isDisplayed());
		

	}
}
