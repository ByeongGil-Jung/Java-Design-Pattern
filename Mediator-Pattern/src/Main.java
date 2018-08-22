/*
< Mediator Pattern >
참조 1 : http://leetaehoon.tistory.com/67
참조 2 : http://palpit.tistory.com/201

- 모듈에서 상호작용을 하는 클래스들(Colleague)이 서로 복잡하게 관계를 맺고 있을 경우에,
  이들을 관리하는 별도의 클래스(Mediator)를 정의하여 중재(Mediate)를 맡게 하는 패턴.

  >> 중재자 패턴은 복잡한 상호작용을 하나의 클래스에서 관리할 수 있다.

=========================================================================================================

- 중간 행위를 찾아 별도의 클래스를 두게 함
- 다른 객체의 존재를 모르는 상태에서도 메시지를 주고 받을 수 있음

 즉,
 중재자 패턴은 M:N 의 객체관계를 M:1 로 전환한다.

>> 옵저버 패턴(Observer Pattern) 과 퍼사드 패턴(Facade Pattern) 을 섞은 느낌이다.
(카카오톡 단톡방의 개념과 유사하다.)

=========================================================================================================

(알고리즘)

연관된 각 Colleague 들은 하나의 Mediator 을 등록시킨다. (registerMediator(Mediator mediator))

이후,
어떤 Colleague 에서 Mediator 를 향해 요청(mediate())을 보내면,
Mediator 에서 각 Colleague 에게 똑같은 메소드(handle())를 수행하도록 시킨다.

예제에선,
단톡방 채팅과 유사한 시스템을 구현하였다.

 */

import colleague.ChattingColleague;
import colleague.Colleague;
import mediator.ChattingMediator;
import mediator.Mediator;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-22
 * Time: 오후 10:57
 */
public class Main {

    public static void main(String[] args) {
        // Creating Mediator
        Mediator chattingMediator = new ChattingMediator();

        // Creating chatting members (Colleagues)
        Colleague colleague1 = new ChattingColleague("A", "1");
        Colleague colleague2 = new ChattingColleague("B", "1");
        Colleague colleague3 = new ChattingColleague("C", "2");
        Colleague colleague4 = new ChattingColleague("D", "3");

        // Register the Mediator
        colleague1.registerMediator(chattingMediator);
        colleague2.registerMediator(chattingMediator);
        colleague3.registerMediator(chattingMediator);
        colleague4.registerMediator(chattingMediator);

        // Sending a message to other members
        ((ChattingColleague) colleague1).sendChattingMessage("Hello ~");
        System.out.println();
        ((ChattingColleague) colleague2).sendChattingMessage("Nihao ~");
        System.out.println();
        ((ChattingColleague) colleague3).sendChattingMessage("An-Nyeong ~");
        System.out.println();
        ((ChattingColleague) colleague4).sendChattingMessage("Bonjour ~");
    }
}
