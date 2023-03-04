plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    val kotlin = "1.8.10"
    val detekt = "1.22.0"
    val jib = "3.3.1"

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:$detekt")
    implementation("com.google.cloud.tools:jib-gradle-plugin:$jib")
}
