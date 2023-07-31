package in.amazon.teststeps;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyPhysicsBook extends Driver{
	@Given("a user is on the landing page of the Amazon page")
	public void a_user_is_on_the_landing_page_of_the_amazon_page() {
	   
	}

	@When("he enters physics books in the search box and then select 3rd option from the drop-down.")
	public void he_enters_physics_books_in_the_search_box_and_then_select_3rd_option_from_the_drop_down() {
	    landingPage.searchItem("physics books");
	}

	@When("he clicks rating 4star and above from left side bar")
	public void he_clicks_rating_4star_and_above_from_left_side_bar() {
		physics_LandingPage2.clickSelectRating();
	}

	@When("he clicks on the first search result")
	public void he_clicks_on_the_first_search_result() throws InterruptedException {
		physics_LandingPage2.ClickSelectFirstBook();
	}

	@When("he clicks Add to Cart button")
	public void he_clicks_add_to_cart_button() {
		addToCart.clickAddToCart();
	}

	@When("he verify the text - Added to Cart is displayed.")
	public void he_verify_the_text_added_to_cart_is_displayed() {
		proceedToBuy.doVerifyText();
		String expectedText = proceedToBuy.doVerifyText();
		String actualText = "Added to Cart";
		Assert.assertEquals(expectedText, actualText);
		}
	

	@When("he clicks on Proceed to Buy button")
	public void he_clicks_on_proceed_to_buy_button() {
		proceedToBuy.clickProceedToBuy();
	}

	@Then("he verify user is on the Sign in page")
	public void he_verify_user_is_on_the_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
