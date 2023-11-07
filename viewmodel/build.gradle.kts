plugins {
    kotlin("multiplatform")
    id("tech.skot.library")
    id("maven-publish")
    signing
}

android {
    namespace = "tech.skot.libraries.tabbar"
}



val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}