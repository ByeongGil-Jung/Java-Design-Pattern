import weapon.Weapon;

/**
 * Created by IntelliJ IDEA.
 * Project: Strategy-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-08
 * Time: 오전 10:45
 */
public class Soldier {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void action() {
        if (weapon == null)
            System.out.println("No weapon !");
        else {
            weapon.doAction();
        }
    }
}
