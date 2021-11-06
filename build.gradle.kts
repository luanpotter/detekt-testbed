plugins {
    application
    kotlin("jvm") version "1.5.31"

    id("io.gitlab.arturbosch.detekt") version "1.19.0-RC1"
}

group = "xyz.luan.test"
version = "0.1.0"

application {
    mainClass.set("xyz.luan.test.MainKt")
}

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    maven("https://kotlin.bintray.com/kotlinx")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.languageVersion = "1.5"
        kotlinOptions.apiVersion = "1.5"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
        kotlinOptions.languageVersion = "1.5"
        kotlinOptions.apiVersion = "1.5"
    }
}

detekt {
    toolVersion = "1.17.1"
    source = files("src/main/kotlin", "test/main/kotlin")
    parallel = true
    config = files("src/main/resources/detekt.yml")
}