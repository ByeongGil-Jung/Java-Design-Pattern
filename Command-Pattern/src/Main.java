/*
< Command Pattern >

참조 1 : http://effectiveprogramming.tistory.com/entry/Command-%ED%8C%A8%ED%84%B4
참조 2 : http://jusungpark.tistory.com/18
참조 3 : http://unabated.tistory.com/entry/%EC%BB%A4%EB%A7%A8%EB%93%9C-%ED%8C%A8%ED%84%B4Command-Pattern

- 일련의 동작 및 요구사항을 객체로 캡슐화 할 수 있으며, 매개변수를 사용하여 여러가지 다른 요구사항들을 추가할 수 있다.

>> 작업을 요청하는 쪽과, 처리하는 쪽을 분리할 수 있다.
>> 요청 내역을 Collection(큐, 스택 등등 ...) 에 저장하거나 로그로 기록할 수 있으며, 작업 취소 기능 등을 추가할 수 있다.
   (예제에선 작업취소(undo()), 재실행(redo()) 기능을 추가하였다.)

======================================================================================

 < 구조 >

 1. Client ::
  - Client 는 Invoker 를 생성하고 Receiver 를 설정한다.

 2. Receiver ::
  - Receiver 는 요구사항을 수행하기 위해 어떤 일을 처리해야 하는지를 알고 있는 객체이다.

 3. Invoker ::
  - Invoker 에는 Command 가 들어있으며,
    execute() 를 호출함으로써 Command 에게 특정 작업을 수행해 달라는 요구를 한다.
    (Invoker 에서 execute() 의 요청이 들어오면, 요구사항에 맞는 ConcreteCommand 를 생성한다.
     - 예제에선 ShapeCommand 하나밖에 없지만, 실제론 다양한 ConcreteCommand 를 생성 할 수 있다.)

 4. Command ::
  - Command 는 보통 인터페이스이며,
    execute() 메소드를 정의함으로써, 이를 통해 Receiver 에게 특정 작업을 처리하라는 요구를 전달한다.

 5. ConcreteCommand ::
  - ConcreteCommand 는 Invoker 의 요청과, Receiver 의 동작을 알맞게 연결(bind) 한다.
    즉, Invoker 에서 들어온 execute() 요청을 Receiver 의 execute() 을 호출함으로써 수행한다.


 < 정리 >

  실질적인 동작을 수행하는 Receiver 를 Command 객체에 집어넣고,
  Invoker 를 통해 Client 와 Command 를 연결시킨다.

  Invoker 는 execute() 를 비롯한 간단한 동작 메소드들만 외부에 공개한다.
  즉, Client 는 오로지 Invoker 를 통해서 Receiver 의 메소드에 접근할 수 있다.
  (Receiver 는 캡슐화된 것)


======================================================================================

예제에선,

Client == Main
Receiver == IShape 를 상속받은 클래스들 (Circle, Rectangle)
Invoker == CommandManager
Command == ICommand
ConcreteCommand == ICommand 를 상속받아 Command 를 구체화한 클래스들 (ShapeCommand)

이다.

*/

import commands.ICommand;
import commands.ShapeCommand;
import shapes.Circle;
import shapes.Rectangle;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-09-01
 * Time: 오후 1:38
 */
public class Main {

    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n - Select the command :");
            System.out.println("1 > Drawing");
            System.out.println("2 > Undo");
            System.out.println("3 > Redo");
            System.out.println("0 > Exit");

            int cmd = scanner.nextInt();
            // 종료
            if (cmd == 0) {
                System.out.println(" - Exit Application");
                break;
            // execute()
            } else if (cmd == 1) {
                System.out.println("\n - Choose what you want to draw :");
                System.out.println("1 > Circle");
                System.out.println("2 > Rectangle");

                ICommand command = null;

                cmd = scanner.nextInt();
                switch (cmd) {
                    case 1:
                        command = new ShapeCommand(new Circle());
                        break;
                    case 2:
                        command = new ShapeCommand(new Rectangle());
                        break;
                }

                commandManager.execute(command);
                commandManager.resetRedo();
            // undo()
            } else if (cmd == 2) {
                commandManager.undo();
            // redo()
            } else if (cmd == 3) {
                commandManager.redo();
            }

            System.out.println("\n - Undo Stack ::");
            System.out.println(commandManager.toStringUndos());
            System.out.println(" - Redo Stack ::");
            System.out.println(commandManager.toStringRedos());
        }
    }
}
