package platforms.api.StepDefinitions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import platforms.api.UserComments;

public class UsersCommentsSteps {

    @When("^user search for the user with username “(.+)”$$")
    public void userSearchForTheUserWithUsername(String username) {
        UserComments.getUsername(username);
    }

    @Then("^user successfully get id and comments$")
    public void userSuccessfullyGetIdAndComments()  {
        UserComments.getComments();
    }

}
