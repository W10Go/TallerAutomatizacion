package co.edu.udea.certificacion.login.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.concurrent.TimeUnit;

import static co.edu.udea.certificacion.login.userinterfaces.DashboardPage.GREETINGS_FIELD;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidationLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualText = Text.of(GREETINGS_FIELD).answeredBy(actor);
        return actualText.contains("Bienvenido, testini tested");
    }

    public static ValidationLogin greetings() {
        return new ValidationLogin();
    }
}
