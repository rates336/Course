package com.kodilla.forum.statistic;

import com.kodilla.forum.ForumUser;
import com.kodilla.library.LibraryUser;

import java.util.ArrayList;
import java.util.List;

public class ForumStats {
<<<<<<< HEAD
=======
    int usersQuantity;
    int postsQuantity;
    int commentsQuantity;
>>>>>>> a855bd3207a025fa9c51b0792f51fb44e64e40ed
    double averagePostsForUser;
    double averageCommentsForUser;
    double averageCommentsForPost;

    public ForumStats(Statistics statistics) {
<<<<<<< HEAD
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
=======
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

    public void calculateAdvStatistics() {
        averagePostsForUser =(double) postsQuantity / usersQuantity;
        averageCommentsForUser =(double) commentsQuantity / usersQuantity;
        averageCommentsForPost = (double) commentsQuantity / postsQuantity;
    }

    public void showStatistics() {
        System.out.println("usersQuantity: " + usersQuantity);
        System.out.println("postsQuantity: " + postsQuantity);
        System.out.println("commentsQuantity: " + commentsQuantity);
>>>>>>> a855bd3207a025fa9c51b0792f51fb44e64e40ed
        System.out.println("averagePostForUser: " + averagePostsForUser);
        System.out.println("averageCommentsForUser: " + averageCommentsForUser);
        System.out.println("averageCommentsForPost: " + averageCommentsForPost);
    }


}
