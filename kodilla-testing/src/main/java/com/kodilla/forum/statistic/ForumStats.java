package com.kodilla.forum.statistic;

import com.kodilla.forum.ForumUser;
import com.kodilla.library.LibraryUser;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {
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

    public void showStatistics() {
        System.out.println("usersQuantity: " + userNames.size());
        System.out.println("postsQuantity: " + postCount);
        System.out.println("commentsQuantity: " + commentsCount);
        System.out.println("averagePostForUser: " + averagePostsForUser);
        System.out.println("averageCommentsForUser: " + averageCommentsForUser);
        System.out.println("averageCommentsForPost: " + averageCommentsForPost);
    }


}
