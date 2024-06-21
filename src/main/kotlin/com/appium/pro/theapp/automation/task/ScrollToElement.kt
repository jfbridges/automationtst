package com.appium.pro.theapp.automation.task

import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.targets.Target

open class ScrollToElement(private val target: Target) : Task {

        companion object {
            fun scrollToElement(target: Target):ScrollToElement {
                return ScrollToElement(target)
            }
        }


        override fun <T : Actor> performAs(actor: T) {
            actor.attemptsTo(
                ScrollToWebElement(target)
            )
        }
    }






