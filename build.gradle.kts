allprojects {
    repositories {
        google()
        jcenter()
        maven(url = "https://dl.bintray.com/kotlin/kotlin-js-wrappers")
        maven(url = "https://dl.bintray.com/kotlin/kotlin-dev")
        maven(url = "https://dl.bintray.com/asofttz/core") {
            metadataSources {
                gradleMetadata()
                mavenPom()
            }
        }
        maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    }
    group = "tz.co.asoft"
    version = "1.0.0"
}