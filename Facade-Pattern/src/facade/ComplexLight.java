package facade;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-20
 * Time: 오후 4:38
 */
class ComplexLight {

    private int lightness;

    public ComplexLight() {
        this.lightness = 10;
    }

    public int getLightness() {
        return lightness;
    }

    public void brighten() {
        System.out.println("ComplexLight :: Lightness + 10");
        lightness += 10;
    }

    public void darken() {
        System.out.println("ComplexLight :: Lightness - 10");
        lightness -= 10;
    }
}
