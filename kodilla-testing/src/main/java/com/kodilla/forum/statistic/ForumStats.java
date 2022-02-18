package com.kodilla.forum.statistic;

import com.kodilla.forum.ForumUser;
import com.kodilla.library.LibraryUser;

import java.util.ArrayList;
import java.util.List;

public class ForumStats implements Statistics {
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
    double averagePostsForUser;
    double averageCommentsForUser;
    double averageCommentsForPost;

    public ForumStats(int usersQuantity, int postsQuantity, int commentsQuantity) {
        this.usersQuantity = usersQuantity;
        this.postsQuantity = postsQuantity;
        this.commentsQuantity = commentsQuantity;
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

    public void calculateAdvStatistics(Statistics statistics) {
        averagePostsForUser =(double) postsQuantity / usersQuantity;
        averageCommentsForUser =(double) commentsQuantity / usersQuantity;
        averageCommentsForPost = (double) commentsQuantity / postsQuantity;
    }

    public void showStatistics() {
        System.out.println("usersQuantity: " + usersQuantity);
        System.out.println("postsQuantity: " + postsQuantity);
        System.out.println("commentsQuantity: " + commentsQuantity);
        System.out.println("averagePostForUser: " + averagePostsForUser);
        System.out.println("averageCommentsForUser: " + averageCommentsForUser);
        System.out.println("averageCommentsForPost: " + averageCommentsForPost);
    }


}
