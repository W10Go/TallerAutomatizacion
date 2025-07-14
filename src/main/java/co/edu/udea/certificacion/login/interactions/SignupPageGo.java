package co.edu.udea.certificacion.login.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.certificacion.login.userinterfaces.HomePage.SIGNUP_BUTTON;
import static co.edu.udea.certificacion.login.userinterfaces.RegisterPage.*;

public class SignupPageGo implements Interaction {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SIGNUP_BUTTON));
        actor.attemptsTo(Enter.theValue("Test").into(NAME_FIELD));
        actor.attemptsTo(Enter.theValue("Creation").into(LAST_NAME_FIELD));
        actor.attemptsTo(Enter.theValue("12345678").into(DOCUMENT_FIELD));
        actor.attemptsTo(Enter.theValue("Test2@citasalud.com").into(EMAIL_FIELD));
        actor.attemptsTo(Enter.theValue("123456789").into(CELLPHONE_FIELD));
        actor.attemptsTo(Click.on(TYC_CHECKBOX));
        actor.attemptsTo(Enter.theValue("test321").into(PASSWORD_FIELD).thenHit(Keys.RETURN));
    }
    public static SignupPageGo signIt() {
        return Tasks.instrumented(SignupPageGo.class);
    }
}
