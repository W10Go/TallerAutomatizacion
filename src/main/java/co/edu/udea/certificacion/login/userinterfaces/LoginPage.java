package co.edu.udea.certificacion.login.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target EMAIL_FIELD = Target.the("EMAIL FIELD").locatedBy("/html/body/main/section[2]/div/form/input");
    public static final Target PASSWORD_FIELD = Target.the("PASSWORD FIELD").locatedBy("/html/body/main/section[2]/div/form/div/input");
    public static final Target ERROR_MESSAGE = Target.the("ERROR TEXT").locatedBy("/html/body/main/section[2]/div/form/p");
}