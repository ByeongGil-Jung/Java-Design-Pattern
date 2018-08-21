package observer_pattern_custom.observers;

import observer_pattern_custom.Observable;
import observer_pattern_custom.WeatherData2;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-21
 * Time: 오후 9:46
 */
public class PressureDisplay2 implements Observer, DisplayInterface2 {

    private Observable observable;

    private float currentPressure = 1013.25f;
    private float lastPressure;

    public PressureDisplay2(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable observable) {
        if (observable instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) observable;
            lastPressure = currentPressure;
            currentPressure = weatherData2.getPressure();
        }
    }

    @Override
    public void display() {
        System.out.println(String.format("Current Pressure : %f", currentPressure));
        System.out.println(String.format(" - Difference with last pressure : %f", currentPressure - lastPressure));
    }
}
