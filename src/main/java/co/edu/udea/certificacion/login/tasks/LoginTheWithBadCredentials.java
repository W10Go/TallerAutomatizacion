package co.edu.udea.certificacion.login.tasks;

import co.edu.udea.certificacion.login.interactions.LoginPageWithBadCredentialsGo;
import co.edu.udea.certificacion.login.interactions.LoginPageWithoutCredentialsGo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginTheWithBadCredentials implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginPageWithBadCredentialsGo.logIt());
    }

    public static LoginTheWithBadCredentials logPage(){
        return Tasks.instrumented(LoginTheWithBadCredentials.class);
    }
}
