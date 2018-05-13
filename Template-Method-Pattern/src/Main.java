/*
< Template Method Pattern >

- 알고리즘을 상위 클래스에 정의하고, 하위 클래스에서 구조의 변경 없이 그대로 재정의하여 구현하는 패턴
>> 상위 클래스는 보통 추상 클래스이며, 하위 클래스에서 상속받아 구현한다.

미리 구조를 갖춘다는 점에서, 클래스 변경이 적은 정적인 로직에 유용하다.

==========

AbstractClass 에서 정의하여,
ConcreteClass 에서 구현한다.

예제에선,
AbstConnector == AbstractClass
DefaultConnector == ConcreteClass

이다.

 */

import connector.AbstConnector;
import connector.DefaultConnector;

public class Main {

    public static void main(String[] args) {

        AbstConnector connector = new DefaultConnector();
        String userId = "abc";

        if (connector.requestConnection(userId))
            System.out.println("\nConnecting Succeeded");
    }
}
