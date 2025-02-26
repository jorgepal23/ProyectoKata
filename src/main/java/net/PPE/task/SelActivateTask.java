package net.PPE.task;

import net.PPE.UI.ActivateUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelActivateTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ActivateUI.BTN_ACTIVATE),
                Click.on(ActivateUI.BTN_ACTIVATECHK)
        );
    }
    public static SelActivateTask selectActivate(){
        return  instrumented(SelActivateTask.class);
    }
}
