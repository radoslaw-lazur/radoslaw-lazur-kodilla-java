package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser user1 = new ForumUser("user1");
        ForumUser user2 = new ForumUser("user2");
        javaHelpForum.registerObserver(user1);
        javaToolsForum.registerObserver(user1);
        javaHelpForum.registerObserver(user2);
        javaToolsForum.registerObserver(user2);
        //When
        javaHelpForum.addPost("post1");
        javaToolsForum.addPost("post2");
        //Then
        assertEquals(2, user1.getUpdateCount());
        assertEquals(2, user2.getUpdateCount());
    }
}
