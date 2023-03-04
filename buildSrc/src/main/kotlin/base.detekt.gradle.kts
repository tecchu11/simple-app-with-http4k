import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.report.ReportMergeTask

plugins {
    id("io.gitlab.arturbosch.detekt")
}

dependencies {
    detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:${detekt.toolVersion}")
}

detekt {
    config = files("$rootDir/config/detekt/detekt.yml")
    buildUponDefaultConfig = true
    parallel = true
    autoCorrect = true
}

tasks.withType<Detekt> {
    reports {
        html.required.set(false)
        xml.required.set(false)
        md.required.set(true)
        txt.required.set(false)
        sarif.required.set(false)
    }
}
