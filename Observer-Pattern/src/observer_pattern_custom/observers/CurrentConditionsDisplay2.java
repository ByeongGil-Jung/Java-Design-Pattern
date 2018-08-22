package observer_pattern_custom.observers;

import observer_pattern_custom.Observable;
import observer_pattern_custom.WeatherData2;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-21
 * Time: 오후 9:07
 */
public class CurrentConditionsDisplay2 implements Observer, DisplayInterface2 {

    private Observable observable;

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay2(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    // observable 을 원하는 객체로 다운 캐스팅 하는 것이 매우 중요하다 !
    @Override
    public void update(Observable observable) {
        if (observable instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) observable;
            temperature = weatherData2.getTemperature();
            humidity = weatherData2.getHumidity();
        }
    }

    @Override
    public void display() {
        System.out.println(String.format("Current Temperature : %f", temperature));
        System.out.println(String.format("Current Humidity : %f", humidity));
    }
}
