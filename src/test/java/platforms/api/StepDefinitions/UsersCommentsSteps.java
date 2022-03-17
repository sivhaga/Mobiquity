package platforms.api.StepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import platforms.api.UserComments;

public class UsersCommentsSteps {
    @Given("^the url$")
    public void the_url() {
    }

    @And("^Search for the user with username “(.+)”$$")
    public void searchForTheUserWithUsername(String username) {
        UserComments.getUsername(username);
    }

    @Then("^Successfully get id and comments$")
    public void successfullyGetIdAndComments()  {
        UserComments.getComments();
    }

}
