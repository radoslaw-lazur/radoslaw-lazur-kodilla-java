package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .bun("Dark")
                .sauce("Standard")
                .burgers(2)
                .ingredient("Onion")
                .ingredient("Cucumber")
                .ingredient("Letucce")
                .ingredient("Chilli Peppers")
                .build();
        System.out.println(bigMac);
        //When
        int sizeOfIngredients = bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(4, sizeOfIngredients);
    }
}
