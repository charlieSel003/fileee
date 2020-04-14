package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.CartPageObjects;
import pageobjects.HomePageObjects;

public class CartPageSteps {
	HomePageObjects hp;
	CartPageObjects cp;
	
	public CartPageSteps(){
		hp = new HomePageObjects();
		cp=new CartPageObjects();
	}
	@Given("^User Added the Product to cart Faded Shorts$")
	public void user_Added_the_Product_to_cart_Faded_Shorts() throws Throwable {
		hp.clickwomen11();

		
		
	    
	}

	@Then("^User should see the price details of the product$")
	public void user_should_see_the_price_details_of_the_product() throws Throwable {
	    
	}

	@When("^user Increases the Quantity the price of the product should be doubled$")
	public void user_Increases_the_Quantity_the_price_of_the_product_should_be_doubled() throws Throwable {
	   
	}

}
