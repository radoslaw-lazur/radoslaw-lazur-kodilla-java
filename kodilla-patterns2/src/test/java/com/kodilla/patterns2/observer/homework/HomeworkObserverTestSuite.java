package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkObserverTestSuite {

    @Test
    public void testSendingHomeworks() {
        //Given
        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");
        Pupil pupil1 = new Pupil("Pupil1");
        Pupil pupil2 = new Pupil("Pupil2");
        mentor1.registerObserver(pupil1);
        mentor2.registerObserver(pupil2);
        //When
        mentor1.sendHomework("Spring Homework");
        mentor2.sendHomework("Hibernate Homework");
        mentor2.sendHomework("Spring WEB Homework");
        mentor2.sendHomework("JDBC Homework");
        //Then
        assertEquals(1, pupil1.getHomeworks());
        assertEquals(3, pupil2.getHomeworks());
    }
}
