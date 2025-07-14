package co.edu.udea.certificacion.login.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target LOGIN_BUTTON = Target.the("LOGIN BUTTON").locatedBy("/html/body/main/div[2]/nav/div[2]/div/a/button");
    public static final Target SIGNUP_BUTTON = Target.the("SIGNUP BUTTON").locatedBy("/html/body/main/div[2]/nav/div[2]/div/div/a");
}
