fun asoftCore(lib: String, platform: String): String {
    return "com.github.andylamax.asoft-core:asoft-$lib-$platform:${versions.asoft.core}"
}

fun asoftTest(platform: String) = asoftCore("test", platform)
