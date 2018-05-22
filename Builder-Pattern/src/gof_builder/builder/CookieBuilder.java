package gof_builder.builder;

import gof_builder.Cookie;

/**
 * Created by IntelliJ IDEA.
 * Project: Builder-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-23
 * Time: 오전 12:11
 */
public abstract class CookieBuilder {

    public abstract void setName();
    public abstract void setWater();
    public abstract void setIngredient();
    public abstract void setEgg();

    public abstract Cookie getCookie();
}
