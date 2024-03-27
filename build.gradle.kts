plugins {
    kotlin("jvm") version "1.9.22"
    id("net.serenity-bdd.serenity-gradle-plugin") version "4.1.4-RC1"


}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.serenity-bdd:serenity-cucumber:4.1.4")
    implementation("net.serenity-bdd:serenity-screenplay:4.1.4")
    implementation("ch.qos.logback:logback-classic:1.5.3")
    implementation("org.slf4j:slf4j-api:2.0.12")
    implementation("io.appium:java-client:9.2.0")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("net.serenity-bdd:serenity-core:4.1.4")
    testImplementation("net.serenity-bdd:serenity-model:4.1.4")
    testImplementation("net.serenity-bdd:serenity-ensure:4.1.4")
    testImplementation("io.cucumber:cucumber-java:6.10.4")
    testImplementation("io.cucumber:cucumber-junit:6.10.4")
    testImplementation("io.cucumber:cucumber-core:6.10.1")
    testImplementation("net.serenity-bdd:serenity-cucumber:4.0.31")
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testImplementation ("net.serenity-bdd:serenity-screenplay:4.1.4")
    testImplementation ("org.hamcrest:hamcrest:2.2")
    testImplementation ("org.eclipse.jetty:jetty-util:9.4.53.v20231009")
    testImplementation ("org.checkerframework:checker-qual:3.41.0")
    testImplementation ("net.serenity-bdd:serenity-screenplay-webdriver:4.1.4")
    testImplementation ("io.cucumber:cucumber-gherkin:7.15.0")
    testImplementation ("net.bytebuddy:byte-buddy:1.14.12")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.8.1")

}
apply(
    plugin = "net.serenity-bdd.serenity-gradle-plugin"

)

/*tasks.test {
    useJUnitPlatform()
}*/

kotlin {
    jvmToolchain(20)
}