plugins {
    kotlin("multiplatform")
    id("tech.skot.library-contract")
    id("maven-publish")
    signing
}


val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}