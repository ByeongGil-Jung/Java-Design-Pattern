/*
< Visitor Pattern >

참조 1 : http://techbard.tistory.com/2869
참조 2 : https://blog.naver.com/klp0712/220877644948
참조 3 : https://blog.naver.com/2feelus/220664244510

- 이미 구조적으로 완성된 클래스 / 프로젝트 등에 새로운 기능을 추가하고 싶을 때 주로 사용된다.

이 때, 이미 완성된 내부 클래스에 새로운 기능을 추가하는 것이 아니라,
외부 클래스인 Visitor 에 새로운 기능을 추가하고,
기존 내부 클래스의 Accept 메소드를 통해 Visitor 에 방문하여 그 기능을 작동시키게 한다.

(즉, 기존 객체는 그대로 둔 채, 추가된 기능의 연산을 분리한다.)

////

>> 이 때, accept 는 반환 값까지 미리 고려해야 한다.
(예제에선 총 가격의 합을 구하기 위해서 반환값의 자료형을 int 로 지정하였다.)

>> Visitor Pattern 은 완성된 여러 객체들에 대해 여러 새로운 연산을 지정하는 방식이므로 (N:N) 이다.
즉, Command Pattern 의 (1:1) 혹은 Strategy Pattern 의 (1:N) 보다 조금 더 복잡하게 구현해야 한다.

////

(알고리즘의 순서)
1. accept 메소드를 통해 Visitor 의 visit 메소드에 접근한다.
2. visit 메소드는 element 에 따라 각기 다르게 메소드 연산을 수행한다.
3. 각기 다르게 수행된 visit 메소드의 반환값은, 곧 accept 메소드의 반환값으로 도출된다.

==========

AcceptInterface :: 기존에 존재하는 클래스 혹은 구조의 interface 이며, accept 메소드를 선언하여 방문자가 새로운 연산(visit)에 참조 할 수 있게끔 만든다.
(예제에선 ItemElement)
Accept :: interface 에서 선언한 accept 메소드의 실질적인 접근부이다. (여기선 접근만 담당한다. 실질적인 연산의 구현은 visitor 에서 담당한다.)
(예제에선 Fruit, Meat)

VisitorInterface :: accept 에서 요청된 visit 가 수행되도록 선언한다. (이 때, 각기 다른 element 에서 서로 다른 연산이 수행될 수 있으므로 개별적으로 선언한다.)
(예제에선 Visitor)
Visitor :: 실질적인 visit 의 실행부이며, 추가된 연산의 로직을 실질적으로 구현해야 하는 부분이다.
(예제에선 ShopVisitor)

*/

import element.Fruit;
import element.ItemElement;
import element.Meat;
import element_visitor.ShopVisitor;
import element_visitor.Visitor;

public class Main {

    public static void main(String[] args) {

        int total = 0;
        Visitor visitor = new ShopVisitor();
        ItemElement[] items = new ItemElement[]{
                new Meat("Beef", 10, 2),
                new Fruit("Cucumber", 30),
                new Meat("Mutton", 5, 2),
                new Meat("Pork", 7, 3),
                new Fruit("Tomato", 20)
        };

        for (ItemElement item : items) {
            total += item.accept(visitor);
        }

        System.out.println("\nTotal Price :: " + total);
    }
}
