/*
< Chain-of-Responsibility >

참조 1 : http://objectbuilder.tistory.com/84
참조 2 : http://blog.naver.com/PostView.nhn?blogId=janghun741&logNo=10187839624

- 어떤 요청이 발생했을 때 그 요청을 처리할 객체를 직접 찾을 수 없는 경우,
복수의 객체를 사슬처럼 연결해두어 처리 가능한 객체를 찾을 때 까지 계속 요청을 넘기는 구조이다.

(Linked List 의 개념과 유사하다.)

////

요청을 받을 추상 클래스와,
요청을 처리할 구상 클래스로 구성된다.

이 때, 추상 클래스에서 '요청을 어떻게 구분하고, 넘길지 판단하는 로직' 을 작성해야 한다.
(예제에선 AbstLogger 의 logMessage 메소드가 그 역할을 담당한다.)

==========

예제에선,

추상 클래스 == AbstLogger
구상 클래스 == ErrorLogger, WarningLogger, InfoLogger

이다.

*/

import logger.*;

public class Main {

    private static AbstLogger getLoggers() {
        AbstLogger errorLogger = new ErrorLogger(LogLevel.ERROR.ordinal());
        AbstLogger warningLogger = new WarningLogger(LogLevel.WARNING.ordinal());
        AbstLogger infoLogger = new InfoLogger(LogLevel.INFO.ordinal());

        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstLogger logger = getLoggers();

        logger.logMessage(LogLevel.INFO.ordinal(), "Info Message");
        logger.logMessage(LogLevel.WARNING.ordinal(), "Warning Message");
        logger.logMessage(LogLevel.ERROR.ordinal(), "Error Message");
    }
}
