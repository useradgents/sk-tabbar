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
    jvmToolchain(17)
    compilerOptions {
        apiVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_2)
    }
    androidTarget("android") {

    }
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}