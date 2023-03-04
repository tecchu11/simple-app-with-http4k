plugins {
    id("com.google.cloud.tools.jib")
}

jib {
    from.platforms {
        platform {
            architecture = "arm64"
            os = "linux"
        }
    }
    to.image = "${rootProject.name}-${project.name}"
    container.creationTime.set("USE_CURRENT_TIMESTAMP")
}
