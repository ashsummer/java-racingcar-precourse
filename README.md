# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구 사항
- k개의 횟수 동안 n 대의 자동차 전진/멈춤
- 자동차 이름 부여 가능 (자동차 출력시 자동차 이름도 함께 출력)
- 자동차 이름 쉼표(,) 기준 구분 / 이름은 5자 이하
- 이동 횟수 사용자가 입력 가능
- 전진 조건 : 0 ~ 9 의 값 / 4이상 전진 / 3이하 멈춤
- 우승자는 한명 이상 / 게임 종료 후 알려주기

## 기능 목록
1. 사용자 입력
 - 자동차 이름 입력
    - 이름은 쉼표(,)로 구분
    - 이름 앞 뒤 공백은 제거
    - 이름은 5자 이하(String length 기준)
    - 자동차 경주이므로 적어도 2개 이상의 이름이 입력되어야 함
    - 자동차 최대 100대로 가정
 - 시도할 횟수 입력
    - 숫자만 입력 가능 (1 이상 100000이하 받기)
    - 앞 뒤 공백 제거
    
2. 자동차 경주
 - 시도할 횟수 입력된 만큼만 경주 진행
 - 각 자동차마다 전진/멈춤 판단 후 바로 출력  
 - 자동차 전진/멈춤 유무 판단
    - random 함수로 0 ~ 9 값 받아오기
    - 4 이상 전진 / 3 이하 멈춤
 - 자동차 경주 출력
    - 자동차 입력 순서대로 출력
    - '-'표시로 전진을 표시한다
    - 각 경주마다(1회마다) 공백을 보여준다
 - 경주 완료
    - 최종 우승자 이름 표시    - 1명 이상 우승 가능
    - 경주 완료 후에는 프로그램 종료