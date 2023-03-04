import gradle.kotlin.dsl.accessors._d7bf04f8f7f7024726476a695348064c.testImplementation

plugins {
   id("base.kotlin-jvm")
    `java-library`
}

dependencies {
    // main bom
    implementation(platform("org.http4k:http4k-bom:4.40.0.0"))
    // test bom
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
}
