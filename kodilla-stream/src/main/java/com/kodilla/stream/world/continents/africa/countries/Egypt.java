package com.kodilla.stream.world.continents.africa.countries;

import com.kodilla.stream.world.interfaces.City;
import com.kodilla.stream.world.interfaces.Country;

import java.math.BigDecimal;
import java.util.List;

public class Egypt implements Country {
    public BigDecimal getPeopleQuantity() {
        return BigDecimal.valueOf(102300000);
    }
    public List<City> listOfCities() {
        return null;
    }
}
