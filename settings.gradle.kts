pluginManagement {
    repositories {
        google()
        jcenter()
        maven(url = "https://jitpack.io")
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }

    val versions = object {
        val kotlin = "1.3.72"
        val android_tools = "3.6.0"
    }

    resolutionStrategy {
        eachPlugin {
            if (requested.id.id.contains("kotlin.multiplatform")) {
                useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${versions.kotlin}")
            }
            if (requested.id.id.contains("serialization")) {
                useModule("org.jetbrains.kotlin:kotlin-serialization:${versions.kotlin}")
            }
            if (requested.id.id.contains("android")) {
                useModule("com.android.tools.build:gradle:${versions.android_tools}")
            }
            if (requested.id.id == "com.jfrog.bintray") {
                useModule("com.jfrog.bintray.gradle:gradle-bintray-plugin:${requested.version}")
            }
        }
    }
}

rootProject.name = "asoft-basics"

include(":asoft-storage")
include(":asoft-logging")
include(":asoft-networking")
include(":asoft-email-gateway")
include(":asoft-sms-gateway")
include(":asoft-neo4j")
include(":asoft-geo")
include(":asoft-ui")