
package com.kodilla.forum.statistic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticTestSuite {

    public List<String> generatorOfUsersList(int quantity) {
        List<String> theList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            theList.add("Book Reader nr " + i);
        }
        return theList;
    }


    @Mock
    Statistics statisticsMock;

    @BeforeEach
    void nextTest() {

    }
    @Test
    void testCalculateAdvStatistics000() {
        //Given
        ForumStats forumStats = new ForumStats(statisticsMock);
        forumStats.userNames = new ArrayList<>();
        forumStats.postCount = 0;
        forumStats.commentsCount = 0;
        forumStats.calculateAdvStatistics();

        //When
        double resultAvePostsForUser = forumStats.averagePostsForUser;
        double resultAveCommentsForUser = forumStats.averageCommentsForUser;
        double resultAveCommentsForPost = forumStats.averageCommentsForPost;
        //Then
        assertEquals(NaN, resultAvePostsForUser);
        assertEquals(NaN, resultAveCommentsForUser);
        assertEquals(NaN, resultAveCommentsForPost);

    }
    @Test
    void testCalculateAdvStatistics010() {
        //Given
        ForumStats forumStats = new ForumStats(statisticsMock);
        forumStats.userNames = new ArrayList<>();
        forumStats.postCount = 1000;
        forumStats.commentsCount = 0;
        forumStats.calculateAdvStatistics();

        //When
        double resultAvePostsForUser = forumStats.averagePostsForUser;
        double resultAveCommentsForUser = forumStats.averageCommentsForUser;
        double resultAveCommentsForPost = forumStats.averageCommentsForPost;
        //Then
        assertEquals(POSITIVE_INFINITY, resultAvePostsForUser);
        assertEquals(NaN, resultAveCommentsForUser);
        assertEquals(0, resultAveCommentsForPost);

    }
    @Test
    void testCalculateAdvStatistics100() {
        //Given
        ForumStats forumStats = new ForumStats(statisticsMock);
        forumStats.userNames = generatorOfUsersList(100);
        forumStats.postCount = 0;
        forumStats.commentsCount = 0;
        forumStats.calculateAdvStatistics();

        //When
        double resultAvePostsForUser = forumStats.averagePostsForUser;
        double resultAveCommentsForUser = forumStats.averageCommentsForUser;
        double resultAveCommentsForPost = forumStats.averageCommentsForPost;
        //Then
        assertEquals(0, resultAvePostsForUser);
        assertEquals(0, resultAveCommentsForUser);
        assertEquals(NaN, resultAveCommentsForPost);

    }
    @Test
    void testCalculateAdvStatistics110() {
        //Given
        ForumStats forumStats = new ForumStats(statisticsMock);
        forumStats.userNames = generatorOfUsersList(100);
        forumStats.postCount = 1000;
        forumStats.commentsCount = 0;
        forumStats.calculateAdvStatistics();

        //When
        double resultAvePostsForUser = forumStats.averagePostsForUser;
        double resultAveCommentsForUser = forumStats.averageCommentsForUser;
        double resultAveCommentsForPost = forumStats.averageCommentsForPost;
        //Then
        assertEquals(10, resultAvePostsForUser);
        assertEquals(0, resultAveCommentsForUser);
        assertEquals(0, resultAveCommentsForPost);

    }




}

