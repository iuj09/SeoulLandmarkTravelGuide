# UserService

### * JWT를 활용한 회원가입, 로그인, 로그아웃 기능 구현

### * RefreshToken의 저장소로 redis를 사용

> 사용 이유
> 1. redis는 캐시 서버로 이용할 수 있는 In-Memory DB 중 하나로 DB의 부하를 줄여 속도 저하를 방지할 수 있다.
> 2. jwt의 특성상 저장된 토큰의 만료시간이 지나면 불필요한 값이 DB에 남게되는데 데이터 휘발의 특성을 가진 redis를 사용하면 이 같은 상황에서 관리가 편리하다는 장점이 있다.
>> 로그아웃 시 저장된 RefreshTokken을 삭제하고 사용중이던 AccessToken은 blacklist에 등록하여 만료시키도록 설정

### * swagger를 사용한 API 문서화
