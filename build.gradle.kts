plugins {
    java
    id("org.springframework.boot") version "2.7.11"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "com.gallary"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    // JPA
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    // mariadb
    runtimeOnly ("org.mariadb.jdbc:mariadb-java-client")
    // lombok
    compileOnly ("org.projectlombok:lombok")
    // devTools
    developmentOnly ("org.springframework.boot:spring-boot-devtools")

    annotationProcessor ("org.projectlombok:lombok")

}

tasks.withType<Test> {
    useJUnitPlatform()
}
