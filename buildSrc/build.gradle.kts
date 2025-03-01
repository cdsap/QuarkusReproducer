plugins {
    id("java")
    `kotlin-dsl`
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

gradlePlugin {
    plugins {
        create("QuarkusRedux") {
            id = "quarkusRedux"
            displayName = " "
            description = " "
            implementationClass = "org.example.QuarkusReduxPlugin"
        }
    }
}
