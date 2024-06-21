package com.appium.pro.theapp.automation.interactions

import net.serenitybdd.annotations.Step
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Interaction
import net.serenitybdd.screenplay.Tasks
import net.serenitybdd.screenplay.actions.Click
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers
import net.serenitybdd.screenplay.targets.Target
import net.serenitybdd.screenplay.waits.WaitUntil

open class ClicOnScreen(private val elmnt:Target):Interaction {
    companion object{
        fun UserMakeClick(elmnt: Target):ClicOnScreen{
            return Tasks.instrumented(ClicOnScreen::class.java,elmnt)

        }
    }

    @Step("User make a click on screen")
    override fun <T : Actor> performAs(actor: T) {
       actor.attemptsTo(
           WaitUntil.the(elmnt,WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
           Click.on(elmnt)
       )
    }

}