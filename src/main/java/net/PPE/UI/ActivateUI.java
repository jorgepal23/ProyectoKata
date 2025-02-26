package net.PPE.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ActivateUI {
    public static Target BTN_ACTIVATE =Target.the("Select the activate").locatedBy("//*[contains(text(),'Activacion y ONP de chequeras')]");
    public static Target BTN_ACTIVATECHK =Target.the("Select the activate checkbook").locatedBy("//*[contains(text(),'Activacion de chequeras')]");
    public static Target BTN_TIP=Target.the("Select the type").locatedBy("//button[@class='ui-multiselect ui-widget ui-state-default ui-corner-all']");
    public static Target BTN_TIPID=Target.the("Select the ID type").locatedBy("//label[@for='ui-multiselect-tipoId-option-7']/span");
    public static Target TXT_TIPID=Target.the("Select the ID type").locatedBy("//*[@id='numeroId']");
    public static Target BTN_SEARCH=Target.the("Enter to search").locatedBy("//button[@id='buscarCuentasBtn']/span");
    public static Target BTN_PRO=Target.the("Select the product type").locatedBy("//button[@class='ui-multiselect ui-widget ui-state-default ui-corner-all']");
    public static Target BTN_TIPPRO=Target.the("Select the ID product type").locatedBy("//label[@for='ui-multiselect-nombreProducto-option-2']/span");
    public static Target BTN_ACT=Target.the("Enter the active").locatedBy("//button[@class='activarCh ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']");
}