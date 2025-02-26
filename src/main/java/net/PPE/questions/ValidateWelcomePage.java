package net.PPE.questions;

import net.PPE.UI.ActivateUI;
import net.PPE.UI.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

public class ValidateWelcomePage implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LoginUI.LBL_WELCOME.resolveFor(actor).isVisible();
    }
    public static Question validate(){
        return new ValidateWelcomePage();
    }
}