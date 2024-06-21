package com.appium.pro.theapp.automation.interactions

import com.appium.pro.theapp.automation.task.ScrollToElement
import net.serenitybdd.annotations.Step
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Interaction
import net.serenitybdd.screenplay.Tasks
import net.serenitybdd.screenplay.targets.Target

open class ScrollToElementStep(private val target: Target) :Interaction{
    companion object {
        fun scrollToElement(target: Target):ScrollToElementStep {
            return Tasks.instrumented(ScrollToElementStep::class.java,target )
        }
    }
    @Step("make a scroll")
        override fun <T : Actor> performAs(actor: T) {
            actor.attemptsTo(
                ScrollToElement.scrollToElement(target)
            )
        }


    }
