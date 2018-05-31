/*
< Decorator Pattern >

참조 1 : http://leetaehoon.tistory.com/61
참조 2 : http://palpit.tistory.com/193
참조 3 : http://jusungpark.tistory.com/9

- 객체에 추가적인 기능(요건) 을 런타임 도중 동적으로 추가할 수 있다.
기능 확장이 필요할 때 서브클래싱 대신 쓸 수 있는 유용한 대안이다.

////

>> 데코레이터의 부모클래스는 자신이 장식하고 있는 객체의 부모클래스와 같다.
따라서 한 객체를 여러 개의 데코레이터로 감쌀 수 있다.

>> 기존 코드를 수정하지 않고서 기능을 확장할 수 있는 부분에서 OCP 를 만족한다.

>> 데코레이터 패턴을 남용하면 코드가 필요 이상으로 복잡해질 수도 있다.

==========

Component :: 데코레이터의 기반이 되는 인터페이스 혹은 추상클래스를 선언한다.
ConcreteComponent :: Component 의 실질적인 인스턴스이며, 책임의 주체이다.

Decorator :: Component 에서 Decorator 를 통해 확장될 수 있도록, Component 를 상속받는다.
ConcreteDecorator :: 실질적인 Decorator 의 구현부이며, 책임이 추가되는 부분이다.

*/

import component.Component;
import component.ConcreteComponent;
import decorator.ConcreteDecorator1;
import decorator.ConcreteDecorator2;
import decorator.ConcreteDecorator3;
import decorator.Decorator;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n========================");
        Component basicPizza = new ConcreteComponent();
        System.out.println(basicPizza.getName());
        System.out.println(basicPizza.getPrice());

        System.out.println("\n========================");
        Decorator toppingPizza = new ConcreteDecorator1(basicPizza);
        System.out.println(toppingPizza.getName());
        System.out.println(toppingPizza.getPrice());
        // System.out.println(((ConcreteDecorator1) basicPizza).description());

        /*
        만약 Decorator 로 형변환을 해주지 않으면 위와 같이 다운캐스팅을 해서 메소드를 호출해야 한다.

        왜냐하면 Component 인터페이스에서는 존재하지 않는 메소드이고,
        상속받은 클래스인 Decorator 에서 추상메소드로 생성해 놓은 메소드이기 때문이다.
        즉, Decorator 를 상속받는 객체부터 사용 가능한 메소드이다.
         */

        System.out.println(toppingPizza.description());

        System.out.println("\n========================");
        toppingPizza = new ConcreteDecorator2(toppingPizza);
        System.out.println(toppingPizza.getName());
        System.out.println(toppingPizza.getPrice());
        System.out.println(toppingPizza.description());

        System.out.println("\n========================");
        toppingPizza = new ConcreteDecorator3(toppingPizza);
        System.out.println(toppingPizza.getName());
        System.out.println(toppingPizza.getPrice());
        System.out.println(toppingPizza.description());

        System.out.println("\n========================");
        toppingPizza = new ConcreteDecorator1(toppingPizza);
        System.out.println(toppingPizza.getName());
        System.out.println(toppingPizza.getPrice());
        System.out.println(toppingPizza.description());
    }
}
