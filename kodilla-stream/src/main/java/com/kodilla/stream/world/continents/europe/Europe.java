package com.kodilla.stream.world.continents.europe;

import com.kodilla.stream.world.interfaces.Continent;
import com.kodilla.stream.world.interfaces.Country;
import com.kodilla.stream.world.continents.europe.countries.Germany;
import com.kodilla.stream.world.continents.europe.countries.Poland;
import com.kodilla.stream.world.continents.europe.countries.Ukraine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Europe implements Continent {
    public static List<Country> listOfCountries = new LinkedList();
    public BigDecimal peopleQuantity = listOfCountries.stream()
            .map(Country::getPeopleQuantity)
            .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public Europe() {
        listOfCountries.add(new Germany());
        listOfCountries.add(new Poland());
        listOfCountries.add(new Ukraine());
    }

    public List<Country> getListOfCountries() {
        return listOfCountries;
    }
}
