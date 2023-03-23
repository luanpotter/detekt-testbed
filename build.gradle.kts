plugins {
    application
    kotlin("jvm") version "1.7.20"

    id("io.gitlab.arturbosch.detekt") version "1.22.0"
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

detekt {
    toolVersion = "1.22.0"
    source = files("src/main/kotlin", "test/main/kotlin")
    parallel = true
    config = files("src/main/resources/detekt.yml")
}