package com.appium.pro.theapp.automation.task

import com.appium.pro.theapp.automation.userinterfaces.ListOptionElements
import net.serenitybdd.annotations.Step
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Task
import net.serenitybdd.screenplay.Tasks
import net.serenitybdd.screenplay.actions.Click

open class SelectItemList:Task {
    companion object{
        fun UserSelectItem():SelectItemList{
            return Tasks.instrumented(SelectItemList::class.java)
        }
    }

    @Step("User select Item from List")
    override fun <T : Actor> performAs(actor: T) {
        actor.attemptsTo(
            Click.on(ListOptionElements.TXT_LIST_15)

        )
    }
}