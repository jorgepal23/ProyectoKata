package net.PPE.task;

import net.PPE.UI.LoginUI;
import net.PPE.utils.CallData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.PPE.utils.CallData.extractTo;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class EnterUserPassTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(extractTo().get(0).get("USUARIO")).into(LoginUI.INPUT_USER),
                Click.on(LoginUI.BTN_PASSWORD),
                Enter.theValue(extractTo().get(0).get("PASS")).into(LoginUI.TXT_PASSWORD),
                Click.on(LoginUI.BTN_DOMINIO)
        );
    }
    public static EnterUserPassTask enterUserPass(){
        return  instrumented(EnterUserPassTask.class);
    }
}
