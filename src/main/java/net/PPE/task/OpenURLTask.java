package net.PPE.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class OpenURLTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("http://ppeportalprue.bancodebogota.net:8000/PPE/login.jsp")
        );
    }
    public static OpenURLTask openBrowser(){
        return  instrumented(OpenURLTask.class);
    }
}