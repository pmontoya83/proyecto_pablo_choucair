package co.com.choucair.certification.pablo.tasks;

import co.com.choucair.certification.pablo.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class Login implements Task {

    private String strUser;

    public Login(String strUser) {
        this.strUser = strUser;
    }

    public String getStrUser() {
        return strUser;
    }

    public void setStrUser(String strUser) {
        this.strUser = strUser;
    }

    private String strPassword;

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }


    public static Login onThePage() {

        return Tasks.instrumented(Login.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue("pablomontoya3914@gmail.com").into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue("Pmontoya83").into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)

        );
    }
}
