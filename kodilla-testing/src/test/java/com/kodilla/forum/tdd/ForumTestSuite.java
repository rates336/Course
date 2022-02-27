package com.kodilla.forum.tdd;

import com.kodilla.forum.ForumComment;
import com.kodilla.forum.ForumPost;
import com.kodilla.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite")
public class ForumTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testAddPost() {
        ForumUser fu = new ForumUser("mrSmith", "John Smith");

        fu.addPost("mrSmith", "Hello everyone, This is my first post on the forum :)");

        Assertions.assertEquals(1, fu.getPostsQuantity());
    }

    @Test
    void testAddComment() {
        ForumUser fu = new ForumUser("mrSmith", "John Smith");
        ForumPost fp = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrSmith");

        fu.addComment(fp, "mrSmith", "Thank you for all good words!");

        Assertions.assertEquals(1, fu.getCommentsQuantity());
    }

    @Test
    void testGetPost() {

        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrSmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        ForumPost retrievedPost;
        retrievedPost = forumUser.getPost(0);

        Assertions.assertEquals(thePost, retrievedPost);
    }

    @Test
    void testGetComment() {
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrSmith");
        ForumComment theComment = new ForumComment(thePost, "mrSmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());

        ForumComment retrievedComment = forumUser.getComment(0);

        Assertions.assertEquals(theComment, retrievedComment);
    }

    @Test
    void testRemovePostNotExisting() {
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrSmith");

        boolean result = forumUser.removePost(thePost);

        Assertions.assertFalse(result);
    }

    @Test
    void testRemoveCommentNotExisting() {
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrSmith");
        ForumComment theComment = new ForumComment(thePost, "mrSmith",
                "Thank you for all good words!");

        boolean result = forumUser.removeComment(theComment);

        Assertions.assertFalse(result);
    }

    @Test
    void testRemovePost() {
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrSmith");
        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

        boolean result = forumUser.removePost(thePost);

        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test
    void testRemoveComment() {
        ForumUser forumUser = new ForumUser("mrSmith", "John Smith");
        ForumPost thePost = new ForumPost("Hello everyone, " +
                "this is my first contribution here!", "mrSmith");
        ForumComment theComment = new ForumComment(thePost, "mrSmith",
                "Thank you for all good words!");
        forumUser.addComment(thePost, theComment.getAuthor(),
                theComment.getCommentBody());

        boolean result = forumUser.removeComment(theComment);

        Assertions.assertTrue(result);
        Assertions.assertEquals(0, forumUser.getCommentsQuantity());
    }

}


