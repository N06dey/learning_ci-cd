// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false

    id("com.google.devtools.ksp") version "2.2.10-2.0.2" apply false
    id("com.google.dagger.hilt.android") version "2.57" apply false

    id("org.jlleitschuh.gradle.ktlint") version "13.0.0" apply false
    id("io.gitlab.arturbosch.detekt") version "1.23.8" apply false
}