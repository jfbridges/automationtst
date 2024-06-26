package com.appium.pro.theapp.automation.stepdefinitions


import com.appium.pro.theapp.automation.interactions.EnterFalseCredentials
import com.appium.pro.theapp.automation.questions.TheScreenValidateCorrectUser
import com.appium.pro.theapp.automation.questions.TheScreenValidateWrongUser
import com.appium.pro.theapp.automation.task.EnterTheLogin
import io.cucumber.java.es.Cuando
import io.cucumber.java.es.Dado
import io.cucumber.java.es.Entonces
import net.serenitybdd.screenplay.GivenWhenThen
import net.serenitybdd.screenplay.actors.OnStage

class LoginStepdefinition {

    /* @Before
     fun setstage(){
         OnStage.setTheStage(OnlineCast())
     }*/

    @Dado("^EL usuario (.*) abre la aplicacion the app")
    fun fromMenuTheApp(actor: String) {
        OnStage.theActorCalled(actor).entersTheScene()
    }

    @Cuando("El usuario ingresa a la opcion login")
    fun userEnterTheLoginOption() {
        OnStage.withCurrentActor(EnterTheLogin.menuAppLoginOption())
    }

    @Cuando("^Diligencia los campos (.*) y (.*)")
    fun userEnterCredentials(usuario: String, password: String) {
        OnStage.withCurrentActor(EnterFalseCredentials.enterUserFalseData(usuario, password))
    }

    @Entonces("Es validado como usuario no autorizado")
    fun userIsValidatedAsWrongUser() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat<Boolean>(TheScreenValidateWrongUser.forUserOnValidateCredentials()))
    }

    @Entonces("Es validado como usuario autorizado")
    fun userIsValidatedAsUser() {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat<Boolean>(TheScreenValidateCorrectUser.forUserOnValidateCredentials()))
    }


}