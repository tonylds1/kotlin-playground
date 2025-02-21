plugins {
    kotlin("jvm") version "1.9.21"  // Atualize para a versão mais recente
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.10.0")
}

kotlin {
    jvmToolchain(17) // Garantir compatibilidade com Java 17
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}

application {
    mainClass.set("main.MainKt")
}
