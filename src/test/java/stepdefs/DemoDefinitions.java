package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoDefinitions {
    @Given("^I have a configured Cucumber-JVM project$")
    public void i_have_a_configured_Cucumber_JVM_project() throws Exception {
        System.out.println(" This is Given...");
    }

    @When("^I run it within my IDE$")
    public void i_run_it_within_my_IDE() throws Exception {
        System.out.println(" This is Then...");
    }

    @Then("^I will be able to run connected step definitions$")
    public void i_will_be_able_to_run_connected_step_definitions() throws Exception {
        System.out.println(" This is Then...");
    }

}
