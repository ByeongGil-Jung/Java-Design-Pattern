package observer_pattern_util;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by IntelliJ IDEA.
 * Project: Design-Pattern
 * ===========================================
 * User: ByeongGil Jung
 * Date: 2018-08-21
 * Time: 오후 4:14
 */
public class CurrentConditionsDisplay1 implements Observer, DisplayInterface1 {

    private Observable observable; // 등록될 Observable

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay1(Observable observable) {
        this.observable = observable; // Observable 등록
        this.observable.addObserver(this); // this(CurrentConditionDisplay) 를 옵저버로 등록
    }

    // 근데 update() 는 왜 public 일까 ?
    // 커스텀 한다면 protected 로 하는 것이 더 안전하지 않을까 ??
    //  -> interface 는 public 으로만 만들 수 있다 !
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData1) { // Observable 이 WeatherData1 인지 확인
            WeatherData1 weatherData1 = (WeatherData1) o; // WeatherData1 로 다운캐스팅
            this.temperature = weatherData1.getTemperature(); // 온도 갱신
            this.humidity = weatherData1.getHumidity(); // 습도 갱신
        }
    }

    // 현재 데이터를 출력
    @Override
    public void display() {
        System.out.println(String.format("Current Temperature : %f", temperature));
        System.out.println(String.format("Current Huminity : %f", humidity));
    }
}
