pluginManagement {
    val quarkusPluginVersion: String by settings
    val quarkusPluginId: String by settings

    val vaadinPluginVersion: String by settings
    val vaadinPluginId: String by settings

    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
    plugins {
        id(quarkusPluginId) version quarkusPluginVersion
        id(vaadinPluginId) version vaadinPluginVersion
    }
}
rootProject.name="quarkus-reproducer"
