/*
< Proxy Pattern >
참조 1 : http://plposer.tistory.com/31
참조 2 : http://palpit.tistory.com/196

- 어떤 기존 객체(RealSubject) 에 대한 접근을 제어하는 용도로, 대리인(Proxy) 에 해당하는 객체를 제공하는 패턴

>> 프록시는 다양한 방식으로 활용될 수 있다.
   (프록시는 자신이 대변하는 객체(RealSubject) 와 그 객체에 접근하고자 하는 클라이언트 사이에서 여러 가지 방식으로 작업을 처리한다.)

>> RealSubject 객체와 클라이언트 사이에 프록시를 둠으로써, 필요할 때만 cost 높은 메소드에 접근하도록 한다.
>> 중요한 것은 흐름제어만 할 뿐, 절대 결과값을 조작하거나 변경시켜선 안된다.

==========

 << 프로시의 종류 >>

 1. 원격 프록시
 2. 가상 프록시
 3. 동적 프록시
 4. 방화벽 프록시
 5. 스마트 패턴 프록시
 6. 캐싱 프록시
 7. 동기화 프록시
 8. 복잡도 숨김 프록시
 9. 복사 지연 프록시

 등등 ...
 "http://plposer.tistory.com/31" 를 참조하자

==========

 << Proxy 패턴 vs Decorator 패턴 >>

 - 프록시 패턴은 객체에 대한 접근을 제어하고, 데코레이터 패턴은 객체를 치장하여 기능을 확장한다.

 (1) 프록시 패턴
  - 원치 않는 접근으로부터 보호할 수 있음.
  - 커다란 객체를 로딩하는 동안 프로그램이 멈추는 것을 방지할 수 있음.
  - Subject 객체가 원격 시스템에서 돌아가고 있다는 사실을 숨길 수 있음.


 (2) 데코레이터 패턴
  - 코드를 수정하지 않고도 객체가 할 수 있는 행동을 추가해 줌.
  - 구성과 위임을 통해서 실행중에 동적으로 새로운 행동을 추가할 수 있다.
  - 구성요소를 감싸는 데코레이터의 갯수에는 제한이 없다.

==========

예제에선,
수많은 Proxy 패턴의 활용 중 가장 간단하고 기본적인 것을 구현하였다.

Subject == Sendable
RealSubject == Sender
Proxy == SenderProxy

이며,
내용은 Mail 전송 시스템이다.

 */

import mail.Mail;
import mail.Sender;
import mail.SenderProxy;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-31
 * Time: 오후 5:23
 */
public class Main {

    public static void main(String[] args) {
        Sender sender = new Sender();
        SenderProxy senderProxy = new SenderProxy(sender);

        // ====================================================

        Mail simpleMail_1 = new Mail("A", "B");
        simpleMail_1.setContext("This is a simple mail_1");
        senderProxy.sendSimple(simpleMail_1);

        Mail complexMail_1 = new Mail("a", "b");
        complexMail_1.setContext("This is a complex mail_1");
        senderProxy.sendComplex(complexMail_1);

        // ====================================================

        Mail simpleMail_2 = new Mail("a", "B");
        simpleMail_2.setContext("This is a simple mail_2");
        Mail simpleMail_3 = new Mail("c", "A");
        simpleMail_3.setContext("This is a simple mail_3");
        Mail complexMail_2 = new Mail("B", "a");
        complexMail_2.setContext("This is a complex mail_2");
        Mail complexMail_3 = new Mail("d", "B");
        complexMail_3.setContext("This is a complex mail_3");

        senderProxy.sendSimple(simpleMail_2);
        senderProxy.sendSimple(simpleMail_3);
        senderProxy.sendComplex(complexMail_2);
        senderProxy.sendComplex(complexMail_3);
    }
}
