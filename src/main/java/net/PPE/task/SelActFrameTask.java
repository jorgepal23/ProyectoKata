package net.PPE.task;

import net.PPE.UI.ActivateUI;
import net.PPE.UI.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;

import static net.PPE.utils.CallData.extractTo;
import static net.serenitybdd.screenplay.Tasks.instrumented;
public class SelActFrameTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Switch.toFrame("iframe iFrame1"),
                Click.on(ActivateUI.BTN_TIP),
                Click.on(ActivateUI.BTN_TIPID),
                //Enter.theValue("9005470519").into(ActivateUI.TXT_TIPID),
                Enter.theValue(extractTo().get(0).get("NUMBER")).into(ActivateUI.TXT_TIPID),
                Click.on(ActivateUI.BTN_SEARCH)
        );
    }
    public static SelActFrameTask selActFrame(){
        return  instrumented(SelActFrameTask.class);
    }
}