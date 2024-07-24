package step_Def;


import Locater_pom_dominos.addlocation_page;
import b_ClassDominos.B_Class_daminos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_def extends B_Class_daminos {

	addlocation_page addlocation = new addlocation_page();

	@Given("User launch the URL")
	public void user_launch_the_url() throws InterruptedException {
		driver.manage().window().maximize();
		getURL("https://pizzaonline.dominos.co.in/");
		Thread.sleep(2000);
	}

	@When("User click pizza to add to cart and click to checkout Button")
	public void user_click_pizza_to_add_to_cart_and_click_to_checkout_button() throws InterruptedException {
		addlocation.aleart();
		addlocation.locate();
		addlocation.AddPizza();
		
	}
	@Then("User check pizza and click place order button")
	public void user_check_pizza_and_click_place_order_button() {
		addlocation.checkout();  
	}
	

	@Then("User click address and click save address button")
	public void user_click_address_and_click_save_address_button() throws InterruptedException {
		addlocation.addpepsi();
		
	}

	

}
