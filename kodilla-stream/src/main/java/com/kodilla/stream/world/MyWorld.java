package com.kodilla.stream.world;

import com.kodilla.stream.world.continents.africa.Africa;
import com.kodilla.stream.world.interfaces.Continent;
import com.kodilla.stream.world.continents.europe.Europe;
import com.kodilla.stream.world.interfaces.World;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyWorld implements World {

    List<Continent> listOfContinents = new LinkedList<>();
    public BigDecimal peopleQuantity = listOfContinents.stream()
            .map(Continent::getPeopleQuantity)
            .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

    public MyWorld() {
        listOfContinents.add(new Europe());
        listOfContinents.add(new Africa());
    }

    public List<Continent> getListOfContinents() {
        return listOfContinents;
    }
}
