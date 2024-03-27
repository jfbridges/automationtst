package com.appium.pro.theapp.automation.questions

import com.appium.pro.theapp.automation.userinterfaces.MenuAppElements
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Question
import net.serenitybdd.screenplay.annotations.Subject

open class TheScreenValidateUser:Question<Boolean> {
    companion object{
        fun forUserOnValidateCredentials():TheScreenValidateUser{
            return TheScreenValidateUser()
        }
    }

    @Subject("User is validated like unautorized")
    override fun answeredBy(actor: Actor): Boolean {
        return MenuAppElements.TXT_MSG_LOGIN.resolveFor(actor).isVisible
    }
}