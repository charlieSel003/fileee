package steps;

import java.util.Random;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.HomePageObjects;

public class HomePageSteps {
	
	HomePageObjects hp;
	
	 public HomePageSteps() {
		 
		 hp = new HomePageObjects();
	 }
		 int random = new Random().nextInt(50000); 
	
	
	@Given("^User launch the application$")
	public void user_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    hp = new HomePageObjects();
	}

	@When("^User enter email \"(.*?)\" in the subscription text box$")
	public void user_enter_email_in_the_subscription_text_box(String arg1) throws Throwable {
	    arg1 = random + arg1;
	    hp.setemailadress(arg1);
	    hp.arrorclick();
	}

	@Then("^User should see subscription Message$")
	public void user_should_see_subscription_Message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue("failed", hp.msgalertsub().getText().contains("successfully"));
	}

	
	@When("^User Click on the tab \"(.*?)\"$")
	public void user_Click_on_the_tab(String arg1) throws Throwable {
		if (arg1.equalsIgnoreCase("Dresses")){
			hp.clickdresses();
		}else if (arg1.equalsIgnoreCase("Women")){
			hp.clickwomen();
		}else {
			
		}
	
		}

	@Then("^User should see the respective details page \"(.*?)\"$")
	public void user_should_see_the_respective_details_page(String arg1) throws Throwable {
	    
	Assert.assertTrue("failed", hp.getTitlte().toLowerCase().contains(arg1.toLowerCase()));
	    
	    
	}


}
