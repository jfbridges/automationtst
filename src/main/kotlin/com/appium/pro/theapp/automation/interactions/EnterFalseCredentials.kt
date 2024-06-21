package com.appium.pro.theapp.automation.interactions

import com.appium.pro.theapp.automation.userinterfaces.MenuAppElements
import net.serenitybdd.annotations.Step
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Interaction
import net.serenitybdd.screenplay.Tasks
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.actions.Enter

open class EnterFalseCredentials(private val user: String, private val pass: String) : Interaction {

    companion object {
        fun enterUserFalseData(user: String, pass: String): EnterFalseCredentials {
            return Tasks.instrumented(EnterFalseCredentials::class.java, user, pass)
        }
    }

    @Step("User enter his false credentials")
    override fun <T : Actor> performAs(actor: T) {
        actor.attemptsTo(
            Enter.theValue(user).into(MenuAppElements.LBL_USERNAME),
            Enter.theValue(pass).into(MenuAppElements.LBL_PASSWORD),
            Click.on(MenuAppElements.BTN_VAL_LOGIN)

        )
    }
}