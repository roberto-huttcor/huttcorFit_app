plugins {
    id("com.android.application")
    id("kotlin-android")
    // Plugin do Firebase (Google Services)
    id("com.google.gms.google-services")
    id("com.google.firebase.crashlytics")
    // Plugin do Flutter deve ser aplicado depois
    id("dev.flutter.flutter-gradle-plugin")
}

android {
    namespace = "com.example.huttcorfit_app"
    compileSdk = flutter.compileSdkVersion
    ndkVersion = flutter.ndkVersion

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }

    defaultConfig {
        applicationId = "com.example.huttcorfit_app"
        minSdk = flutter.minSdkVersion
        targetSdk = flutter.targetSdkVersion
        versionCode = flutter.versionCode
        versionName = flutter.versionName
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("debug")
        }
    }
}

flutter {
    source = "../.."
}

dependencies {
    // Import do Firebase BoM
    implementation(platform("com.google.firebase:firebase-bom:34.2.0"))

    // Firebase Analytics
    implementation("com.google.firebase:firebase-analytics")

    // TODO: Adicione outras dependências do Firebase que desejar
    // Ex.: Firestore, Auth, Storage
    // implementation("com.google.firebase:firebase-firestore")
    // implementation("com.google.firebase:firebase-auth")
    // implementation("com.google.firebase:firebase-storage")
}
