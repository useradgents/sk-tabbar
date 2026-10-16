plugins {
    id("tech.skot.library-viewlegacy")
    id("maven-publish")
    signing
}

android {
    namespace = "tech.skot.libraries.tabbar.viewlegacy"
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}
