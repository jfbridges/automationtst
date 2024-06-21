package com.appium.pro.theapp.automation.questions

import com.appium.pro.theapp.automation.userinterfaces.ListOptionElements
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Question
import net.serenitybdd.screenplay.annotations.Subject

open class TheAlertMessage:Question<Boolean> {

    companion object{
        fun ForUserOnListScreenValidation():TheAlertMessage{
            return TheAlertMessage()
        }
    }

    @Subject("Validate message for list screen")
    override fun answeredBy(actor: Actor): Boolean {
        return ListOptionElements.MSGS_ALERT.resolveFor(actor).isVisible
    }
}