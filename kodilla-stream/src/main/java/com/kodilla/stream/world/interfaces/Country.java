package com.kodilla.stream.world.interfaces;

import java.math.BigDecimal;
import java.util.List;

public interface Country {
    BigDecimal getPeopleQuantity();
    List<City> listOfCities();
}
