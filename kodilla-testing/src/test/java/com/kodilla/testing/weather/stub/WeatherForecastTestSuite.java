package com.kodilla.testing.weather.stub;

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
        double expectedTotal = 127.8;
        double actual = weatherForecast.averageTemperatures(temperatures);

        Assertions.assertEquals(expectedTotal, actual);
    }

}