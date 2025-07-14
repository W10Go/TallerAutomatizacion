package co.edu.udea.certificacion.login.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.util.concurrent.TimeUnit;

import static co.edu.udea.certificacion.login.userinterfaces.LoginPage.ERROR_MESSAGE;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ValidationLoginWithoutCredentials implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualText = Text.of(ERROR_MESSAGE).answeredBy(actor);
        System.out.println(actualText);
        return actualText.contains("Todos los campos son obligatorios");
    }

    public static ValidationLoginWithoutCredentials error() {
        return new ValidationLoginWithoutCredentials();
    }
}
