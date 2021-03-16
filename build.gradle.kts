plugins {
    `java-library`
    kotlin("jvm") version "1.4.31"
}

group = "com.sofi"

repositories {
    mavenCentral()
    maven("https://juggernaut0.github.io/m2/repository")
}

dependencies {
    val multiplatformUtilsVersion = "0.4.0"
    api("com.github.juggernaut0:multiplatform-utils-jvm:$multiplatformUtilsVersion")
}
