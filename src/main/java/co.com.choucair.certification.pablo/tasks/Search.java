package co.com.choucair.certification.pablo.tasks;

import co.com.choucair.certification.pablo.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private String academies;

    public Search(String academies) {
        this.academies = academies;
    }

    public static Search the(String academies) {

        return Tasks.instrumented(Search.class,academies);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchCoursePage.INPUT_ACADEMY),
                Enter.theValue(academies).into(SearchCoursePage.LOGIN_BUTTON),
                Click.on(SearchCoursePage.SELECT_COURSE)

        );

    }
}
