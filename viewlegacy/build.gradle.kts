plugins {
    id("tech.skot.library-viewlegacy")
    id("maven-publish")
    signing
}

kotlin {
    jvmToolchain(17)
    compilerOptions {
        apiVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_3)
    }
}

android {
    compileSdk { version = release(36) }
    namespace = "tech.skot.libraries.tabbar.viewlegacy"
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}