package co.edu.udea.certificacion.login.interactions;

import co.edu.udea.certificacion.login.userinterfaces.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.certificacion.login.userinterfaces.HomePage.SIGNUP_BUTTON;
import static co.edu.udea.certificacion.login.userinterfaces.RegisterPage.*;
import static co.edu.udea.certificacion.login.userinterfaces.RegisterPage.CELLPHONE_FIELD;

public class SignupPageWithoutDataGo implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SIGNUP_BUTTON));
        actor.attemptsTo(Enter.theValue("Test").into(NAME_FIELD));
        actor.attemptsTo(Enter.theValue("Creation").into(LAST_NAME_FIELD));
        actor.attemptsTo(Enter.theValue("test3@citasalud.com").into(RegisterPage.EMAIL_FIELD));
        actor.attemptsTo(Enter.theValue("123456789").into(CELLPHONE_FIELD));
        actor.attemptsTo(Click.on(TYC_CHECKBOX));
        actor.attemptsTo(Enter.theValue("test321").into(RegisterPage.PASSWORD_FIELD).thenHit(Keys.RETURN));
    }

    public static SignupPageWithoutDataGo signIt() {
        return Tasks.instrumented(SignupPageWithoutDataGo.class);
    }
}
