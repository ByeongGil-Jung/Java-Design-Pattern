/*
< Adapter Pattern >
- 참조 1 : http://jusungpark.tistory.com/22
- 참조 2 : http://jdm.kr/blog/11

서로 다른 타입의 객체를 연결 시킬 때 사용한다. // 혹은 기능이 다를 때 유지보수를 위해서 사용한다.
>> 이를 통해 인터페이스의 호환성 문제를 해결 할 수 있다 !!

어댑터를 만들고자 하는 목적이 중요하다.

보통,
예전에 사용하던 엔진을 새 엔진으로 바꾸고자 할 때
어댑터를 사용한다.

////

- Target : 사용자가 사용할 응용 분야에 종속적인 인터페이스를 정의하는 클래스.
- Client : Target 인터페이스를 만족하는 객체와 동작할 대상.
- Adaptee : 인터페이스의 적응이 필요한 기존 인터페이스를 정의하는 클래스.
- Adapter  : Target 인터페이스에 Adaptee 의 인터페이스를 적응시키는 클래스.

밑의 예제에선,
Target == duck
Adapter == turkeyAdapter
Adaptee == turkey

 */

import duck.Duck;
import duck.GoodDuck;
import turkey.Turkey;
import turkey.WildTurkey;

public class Main {

    public static void main(String[] args) {
        Duck duck = new GoodDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("======================");
        System.out.println("Duck action :");
        duck.quack();
        duck.fly();

        System.out.println("======================");
        System.out.println("Turkey action :");
        turkey.gobble();
        turkey.fly();

        System.out.println("======================");
        System.out.println("TurkeyAdapter action :");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
