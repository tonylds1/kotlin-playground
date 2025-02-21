plugins {
    kotlin("jvm") version "1.9.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

kotlin {
    jvmToolchain(17) // Define Java 17 como target
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("MainKt")
}
