/*

package com.kodilla.forum.statistic;

import com.kodilla.forum.ForumUser;
import com.kodilla.library.LibraryUser;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {

    double averagePostsForUser;
    double averageCommentsForUser;
    double averageCommentsForPost;

    public double getAveragePostsForUser() {
        return averagePostsForUser;
    }

    public double getAverageCommentsForUser() {
        return averageCommentsForUser;
    }

    public double getAverageCommentsForPost() {
        return averageCommentsForPost;
    }

    public ForumStats(Statistics statistics) {
        this.userNames(statistics);
        this.postCount(statistics);
        this.commentsCount(statistics);
    }

    public List<String> userNames(Statistics statistics) {
        return statistics.userNames();
    }
    public int postCount(Statistics statistics) {
        return statistics.postCount();
    }
    public int commentsCount(Statistics statistics) {
        return statistics.commentsCount();
    }

    public void calculateAdvStatistics(Statistics statistics) {
        averagePostsForUser =(double) postCount(statistics) / userNames(statistics).size();
        averageCommentsForUser =(double) commentsCount(statistics) / userNames(statistics).size();
        averageCommentsForPost = (double) commentsCount(statistics) / postCount(statistics);
    }

    public void showStatistics(Statistics statistics) {
        System.out.println("usersQuantity: " + userNames(statistics).size());
        System.out.println("postsQuantity: " + postCount(statistics));
        System.out.println("commentsQuantity: " + commentsCount(statistics));
    }




}
*/
