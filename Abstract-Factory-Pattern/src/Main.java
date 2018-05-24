/*
< Abstract Factory Pattern >
참조 1 : http://defacto-standard.tistory.com/entry/Factory-Method-Pattern%EA%B3%BC-Abstract-Factory-Pattern-%EA%B3%B5%ED%86%B5%EC%A0%90%EA%B3%BC-%EC%B0%A8%EC%9D%B4%EC%A0%90
참조 2 : http://oniondev.egloos.com/9662639

- 팩토리 패턴의 결과값이 인스턴스인 것과 달리, 추상 팩토리 패턴의 결과값은 인스턴스를 만드는 서브클래스가 된다.

즉, 팩토리 패턴은 팩토리를 통해 여러 비슷한 인스턴스를 생성할 수 있고,
추상 팩토리 패턴은 팩토리를 통해 상황에 따라 다양한 서브클래스를 반환하여, 그 서브클래스에서 인스턴스를 생성하게 끔 만든다.

////

추상 팩토리 패턴을 통해 다시 구조화 된 서브클래스를 반환함을 아는 것이 중요하다 !


==========

AbstractClass 에서 정의하여,
ConcreteClass 에서 구조(서브클래스)를 구현하고,
Factory 에서 구조(서브클래스)를 반환한다.

예제에선,
AbstractClass == abst_class 패키지 내의 인터페이스들
ConcreteClass == concrete_class 패키지 내의 클래스들
Factory == FactoryInstance

이다.

////

예제는 OS 플랫폼에 따라 팩토리에서 적합한 객체를 반환한다.
이를 통해 알맞은 플랫폼에 원하는 인스턴스를 생성할 수 있다.

팩토리 :
    FactoryInstance fi = FactoryInstance.getInstance();
적합한 객체 :
    guiFactory = fi.getGuiFactory()
원하는 인스턴스 :
    Button button = guiFactory.createButton();
    Table table = guiFactory.createTable();

 */

import abst_class.Button;
import abst_class.GuiFactory;
import abst_class.Table;
import concrete_class.FactoryInstance;

public class Main {

    public static void main(String[] args) {

        FactoryInstance fi = FactoryInstance.getInstance();
        GuiFactory guiFactory = fi.getGuiFactory();

        Button button = guiFactory.createButton();
        Table table = guiFactory.createTable();

        button.click();
        System.out.println(table.getTable());
    }
}
