package com.appium.pro.theapp.automation.questions

import com.appium.pro.theapp.automation.userinterfaces.MenuAppElements
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Question
import net.serenitybdd.screenplay.annotations.Subject

open class TheScreenValidateCorrectUser:Question<Boolean> {
    companion object{
        fun forUserOnValidateCredentials():TheScreenValidateCorrectUser{
            return TheScreenValidateCorrectUser()
        }
    }

    @Subject("User is validated as a correct user")
    override fun answeredBy(actor:Actor): Boolean {
        return MenuAppElements.TXT_MSG_lOGIN_SUCCES.resolveFor(actor).isVisible
    }
}