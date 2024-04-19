plugins {
    id 'com.android.application'
    id 'kotlin-android'
}

android {
    // Configuraciones de Android
}

dependencies {
    // Dependencias del proyecto

    // Importa el BoM de Firebase
    implementation platform("com.google.firebase:firebase-bom:32.8.1")

    // Agrega las dependencias específicas de Firebase que quieras utilizar
    implementation 'com.google.firebase:firebase-analytics' // Ejemplo de Firebase Analytics
}

// Aplica el plugin de Google Services
apply plugin: 'com.google.gms.google-services'


