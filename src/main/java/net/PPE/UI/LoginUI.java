package net.PPE.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class LoginUI {
    public static Target INPUT_USER =Target.the("Enter user").located(By.id("user"));
    public static Target BTN_PASSWORD =Target.the("Enter password fake").located(By.id("fake_pass"));
    public static Target TXT_PASSWORD =Target.the("Enter password").located(By.id("pass"));
    public static Target BTN_DOMINIO =Target.the("Enter domain").locatedBy("//*[@id='dominio']/option[@value='PRO1']");
    public static Target BUTTON_LOGIN =Target.the("Ingresar").located(By.id("enviarLink"));
    public static Target LBL_WELCOME =Target.the("Welcome").locatedBy("//*[contains(text(),'Bienvenido')]");

}
