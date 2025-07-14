package co.edu.udea.certificacion.login.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target ERROR_MESSAGE = Target.the("ERROR TEXT").locatedBy("/html/body/main/div/div/form/p");
    public static final Target NAME_FIELD = Target.the("NAME FIELD").locatedBy("//*[@id='nombre/s']");
    public static final Target LAST_NAME_FIELD = Target.the("LAST NAME FIELD").locatedBy("//*[@id='apellido/s']");
    public static final Target DOCUMENT_FIELD = Target.the("DOCUMENT FIELD").locatedBy("//*[@id='documento-de-identidad-']");
    public static final Target EMAIL_FIELD = Target.the("EMAIL FIELD").locatedBy("//*[@id='correo-electrónico']");
    public static final Target CELLPHONE_FIELD = Target.the("CELLPHONE FIELD").locatedBy("//*[@id='celular']");
    public static final Target PASSWORD_FIELD = Target.the("PASSWORD FIELD").locatedBy("//*[@id='password']");
    public static final Target TYC_CHECKBOX = Target.the("TYC CHECKBOX").locatedBy("/html/body/main/div/div/form/section[1]/input");
}
