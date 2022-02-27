package com.kodilla.stream.world.continents.africa;

import com.kodilla.stream.world.continents.africa.countries.Egypt;
import com.kodilla.stream.world.continents.africa.countries.RPA;
import com.kodilla.stream.world.continents.africa.countries.SudanSouth;
import com.kodilla.stream.world.interfaces.Continent;
import com.kodilla.stream.world.interfaces.Country;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Africa implements Continent {

    List<Country> listOfCountries = new ArrayList<>();
    public BigDecimal peopleQuantity = getListOfCountries().stream()
            .map(Country::getPeopleQuantity)
            .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));


    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public Africa() {
        listOfCountries.add(new SudanSouth());
        listOfCountries.add(new Egypt());
        listOfCountries.add(new RPA());

    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
