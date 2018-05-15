/*
< Factory Method Pattern >
참조 1 : http://jdm.kr/blog/180
참조 2 : https://blog.seotory.com/post/2016/08/java-factory-pattern

- 어떤 Super Class 하위의 비슷한 구조의 Sub Class 들을 생성하고자 할 때,
 모든 로직을 하나의 Controller(Factory) 에서 관리하여 객체 자체를 반환하는 구조 패턴

>> Template Method Pattern 의 연장선에 있는 패턴이며,
결과값이 객체 자체인 점에서 차이가 있다.

>> 로직 간의 결합도를 낮춰 유지 보수에 유용하다.

(MVC 에서 Controller 의 역할과 비슷한 느낌.)

==================

SuperProduct 에서 구조를 정의하고,
SubProduct 에서 로직을 구현한다.
Factory 에서 SuperProduct - SubProduct 를 생성하고 반환한다.

예제에선,

SuperProduct == Cake
SubProduct == ChocolateCake || StrawberryCake
Factory == CakeFactory

 */

import factory.CakeFactory;
import product.Cake;

public class Main {

    public static void main(String[] args) {

        CakeFactory cf = new CakeFactory();
        Cake cake1, cake2;

        cake1 = cf.createCake("Chocolate");
        cake2 = cf.createCake("Strawberry");

        System.out.println("=======================");
        System.out.println(cake1.getName());
        System.out.println(cake1.getMaterial());
        System.out.println(cake1.getPrice());
        System.out.println(cake1.toString());
        System.out.println("=======================");
        System.out.println(cake2.getName());
        System.out.println(cake2.getMaterial());
        System.out.println(cake2.getPrice());
        System.out.println(cake2.toString());
    }
}
