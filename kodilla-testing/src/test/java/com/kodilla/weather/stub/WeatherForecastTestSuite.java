package com.kodilla.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WeatherForecastTestSuite {

    @Test
    void testCalculateForecastWithStub() {
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        int quantityOfSensors = weatherForecast.calculateForecast().size();

        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testAverageTemperatures() {
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        double expected = 25.56;
        double actual = weatherForecast.averageTemperatures(temperatures);

        Assertions.assertEquals(expected, actual, 2,"Average");
    }

    @Test
    void testMedianTemperatures() {
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        double expected = 25.5;
        double actual = weatherForecast.medianTemperatures(temperatures);

        Assertions.assertEquals(expected, actual,"Median");
    }

}