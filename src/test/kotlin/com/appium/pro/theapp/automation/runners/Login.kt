package com.appium.pro.theapp.automation.runners

import io.cucumber.junit.CucumberOptions
import net.serenitybdd.cucumber.CucumberWithSerenity
import org.junit.runner.RunWith

@RunWith(CucumberWithSerenity::class)
@CucumberOptions(
    glue = ["com.appium.pro.theapp.automation.stepdefinitions"],
    features = ["src/test/resources/features/Login.feature"],
    snippets = CucumberOptions.SnippetType.CAMELCASE)
class Login