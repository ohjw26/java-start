# java-start

Java 입문 학습용 저장소입니다. 인프런 김영한님의 *자바 입문 - 코드로 배우는 자바* 강의를 따라가며 작성한 예제 코드를 챕터별로 정리합니다.

자바 기본편(`java-basic`)으로 넘어가기 전 단계의 기초 문법 위주입니다.

## 환경

- **Java**: JDK 17+
- **IDE**: IntelliJ IDEA
- 빌드 도구 없이 IntelliJ 프로젝트로 직접 실행 (`out/` 디렉토리에 컴파일 결과 생성)

## 실행 방법

IntelliJ에서 프로젝트를 열고 각 클래스의 `main` 메서드를 실행합니다.

예시:
```
src/loop/While2_3.java  →  우클릭 → Run
```

## 디렉토리 구조

```
src/
├── Main.java       # 진입 예제
├── variable/       # 변수, 자료형
├── operator/       # 연산자
├── cond/           # 조건문 (if, switch)
├── loop/           # 반복문 (while, do-while, for, break, continue)
├── scope/          # 변수 스코프
├── Casting/        # 형 변환 (자동/명시적)
├── array/          # 배열 (1차원, 다차원, 참조, 향상된 for)
├── method/         # 메서드 (정의, 매개변수, 반환값, 오버로딩)
└── scanner/        # Scanner를 통한 콘솔 입력
```

각 챕터 폴더 안의 `ex` 폴더에는 해당 단원의 연습 문제 풀이가 들어 있습니다.

## 학습 주제 요약

| 폴더 | 주제 |
|---|---|
| `variable` | 변수 선언, 기본형 자료형, 리터럴, 형식 문자 |
| `operator` | 산술/비교/논리/대입 연산자, 연산자 우선순위 |
| `cond` | `if`, `if-else`, `switch` |
| `loop` | `while`, `do-while`, `for`, `break`, `continue` |
| `scope` | 지역 변수 스코프 |
| `Casting` | 자동 형 변환, 명시적 형 변환, 오버플로우 |
| `array` | 1차원/다차원 배열, 배열과 참조, 향상된 for문 |
| `method` | 메서드 정의, 매개변수, 반환값, 메서드 오버로딩 |
| `scanner` | `java.util.Scanner` 사용법 |

## 참고

- 학습 정리용 저장소라 외부 의존성/빌드 설정은 따로 없습니다.
- `out/`, `.idea/`, `*.iml`, `.DS_Store`는 `.gitignore`로 제외되어 있습니다.
- 이후 단계: [java-basic](https://github.com/ohjw26/java-basic) (객체 지향, 상속, 다형성)
