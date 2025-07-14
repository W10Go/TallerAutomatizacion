package co.edu.udea.certificacion.login.stepdefinitions;

import co.edu.udea.certificacion.login.interactions.LoginPageWithBadCredentialsGo;
import co.edu.udea.certificacion.login.questions.ValidationLogin;
import co.edu.udea.certificacion.login.questions.ValidationLoginWithBadCredentials;
import co.edu.udea.certificacion.login.questions.ValidationLoginWithoutCredentials;
import co.edu.udea.certificacion.login.tasks.LoginThe;
import co.edu.udea.certificacion.login.tasks.LoginTheWithoutCredentials;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.model.environment.ConfiguredEnvironment;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.model.util.EnvironmentVariables;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class SignupCitaSaludRunnerStepDefinition {
    private final EnvironmentVariables environmentVariables = ConfiguredEnvironment.getEnvironmentVariables();

    @Managed(driver="chrome")
    public WebDriver driver;

    private Actor user = Actor.named("Paciente");

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        user.can(BrowseTheWeb.with(driver));
    }

}
