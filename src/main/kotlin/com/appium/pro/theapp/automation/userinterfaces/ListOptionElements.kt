package com.appium.pro.theapp.automation.userinterfaces

import net.serenitybdd.screenplay.targets.Target
import org.openqa.selenium.By

object ListOptionElements {
    val LIST_VIEW: Target =
        Target.the("List of cloud elements").locatedBy("//android.widget.ScrollView")

    val LBL_LIST: Target =
        Target.the("Cumulus Congestus")
            .locatedBy("//android.widget.TextView[@resource-id=\"listItemTitle\" and @text=\"Cumulus Congestus\"]")

    val TXT_LIST_15: Target =
        Target.the("IBM Cloud")
            .locatedBy("//android.widget.TextView[@resource-id=\"listItemTitle\" and @text=\"IBM Cloud\"]")

    val TST_LST_9:Target=
        Target.the("Cumulus Congestus").locatedBy("//android.view.ViewGroup[@content-desc=\"Cumulus Congestus\"]")

    val LST_GRP:Target=
        Target.the("view group").locatedBy("//android.widget.ScrollView/android.view.ViewGroup")

    val MSGS_ALERT:Target=
        Target.the("Alert Message Screen").located(By.id("android:id/alertTitle"))

    val MSGS_ALERT_BTN_OK:Target=
        Target.the("Alert Message Screeen button OK").located(By.id("android:id/button1"))

    val MSGS_ALERT_BTN_CANCEL:Target=
        Target.the("Alert Message Screeen button CANCEL").located(By.id("android:id/button2"))

    val MSGS_ALERT_BTN_INFO:Target=
        Target.the("Alert Message Screeen button INFO").located(By.id("android:id/button3"))

    val INFO_LBL:Target=
        Target.the("Title of Alert More Info Screen").locatedBy("//android.widget.TextView[@resource-id=\"android:id/alertTitle\" and @text=\"IBM Cloud\"]")


}