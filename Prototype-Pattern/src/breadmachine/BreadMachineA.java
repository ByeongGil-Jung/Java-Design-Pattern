package breadmachine;

import bread.Kind;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * Project: Prototype-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-19
 * Time: 오전 10:08
 */
public class BreadMachineA extends BreadMachine {

    private ArrayList<Kind> kindOfbread;

    public BreadMachineA() {
        kindOfbread = new ArrayList<>();
    }

    public ArrayList<Kind> getKindOfbread() {
        return kindOfbread;
    }

    private void setKindOfbread(ArrayList<Kind> kindOfbread) {
        this.kindOfbread = kindOfbread;
    }

    // Copy only the first floor Object
    public BreadMachineA copy1() throws CloneNotSupportedException {
        BreadMachineA clone = (BreadMachineA) clone();
        return clone;
    }

    // Copy not only first floor Object, but also values of the list
    public BreadMachineA copy2() throws CloneNotSupportedException {

        BreadMachineA clone = (BreadMachineA) clone();
        clone.setKindOfbread(new ArrayList<>());

        for (Kind i : this.getKindOfbread()) {
            clone.getKindOfbread().add(i);
        }

        return clone;
    }
}
