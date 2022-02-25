package com.kodilla.stream.world.continents.europe;

import com.kodilla.stream.world.interfaces.Continent;
import com.kodilla.stream.world.interfaces.Country;
import com.kodilla.stream.world.continents.europe.countries.Germany;
import com.kodilla.stream.world.continents.europe.countries.Poland;
import com.kodilla.stream.world.continents.europe.countries.Ukraine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Europe implements Continent {
    public BigDecimal peopleQuantity = listOfCountries().stream()
            .map(Country::getPeopleQuantity)
            .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public List<Country> listOfCountries() {
        List<Country> theList = new ArrayList<>();
        theList.add(new Germany());
        theList.add(new Poland());
        theList.add(new Ukraine());
        return theList;
    }
}
