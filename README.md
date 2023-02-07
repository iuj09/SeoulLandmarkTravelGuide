# LandmarkWebCrowling


### ◦ Selenium과 카카오맵 API를 활용해 찾은 관광지 주변 맛집 정보 중(ex."덕수궁 맛집") 해당 관광지를 기준으로 1km내에 위치하면서 별점 4.0 이상의 식당만을 추려 inner document 형식으로 MongoDB에 저장

### ◦ Python에서 제공하는 schedule 패키지를 활용하여 매일 지정 시각에 웹크롤링을 실행, DB 안의 값을 최신화
> ⛑ GoogleMap API를 활용해 위경도 값을 찾는데, 프로젝트 진행 중 무료사용일이 종료되어 웹크롤링 실행 시 생기는 비용 발생으로 최신화를 멈춤 
