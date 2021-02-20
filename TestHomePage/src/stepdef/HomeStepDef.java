package stepdef;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class HomeStepDef {
	HomePage hp;
	@Given("user opens the browser")
	public void user_opens_the_browser() {
	   hp = new HomePage();
	}
//	@When("user enter the URL {string}")
//	public void user_enter_the_url(String string) {
//	    hp.enterUrl(string);
//	}
	@When("click on Shop Menu")
	public void click_on_shop_menu() {
	    hp.clickShop();
	}
	@When("now click on Home menu button")
	public void now_click_on_home_menu_button() {
	   hp.clickHome();
	}
	
	@Then("test whether the Home page has Three Sliders only")
	public void test_whether_the_home_page_has_three_sliders_only() {
		hp.sliders();
	}
	
	@Then("user is available with three arrivals")
	public void user_is_available_with_three_arrivals() {
	    hp.arrivals();
	}
		
	@Then("arrival image should be clickable and navigable")
	public void arrival_image_should_be_clickable_and_navigable() throws InterruptedException {
	    hp.arrivalNavigation();
	}
	
	@Then("click on description")
	public void click_on_description_tab() throws InterruptedException {
	   hp.clickDescription();
	}
	@Then("there should be description regarding book")
	public void there_should_be_description_regarding_book() {
	    
	}
	
	@Then("click on review")
	public void click_on_review_tab() {
	   hp.clickReview();
	}
	
	@Then("there should be review regarding book")
	public void there_should_be_review_regarding_book() {
	    
	}

}
