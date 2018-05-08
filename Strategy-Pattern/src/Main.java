import weapon.Ax;
import weapon.Gun;
import weapon.Sword;

/*
< Strategy Pattern >

implement 를 활용하여 하나의 접점을 만든다.
이 후, 하나의 객체에
같은 기능을 하는 서로 다른 메소드들을 할당할 수 있다. (implement 는 동일하게 받는다.)

>> 같은 객체에 동일한 implement 에서 만든 method 를 다양하게 치환할 수 있다는 것이 포인트.
 */

public class Main {

    public static void main(String[] args) {
        Soldier soldier = new Soldier();

        soldier.action();

        soldier.setWeapon(new Gun());
        soldier.action();

        soldier.setWeapon(new Sword());
        soldier.action();

        // Adding Ax
        soldier.setWeapon(new Ax());
        soldier.action();
    }
}
