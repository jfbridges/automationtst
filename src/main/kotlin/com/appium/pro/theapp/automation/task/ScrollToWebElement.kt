package com.appium.pro.theapp.automation.task

import io.appium.java_client.AppiumBy
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Performable
import net.serenitybdd.screenplay.abilities.BrowseTheWeb
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers
import net.serenitybdd.screenplay.targets.Target
import net.serenitybdd.screenplay.waits.WaitUntil
import org.openqa.selenium.WebDriver

open class ScrollToWebElement(private val target: Target): Performable {


    override fun <T : Actor> performAs(actor: T) {
        val driver: WebDriver = actor.abilityTo(BrowseTheWeb::class.java).driver
        val txt:String=target.toString()
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().text(\"" +txt+"\"));"));
        actor.attemptsTo(
            WaitUntil.the(target,WebElementStateMatchers.isVisible()).forNoMoreThan(2).seconds()
        )
    }
}






//          val action : Actions=Actions(driver)
//            val element: WebElement = target.resolveFor(actor)
//            action.moveToElement(element).perform()
//            val driver: WebDriver =actor.abilityTo(BrowseTheWeb::class.java).driver
//            (driver as JavascriptExecutor).executeScript("arguments[0].scrollIntoView(true);",element)
//            (driver as JavascriptExecutor).executeScript("arguments[0].scrollIntoView();",element)
//        val js: JavascriptExecutor = actor.abilityTo(BrowseTheWeb::class.java)as(WebDriver::class.java) as JavascriptExecutor
//        js.executeScript("arguments[0].scrollIntoView();", element)
