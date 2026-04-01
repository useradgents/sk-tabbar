plugins {
    kotlin("multiplatform")
    id("tech.skot.library")
    id("maven-publish")
    signing
}

kotlin {
    android {
        compileSdk = 36
        namespace = "tech.skot.libraries.tabbar"
    }
}



val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}