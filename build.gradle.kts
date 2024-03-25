plugins {
    id("java")
}

group = "aaj.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.18.1")
    testImplementation("junit:junit:4.13.2")

}

tasks.test {
    useJUnitPlatform()
}