plugins {
    kotlin("multiplatform")
    id("tech.skot.library-viewlegacy")
    id("maven-publish")
    signing
}

android{
    namespace = "tech.skot.libraries.tabbar.viewlegacy"
}

kotlin {
    androidTarget("android") {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}