package co.edu.udea.certificacion.login.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.concurrent.TimeUnit;

import static co.edu.udea.certificacion.login.userinterfaces.LoginPage.ERROR_MESSAGE;

public class ValidationLoginWithBadCredentials implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String actualText = Text.of(ERROR_MESSAGE).answeredBy(actor);
        return actualText.contains("Error al iniciar sesión, por favor verifica tus datos");
    }

    public static ValidationLoginWithBadCredentials error() {
        return new ValidationLoginWithBadCredentials();
    }
}
