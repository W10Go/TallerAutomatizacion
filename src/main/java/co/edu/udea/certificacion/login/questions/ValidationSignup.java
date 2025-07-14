package co.edu.udea.certificacion.login.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.concurrent.TimeUnit;

import static co.edu.udea.certificacion.login.userinterfaces.DashboardPage.GREETINGS_FIELD;

public class ValidationSignup implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualText = Text.of(GREETINGS_FIELD).answeredBy(actor);
        return actualText.contains("¡Bienvenido, Test Creation!");
    }

    public static ValidationSignup greetings() {
        return new ValidationSignup();
    }


}
