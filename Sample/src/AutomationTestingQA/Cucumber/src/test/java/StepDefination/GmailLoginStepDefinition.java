package StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class GmailLoginStepDefinition {

    @Given("^Open a gmail signin page$")
    public void open_a_gmail_signin_page() throws Throwable {
        throw new PendingException();
    }

    @When("^Provide a user name and password$")
    public void provide_a_user_name_and_password() throws Throwable {
        throw new PendingException();
    }

    @Then("^It should open the home page$")
    public void it_should_open_the_home_page() throws Throwable {
        throw new PendingException();
    }

    @And("^It opened Inbox$")
    public void it_opened_inbox() throws Throwable {
        throw new PendingException();
    }
}