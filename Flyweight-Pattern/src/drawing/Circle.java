package drawing;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-31
 * Time: 오전 2:54
 */
// 원을 만드는 객체
public class Circle implements Shape {

    private Color color;
    private int x;
    private int y;
    private int radius;

    public Circle(Color color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        return String.format("Color : %s, X: %d, Y: %d, Radius: %d || Class : ", color, x, y, radius) + this;
    }
}
