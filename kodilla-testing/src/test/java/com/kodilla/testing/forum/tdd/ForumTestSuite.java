package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite \uD83D\uDE31")
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

        Assertions.assertEquals(1, fu.getPostQuantity());
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

}


