package com.appium.pro.theapp.automation.stepdefinitions

import io.appium.java_client.AppiumDriver
import io.appium.java_client.android.AndroidDriver
import io.cucumber.java.After
import io.cucumber.java.Before
import net.serenitybdd.screenplay.abilities.BrowseTheWeb
import net.serenitybdd.screenplay.actors.OnStage
import net.serenitybdd.screenplay.actors.OnlineCast
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

open class Hooks {

    lateinit var driver: AppiumDriver
    @Before

    fun setup() {
        // Configuración inicial antes de ejecutar los escenarios
        println("Ejecutando un before 1")

        val capabilities = DesiredCapabilities()
        capabilities.setCapability("platformName", "Android")
        capabilities.setCapability("deviceName", "Automation Device")
        capabilities.setCapability("platformVersion", "12")
//        capabilities.setCapability("app", "/ruta/a/tu/aplicacion.apk")
        capabilities.setCapability("appPackage", "com.appiumpro.the_app")
        capabilities.setCapability("appActivity", "com.appiumpro.the_app.MainActivity")
        capabilities.setCapability("automationName","UIAutomator2")

        val serverUrl= URL("http://localhost:4723")
        driver = AndroidDriver(serverUrl, capabilities)

        fun prepareStage(){
            OnStage.setTheStage(OnlineCast.whereEveryoneCan(BrowseTheWeb.with(driver)))
            println("preparando el stage")
        }
        prepareStage()
    }

    @After
    fun tearDown() {
        // Limpieza o finalización después de ejecutar los escenarios
        println("Ejecutando un after")
        driver.quit()
    }
}