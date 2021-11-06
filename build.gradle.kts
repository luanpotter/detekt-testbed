buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.70")
    }
}

repositories {
    mavenCentral()
}

plugins {
    id("io.gitlab.arturbosch.detekt") version "1.19.0-RC1"
    kotlin("jvm") version "1.5.31"
}

apply {
    plugin("kotlin")
    plugin("application")
}

configure<ApplicationPluginConvention> {
    mainClassName = "xyz.luan.test.MainKt"
}
