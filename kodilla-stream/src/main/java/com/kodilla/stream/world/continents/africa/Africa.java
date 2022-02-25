package com.kodilla.stream.world.continents.africa;

import com.kodilla.stream.world.continents.africa.countries.Egypt;
import com.kodilla.stream.world.continents.africa.countries.RPA;
import com.kodilla.stream.world.continents.africa.countries.SudanSouth;
import com.kodilla.stream.world.interfaces.Continent;
import com.kodilla.stream.world.interfaces.Country;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Africa implements Continent {

    public BigDecimal peopleQuantity = listOfCountries().stream()
            .map(Country::getPeopleQuantity)
            .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
    public List<Country> listOfCountries() {
        List<Country> theList = new ArrayList<>();
        theList.add(new SudanSouth());
        theList.add(new Egypt());
        theList.add(new RPA());
        return theList;
    }
}
