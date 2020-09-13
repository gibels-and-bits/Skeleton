object Versions {
    val kotlin = "1.3.72"
    val rxjava = "2.0.19"
    val material = "1.2.0-rc01"
    val min_sdk = 21
    val androidX_navigation = "2.3.0"
    val target_sdk = 29
    val compile_sdk = 29
    val version_code = 1
    val version_name = "1.0"
    val android_gradle_plugin = "4.0.1"
    val junit5_android_plugin = "1.3.2.0"
    val junit5 = "5.3.2"
    val toothpick = "3.1.0"
    val androidX_fragment_extensions = "1.2.5"
    val androidX_constraintLayout = "2.0.0-rc1"
    val retrofit = "2.7.2"
    val rx_android = "2.1.1"
    val rx_relay = "2.1.1"
    val ok_http = "3.11.0"
    val timber = "4.6.0"
    val glide = "4.1.1"
    val lottie = "3.4.1"
    val truth = "1.0.1"
}

object Deps {

    // Kotlin
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    // DI
    val ktp = "com.github.stephanenicolas.toothpick:ktp:${Versions.toothpick}"
    val ktp_lifecycle = "com.github.stephanenicolas.toothpick:smoothie-lifecycle-ktp:${Versions.toothpick}"
    val ktp_viewmodel = "com.github.stephanenicolas.toothpick:smoothie-lifecycle-viewmodel-ktp:${Versions.toothpick}"
    val ktp_compiler = "com.github.stephanenicolas.toothpick:toothpick-compiler:${Versions.toothpick}"

    // Android
    val material = "com.google.android.material:material:${Versions.material}"
    val android_gradle_plugin = "com.android.tools.build:gradle:${Versions.android_gradle_plugin}"
    val jetpack_nav_safeargs_plugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.androidX_navigation}"
    val jetpack_nav_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.androidX_navigation}"
    val jetpack_nav_ui = "androidx.navigation:navigation-ui-ktx:${Versions.androidX_navigation}"
    val androidX_fragment_extensions = "androidx.fragment:fragment-ktx:${Versions.androidX_fragment_extensions}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.androidX_constraintLayout}"

    // Async
    val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
    val rxandroid = "io.reactivex.rxjava2:rxandroid:${Versions.rx_android}"
    val rxrelay = "com.jakewharton.rxrelay2:rxrelay:${Versions.rx_relay}"

    // Test
    val junit5_plugin = "de.mannodermaus.gradle.plugins:android-junit5:${Versions.junit5_android_plugin}"
    val junit5_api = "org.junit.jupiter:junit-jupiter-api:${Versions.junit5}"
    val junit5_engine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junit5}"
    val junit5_params = "org.junit.jupiter:junit-jupiter-params:${Versions.junit5}"
    val junit_vintage_engine = "org.junit.vintage:junit-vintage-engine:${Versions.junit5}"
    val mock_webserver = "com.squareup.okhttp3:mockwebserver:${Versions.ok_http}"
    val google_truth = "com.google.truth:truth:${Versions.truth}"

    // REST
    val ok_http = "com.squareup.okhttp3:okhttp:${Versions.ok_http}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofit_rxjava_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val retrofit_gson_converter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    // Images
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glide_compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    val lottie = "com.airbnb.android:lottie:${Versions.lottie}"

    // Logging
    val http_logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.ok_http}"
    val timber = "com.jakewharton.timber:timber:${Versions.timber}"
}