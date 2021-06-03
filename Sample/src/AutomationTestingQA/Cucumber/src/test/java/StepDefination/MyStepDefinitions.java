package StepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^google search page$")
    public void google_search_page() throws Throwable {
        throw new PendingException();
    }

    @When("^given the text as Cucumber Tutorial$")
    public void given_the_text_as_cucumber_tutorial() throws Throwable {
        throw new PendingException();
    }

    @Then("^Tutorials will list out$")
    public void tutorials_will_list_out() throws Throwable {
        throw new PendingException();
    }

}