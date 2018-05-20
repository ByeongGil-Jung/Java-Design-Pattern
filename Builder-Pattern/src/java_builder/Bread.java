package java_builder;

/**
 * Created by IntelliJ IDEA.
 * Project: Builder-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-20
 * Time: 오후 9:36
 */
public class Bread {

    private final String name;
    private final int flour;
    private final String fruit;
    private final int water;
    private final int egg;

    private Bread(BreadBuilder builder) {
        this.name = builder.name;
        this.flour = builder.flour;
        this.fruit = builder.fruit;
        this.water = builder.water;
        this.egg = builder.egg;
    }

    public String getName() {
        return name;
    }

    public int getFlour() {
        return flour;
    }

    public String getFruit() {
        return fruit;
    }

    public int getWater() {
        return water;
    }

    public int getEgg() {
        return egg;
    }

    // Builder
    public static class BreadBuilder {

        // Required Parameters
        private final String name;

        // Optional Parameters (initialized to default values)
        private int flour = 100;
        private String fruit = "None";
        private int water = 100;
        private int egg = 0;

        public BreadBuilder(String name) {
            this.name = name;
        }

        public BreadBuilder setFlour(int flour) {
            this.flour = flour;
            return this;
        }

        public BreadBuilder setFruit(String fruit) {
            this.fruit = fruit;
            return this;
        }

        public BreadBuilder setWater(int water) {
            this.water = water;
            return this;
        }

        public BreadBuilder setEgg(int egg) {
            this.egg = egg;
            return this;
        }

        public Bread build() {
            return new Bread(this);
        }
    }
}
