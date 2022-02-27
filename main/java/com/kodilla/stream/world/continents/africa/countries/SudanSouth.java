package com.kodilla.stream.world.continents.africa.countries;

import com.kodilla.stream.world.interfaces.City;
import com.kodilla.stream.world.interfaces.Country;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class SudanSouth implements Country {
    List<City> listOfCities = new LinkedList<>();
    public BigDecimal getPeopleQuantity() {
        return BigDecimal.valueOf(111900000);
    }

    public List<City> getListOfCities() {
        return listOfCities;
    }
}
