# 밑바닥부터 다시 Study
1. 기본 정보 
- gradle
  - 그루비를 이용한 빌드 자동화 시스템
  - build.gradle 파일에서 사용할 라이브러리를 지정할 수 있음.
    - implemenation
      - MVN Repository에서 의존성 추가하려고 예시를 가져오면 대부분 이것을 사용
      - 프로젝트에 어떤 라이브러리를 사용한다고 하면 대부분 이것을 사용하게 된다.
    - compileOnly
      - 컴파일 시점에 꼭 필요한 라이브러리
      - Lombok 같은 라이브러리가 이에 해당한다.
    - runtimeOnly
      - 컴파일 시점에는 필요 없지만, 런타임에 필요한 라이브러리 
      - Logging 관련 라이브러리, DB 관련 라이브러리 등
- devtools
  - 로그에 restartedMain 라고 뜨면 devtools 적용됨. 
  - rebuild를 하면 재시작을 안해도 적용됨.

- h2 database 
  - 개발 또는 테스트 용도로 유용함
