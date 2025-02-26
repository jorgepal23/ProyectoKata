package net.PPE.task;

import net.PPE.UI.ActivateUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class SelAccountTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ActivateUI.BTN_PRO),
                Click.on(ActivateUI.BTN_TIPPRO),
                Click.on(ActivateUI.BTN_ACT)
        );
    }
    public static SelAccountTask selAccount(){
        return  instrumented(SelAccountTask.class);
    }
}
