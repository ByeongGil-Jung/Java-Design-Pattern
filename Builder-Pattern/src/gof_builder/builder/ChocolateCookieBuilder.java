package gof_builder.builder;

import gof_builder.Cookie;

/**
 * Created by IntelliJ IDEA.
 * Project: Builder-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-23
 * Time: 오전 12:46
 */
public class ChocolateCookieBuilder extends CookieBuilder {

    private Cookie cookie;

    public ChocolateCookieBuilder() {
        this.cookie = new Cookie("Normal Cookie", 100, "None", 0);
    }

    @Override
    public void setName() {
        cookie.setName("Chocolate Cookie");
    }

    @Override
    public void setWater() {
        cookie.setWater(300);
    }

    @Override
    public void setIngredient() {
        cookie.setIngredient("Chocolate");
    }

    @Override
    public void setEgg() {
        cookie.setEgg(1);
    }

    @Override
    public Cookie getCookie() {
        return cookie;
    }
}
