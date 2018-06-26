package element_visitor;

import element.Fruit;
import element.Meat;

/**
 * Created by IntelliJ IDEA.
 * Project: Visitor-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-06-20
 * Time: 오후 2:35
 */
public interface Visitor {

    public int visit(Meat meat);
    public int visit(Fruit fruit);
}
