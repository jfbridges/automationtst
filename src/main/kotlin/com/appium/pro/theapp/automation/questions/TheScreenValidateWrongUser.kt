package com.appium.pro.theapp.automation.questions

import com.appium.pro.theapp.automation.userinterfaces.MenuAppElements
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Question
import net.serenitybdd.screenplay.annotations.Subject

open class TheScreenValidateWrongUser:Question<Boolean> {
    companion object{
        fun forUserOnValidateCredentials():TheScreenValidateWrongUser{
            return TheScreenValidateWrongUser()
        }
    }

    @Subject("User is validated like unautorized")
    override fun answeredBy(actor: Actor): Boolean {
        return MenuAppElements.TXT_MSG_LOGIN_FAILED.resolveFor(actor).isVisible
    }
}