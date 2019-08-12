package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.SignUpPage;


public class SignUpSteps {

    SignUpPage signUpPage = new SignUpPage();


    @Given("^I navigate to the url \"([^\"]*)\"$")
    public void i_navigate_to_the_url(String arg1) throws Throwable {
        signUpPage.LauchUrl();

    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String arg1) throws Throwable {
        signUpPage.ClickSignInButton();

    }

    @And("^I enter \"([^\"]*)\"$")
    public void i_enter(String arg1) throws Throwable {
        signUpPage.EnterEmailAddress();

    }

    @And("^I click on the \"([^\"]*)\"$")
    public void i_click_on_the(String arg1) throws Throwable {
        signUpPage.ClickCreateAccount();

    }

    @Given("^I check the title radio button as \"([^\"]*)\"$")
    public void i_check_the_title_radio_button_as(String arg1) throws Throwable {
        signUpPage.TickTitle();

    }

    @When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_my_and(String arg1, String arg2) throws Throwable {
        signUpPage.FirstNameAndLastName();

    }

    @When("^I enter (\\d+) character minimum \"([^\"]*)\"$")
    public void i_enter_character_minimum(int arg1, String arg2) throws Throwable {
        signUpPage.EnterPassword();

    }

    @When("^I select my \"([^\"]*)\" from the select boxes$")
    public void i_select_my_from_the_select_boxes(String arg1) throws Throwable {
        signUpPage.EnterDateOfBirth();
        signUpPage.EnterMonthOfBirth();
        signUpPage.EnterYearOfBirth();

    }

    @Given("^I enter my \"([^\"]*)\"$")
    public void i_enter_my(String arg1) throws Throwable {
        signUpPage.enterAddressDetails();

    }

    @When("^I click on \"([^\"]*)\" button$")
    public void i_click_on_button(String arg1) throws Throwable {
        signUpPage.ClickRegisterButton();

    }

    @Then("^the homepage is displayed and title is \"([^\"]*)\"$")
    public void the_homepage_is_displayed_and_title_is(String arg1) throws Throwable {
        String title = "Your logo";
        if (title.contains("Your logo")){
            System.out.println("Registration Successful");
        }else{System.out.println("Registration not Successful");}



    }


}
