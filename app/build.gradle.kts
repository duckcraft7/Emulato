
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android") version "1.9.0" // Mesmo que estejamos em Java, o KTS usa
}

android {
    namespace = "com.meuapp.emulato"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.meuapp.emulato"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    // Informa ao Gradle onde encontrar os arquivos
    sourceSets {
        getByName("main") {
            java.srcDirs("src/main/java")
            res.srcDirs("src/main/res")
            manifest.srcFile("src/main/AndroidManifest.xml")
        }
    }
}

dependencies {
    // Dependência necessária para o modo de tela cheia
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
}
