package net.PPE.task;

import net.PPE.UI.ActivateUI;
import net.PPE.UI.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static net.PPE.UI.ActivateUI.BTN_TIP;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class EnterThePageTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LoginUI.BUTTON_LOGIN)
        );
    }
    public static EnterThePageTask enterThePage(){
        return  instrumented(EnterThePageTask.class);
    }
}
