# 백엔드 생존코스 2주차 과제

## REST API 설계

### 예시

- 게시글 조회 `GET /posts`
- 게시글 작성 `POST /posts`
- 게시글 수정 `PATCH /posts/{id}`
- 게시글 삭제 `DELETE /posts/{id}`

### 로그인/회원가입

- 로그인
- 로그아웃
- 회원가입

### 내 정보

- 내 정보 
- 내 정보 수정 

### 상품

- 상품 목록
- 상품 상세

### 상품 리뷰

- 상품에 리뷰 작성
- 상품에 리뷰 수정
- 상품에 리뷰 삭제

### 장바구니

- 장바구니에 상품 추가
- 장바구니에 상품 삭제
- 장바구니 (담긴 상품 목록)

### 주문하기

- 주문하기
- 주문 목록

## 질문과 답변

> 화면 URL과 API의 URL이 일치해야 할까? 달라야 한다면 그 이유는 무엇일까?

일치하지 않아도 된다고 생각합니다.<br>
화면 URL은 사용자가 보는 화면을 위한 것이고, API URL은 서버와 통신하기 위한 것이기 때문입니다.<br>
> 서버는 API 요청을 받을 때 사용자가 누구인지 어떻게 알 수 있을까?

auth 를 어떻게 가져가는지에 따라 드리겠지만 요즘 JWT 를 많이사용해서<br>
JWT 기준으로 JWT 안에 포함되어있는 email 값 혹은 id 값으로 누구인지 판단하게 됩니다.

> API 요청으로 다른 사람의 정보를 함부로 볼 수 없게 하려면 어떻게 해야 할까?

Cookie, Session, JWT 등을 사용해서 인증을 합니다.