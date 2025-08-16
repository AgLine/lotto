# 🎲 로또 번호 추천 사이트
🔗 서비스 URL: [http://lotto.lineee.shop](http://lotto.lineee.shop)
---

## 📌 프로젝트 개요
- **기간**: 2022.06
- **Backend**: `Java17`, `Spring Boot 3`
- **Frontend**: `JSP`, `JSTL`
- **Build Tool**: `Maven`  
- **IDE**: `IntelliJ`  
- **Infra**: `AWS EC2 (Amazon Linux)`, `Tomcat 10`
- **Domain**: `Gabia` + `AWS Route 53`

---
## 🎯 프로젝트 목적
사용자가 원하는 수량(1~5개)의 로또 번호 세트를 랜덤으로 추천해 주는 **웹 서비스**입니다.  
단순한 로직 구현에 그치지 않고, **AWS EC2에 배포하여 실제 서비스 환경**에서 접근 가능하도록 구성했습니다. 

---
## 🚀 배포 과정
### 1. WAR 패키징 
   - Maven을 통해 프로젝트를 `WAR` 파일로 빌드
   - Tomcat 10 서버에서 실행 가능하도록 설정

### 2. AWS EC2 인스턴스 환경 구성
   - Amazon Linux EC2 생성
   - Java 환경 세팅 & Tomcat 설치
   - 보안 그룹 설정으로 80 포트 오픈

### 3. 서비스 배포
   - `WAR` 파일을 EC2 인스턴스의 Tomcat `webapps` 디렉토리에 배치
   - 서비스 실행 및 외부 접근 확인

### 4. 도메인 연결
   - 가비아에서 구입한 도메인 → AWS Route 53 연결
   - `http://lotto.lineee.shop` 으로 접속 가능

---

## 🛠 주요 기능
- **랜덤 번호 생성**  
  - 1~45 사이의 숫자를 중복 없이 랜덤 추출
  - 1~5세트 범위 내에서 선택 가능

- **결과 출력**  
  - 추천된 번호를 테이블 형태로 직관적으로 제공

- **예외 처리**  
  - 번호 개수를 선택하지 않은 경우 경고창 안내

---
## 📖 배운 점 & 느낀 점
- 프로젝트에 Java 17과 Spring Boot 최신 버전을 적용했으나, Tomcat 9에서는 Jakarta Servlet API (Servlet 5.0)을 지원하지 않아 사이트접속시 에러가 발생했습니다.
- Tomcat 9은 Java 8 이상만 요구하며 Servlet 4.0까지 지원 Servlet 5.0은 **Tomcat 10 이상**에서만 가능하다는 것을 알게 되었습니다.
- Tomcat 버전을 10으로 업그레이드하고, Java–Tomcat 구성 간 호환성을 확보하여 성공적으로 배포할 수 있었습니다.

---
## 📷 실행 화면
---
### AWS
<img width="1165" height="202" alt="image" src="https://github.com/user-attachments/assets/1c4f657d-48e3-4ca0-ace7-0773e3b735d6" />
<img width="856" height="526" alt="image" src="https://github.com/user-attachments/assets/c3e4b26c-d21e-4f16-ad3c-7cffb2012382" />

---
### 웹사이트
<img width="1080" height="1342" alt="image" src="https://github.com/user-attachments/assets/f1a20f56-adae-49f8-a5a0-d7e748c4b7d4" />
<img width="1082" height="347" alt="image" src="https://github.com/user-attachments/assets/77a89983-1f49-4bf7-a9b8-9dcdd7d24317" />

