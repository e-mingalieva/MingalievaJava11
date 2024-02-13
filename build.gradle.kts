plugins {
    id("java")
    kotlin("jvm")
}

group = "java11.mingalieva"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation(kotlin("stdlib-jdk8"))
}
kotlin {
    jvmToolchain(11)
}