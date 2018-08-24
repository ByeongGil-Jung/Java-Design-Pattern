/*
< State Pattern >

참조 1 : http://sticky32.tistory.com/entry/%EC%86%8C%ED%94%84%ED%8A%B8%EC%9B%A8%EC%
        96%B4%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4
        -%EC%8A%A4%ED%85%8C%EC%9D%B4%ED%8A%B8-%ED%8C%A8%ED%84%B4State-Pattern
참조 2 : http://egloos.zum.com/iilii/v/5203506


- State Pattern 은 상태에 행위를 위임하는 패턴으로,
  현재 상태에 따라 같은 일에 대해 다르게 로직(행위)을 수행한다.


==========================================================================================

>> State Pattern 은 다양한 방식으로 구현 가능하다. (찾아보면서 발견한 방식만 세 가지이다.)
   ex) enum 활용, abstract class 상속, Strategy 패턴 활용 등등 ...

(공통점)

- Object 클래스는 상태를 추상화한 Abstract-State 클래스(혹은 interface) 를 참조하고 있다.
- 각각의 상태 클래스(Abstract-State) 의 구현체(Concrete-State) 들은 자신의 상태에서 어떠한 행위(Action) 가 발생했을 때의 로직을 구현해야 한다.
- 상태가 추가되거나, 수정됐을 때 기존 코드를 수정하지 않아야 한다.
- 상태는 단 하나만 존재하므로 Singleton 패턴으로 구현한다. (혹은 enum)


>> 행위(Action)에 따라 상태를 바꾸고, 서로 다른 메소드를 수행하는 점에서
   Strategy 패턴과 유사한 점이 많다.


==========================================================================================

예제에선, enum 을 활용하여 구현하였음.

Object == Light 클래스
Abstract-State == State 클래스 중, {ON, OFF, SLEEP} 등 enum 선언부
Concrete-State == State 클래스 중, @Override 한 act() 메소드
Action == Action 클래스

 */

import product.Light;
import state.Action;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-24
 * Time: 오후 2:21
 */
public class Main {

    public static void main(String[] args) {

        Light light = new Light();

        System.out.println();
        light.changeState(new Action(Action.Type.CLICK_OFF_SWITCH));

        System.out.println();
        light.changeState(new Action(Action.Type.CLICK_ON_SWITCH));
        light.changeState(new Action(Action.Type.CLICK_ON_SWITCH));
        light.changeState(new Action(Action.Type.CLICK_ON_SWITCH));
        light.changeState(new Action(Action.Type.CLICK_OFF_SWITCH));
        light.changeState(new Action(Action.Type.CLICK_OFF_SWITCH));
        light.changeState(new Action(Action.Type.CLICK_OFF_SWITCH));
        light.changeState(new Action(Action.Type.CLICK_OFF_SWITCH));

        System.out.println();
        light.changeState(new Action(Action.Type.CLICK_ON_SWITCH));
        light.changeState(new Action(Action.Type.CLICK_ON_SWITCH));
        light.changeState(new Action(Action.Type.CLICK_OFF_SWITCH));
        light.changeState(new Action(Action.Type.CLICK_OFF_SWITCH));

    }
}
