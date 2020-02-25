# Gradle 사용법

Gradle은 빌드 툴이다.
Gradle Sciprt는 Groovy, Kotlin 언어로 작성될 수 있다.

초기 생성 시
build.gradle 파일과 setting.gralde 파일이 생성된다.

`apply plugin: 'java'`
- compileJava Task를 이 곳에서 제공한다.

`apply plugin: 'application'`
- run 응용프로그램 제공 Task

아무래도 import와 비슷한 느낌이다.

`mainClassName = 'App'`
- 프로그램 시작 클래스를 지정하여야 한다. applicaiton plugin 에서 제공하는듯


### Repositories

build.gradle에 기술된 내용에는 종속 라이브러리 관리 기술이 있다.
Gradle에 필요한 라이브러리를 자동으로 다운로드 및 통합하는 기능이 존재하고 어떤 저장소를 이용하는지 스크립트에 명세하여야 한다.
간단한 호출을 통해 Apache maven 저장소 및 JCenter를 이용할 수 있다.

```
repositories {
    mavenCetral()
    jcenter()
}
```

### Dependencies

저장소를 이용하여 필요한 라이브러리를 명세하는 곳으로
컴파일 시 의존 라이브러리를 명세하면 된다.

compile, testCompile이 있으며 일반 및 단위 테스트 용도의 컴파일 차이만 있다.

### Task

### Instructions



---



