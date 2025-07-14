package co.edu.udea.certificacion.login.runners.runnerspackage;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/signup_citasalud.feature/",
        glue = "co.edu.udea.certificacion.login.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SignupCitaSaludRunner {
}
