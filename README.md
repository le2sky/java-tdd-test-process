## 생소한 단축키

- 다음 에러로 이동 : fn + f2

## 메모

### Assert First

- 테스트를 작성할때 then을 먼저 작성한다. 즉, assert부터 거꾸로 작성하는 기술
- assert를 먼저 작성하면, 컴파일 에러가 발생하는데, 이를 고치면서 프로덕션을 만들어 간다.
- test drives. 즉, 테스트가 나를 운전하도록 한다.
- 프로덕션 코드에 무언가를 추가하고 싶으면, 그렇게 할 수 밖에 없도록 만드는 테스트 코드를 추가한다.
- (결론) Assert First를 하면, 쓸데 없는 코드를 적게 만들 수 있다.
- (내 생각) 라이브 템플릿에 then 절에 $END$를 추가하도록 해볼까?