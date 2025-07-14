package co.edu.udea.certificacion.login.tasks;

import co.edu.udea.certificacion.login.interactions.LoginPageGo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class LoginThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(LoginPageGo.logIt());
    }

    public static LoginThe logPage(){
        return Tasks.instrumented(LoginThe.class);
    }
}
