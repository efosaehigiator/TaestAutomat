package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("^I am on the landing page of \"([^\"]*)\"$")
    public void i_am_on_the_landing_page_of(String arg1) throws Throwable {
        loginPage.launchUrl();

    }

    @When("^I click on \"([^\"]*)\" tab$")
    public void i_click_on_tab(String arg1) throws Throwable {
        loginPage.logIn();

    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_and(String arg1, String arg2) throws Throwable {
        loginPage.enterEmailAddress();
        loginPage.enterPassword();

    }

    @And("^I click on signIn button$")
    public void i_click_on_signIn_button() throws Throwable {
        loginPage.clickSigInButton();

    }

    @Then("^I am logged in and a banner \"([^\"]*)\" is displayed$")
    public void i_am_logged_in_and_a_banner_is_displayed(String arg1) throws Throwable {

    }

}
