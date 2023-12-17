// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }


    dependencies {
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.49")
        classpath ("com.android.tools.build:gradle:7.0.4")
    }
}

plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.gms.google-services") version "4.3.10" apply false
    //id("com.google.dagger.hilt.android") version "2.48" apply false
}


