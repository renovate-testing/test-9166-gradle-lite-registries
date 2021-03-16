plugins {
    `java-library`
    kotlin("jvm") version "1.4.20"
}

group = "com.sofi"

repositories {
    mavenCentral()
}

dependencies {
    val jwtVersion: String by project

    api("io.jsonwebtoken", "jjwt-api", jwtVersion)
    api("com.fasterxml.jackson.core", "jackson-databind", "2.10.5")
}
