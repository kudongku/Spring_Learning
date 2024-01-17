# HTTP
- HyperText Transfer Protocol
- 데이터 를 주고 받는 양식을 정의한 "통신 규약"

## Browser <=> Server
1. browser 에서 Server 로 HTTP request
2. server 는 browser 에게 해당 데이터 를 HTTP response
3. browser 는 server 로 부터 받은 정보를 보여줌

## browser 에서 HTTP 확인
1. 크롬 개발자 도구 -> 네트워크 탭
2. 서버 에서 받아온 데이터 목록들을 확인
3. 데이터 목록 중 아무거나 클릭해 보면, Requset Method 나, status 등을 확인 가능
   1. status code 1xx : 요청이 수신 되었으며, 처리가 진행 중, 서버 연결 상태를 확인하기 위해 사용
   2. status code 2xx : 정상적으로 처리가 되었음을 나타냄
   3. status code 3xx : 클라이언트가 추가적인 조치를 해야됨
   4. status code 4xx : 클라이언트에 오류가 있음, 404 에러가 이에 해당
   5. status code 5xx : 서버에 오류가 있음

## 구성요소
1. Method
   1. GET : 주소창에 URL을 입력하는 경우
   2. POST : 웹 서버에 데이터를 게시할 때 
   3. DELETE
2. Header
    1. 다양한 의사 표현을 위한 데이터를 포함
3. Payload
   1. 실제 데이터를 포함