# WepApp with create Spring boot And React App

  이 프로젝트는 학습용도로 만들어진 프로젝트입니다.
  
## 2020-09-17
  - Spring boot 와 React App 을 연동
    - React의 포트 localhost:3000을 Spring boot의 포트와 같이 localhost:8080으로 변경 완료
    - maven pom.xml에 플러그인 artifact: com.github.eirslett, maven-antrun-plugin 각각 추가 후 ./mvnw clean install 명령어 실행
    - jar파일 생성 후 java -jar target/spring-and-react-0.0.1-SNAPSHOT.jar 명령어 실행으로 연동 확인
  

## Reference

  - https://github.com/kantega/react-and-spring
  
  - https://github.com/eirslett/frontend-maven-plugin
  
  - https://sundries-in-myidea.tistory.com/71
