package co.edu.udea.certificacion.login.tasks;

import co.edu.udea.certificacion.login.interactions.SignupPageWithoutDataGo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SignupTheWithoutData implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SignupPageWithoutDataGo.signIt());
    }

    public static SignupTheWithoutData signIt(){
        return Tasks.instrumented(SignupTheWithoutData.class);
    }
}
