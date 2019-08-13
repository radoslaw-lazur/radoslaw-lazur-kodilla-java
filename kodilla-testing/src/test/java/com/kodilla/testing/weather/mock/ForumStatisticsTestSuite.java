package com.kodilla.testing.weather.mock;

import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;

import java.util.Arrays;
import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    @Before
    public void before() { System.out.println("Test Case: begin"); }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testCalculateAdvStatistics1(){
        // Given when posts = 0
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2", "User3"));
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        System.out.println("");
        forumStatistics.showStatistics();
        System.out.println("");
        // Then
        Assert.assertEquals(3, forumStatistics.getUsersSize()); // checking number of Users
        Assert.assertEquals(100, forumStatistics.getPosts()); // checking number of Posts
        Assert.assertEquals(10, forumStatistics.getComments()); // checking number of Comments
    }

    @Test
    public void testCalculateAdvStatistics2(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2")); // users
        when(statisticsMock.postsCount()).thenReturn(0); // posts
        when(statisticsMock.commentsCount()).thenReturn(10); // comments
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        System.out.println("");
        forumStatistics.showStatistics();
        System.out.println("");
        // Then
        Assert.assertEquals(0.0, forumStatistics.getMeanPostsperUser(), 0.0);
    }

    @Test
    public void testCalculateAdvStatistics3(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2")); // users
        when(statisticsMock.postsCount()).thenReturn(1000); // posts
        when(statisticsMock.commentsCount()).thenReturn(10); // comments
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        System.out.println("");
        forumStatistics.showStatistics();
        System.out.println("");
        // Then
        Assert.assertEquals(500.00, forumStatistics.getMeanPostsperUser(), 0.0);
    }

    @Test
    public void testCalculateAdvStatistics4(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2")); // users
        when(statisticsMock.postsCount()).thenReturn(1000); // posts
        when(statisticsMock.commentsCount()).thenReturn(0); // comments
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        System.out.println("");
        forumStatistics.showStatistics();
        System.out.println("");
        // Then
        Assert.assertEquals(0, forumStatistics.getMeanCommentsPerUser(), 0.0);
    }

    @Test
    public void testCalculateAdvStatistics5(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2")); // users
        when(statisticsMock.postsCount()).thenReturn(1000); // posts
        when(statisticsMock.commentsCount()).thenReturn(100); // comments
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        System.out.println("");
        forumStatistics.showStatistics();
        System.out.println("");
        // Then
        Assert.assertTrue(forumStatistics.getMeanCommentsPerUser() < forumStatistics.getMeanPostsperUser());
    }

    @Test
    public void testCalculateAdvStatistics6(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Arrays.asList("User1", "User2")); // users
        when(statisticsMock.postsCount()).thenReturn(100); // posts
        when(statisticsMock.commentsCount()).thenReturn(1000); // comments
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        System.out.println("");
        forumStatistics.showStatistics();
        System.out.println("");
        // Then
        Assert.assertTrue(forumStatistics.getMeanCommentsPerUser() > forumStatistics.getMeanPostsperUser());
    }

    @Test
    public void testCalculateAdvStatistics7(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(Collections.emptyList()); // users
        when(statisticsMock.postsCount()).thenReturn(100); // posts
        when(statisticsMock.commentsCount()).thenReturn(1000); // comments
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        System.out.println("");
        forumStatistics.showStatistics();
        System.out.println("");
        // Then
        Assert.assertEquals(forumStatistics.getMeanCommentsPerUser(), forumStatistics.getMeanPostsperUser(), 0.0);
    }

    @Test
    public void testCalculateAdvStatistics8(){
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        String[] testListUsers = new String[100];
        for(int i = 0; i < testListUsers.length; i++){
            testListUsers[i] = "User" + i;
        }

        when(statisticsMock.usersNames()).thenReturn(Arrays.asList(testListUsers)); // users
        when(statisticsMock.postsCount()).thenReturn(100); // posts
        when(statisticsMock.commentsCount()).thenReturn(100); // comments
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        System.out.println("");
        forumStatistics.showStatistics();
        System.out.println("");
        // Then
        Assert.assertEquals(forumStatistics.getMeanCommentsPerUser(), forumStatistics.getMeanPostsperUser(), 0.0);
    }
}
