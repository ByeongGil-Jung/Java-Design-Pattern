package gof_builder;

/**
 * Created by IntelliJ IDEA.
 * Project: Builder-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-22
 * Time: 오후 11:57
 */
public class Cookie {

    private String name;
    private int water;
    private String ingredient;
    private int egg;

    public Cookie(String name, int water, String ingredient, int egg) {
        this.name = name;
        this.water = water;
        this.ingredient = ingredient;
        this.egg = egg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }
}
