
package com.kodilla.forum.statistic;

import com.kodilla.forum.ForumUser;
import com.kodilla.library.LibraryUser;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {

    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;

    double averagePostsForUser;
    double averageCommentsForUser;
    double averageCommentsForPost;

    public ForumStats(Statistics statistics) {
        this.userNames = statistics.userNames();
        this.postCount = statistics.postCount();
        this.commentsCount = statistics.commentsCount();
    }

    public List<String> userNames;
    public int postCount;
    public int commentsCount;

    public void calculateAdvStatistics() {
        averagePostsForUser =(double) postCount / userNames.size();
        averageCommentsForUser =(double) commentsCount / userNames.size();
        averageCommentsForPost = (double) commentsCount / postCount;
    }

    public void showStatistics(Statistics statistics) {
        System.out.println("usersQuantity: " + userNames.size());
        System.out.println("postsQuantity: " + postCount);
        System.out.println("commentsQuantity: " + commentsCount);
        this.usersQuantity = statistics.userNames().size();
        this.postsQuantity = statistics.postCount();
        this.commentsQuantity = statistics.commentsCount();
    }

    public List<String> userNames() {
        return null;
    }

    public int postCount() {
        return 0;
    }

    public int commentsCount() {
        return 0;
    }




}
