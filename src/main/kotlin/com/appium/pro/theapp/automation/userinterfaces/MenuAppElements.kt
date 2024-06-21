package com.appium.pro.theapp.automation.userinterfaces

import net.serenitybdd.screenplay.targets.Target

object MenuAppElements {
    val BTN_LOGIN: Target =
        Target.the("Button login menu app")
            .locatedBy("//android.widget.TextView[@resource-id=\"listItemTitle\" and @text=\"Login Screen\"]")

    val  LBL_USERNAME: Target=
        Target.the("username field").locatedBy("//android.widget.EditText[@content-desc=\"username\"]")

    val LBL_PASSWORD: Target=
        Target.the("password field").locatedBy("//android.widget.EditText[@content-desc=\"password\"]")

    val BTN_VAL_LOGIN:Target=
        Target.the("Login button").locatedBy("//android.widget.Button[@content-desc=\"loginBtn\"]")

    val TXT_MSG_LOGIN_FAILED:Target=
        Target.the("Message login validation").locatedBy("//android.widget.TextView[@resource-id=\"android:id/message\"and @text='Invalid login credentials, please try again']")

    val TXT_MSG_lOGIN_SUCCES:Target=
        Target.the("Message login validation ok").locatedBy("//android.widget.TextView[@text=\"Secret Area\"]")

    val BTN_LIST:Target=
        Target.the("Button list demo menu app").locatedBy("//android.widget.TextView[@resource-id=\"listItemTitle\" and @text=\"List Demo\"]")
}