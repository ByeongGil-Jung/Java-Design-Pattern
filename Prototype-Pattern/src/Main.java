/*
< Prototype Pattern >

- Prototype Pattern 은 어떤 객체가 복잡한 구조를 가지고, 서로 다른 인스턴스를
여러개 만들어야 하는 상황에 유용하다.

>> 얕은 복사(Shallow Copy) 와 깊은 복사(Deep Copy) 의 개념이 필요하다.

Shallow Copy :: 같은 주소값을 참조하며 복사한 인스턴스가 동일하다. (윈도우의 바로가기)
Deep Copy :: 서로 다른 주소값을 가지며, 별개의 인스턴스이다. (윈도우의 복사 - 붙여넣기)

////

보통 Factory Pattern 과 조합해서 사용한다. Factory 에서 Prototype 을 관리하고,
만약 create 메소드가 호출되면, Prototype 으로부터 clone 하여 새로운 인스턴스를 생성하는 방식이다.
>> Prototype 은 Factory 에서만 관리되고 외부로 드러나지 않는다.

////

여기서 중요한 것은,
clone 메소드를 사용 할 때 Object 의 모든 value 값들이 복사되는 것이 아니라는 점이다.
단순히 첫번째 층의 Object 들만 copy 되는 점을 기억해야 한다.

즉, List 와 같이 층이 두 겹 이상인 Object 들은 clone 메소드를 오버라이딩 할 때
List 내부의 Value 들까지 모두 copy 하는 로직을 따로 만들어줘야 한다.
(예제의 copy2)

다시 말해, List 와 같은 Object 들은 Deep Copy 를 해도,
복사되기 전의 인스턴스와 동일한 주소값을 갖는다는 의미이다.

==========

예제에선,

copy1 == 단순한 Deep Copy
copy2 == ArrayList 의 내부까지 copy (서로 다른 주소값을 가짐)

이다.

 */

import bread.Kind;
import breadmachine.BreadMachineA;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        BreadMachineA a = new BreadMachineA();
        a.setId(1);
        a.setName("Machine A");
        ArrayList<Kind> kind_A = a.getKindOfbread();

        kind_A.add(Kind.BANANA_BREAD);
        kind_A.add(Kind.CHOCOLATE_BREAD);
        kind_A.add(Kind.MELON_BREAD);

        System.out.println("\n[Before Clone]\n====================");
        System.out.println(a.getId());
        System.out.println(a.getName());
        System.out.println(a.getKindOfbread());
        System.out.println("Class Address : " + a.toString());

        // Deep Copy 1 (Copy only the first floor Object)
        BreadMachineA b = a.copy1();

        System.out.println("\n[After Clone (copy 1)]\n====================");
        System.out.println(b.getId());
        System.out.println(b.getName());
        System.out.println(b.getKindOfbread());
        System.out.println("Class Address : " + b.toString());

        b.setId(2);
        b.setName("Machine B");
        ArrayList<Kind> kind_B = b.getKindOfbread();
        kind_B.remove(Kind.BANANA_BREAD);

        // Lists have the same address
        System.out.println("\n[Change Clone (copy 1)]\n====================");
        System.out.println("<A>");
        System.out.println(a.getId());
        System.out.println(a.getName());
        System.out.println(a.getKindOfbread());
        System.out.println("Class Address : " + a.toString());
        System.out.println("\n<B>");
        System.out.println(b.getId());
        System.out.println(b.getName());
        System.out.println(b.getKindOfbread());
        System.out.println("Class Address : " + b.toString());

        // Deep Copy 2 (Copy not only first floor Object, but also values of the list)
        BreadMachineA c = a.copy2();

        c.setId(3);
        c.setName("Machine C");
        ArrayList<Kind> kind_C = c.getKindOfbread();
        kind_C.add(Kind.STRAWBERRY_BREAD);
        kind_C.add(Kind.BANANA_BREAD);

        // Lists have the different address
        System.out.println("\n[Change Clone (copy 2)]\n====================");
        System.out.println("<A>");
        System.out.println(a.getId());
        System.out.println(a.getName());
        System.out.println(a.getKindOfbread());
        System.out.println("Class Address : " + a.toString());
        System.out.println("\n<B>");
        System.out.println(b.getId());
        System.out.println(b.getName());
        System.out.println(b.getKindOfbread());
        System.out.println("Class Address : " + b.toString());
        System.out.println("\n<C>");
        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getKindOfbread());
        System.out.println("Class Address : " + c.toString());
    }
}
