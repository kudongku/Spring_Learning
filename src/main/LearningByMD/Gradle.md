# Gradle

## Gradle 이란
- 빌드 자동화 program

### 빌드 하는 법
1. Gradle -> Build -> Build 누르기
2. BUILD SUCCESSFUL in 6s

## build.gradle
- gradle 이 groovy 언어로 작성됨 (선택)
- library 를 관리
```groovy
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-web'
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```
