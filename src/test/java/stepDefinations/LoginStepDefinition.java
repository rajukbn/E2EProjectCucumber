package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resources.HomePage;
import resources.base;

public class LoginStepDefinition extends base{
	
	@Given("^launch the application$")
	public void launch_the_application() throws Throwable {
	    initializeDriver();
	}

	@When("^user click on login link$")
	public void user_click_on_login_link() throws Throwable {
		HomePage hp =new HomePage();
		hp.loginLink();
		hp.username();
		hp.pwd();
		hp.loginbtn();
	    
	}

	@When("^user login with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_with_and(String arg1, String arg2) throws Throwable {
	    
	}

	@Then("^user on the mainpage$")
	public void user_on_the_mainpage() throws Throwable {
	    
	}

}
