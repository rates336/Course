package com.kodilla.stream.world.interfaces;

import java.math.BigDecimal;
import java.util.List;

public interface Continent {
    BigDecimal getPeopleQuantity();
    List<Country> listOfCountries();
}
