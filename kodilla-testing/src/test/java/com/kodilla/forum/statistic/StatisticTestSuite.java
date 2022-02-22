package com.kodilla.forum.statistic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class StatisticTestSuite {
    int noThis = 0;
    int number100 = 100;
    int number1000 = 1000;
    int numberTest = 0;


    @InjectMocks
    ForumStats forumStats;
    @Mock
    Statistics statisticsMock;

    @BeforeEach
    void nextTest() {
        System.out.println("Now is next test ");
    }
    @Test
    void testCalculateAdvStatistics111() {
        //Given
        //forumStats = new ForumStats(statisticsMock);
        forumStats.calculateAdvStatistics(statisticsMock);

        //When
        double resultAvePostsForUser = forumStats.averagePostsForUser;
        double resultAveCommentsForUser = forumStats.averageCommentsForUser;
        double resultAveCommentsForPost = forumStats.averageCommentsForPost;
        //Then
        assertEquals(0, resultAvePostsForUser);
        assertEquals(0, resultAveCommentsForUser);
        assertEquals(0, resultAveCommentsForPost);

    }
    @Test
    void testCalculateAdvStatistics132() {
        //Given
        forumStats = new ForumStats(statisticsMock);
        forumStats.calculateAdvStatistics(statisticsMock);

        //When
        double resultAvePostsForUser = forumStats.averagePostsForUser;
        double resultAveCommentsForUser = forumStats.averageCommentsForUser;
        double resultAveCommentsForPost = forumStats.averageCommentsForPost;
        //Then
        assertEquals(0, resultAvePostsForUser);
        assertEquals(0, resultAveCommentsForUser);
        assertEquals(0.1, resultAveCommentsForPost);

    }
    @Test
    void testCalculateAdvStatistics123() {
        //Given
        forumStats = new ForumStats(statisticsMock);
        forumStats.calculateAdvStatistics(statisticsMock);

        //When
        double resultAvePostsForUser = forumStats.averagePostsForUser;
        double resultAveCommentsForUser = forumStats.averageCommentsForUser;
        double resultAveCommentsForPost = forumStats.averageCommentsForPost;
        //Then
        assertEquals(0, resultAvePostsForUser);
        assertEquals(0, resultAveCommentsForUser);
        assertEquals(10, resultAveCommentsForPost);

    }
    @Test
    void testCalculateAdvStatistics211() {
        //Given
        forumStats = new ForumStats(statisticsMock);
        forumStats.calculateAdvStatistics(statisticsMock);

        //When
        double resultAvePostsForUser = forumStats.averagePostsForUser;
        double resultAveCommentsForUser = forumStats.averageCommentsForUser;
        double resultAveCommentsForPost = forumStats.averageCommentsForPost;
        //Then
        assertEquals(0, resultAvePostsForUser);
        assertEquals(0, resultAveCommentsForUser);
        assertEquals(0, resultAveCommentsForPost);

    }
    @Test
    void testCalculateAdvStatistics232() {
        //Given
        forumStats = new ForumStats(statisticsMock);
        forumStats.calculateAdvStatistics(statisticsMock);

        //When
        double resultAvePostsForUser = forumStats.averagePostsForUser;
        double resultAveCommentsForUser = forumStats.averageCommentsForUser;
        double resultAveCommentsForPost = forumStats.averageCommentsForPost;
        //Then
        assertEquals(10, resultAvePostsForUser);
        assertEquals(1, resultAveCommentsForUser);
        assertEquals(10, resultAveCommentsForPost);

    }
    @Test
    void testCalculateAdvStatistics223() {
        //Given
        forumStats = new ForumStats(statisticsMock);
        forumStats.calculateAdvStatistics(statisticsMock);

        //When
        double resultAvePostsForUser = forumStats.averagePostsForUser;
        double resultAveCommentsForUser = forumStats.averageCommentsForUser;
        double resultAveCommentsForPost = forumStats.averageCommentsForPost;
        //Then
        assertEquals(1, resultAvePostsForUser);
        assertEquals(10, resultAveCommentsForUser);
        assertEquals(0.1, resultAveCommentsForPost);

    }

}
