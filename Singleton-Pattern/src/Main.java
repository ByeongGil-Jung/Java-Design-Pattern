/*
< Singleton Pattern >

참조 1 : http://egloos.zum.com/iilii/v/3807664

- 인스턴스를 사용하고자 할 떄, 계속해서 인스턴스를 만드는 것이 아니라,
동일한 하나의 인스턴스를 사용하게끔 하는 디자인 패턴이다.

>> DAO (Database Access Object) 와 같이, 하나의 인스턴스만 필요해도 되는 경우 사용된다.
즉, 모든 request 가 한곳으로 모이고, 비슷한 작업을 수행할 때 용이하다.

>> 무엇보다, 인스턴스를 하나만 만든다는 점에서, 메모리를 효율적으로 활용하여 아낄 수 있다.

==========

private 멤버 변수로 자기 자신의 클래스 인스턴스를 가진다.
private 생성자를 지정하여, 외부에서 절대로 인스턴스를 생성하지 못하게 한다.
getInstance() 메소드를 통해 객체를 static 으로 얻을 수 있다.

예제에선,

만약 getInstance() 를 static 으로 구현하지 않는다면,
DataConnector.getInstance() 에 접근 자체가 불가능하다.

또한, instance 를 static 으로 구현하지 않는다면,
DataConnector 클래스의 getInstance() 내부의 instance 에 접근 자체가 불가능하다.
(static 메소드에는 static 변수만 사용 가능하기 때문 !)

>> static 으로 선언하면, 미리 메모리 상에 올라간다. 마치 전역변수처럼 같은 주소값을 참조하게 된다.

 */

import singleton.DataConnector;

public class Main {

    public static void main(String[] args) {

        DataConnector connector1 = DataConnector.getInstance();
        DataConnector connector2 = DataConnector.getInstance();

        System.out.println("====================");
        System.out.println(connector1);
        System.out.println(connector2);

        System.out.println("====================");
        connector1.setA("First A");
        System.out.println(connector1.getA());
        System.out.println(connector2.getA());

        System.out.println("====================");
        connector2.setA("Second A");
        System.out.println(connector1.getA());
        System.out.println(connector2.getA());
    }
}
