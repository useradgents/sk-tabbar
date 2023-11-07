
buildscript {
    repositories {
        google()
       // mavenLocal()
        maven { setUrl("https://jitpack.io") }
        mavenCentral()
    }

    dependencies {
        classpath("${Versions.frameworkGroup}:plugin:${Versions.framework}")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.9.10")
    }
}

allprojects {

    group = Versions.group
    version = "${Versions.library}_${Versions.framework}"

    repositories {
        google()
       // mavenLocal()
        maven { setUrl("https://jitpack.io") }
        mavenCentral()
    }

    apply(plugin = "maven-publish")
    apply(plugin = "org.jetbrains.dokka")

}

subprojects{
    tasks {
        named<org.jetbrains.dokka.gradle.DokkaTaskPartial>("dokkaHtmlPartial") {
            suppressInheritedMembers.set(true)
        }
        named<org.jetbrains.dokka.gradle.DokkaTaskPartial>("dokkaGfmPartial") {
            suppressInheritedMembers.set(true)
        }
    }
}

