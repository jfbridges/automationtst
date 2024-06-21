package com.appium.pro.theapp.automation.task


import com.appium.pro.theapp.automation.userinterfaces.MenuAppElements
import net.serenitybdd.annotations.Step
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.Tasks
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers
import net.serenitybdd.screenplay.waits.WaitUntil

open class EnterTheLogin :Task {
    companion object {
        fun menuAppLoginOption(): EnterTheLogin {
            return Tasks.instrumented(EnterTheLogin::class.java)
        }
    }

    @Step("user enters the menu the app login")
    override fun <T : Actor> performAs(actor:T) {
        actor.attemptsTo(
            WaitUntil.the(MenuAppElements.BTN_LOGIN, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
            Click.on(MenuAppElements.BTN_LOGIN)
        )
    }

}
