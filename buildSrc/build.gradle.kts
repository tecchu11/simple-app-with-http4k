plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    val kotlin = "1.8.10"

    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin")
}
