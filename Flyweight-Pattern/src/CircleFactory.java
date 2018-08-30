import drawing.Circle;
import drawing.Color;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-31
 * Time: 오전 3:02
 */
public class CircleFactory {

    private Map<Color, Circle> pool;

    public CircleFactory() {
        this.pool = new HashMap<>();
    }

    public Circle getInstance(Color color) {
        Circle instance = pool.get(color);

        // Flyweight 객체의 존재 여부 확인 (없으면 새로 생성)
        if (instance == null) {
            instance = new Circle(color);
            pool.put(color, instance);
            System.out.println(String.format("\n - Creating a new Circle of color '%s'", color));
        }
        return instance;
    }

    public Map<Color, Circle> getPool() {
        return this.pool;
    }
}
