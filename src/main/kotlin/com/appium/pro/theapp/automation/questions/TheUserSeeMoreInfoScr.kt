package com.appium.pro.theapp.automation.questions

import com.appium.pro.theapp.automation.userinterfaces.ListOptionElements
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Question
import net.serenitybdd.screenplay.annotations.Subject

open class TheUserSeeMoreInfoScr:Question<Boolean> {

    companion object{
        fun MustSeeInfoScr():TheUserSeeMoreInfoScr{
            return TheUserSeeMoreInfoScr()
        }
    }

    @Subject("the user must see the info screen")
    override fun answeredBy(actor: Actor): Boolean {
        return ListOptionElements.INFO_LBL.resolveFor(actor).isVisible
    }
}