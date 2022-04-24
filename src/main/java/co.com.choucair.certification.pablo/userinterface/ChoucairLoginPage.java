package co.com.choucair.certification.pablo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
/*import net.thucydides.core.pages.PageObject; */
import net.serenitybdd.core.pages.PageObject;


public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login").
            located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("Where do we write the user").
            located(By.id("Email Address"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password").
            located(By.id("Password"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").
            located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
