/*
< Bridge Pattern >
참조 1 : http://blog.naver.com/PostView.nhn?blogId=2feelus&logNo=220654144018&redirect=Dlog&widgetTypeCall=true
참조 2 : http://gakari.tistory.com/entry/%EB%94%94%EC%9E%90%EC%9D%B8-%ED%8C%A8%ED%84%B4-Bridge-%ED%8C%A8%ED%84%B4

- 객체의 생성을 구현부(interface) 와 기능부(execution) 로 분리하여
클라이언트의 요청에 따라 적합한 인스턴스를 만들고, 두 관계간의 결합도를 낮춰 유지보수성을 높인 설계 방식이다.

>> 즉, 구현부와 기능부를 분리하여 독립적으로 개발하고 변화시킬 수 있다는 것이 중요하다 !!

////

< Strategy Pattern 과의 비교 >

[공통점]
> 인자로 전달받은 객체(구현부)에 의해 기능부가 결정된다.

[차이점]
> Strategy Pattern 은 런타임 도중 클라이언트의 요청에 따라 기능부를 변경시키지만,
Bridge Pattern 은 객체 생성 시점에 기능부를 결정한다. (즉, 고정된 인스턴스를 만든다.)

////

< Adapter Pattern 과의 비교 >

[공통점]
> 인자로 전달받은 객체에 따라, 매우 연관성이 높은 새로운 클래스 혹은 인터페이스로 참조할 수 있다.

[차이점]
> Adapter Pattern 은 기존에 존재하는 객체를 참조할 수 있는 새로운 인터페이스를 리턴해주지만,
Bridge Pattern 은 새로운 객체를 효율적으로 만들기 위해 기능부와 구현부를 분리하고, 구현부를 객체 생성시에 인자로 전달받는다.

==================

예제에선,

구현부(interface) == interface_pkg 패키지
기능부(execution) == execution 패키지

 */

import execution.PrintMorseCode;
import interface_pkg.FlashMorseFunction;
import interface_pkg.SoundMorseFunction;

public class Main {

    public static void main(String[] args) {

        PrintMorseCode morseCode1 = new PrintMorseCode();
        morseCode1.J().B().K();
        System.out.print("\n");

        PrintMorseCode morseCode2 = new PrintMorseCode(new FlashMorseFunction());
        morseCode2.J().B().K();
        System.out.print("\n");

        PrintMorseCode morseCode3 = new PrintMorseCode(new SoundMorseFunction());
        morseCode3.J().B().K();
        System.out.print("\n");
    }
}
