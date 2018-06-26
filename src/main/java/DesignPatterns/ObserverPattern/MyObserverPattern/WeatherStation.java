package DesignPatterns.ObserverPattern.MyObserverPattern;

/**
 * Created by cycy on 2018/6/16.
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData weatherData=new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay=new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);

        weatherData.setMeasurements(1,1,1);
        weatherData.setMeasurements(2,2,2);
    }



}
