package co.edu.udea.certificacion.login.utils;

import net.serenitybdd.model.environment.ConfiguredEnvironment;
import net.thucydides.model.util.EnvironmentVariables;

public class Credentials {
    private EnvironmentVariables environmentVariables = ConfiguredEnvironment.getEnvironmentVariables();

    private String email;
    private String password;

    public Credentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Credentials() {
        this.email = environmentVariables.getProperty("citasalud_email");
        this.password = environmentVariables.getProperty("citasalud_password");
    }

    public String getEmail() { return email; }
    public String getPassword() { return password; }
}
