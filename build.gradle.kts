plugins {
    kotlin("js") version "1.4.0"
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.7.1")
}

kotlin {
    js(IR) {
        nodejs()
        binaries.executable()
    }
}
