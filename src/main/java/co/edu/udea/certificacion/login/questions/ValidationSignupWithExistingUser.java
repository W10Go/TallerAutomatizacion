package co.edu.udea.certificacion.login.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.concurrent.TimeUnit;

import static co.edu.udea.certificacion.login.userinterfaces.RegisterPage.ERROR_MESSAGE;

public class ValidationSignupWithExistingUser implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualText = Text.of(ERROR_MESSAGE).answeredBy(actor);
        return actualText.contains("Usuario ya se encuentra registrado");
    }

    public static ValidationSignupWithExistingUser error() {
        return new ValidationSignupWithExistingUser();
    }
}
