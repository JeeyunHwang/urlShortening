# URL Shortening Service
-----
##Descriptions
URL을 입력받아 짧게 줄여주고, 
Shortening된 URL을 입력하면 원래 URL로 리다이렉트하는 URL Shortening Service

예) https://en.wikipedia.org/wiki/URL_shortening => http://localhost/JZfOQNro

- URL 입력폼 제공 및 결과 출력
- URL Shortening Key는 8 Character 이내로 생성되어야 합니다.
- 동일한 URL에 대한 요청은 동일한 Shortening Key로 응답해야 합니다.
- 동일한 URL에 대한 요청 수 정보를 가져야 한다(화면 제공 필수 아님)
- Shortening된 URL을 요청받으면 원래 URL로 리다이렉트 합니다.
- Database 사용은 필수 아님
-----
##Environment
- Ubuntu 
- java 1.8
- Spring Boot 2.6.0
- gradle 2.10
- git 

##Prepare Environment
- java 1.8
  - 설치 : sudo apt-get install openjdk-8-jdk
  - 설치 확인 : java -version 
  
- Gradle
  - 설치 : sudo apt-get install gradle
  - 설치 확인 : gradle -v
- git
  - 설치 : sudo apt-get install git
  - 설치 확인 : git --version
-----
##Project 실행
1. git checkout:

git clone https://github.com/JeeyunHwang/urlShortening.git

2. build & Run :

gradle clean build -x test

./gradlew bootRun

3. 접속 url :

http://localhost:8080/
