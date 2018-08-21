package observer_pattern_util;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-21
 * Time: 오후 6:25
 */
public class PressureDisplay1 implements Observer, DisplayInterface1 {

    private Observable observable;

    private float currentPressure = 1013.25f; // default pressure
    private float lastPressure;

    public PressureDisplay1(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData1) {
            WeatherData1 weatherData1 = (WeatherData1) o;
            lastPressure = currentPressure;
            currentPressure = weatherData1.getPressure();
        }
    }

    @Override
    public void display() {
        System.out.println(String.format("Current Pressure : %f", currentPressure));
        System.out.println(String.format(" - Difference with last pressure : %f", currentPressure - lastPressure));
    }
}
