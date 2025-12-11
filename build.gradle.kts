plugins {
    id("java")
    id("io.qameta.allure") version "2.11.0"
}

group = "com.qa.automation"
version = "1.0"

repositories {
    mavenCentral()
    maven { url = uri("https://repo.maven.apache.org/maven2") }
}

dependencies {

    implementation("net.serenity-bdd:serenity-core:3.9.1")
    implementation("net.serenity-bdd:serenity-junit:3.9.1")
    implementation("net.serenity-bdd:serenity-cucumber:3.9.1")
    testImplementation("junit:junit:4.13.2")
    testImplementation("net.serenity-bdd:serenity-screenplay:3.9.1")
    testImplementation("net.serenity-bdd:serenity-screenplay-webdriver:3.9.1")
    testImplementation("io.github.bonigarcia:webdrivermanager:5.0.3")
}

tasks.withType<Test> {
    useJUnit()
    systemProperties = System.getProperties().toMap() as Map<String, Any>
}

allure {
    version = "2.27.0"
}
