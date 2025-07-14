package co.edu.udea.certificacion.login.tasks;

import co.edu.udea.certificacion.login.interactions.LoginPageWithoutCredentialsGo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginTheWithoutCredentials implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginPageWithoutCredentialsGo.logIt());
    }

    public static LoginTheWithoutCredentials logIt(){
        return Tasks.instrumented(LoginTheWithoutCredentials.class);
    }
}
