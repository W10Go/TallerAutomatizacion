package co.edu.udea.certificacion.login.tasks;

import co.edu.udea.certificacion.login.interactions.SignupPageWithExistingUserGo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SignupTheExistingUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SignupPageWithExistingUserGo.signIt());
    }

    public static SignupTheExistingUser signPage(){
        return Tasks.instrumented(SignupTheExistingUser.class);
    }
}
