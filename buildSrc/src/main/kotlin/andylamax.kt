fun asoftCore(lib: String, platform: String): String {
    return "tz.co.asoft:asoft-$lib-$platform:${versions.asoft.core}"
}

fun asoftTest(platform: String) = asoftCore("test", platform)