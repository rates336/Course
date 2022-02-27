package com.kodilla.stream.world.continents.europe.countries;

import com.kodilla.stream.world.interfaces.City;
import com.kodilla.stream.world.interfaces.Country;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Ukraine implements Country {
    List<City> listOfCities = new LinkedList<>();
    public BigDecimal getPeopleQuantity() {
        return BigDecimal.valueOf(44130000);
    }

    public List<City> getListOfCities() {
        return listOfCities;
    }
}
