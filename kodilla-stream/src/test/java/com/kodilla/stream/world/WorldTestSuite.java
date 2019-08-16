package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        // Given
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland",new BigDecimal("100")));
        europe.addCountry(new Country("Germany",new BigDecimal("100")));
        europe.addCountry(new Country("France",new BigDecimal("100")));
        europe.addCountry(new Country("Spain",new BigDecimal("100")));
        europe.addCountry(new Country("Italy",new BigDecimal("100")));
        Continent asia = new Continent();
        asia.addCountry(new Country("China",new BigDecimal("100")));
        asia.addCountry(new Country("Singapore",new BigDecimal("100")));
        asia.addCountry(new Country("Japan",new BigDecimal("100")));
        asia.addCountry(new Country("India",new BigDecimal("100")));
        Continent australia = new Continent();
        australia.addCountry(new Country("Australia",new BigDecimal("100")));
        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(australia);
        // When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();
        // Then
        Assert.assertEquals(new BigDecimal("1000"), totalPeopleQuantity);
    }
}
