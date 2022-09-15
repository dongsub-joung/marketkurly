# MarketCury

# ☑️요약


# 9조 클론코딩


**클론 대상 사이트** : 마켓컬리


📸  **클론 페이지** : 로그인, 회원가입, 메인, 장바구니


🛠  **클론 기능** : 로그인, 회원가입, 페이지 조회(메인, 상세), 리뷰 CRUD, 장바구니 CRUD


➤ [시연영상 바로가기]


# 📅 프로젝트 기간 및 팀원 👨🏻‍💻 👩‍💻
**2022.09.09 ~ 2022.09.15**


👨‍👩‍👧 **Back-End** : 강민승, 김규수, 정동섭


👨‍👦 **Front-End** : 강민택, 이예지


# ⚔️ 기술 스택


# 와이어프레임
![image](https://user-images.githubusercontent.com/110078419/190320028-2e399b04-0ac8-43a2-b990-ffffbf471aa2.png)


# API 명세서
![image](https://user-images.githubusercontent.com/110078419/190320256-c6db458a-9c4a-4848-a6dd-b7f18991b7b9.png)
![image](https://user-images.githubusercontent.com/110078419/190320427-2a2c4059-63c9-4dba-b403-12c83414f898.png)
![image](https://user-images.githubusercontent.com/110078419/190320642-a24a4f44-0342-4894-8e23-cc8d9730b40b.png)


# ERD
![image](https://user-images.githubusercontent.com/110078419/190319748-27cec1d5-f0e6-4e7e-8ce4-9170f39b293f.png)


# 📜  페이지 설명


# 📎  로그인 페이지
![image](https://user-images.githubusercontent.com/110078419/190301199-d9b53ca8-ce70-408c-abfa-b55d31cda4f6.png)
아이디, 비밀번호를 입력하여 DB에 저장되어있는 사용자의 정보와 일치하면 로그인 완료. Access-Token 발급과 동시에 메인페이지로 이동.
아이디를 생성하지 않은 상태일 경우 회원가입 버튼을 클릭시 회원가입 페이지로 이동.


# 📎  회원가입 페이지
![image](https://user-images.githubusercontent.com/110078419/190301024-79ee3173-2451-4f00-acde-232ec21bda29.png)
아이디 중복성 검사, 닉네임 중복성 검사, 비밀번호 비밀번호 확인 일치 여부를 통해 조건이 만족되면 회원가입을 통해 사용자 생성.


# 📎  메인 
![image](https://user-images.githubusercontent.com/110078419/190301307-849662ee-6c16-4522-b4b9-bfdb8b4377b2.png)
전체 상품의 조회. 특정 상품의 이미지를 클릭하면 단일 상품 조회 페이지로 이동.


![image](https://user-images.githubusercontent.com/110078419/190301389-4ed5cfec-7598-4981-bf61-d420766a83b9.png)
단일 상품 페이지 - 특정 상품에 대한 세부적인 내용과 함께 해당 상품을 구매한 사용자들의 상품평이 작성된 내용을 표시.


# 📎  장바구니 페이지
![image](https://user-images.githubusercontent.com/110078419/190301585-a44a27c9-e666-4236-b16e-58b1b3622ba9.png)
상품에서 장바구니 버튼을 클릭시 이동되며 장바구니 페이지에서는 추가된 상품의 내용 및 장바구니 비우기(삭제), 주문하기의 기능이 추가


# ⛳️  역할 담당
👨‍👩‍👧 **Back-End**  
로그인, 회원가입 (김규수)

리뷰 CRUD, 이미지 업로드 (강민승)

장바구니 CRUD, 상품전체 조회, 단일 상품 조회 (정동섭)



👨‍👦 **Front-End** 
로그인, 회원가입, 리뷰 페이지 (이예지)

상품 조회 페이지(전체, 단일 상품), 장바구니 페이지 (강민택)


# 💡Trouble Shooting
👨‍👩‍👧 **Back-End** 
1. API명세서

회원가입의 중복성 검사를 하나의 CRUD로 구현했으나 API명세서 설계시 중복성 검사에 대한 API를 개별로 구현하여 오류 발생.
-> 설계한 명세서대로 중복성 검사에 대한 CRUD를 개별로 구현함으로서 해결
-> 이 경우 Postman으로 회원가입 기능을 구현해보았을 때 실제 회원가입의 진행 절차대로 idCheck와 nicknameCheck를 진행한 후에 회원가입이 진행되는것을 확인.

2. Cors

Cors에 대한 요청을 지난주차와 동일하게 진행하였으나 에러가 발생
-> WebMvcConfigurer를 implements하는 WebMvcConfig 클래스를 생성하여 구현 + h2, api에 대하여 권한없이 요청 가능하게 설정한 SecurityConfiguration 클래스에 CorsConfigurationSource를 정의하여 Cors에 대하여 추가 설정을 통해 해결

3. S3

이미지 업로드를 구현한 팀원과 서버를 배포한 팀원이 달랐기에 S3의 경로에 대하여 오류가 발생
-> 서버를 배포하는 팀원의 코드에 S3경로에 대한 정의를 위해 yml파일을 작성하여 서버를 배포한 팀원의 이미지 업로드 경로가 이미지 업로드 구현한 팀원이 생성한 S3의 경로로 설정


👨‍👦 **Front-End** 



<h3 align="center"><b>📂 Project Directory Structure 📁</b></h3>

