package observer_pattern_custom;

import observer_pattern_custom.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-21
 * Time: 오후 8:46
 */
public class WeatherData2 implements Observable {

    // 연락을 돌릴 Observer 들의 리스트
    private List<Observer> observerList;

    private float temperatrue;
    private float humidity;
    private float pressure;

    public WeatherData2() {
        this.observerList = new ArrayList<>();
    }

    public void setMeasurements(float temperatrue, float humidity, float pressure) {
        this.temperatrue = temperatrue;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    // 변경된 데이터를 실질적으로 업데이트 해주는 메소드
    // 각 Observer 객체들에게 update() 메소드를 호출시킨다.

    // 이 때, 자기 자신을 인자로 던진다. (객체 그 자체(DTO)로 넘겨서 변경된 데이터를 처리하도록 한다.)
    @Override
    public void notifyObserver() {
        for (Observer obs : observerList) {
            obs.update(this);
        }
    }

    public float getTemperatrue() {
        return temperatrue;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
