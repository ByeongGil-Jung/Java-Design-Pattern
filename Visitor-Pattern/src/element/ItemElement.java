package element;

import element_visitor.Visitor;

/**
 * Created by IntelliJ IDEA.
 * Project: Visitor-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-06-20
 * Time: 오후 2:27
 */
public interface ItemElement {

    public int accept(Visitor visitor);
}
