/*
< Composite Pattern >

참조 1 : https://blog.seotory.com/post/2017/09/java-composite-pattern
참조 2 : https://jdm.kr/blog/228

- 클래스의 구조적 디자인 패턴으로,
  단일 객체(내용물, Leaf)와 복합 객체(컨테이너, Composite)를 동일하게 컨트롤 할 수 있게끔 도와주는 패턴이다.
- 단일 객체와 복합 객체를 트리 구조로 구성할 수 있다.


==========

 Component :
  - 인터페이스 혹은 추상 클래스로 정의.

 Composite :
  - 다수의 Leaf 를 컨트롤 할 수 있는 클래스.
  - Component 클래스를 상속받는다.
  - Component 요소를 자식으로 가진다.
  (Component 요소를 관리하기 위한 메소드들을 추가적으로 구현해줘야 한다.)

 Leaf :
  - Component 를 구현하는 실질적 요소.
  - Component 클래스를 상속받는다.

즉,
컨테이너(Composite)와 내용물(Leaf)을 동일한 컴포넌트(Component) 객체로 상속받는다.


==========

예제에선,

Component == Component
Composite == Composition
Leaf == Leaf

클래스로,
폴더와 파일 구조를 트리 관계로 나타내었다.

*/


import component.Composition;
import component.Leaf;

public class Main {

    public static void main(String[] args) {

        Composition root = new Composition("Root");

        Composition folder1 = new Composition("Folder 1");
        Composition folder2 = new Composition("Folder 2");

        Composition folder1_1 = new Composition("Folder 1 - 1");
        Composition folder1_2 = new Composition("Folder 1 - 2");

        Leaf file1 = new Leaf("File 1");
        Leaf file2 = new Leaf("File 2");
        Leaf file3 = new Leaf("File 3");
        Leaf file4 = new Leaf("File 4");

        root.add(folder1);
        root.add(folder2);

        folder1.add(folder1_1);
        folder1.add(folder1_2);

        folder1.add(file1);
        folder1_1.add(file2);
        folder1_2.add(file2);
        folder2.add(file3);
        folder1_1.add(file4);

        System.out.println("=====================");
        System.out.println("\n - Show : Root");
        root.show();
        System.out.println("\n - Show : folder1");
        folder1.show();
        System.out.println("\n - Show : folder1_1");
        folder1_1.show();
        System.out.println("\n - Show : folder1_2");
        folder1_2.show();
        System.out.println("\n - Show : folder2");
        folder2.show();
    }
}
