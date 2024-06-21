package com.appium.pro.theapp.automation.task


import com.appium.pro.theapp.automation.userinterfaces.MenuAppElements
import net.serenitybdd.annotations.Step
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.Tasks
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers
import net.serenitybdd.screenplay.waits.WaitUntil

open class EnterTheListOption:Task {

    companion object{
        fun menuAppListDemo(): EnterTheListOption{
            return Tasks.instrumented(EnterTheListOption::class.java)
        }
    }

    @Step("User enters to list demo")
    override fun <T : Actor> performAs(actor:T) {
        actor.attemptsTo(
            WaitUntil.the(MenuAppElements.BTN_LIST, WebElementStateMatchers.isVisible()).forNoMoreThan(20).seconds(),
            Click.on(MenuAppElements.BTN_LIST)
        )
    }
}