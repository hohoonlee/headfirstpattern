package ch02;

public class ForecastDisplay implements Observer, DisplayElement {
	private WeatherData weatherData;
	private float currentPressure = 29.92f;
	private float lastPressure;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update() {
		lastPressure = currentPressure;
		currentPressure = weatherData.getPressure();
		display();
	}

	public void display() {
		float diff = currentPressure - lastPressure;
		String msg = "지금과 비슷할 것 같습니다.";
		if(diff < 0) {
			msg = "쌀쌀하면 비가 올 것 같습니다.";
		}else if(diff > 0) {
			msg = "날씨가 좋아지고 있습니다.!";
		}
		System.out.println("기상 예보: " + msg);
	}
}
