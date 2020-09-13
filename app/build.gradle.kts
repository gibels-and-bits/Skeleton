plugins {
    id("com.android.application")
    id("de.mannodermaus.android-junit5")
    kotlin("android")
    kotlin("kapt")
    kotlin("android.extensions")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(Versions.compile_sdk)

    defaultConfig {
        applicationId = "com.gibbs.skeleton"
        minSdkVersion(Versions.min_sdk)
        targetSdkVersion(Versions.target_sdk)
        versionCode = Versions.version_code
        versionName = Versions.version_name
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementation(Deps.kotlin_stdlib)
    implementation(Deps.rxjava)
    implementation(Deps.rxandroid)
    implementation(Deps.rxrelay)
    implementation(Deps.retrofit)
    implementation(Deps.retrofit_gson_converter)
    implementation(Deps.retrofit_rxjava_adapter)
    implementation(Deps.constraintLayout)
    implementation(Deps.material)
    implementation(Deps.http_logging_interceptor)
    implementation(Deps.timber)
    implementation(Deps.ok_http)
    implementation(Deps.mock_webserver)
    implementation(Deps.ktp)
    implementation(Deps.ktp_lifecycle)
    implementation(Deps.ktp_viewmodel)
    implementation(Deps.jetpack_nav_fragment)
    implementation(Deps.jetpack_nav_ui)
    implementation(Deps.androidX_fragment_extensions)
    implementation(Deps.glide)
    implementation(Deps.lottie)
    testImplementation(Deps.junit5_api)
    testRuntimeOnly(Deps.junit5_engine)
    testImplementation(Deps.junit5_params)
    testRuntimeOnly(Deps.junit_vintage_engine)
    testImplementation(Deps.google_truth)
    kapt(Deps.glide_compiler)
    kapt(Deps.ktp_compiler)
}