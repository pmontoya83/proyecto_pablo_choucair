package co.com.choucair.certification.pablo.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;



public class SearchCoursePage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("Introduction to uTest").
            located(By.xpath("//div[@id='Academy']//strong"));

    public static final Target INPUT_ACADEMY = Target.the("Take Course").
            located(By.xpath("coursesearch"));

    public static final Target SELECT_COURSE = Target.the("Welcome to uTest").
            located(By.xpath("//H4[contains(text(),'INTRODUCTION TO UTEST')]"));
}

