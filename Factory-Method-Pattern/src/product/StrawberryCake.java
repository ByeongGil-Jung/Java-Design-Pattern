package product;

/**
 * Created by IntelliJ IDEA.
 * Project: Factory-Method-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-15
 * Time: 오전 9:54
 */
public class StrawberryCake extends Cake {

    @Override
    public String getName() {
        return "Strawberry Cake";
    }

    @Override
    public int getPrice() {
        return 3000;
    }

    @Override
    public String getMaterial() {
        return "Material :: strawberry, flour, whipped cream";
    }

    @Override
    public String toString() {
        return "Cake > Strawberry Cake";
    }
}
