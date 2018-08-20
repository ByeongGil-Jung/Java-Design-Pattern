/*
< Facade Pattern >

참조 1 : http://egloos.zum.com/iilii/v/3891647
참조 2 : http://jusungpark.tistory.com/23

- 어떤 서브 시스템의 일련의 인터페이스에 대한 통합된 인터페이스를 제공한다.
- 퍼사드에서 고수준의 인터페이스를 정의하기 때문에 서브시스템을 더 쉽게 사용할 수 있다.


>> 즉, Facade 패턴은 단순화된 인터페이스를 통해서 서브시스템을 더 쉽게 사용할 수 있도록 하기위한 용도로 쓰인다.
(예제에선 customProcess 메소드가 그 역할을 한다.)

////

- 클라이언트와 서브 시스템이 서로 긴밀하게 연결되지 않는 방향으로 설계해야 한다.
- 최소 자식 원칙을 준수하는 방향으로 설계해야 한다.
(* 최소 지식 원칙 ?
 :: 어떤 객체든 그 객체와 상호작용을 하는 클래스의 갯수에 주의해야 하며, 어떤 식으로 상호작용을 하는지에도 주의를 기울여야 하는 원칙)

==========

예제에선,
Facade 로 홈시어터를 구현하였다.

서브 시스템 == Complex* 클래스들
통합된 인터페이스 == Facade 클래스


위 예제에선 Facade 클래스의 customProcess 메소드가
서브시스템을 더 쉽게 사용할 수 있도록 만들어진 메소드이다.

(사실 Basic Action 메소드들은
default 접근 제한자로 이루어진 서브 클래스에 접근하기 위한 용도이지,
Facade Pattern 를 구성하는 메소드들은 아니다.)

*/
import facade.Facade;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();

        System.out.println("\n< Status >");
        System.out.println(facade.getAllStatus());

        System.out.println("\n== Basic Action ==");
        facade.runAudio();
        facade.rewindAudio();
        facade.darkenLight();
        facade.brigtenLight();
        facade.switchOnTV();

        System.out.println("\n< Status >");
        System.out.println(facade.getAllStatus());

        System.out.println("\n== Custom Process ==");
        System.out.println("\n >> Custom Process 1");
        facade.customProcess1();
        System.out.println("\n< Status >");
        System.out.println(facade.getAllStatus());

        System.out.println("\n >> Custom Process 2");
        facade.customProcess2();
        System.out.println("\n< Status >");
        System.out.println(facade.getAllStatus());

        System.out.println("\n >> Custom Process 3");
        facade.customProcess3();
        System.out.println("\n< Status >");
        System.out.println(facade.getAllStatus());
    }
}
