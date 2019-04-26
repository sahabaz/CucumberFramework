package StepDefinition;

import PageObject.landing_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps
{
//	landing_Page l = new landing_Page(d);
	
	@Given("^Open the Chrome and login to appliaction using \"(.*)\" and \"(.*)\"$")
	public void open_the_Chrome_and_Launch_the_Application(String username , String password) throws Throwable 
	{
		landing_Page.login(username , password);
		
	}

	@When("^Publish one landing page$")
	public void publish_one_landing_page() throws Throwable 
	{
		landing_Page.move_to_landing_page();
		landing_Page.create_landing_page();
	}

	@Then("^Logout the application and close the browser$")
	public void logout_the_application_and_close_the_browser() throws Throwable 
	{
		landing_Page.logout();
		
	}
	
}
