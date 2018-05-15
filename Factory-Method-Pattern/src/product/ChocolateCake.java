package product;

/**
 * Created by IntelliJ IDEA.
 * Project: Factory-Method-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-15
 * Time: 오전 9:56
 */
public class ChocolateCake extends Cake {

    @Override
    public String getName() {
        return "Chocolate Cake";
    }

    @Override
    public int getPrice() {
        return 4500;
    }

    @Override
    public String getMaterial() {
        return "Material :: chocolate, flour, whipped cream";
    }

    @Override
    public String toString() {
        return "Cake > Chocolate Cake";
    }
}
