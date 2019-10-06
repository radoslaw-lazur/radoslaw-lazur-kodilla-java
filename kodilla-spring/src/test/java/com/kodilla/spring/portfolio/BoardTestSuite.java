package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        board.toDoList.tasks.add("toDoList");
        board.inProgressList.tasks.add("inProgressList");
        board.doneList.tasks.add("doneList");
        //When
        String string1 = board.toDoList.tasks.get(0);
        String string2 = board.inProgressList.tasks.get(0);
        String string3 = board.doneList.tasks.get(0);
        //Then
        System.out.println(string1);
        Assert.assertEquals("toDoList", string1);
        System.out.println(string2);
        Assert.assertEquals("inProgressList", string2);
        System.out.println(string3);
        Assert.assertEquals("doneList", string3);
    }
}
