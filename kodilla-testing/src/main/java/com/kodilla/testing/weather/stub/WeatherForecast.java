package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperatures(Temperatures temperatures) {
        double sumOfTemperatures = 0;
        String tab[] = new String[5];
        tab[0] = "Warszawa";
        tab[1] = "Krakow";
        tab[2] = "Wroclaw";
        tab[3] = "Gdansk";
        tab[4] = "Rzeszow";
        for (int i = 0; i < temperatures.getTemperatures().size(); i++) {
            sumOfTemperatures += temperatures.getTemperatures().get(tab[i]);
        }
        return sumOfTemperatures;
    }

    public double medianTemperatures(Temperatures temperatures) {
        double sumOfTemperatures = 0;
        String tab[] = new String[5];
        tab[0] = "Warszawa";
        tab[1] = "Krakow";
        tab[2] = "Wroclaw";
        tab[3] = "Gdansk";
        tab[4] = "Rzeszow";
        double[] tempTab = new double[temperatures.getTemperatures().size()];
        int temp = temperatures.getTemperatures().size();
        double tempOP = 0;
        for (int i = 0; i < temperatures.getTemperatures().size(); i++) {
            tempOP = temperatures.getTemperatures().get(tab[i]);
            for (int j = 1; j < temp; j++) {
                if(tempOP > temperatures.getTemperatures().get(tab[j])) {

                }
            }
        }
        return sumOfTemperatures;

    }


}
