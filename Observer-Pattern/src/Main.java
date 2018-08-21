/*
< Observer Pattern >
참조 1 : http://hyeonstorage.tistory.com/165
참조 2 : http://jusungpark.tistory.com/8

- 한 객체의 상태가 바뀔 경우, 그 객체에 의존하는 다른 객체들에게 연락이 가고 자동으로 내용이 갱신되는 방식으로,
  일대다(one-to-many) 의존성을 정의한다.

==============================================================================================

>> 옵저버 패턴을 구현하는 방법에는 여러가지가 있지만, 대부분

 - 상태를 저장하고 있는 Observable 객체 (subject 객체 라고도 함)
 - Observable 객체에 의존하는 Observer 객체들

로 구현한다.

==============================================================================================

>> 데이터 전달 방식 ? (2 가지)
 1. Observable 이 Observer 로 데이터를 보내는 방식 (PUSH 방식)
 2. Observer 에서 Observable 의 데이터를 가져가는 방식 (PULL 방식)

==============================================================================================

>> 옵저버 패턴은 Observable 과 Observer 가 느슨하게 결합되어 있는 객체 디자인을 제공한다.
   (느슨하게 결합한 디자인을 사용하면, 변경 사항이 생겨도 무난히 처리할 수 있는 유연한 객체지향 시스템을 구축할 수 있다.
    -> 객체 사이의 상호 의존성을 최소화 할 수 있기 때문)

   - Observable 이 Observer 에 대해 아는 것은 Observer 가 특정 인터페이스(Observer 인터페이스)를 구현하는 것 뿐이다.
   - Observer 는 언제든지 새로 추가할 수 있다.
     (Observable 은 Observer 를 구현한 객체들에만 의존하기 때문)
   - 새로운 형식의 Observer 를 추가하려 해도 Observable 을 전혀 변경할 필요가 없다.
     (새로운 클래스에서 Observer 인터페이스만 구현해주면 됨)
   - Observer 나 Observable 이 변경되더라도, 서로에게 전혀 영향이 없다.

   >> 따라서, Observer 와 Observable 은 서로 독립적으로 재 사용 가능하다 !

==============================================================================================

 [ 1. JDK library (extends 방식) ]
 >> observer_pattern_util 패키지

    (단점)
   - Observable 이 클래스이기 때문에, 이를 사용하기 위해선 서브클래스로 사용해야 한다.
     이미 다른 수퍼클래스를 사용하고 있다면, Observable 을 추가할 수 없는 제약이 생긴다.
   - Observable 인터페이스가 없기 때문에,
     자바에 내장된 Observer API 하고 잘 맞는 클래스를 직접 구현하는 것이 불가능하다.

   >> 즉, 클래스를 확장할 필요 없을 경우엔 java.util 에 내장된 것을 사용해도 괜찮지만,
      그렇지 않은 경우가 많기에 되도록 직접 구현해서 커스터마이징 하도록 한다.

 [ 2. 직접 구현 ]
 >> observer_pattern_custom 패키지 (메커니즘은 위와 동일)

    (장점)
   - java.util 에 내장된 것과 달리, 확장과 재사용성에 열려있는 방식으로 구현 가능하다.

   >> 되도록 직접 구현하자 !

==============================================================================================

알고리즘 설명은 클래스 내부 주석 참조 ...

 */

import observer_pattern_custom.WeatherData2;
import observer_pattern_custom.observers.CurrentConditionsDisplay2;
import observer_pattern_custom.observers.PressureDisplay2;
import observer_pattern_util.CurrentConditionsDisplay1;
import observer_pattern_util.PressureDisplay1;
import observer_pattern_util.WeatherData1;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-21
 * Time: 오후 2:07
 */
public class Main {

    public static void main(String[] args) {
        // 옵저버 패턴 - java.util 사용
        System.out.println("\n << 1. Observer Pattern - java.util.Observer >>\n");
        // 주기적으로 변경되는 데이터인 Observable 객체 생성
        WeatherData1 weatherData1 = new WeatherData1();

        // Observer 의 생성자 변수로는 주입할 Observable 객체를 전달
        CurrentConditionsDisplay1 currentConditionsDisplay1 = new CurrentConditionsDisplay1(weatherData1);
        PressureDisplay1 pressureDisplay1 = new PressureDisplay1(weatherData1);

        // 데이터 변경 !
        weatherData1.setMeasurements(10, 20, 1025.23f);
        // 데이터 출력 !
        currentConditionsDisplay1.display();
        pressureDisplay1.display();

        System.out.println();

        weatherData1.setMeasurements(80, 90, 1020.96f);
        currentConditionsDisplay1.display();
        pressureDisplay1.display();

        // 옵저버 패턴 - customizing
        System.out.println("\n << 2. Observer Pattern - customizing >>\n");
        WeatherData2 weatherData2 = new WeatherData2();

        CurrentConditionsDisplay2 currentConditionsDisplay2 = new CurrentConditionsDisplay2(weatherData2);
        PressureDisplay2 pressureDisplay2 = new PressureDisplay2(weatherData2);

        weatherData2.setMeasurements(100, 200, 976.52f);
        currentConditionsDisplay2.display();
        pressureDisplay2.display();

        System.out.println();

        weatherData2.setMeasurements(140, 192, 999.97f);
        currentConditionsDisplay2.display();
        pressureDisplay2.display();
    }
}
