package co.edu.udea.certificacion.login.tasks;

import co.edu.udea.certificacion.login.interactions.SignupPageGo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SignupThe implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SignupPageGo.signIt());
    }

    public static SignupThe signPage(){
        return Tasks.instrumented(SignupThe.class);
    }
}
