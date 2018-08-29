/*
< Memento Pattern >
참조 1 : http://scotty83.tistory.com/entry/Memento-Pattern
참조 2 : http://objectbuilder.tistory.com/89

- 객체의 상태 정보를 저장하고, 사용자의 필요에 따라 원하는 시점의 데이터를 복원할 수 있는 패턴

=========================================================================================================

>> Memento 객체에 상태(State)를 담아 매 순간마다 snapshot 찍듯이 Collection 에 담아 관리한다. (여기선 Stack)
   CareTaker 클래스가 저장된 Memento 들이 담긴 Collection 객체를 관리하며,
   Originator 클래스가 Memento 의 상태(State) 를 관리한다.

즉,

Memento ::
  - Originator 의 내부 정보 및 상태(State)를 담는다. (Originator 의 내부 정보를 갖고 있지만, 외부로 그 정보를 공개하지 않는다.)

CareTaker ::
  - Memento 의 저장을 담당하는 실질적인 객체이며, 보통 Collection<Memento> 을 통해 관리한다.
  - Originator 쪽으로 복원할 시점의 Memento 를 전달하거나,
    Originator 로부터 현재 Memento 를 전달받는다.

Originator ::
  - 현재의 Memento 및 상태(State) 를 관리하는 실질적인 객체이다.
  - 자신의 현재 상태를 저장하고 싶을 때 Memento 객체를 만든다. (스냅샷이라 생각)
  - CareTaker 에게 현재 상태를 담은 Memento 를 전달하여 그 시점을 저장하거나,
    CareTaker 로부터 Memento 객체를 전달받으면, 그 시점의 상태로 돌리는 역할을 한다.

=========================================================================================================

예제에선,

Memento == Memento
CareTaker == CareTaker
Originator == Originator

이며,
Memento 가 외부에서 처리되거나 수정될 수 없도록 접근 제한자를 protected 로 걸어두었다. (중요)

 */

import memento.CareTaker;
import memento.Originator;
import memento.State.State;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-29
 * Time: 오후 3:25
 */
public class Main {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        // 복원 지점 생성
        originator.setState(new State("#State 1"));
        careTaker.addMemento(originator.saveMemento());

        originator.setState(new State("#State 2"));
        careTaker.addMemento(originator.saveMemento());

        originator.setState(new State("#State 3"));
        careTaker.addMemento(originator.saveMemento());

        System.out.println("\nCurrent state of Stack :");
        System.out.println(careTaker);

        // 특정 시점 복원
        System.out.println("\n < Restore to a specific moment >");
        originator.restoreMemento(careTaker.getMemento(0));
        System.out.println(originator.getState());

        System.out.println("\nCurrent state of Stack :");
        System.out.println(careTaker);

        // 순서대로 롤백
        System.out.println("\n < Rollback in order >");
        originator.restoreMemento(careTaker.popMemento());
        System.out.println(originator.getState()); // State #3

        originator.restoreMemento(careTaker.popMemento());
        System.out.println(originator.getState()); // State #2

        System.out.println("\nCurrent state of Stack :");
        System.out.println(careTaker);
        System.out.println();

        // 다시 새로운 복원 지점 생성
        System.out.println("\n < Adding a new memento >");
        originator.setState(new State("#State 2-2"));
        careTaker.addMemento(originator.saveMemento());

        System.out.println("\nCurrent state of Stack :");
        System.out.println(careTaker);

        originator.restoreMemento(careTaker.popMemento()); // State #2-2
        System.out.println(originator.getState());
    }
}
