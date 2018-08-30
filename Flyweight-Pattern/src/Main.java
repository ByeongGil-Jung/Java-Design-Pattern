/*
< Flyweight Pattern >
참조 1 : http://a292run.tistory.com/entry/013-Design-Patterns-Flyweight-Pattern
참조 2 : http://programmingfbf7290.tistory.com/entry/
        %ED%94%8C%EB%9D%BC%EC%9D%B4%EC%9B%A8%EC%9D%B4%ED%8A%B8-%ED%8C%A8%ED%84%B4

- 객체를 공유하여 메모리를 절약하기 위해 고안된 패턴이다.
  공통으로 사용되는 객체는 단 한번만 생성되고 공유를 통해 풀(pool)에 의해 관리 및 사용된다.

>> Singleton 패턴과 유사하다.

==================

(알고리즘 설명)

FlyweightFactory 에서 Flyweight 객체의 생성 및 호출을 담당한다.
Flyweight 객체는 단 하나만 생성되어야 하므로, Map 등의 Collection 을 통해 존재 여부를 확인한다.

==================

예제에선,

Flyweight == Circle
FlyweightFactory == CircleFactory

이고,

결과를 확인해보면,
{RED, BLUE, GREEN} 의 Circle 클래스는 단 하나만 존재하는 것을 알 수 있다.

 */

import drawing.Circle;
import drawing.Color;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-30
 * Time: 오후 11:38
 */
public class Main {
    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();

        for (int i=0; i<15; i++) {
            Color color = Color.values()[(int) (Math.random() * Color.values().length)];
            int x = (int) (Math.random()*100);
            int y = (int) (Math.random()*100);
            int radius = (int) (Math.random()*1000);

            Circle circleInstance = circleFactory.getInstance(color);
            circleInstance.setX(x);
            circleInstance.setY(y);
            circleInstance.setRadius(radius);

            System.out.println(circleInstance.draw());
        }

        System.out.println("\n < The list of Circle Classes >");
        System.out.println(circleFactory.getPool());
    }
}
