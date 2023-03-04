plugins {
    id("base.app")
    id("base.jib")
}

dependencies {
    implementation(libs.http4k.core)
    implementation(libs.http4k.server.undertow)
    implementation(libs.http4k.client.apache)
    testImplementation(libs.junit.jupiter)
}

application {
    mainClass.set("com.example.tecchu11.app.AppKt")
}
