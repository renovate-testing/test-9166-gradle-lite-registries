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
    api("com.github.juggernaut0:multiplatform-utils-jvm:0.4.0")
    api("com.fasterxml.jackson.core:jackson-databind:2.12.3")
}
