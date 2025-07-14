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

public class LoginCitaSaludRunnerStepDefinition {

    private final EnvironmentVariables environmentVariables = ConfiguredEnvironment.getEnvironmentVariables();

    @Managed(driver="chrome")
    public WebDriver driver;

    private Actor user = Actor.named("Paciente");

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        user.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro en la pagina principal de CitaSalud")
    public void que_me_encuentro_en_la_pagina_principal_de_cita_salud() {
        user.attemptsTo(Open.url(environmentVariables.getProperty("webdriver.base.url")));
    }
    @When("ingreso las credenciales correctas")
    public void ingreso_las_credenciales_correctas() {
        user.attemptsTo(LoginThe.logPage());
    }

    @Then("puedo ver el registro de mis actividades como usuario")
    public void puedo_ver_el_registro_de_mis_actividades_como_usuario() {
        user.should(seeThat(ValidationLogin.greetings(), equalTo(true)));
    }
    @When("ingreso solo una de las credenciales")
    public void ingreso_solo_una_de_las_credenciales() {
        user.attemptsTo(LoginTheWithoutCredentials.logIt());
    }
    @Then("puedo ver alerta pidiendo que use todos los campos")
    public void puedo_ver_alerta_pidiendo_que_use_todos_los_campos(){
        user.should(seeThat(ValidationLoginWithoutCredentials.error(), equalTo(true)));
    }

    @When("ingreso las credenciales incorrectas")
    public void ingreso_las_credenciales_incorrectas() {
        user.attemptsTo(LoginPageWithBadCredentialsGo.logIt());
    }

    @Then("puedo ver alerta indicando que los datos son incorrectos")
    public void puedo_ver_alerta_indicando_que_los_datos_son_incorrectos() {
        user.should(seeThat(ValidationLoginWithBadCredentials.error(), equalTo(true)));
    }



}
