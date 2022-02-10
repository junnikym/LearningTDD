# TDD / Refectoring

## TDD 란?
<sup> Test Driven Development; 테스트 주도 개발 </sup>

TDD는 개발 방식이며 <code>"Clean code that works"</code> 작동하는 깔끔한 코드를 지향한다.

Test First! 기존의 테스트->프로덕션 순이 아닌 <code>테스트->프로덕션 순</code>으로 개발 <br/>
개발 주기는 다음과 같다.

1. <code>Red</code> 실패하는 테스트 코드를 작성
2. <code>Green</code> 테스트 코드를 성공시키기 프로덕션 코드 작성
3. <code>Blue</code> 중복 코드 제거 / 일반화 등의 리팩토링을 수행
4. 다시 1.<code>RED</code> 로 이동하여 작성 

디자인 단게에서 개발 목적을 미리 정의 / 가장 중요한 것은 문제 설정!

TDD를 사용함으로써 가질수 있는 장점은 다음과 같다

| 장점 | 이유 |
|---|---|
|튼튼한 객체 지향적인 코드 생산 | 코드의 재사용성 보장 -> 철저한 모듈화 |
|재설계 시간의 단축 | 테스트 코드를 먼저 작성 -> 뭘 해야할지 목적이 또렷|
|디버긴 시간 단축 | 어디서 문제가 났는지 디버깅하지 않고 유닛테스트로 찾을 수 있음|
|테스트 문서의 대체 가능 | 테스팅을 자동화 -> 보다 정확한 테스트 근거 산출 |
|추가 구현의 용의함 | 자동화된 유닛 테스팅 -> 테스트 기간 단축 |

하지만 이럼에도 불구하고 SI 프로젝트와 같이 품질보다 납기일이 더 중요한 프로젝트에는 TDD 방식을 잘 사용하지 않는다고한다.

## TDD 원칙 
1. 실패하는 단위 테스트를 작성하기 전에는 프로덕션 코드를 작성하지 않는다.
2. 컴파일은 실패하지 않으면서 실행이 실패하는 정도로만 단위테스트 작성
3. 현재 실패하는 테스트를 통과할 정도로만 실제코드를 작성 (더 이상의 기능 구현 X)

## FIRST 규칙
무작정 작성하는 테스트는 좋은 테스트 코드가 아니다. FIRST는 좋은 테스트 코드를 작성하기 위한 규칙이다.

1. Fast : 테스틑 빠르게 작동하여 자주 돌릴 수 있어야한다.
2. Independent : 각각의 테스트는 독립적이며 서로 의존해서는 안된다.
3. Repeatable : 어느 환경에서도 반복 가능해야한다.
4. Self-Validating : 테스트틑 성공 또는 실패로 bool 값으로 결과를 내어 자체적으로 검증되어야한다.
5. Timely : 테스트는 실제 코드를 구현하기 직전에 구현해야한다.


ref : <https://hanamon.kr/tdd란-테스트-주도-개발/>
ref : <https://velog.io/@new_wisdom/02.16-강의>
ref : <https://medium.com/pplink/tdd로-프론트엔드-개발-날로-먹기-a95e428d929>
ref : <https://zoosso.tistory.com/1055>

based : <https://mangkyu.tistory.com/182>

실습 : <https://mangkyu.tistory.com/183>

# 번외

## 1. Test Container

독립 통합 테스트 환경 구축; Junit Test 에서 Docker Container를 사용할 수 있도록 해주는 오픈소스 라이브러리.
많은 환경들을 지원하고 있으며 [여기](https://www.testcontainers.org) 에서 확인할 수 있다.

Test Container 를 구성하는 방법은 Dependency를 추가하여 설정을 통해 Container를 생성할 수 있으며 Docker Compose를 활용하여 Container를 생성하는 방법도 있다.

자세한 내용은 [여기](https://taes-k.github.io/2021/05/02/spring-test-container/) 를 참고

# Error Log

- No tests found for given includes - IntelliJ <br/>
  설정으로 해결 -> [여기](https://ddasi-live.tistory.com/35) 참고 