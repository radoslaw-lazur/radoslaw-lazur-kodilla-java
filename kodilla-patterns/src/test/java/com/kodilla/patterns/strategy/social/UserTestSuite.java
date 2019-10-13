package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.users.Millenials;
import com.kodilla.patterns.strategy.social.users.User;
import com.kodilla.patterns.strategy.social.users.YGeneration;
import com.kodilla.patterns.strategy.social.users.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User thomas = new Millenials("Thomas");
        User adam = new YGeneration("Adam");
        User peter = new ZGeneration("Peter");
        //When
        String thomasShared = thomas.sharePost();
        System.out.println(thomasShared);
        String adamShared = adam.sharePost();
        System.out.println(adamShared);
        String peterShared = peter.sharePost();
        System.out.println(peterShared);
        //Then
        Assert.assertEquals("Facebook", thomasShared);
        Assert.assertEquals("Snapchat", adamShared);
        Assert.assertEquals("Twitter", peterShared);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User thomas = new Millenials("Thomas");
        //When
        String thomasShared = thomas.sharePost();
        System.out.println(thomasShared);
        thomas.setSocialPublisher(new SnapchatPublisher());
        String nowThomasShared = thomas.sharePost();
        System.out.println(nowThomasShared);
        //Then
        Assert.assertEquals("Snapchat", nowThomasShared);
    }
}
