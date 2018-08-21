package observer_pattern_custom.observers;

import observer_pattern_custom.Observable;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-21
 * Time: 오후 7:33
 */
// Observer 는 새로 만들어도 되지만,
// java.util 의 Observer 를 그대로 사용해도 괜찮다.
public interface Observer {

    // 객체 그 자체(DTO)로 넘겨서 변경된 데이터를 처리하도록 한다.
    public void update(Observable observable);
}
