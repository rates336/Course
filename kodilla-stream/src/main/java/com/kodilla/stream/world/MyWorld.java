package com.kodilla.stream.world;

import com.kodilla.stream.world.continents.africa.Africa;
import com.kodilla.stream.world.interfaces.Continent;
import com.kodilla.stream.world.continents.europe.Europe;
import com.kodilla.stream.world.interfaces.World;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MyWorld implements World {

    public BigDecimal peopleQuantity = listOfContinents().stream()
            .map(Continent::getPeopleQuantity)
            .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public List<Continent> listOfContinents() {
        List<Continent> theList = new ArrayList<>();
        theList.add(new Europe());
        theList.add(new Africa());
        return theList;
    }

}
