package observer_pattern_util;

import java.util.Observable;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-21
 * Time: 오후 3:58
 */
public class WeatherData1 extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    // 새로운 데이터를 전달 받아 갱신하고, 새로운 데이터가 들어왔음을 알린다.
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 갱신할 새로운 데이터 여부의 플래그 값을 변경하고, (setChanged())
    // 옵저버들에게 새로운 데이터를 전달한다. (notifyObservers())
    private void measurementsChanged() {
        setChanged();
        notifyObservers(); // PUSH 방식
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
