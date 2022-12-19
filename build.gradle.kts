import io.gitlab.arturbosch.detekt.Detekt
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.22"

    id("io.gitlab.arturbosch.detekt") version "1.22.0"
    id("org.jmailen.kotlinter") version "3.12.0"
}

allprojects {
    apply(plugin = "kotlin")

    group = "de.thermondo"
    version = "0.1.0"


    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "17"
    }

    tasks.test {
        useJUnitPlatform()
    }
}

repositories {
    mavenCentral()
}

tasks.withType<Detekt>().configureEach {
    jvmTarget = "17"
    reports {
        html.required.set(true)
        xml.required.set(false)
        txt.required.set(false)
        sarif.required.set(false)
    }
}

