plugins {
    kotlin("jvm") version "2.0.21"
    application
}

group = "org.exampl"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("org.exampl.MainKt") // Укажите главный класс
}

kotlin {
    jvmToolchain(21)
}