package co.edu.udea.certificacion.login.interactions;

import co.edu.udea.certificacion.login.utils.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.edu.udea.certificacion.login.userinterfaces.HomePage.LOGIN_BUTTON;
import static co.edu.udea.certificacion.login.userinterfaces.LoginPage.EMAIL_FIELD;
import static co.edu.udea.certificacion.login.userinterfaces.LoginPage.PASSWORD_FIELD;




public class LoginPageGo implements Interaction {
    private final Credentials credentials = new Credentials();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN_BUTTON));
        actor.attemptsTo(Enter.theValue(credentials.getEmail()).into(EMAIL_FIELD));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(PASSWORD_FIELD).thenHit(Keys.RETURN));
    }
    public static LoginPageGo logIt() {
        return Tasks.instrumented(LoginPageGo.class);
    }
}
