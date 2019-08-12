package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddToBasketsPage;

public class AddToBasketSteps {

    AddToBasketsPage addToBasketsPage = new AddToBasketsPage();

    @Given("^I click on T-Shirts$")
    public void i_click_on_T_Shirts() throws Throwable {
        addToBasketsPage.ClickTShirtButton();

    }

    @When("^I click on Add to cart$")
    public void i_click_on_Add_to_cart() throws Throwable {
        addToBasketsPage.AddtoBaskets();

    }

    @And("^I click on Proceed to check out$")
    public void i_click_on_Proceed_to_check_out() throws Throwable {
        addToBasketsPage.clickProceedToCheckOut();

    }

    @Then("^the item is added to cart$")
    public void the_item_is_added_to_cart() throws Throwable {
        addToBasketsPage.verifyItemInBasket();

    }

}
