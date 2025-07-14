package co.edu.udea.certificacion.login.stepdefinitions;

import co.edu.udea.certificacion.login.interactions.LoginPageWithBadCredentialsGo;
import co.edu.udea.certificacion.login.questions.*;
import co.edu.udea.certificacion.login.tasks.*;
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

    @Given("que estoy en la pagina principal de CitaSalud")
    public void que_estoy_en_la_pagina_principal_de_cita_salud() {
        user.attemptsTo(Open.url(environmentVariables.getProperty("webdriver.base.url")));
    }

    @When("ingreso los datos correctos")
    public void ingreso_los_datos_correctos() {
        user.attemptsTo(SignupThe.signPage());
    }

    @Then("se crea un nuevo usuario")
    public void se_crea_un_nuevo_usuario() {
        user.should(seeThat(ValidationSignup.greetings(), equalTo(true)));
    }

    @When("ingreso los datos de un usuario existente")
    public void ingreso_los_datos_de_un_usuario_existente() {
        user.attemptsTo(SignupTheExistingUser.signPage());
    }

    @Then("veo una alerta indicando que error hay")
    public void veo_una_alerta_indicando_que_error_hay() {
        user.should(seeThat(ValidationSignupWithExistingUser.error(), equalTo(true)));
    }

    @When("no ingreso todos los datos solicitados")
    public void no_ingreso_todos_los_datos_solicitados() {
        user.attemptsTo(SignupTheWithoutData.signIt());
    }

    @Then("veo una alerta indicando que faltan llenarlos")
    public void veo_una_alerta_indicando_que_faltan_llenarlos() {
        user.should(seeThat(ValidationSignupWithoutData.error(), equalTo(true)));
    }

}
