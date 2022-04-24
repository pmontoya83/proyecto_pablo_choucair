package co.com.choucair.certification.pablo.stepdefinitions;

import co.com.choucair.certification.pablo.model.AcademyChoucairData;
import co.com.choucair.certification.pablo.questions.Answer;
import co.com.choucair.certification.pablo.tasks.Login;
import co.com.choucair.certification.pablo.tasks.OpenUp;
import co.com.choucair.certification.pablo.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^the user Pablo is on the Utest\\.com page button join today is present on the screen$")
    public void theUserPabloIsOnTheUtestComPageButtonJoinTodayIsPresentOnTheScreen(List<AcademyChoucairData>academyChoucairData) {

        OnStage.theActorCalled("Pablo").wasAbleTo(OpenUp.thePage(),(Login.onThePage()));
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrUser()));
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrPassword()));
    }


    @When("^the user searches for the academies$")
    public void theUserSearchesForTheAcademies(List<AcademyChoucairData>academyChoucairData) {
    OnStage.theActorInTheSpotlight().attemptsTo(Search.the(academyChoucairData.get(0).getStrCourse()));
    }


    @Then("^the user searches for the course Introduction to uTest$")
    public void theUserSearchesForTheCourseIntroductionToUTest(List<AcademyChoucairData>academyChoucairData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));

}

}
