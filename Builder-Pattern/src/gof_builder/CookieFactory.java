package gof_builder;

import gof_builder.builder.CookieBuilder;

/**
 * Created by IntelliJ IDEA.
 * Project: Builder-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-05-23
 * Time: 오전 12:14
 */
public class CookieFactory {

    private CookieBuilder cookieBuilder;

    public void setCookieBuilder(CookieBuilder cookieBuilder) {
        this.cookieBuilder = cookieBuilder;
    }

    public void make() {
        cookieBuilder.setName();
        cookieBuilder.setWater();
        cookieBuilder.setIngredient();
        cookieBuilder.setEgg();
    }

    public Cookie getCookie() {
        return cookieBuilder.getCookie();
    }
}
