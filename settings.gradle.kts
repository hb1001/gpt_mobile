pluginManagement {
    repositories {
        maven{ url = uri("https://maven.aliyun.com/repository/public") }
        maven{ url = uri("https://maven.aliyun.com/repository/google") }
        maven{ url = uri("https://maven.aliyun.com/repository/jcenter") }
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven{ url = uri("https://maven.aliyun.com/repository/public") }
        maven{ url = uri("https://maven.aliyun.com/repository/google") }
        maven{ url = uri("https://maven.aliyun.com/repository/jcenter") }
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

rootProject.name = "GPTMobile"
include(":app")
