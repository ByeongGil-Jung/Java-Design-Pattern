/*
< Builder Pattern >
참조 1 : https://johngrib.github.io/wiki/builder-pattern/
참조 2 : http://extracold.tistory.com/50

- Builder Pattern 을 활용하여,
생성자만을 사용하여 수많은 인자를 받아 객체를 만들 때 발생하는 번거로움을 해결할 수 있다.

>> 생성자만을 통해 객체를 만들게 되면, 이후에 파라미터 구조가 변경 될 때 유지보수의 어려움이 있다.

[방법 1 - GOF 의 Builder Pattern]
(package :: gof_builder)



[방법 2 - Java 의 Builder Pattern]
(package :: java_builder)

>> 체인 기법을 이용하여, 같은 Builder 인스턴스를 계속 return 하여 연쇄적으로 인자를 입력시킨다.

- 변경 가능성이 없는 Immutable 객체로 만들 수 있다.
(유지보수상 용이하고, 데이터 변경이 잦을 때 안정적이다.)
- 필수 파라미터(Required Parameters)와, 선택적 파라미터(Optional Parameters)를 구별하여 생성할 수 있다.
- 한 번에 객체를 생성하므로 객체 일관성이 깨지지 않는다.
- 잘못된 인자를 판별할 수 있다.

 */

import java_builder.Bread;

public class Main {

    public static void main(String[] args) {

        // Builder Pattern - Java Style
        Bread b_1 = new Bread.BreadBuilder("Strawberry Bread")
                .setFlour(300)
                .setFruit("Strawberry")
                .setWater(100)
                .setEgg(2)
                .build();

        Bread b_2 = new Bread.BreadBuilder("Normal Bread")
                .setFlour(100)
                .setWater(100)
                .build();

        System.out.println("\n[Builder Pattern - Java Style]");
        System.out.println("=====================");
        System.out.println(b_1.getName());
        System.out.println(b_1.getFlour());
        System.out.println(b_1.getFruit());
        System.out.println(b_1.getWater());
        System.out.println(b_1.getEgg());
        System.out.println("=====================");
        System.out.println(b_2.getName());
        System.out.println(b_2.getFlour());
        System.out.println(b_2.getFruit());
        System.out.println(b_2.getWater());
        System.out.println(b_2.getEgg());
    }
}
