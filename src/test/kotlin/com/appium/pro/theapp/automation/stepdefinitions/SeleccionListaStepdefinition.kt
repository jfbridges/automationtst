package com.appium.pro.theapp.automation.stepdefinitions

import com.appium.pro.theapp.automation.interactions.ClicOnScreen
import com.appium.pro.theapp.automation.questions.TheAlertMessage
import com.appium.pro.theapp.automation.questions.TheUserSeeMoreInfoScr
import com.appium.pro.theapp.automation.task.EnterTheListOption
import com.appium.pro.theapp.automation.task.ScrollToElement
import com.appium.pro.theapp.automation.task.SelectItemList
import com.appium.pro.theapp.automation.userinterfaces.ListOptionElements
import io.cucumber.java.es.Cuando
import io.cucumber.java.es.Entonces
import net.serenitybdd.screenplay.GivenWhenThen
import net.serenitybdd.screenplay.actors.OnStage

class SeleccionListaStepdefinition {

    @Cuando("El usuario ingresa a la opcion list demo")
    fun UserEnterTheListOption() {
        OnStage.withCurrentActor(EnterTheListOption.menuAppListDemo())
    }

    @Cuando("Busca la opcion de la lista")
    fun UserSlidesInList(){
    OnStage.withCurrentActor(ScrollToElement(ListOptionElements.TXT_LIST_15))
    }

    @Cuando("selecciona una opcion valida de la lista")
    fun SelectListOption(){
        OnStage.withCurrentActor(SelectItemList.UserSelectItem())
    }

    @Entonces("se valida el mensaje de la opcion seleccionada")
    fun ValidateTheSelectListOption(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat<Boolean>(TheAlertMessage.ForUserOnListScreenValidation()))
    }

    @Entonces("podra seleccionar la opcion OK")
    fun UserSelectOKtoclose(){
        OnStage.withCurrentActor(ClicOnScreen.UserMakeClick(ListOptionElements.MSGS_ALERT_BTN_OK))
    }
    @Entonces("podra cancelar la opcion seleccionada")
    fun USerSelectCanceltoClose(){
        OnStage.withCurrentActor(ClicOnScreen.UserMakeClick(ListOptionElements.MSGS_ALERT_BTN_CANCEL))
    }

    @Cuando("selecciona el boton mas informacion")
    fun UserSelectMoreInfo(){
       OnStage.withCurrentActor(ClicOnScreen.UserMakeClick(ListOptionElements.MSGS_ALERT_BTN_INFO))
    }

    @Entonces("podra ver la pantalla con informacion mas detallada")
    fun UserSeeMoreInfoScreen(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat<Boolean>(TheUserSeeMoreInfoScr.MustSeeInfoScr()))
    }


}