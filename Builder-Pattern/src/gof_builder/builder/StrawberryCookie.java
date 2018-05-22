package gof_builder.builder;

import gof_builder.Cookie;

/**
 * Created by IntelliJ IDEA.
 * Project: Builder-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-23
 * Time: 오전 12:24
 */
public class StrawberryCookie extends CookieBuilder {


    private Cookie cookie;

    public StrawberryCookie() {

        // Default settings
        this.cookie = new Cookie("Normal Cookie", 100, "None", 0);
    }

    @Override
    public void setName() {
        cookie.setName("Strawberry Cookie");
    }

    @Override
    public void setWater() {
        cookie.setWater(200);
    }

    @Override
    public void setIngredient() {
        cookie.setIngredient("Strawberry");
    }

    @Override
    public void setEgg() {
        cookie.setEgg(2);
    }

    @Override
    public Cookie getCookie() {
        return cookie;
    }
}
