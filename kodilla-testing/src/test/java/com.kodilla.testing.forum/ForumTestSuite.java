package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForumTestSuite {

    @Test
    void testCaseUsername() {
    //Given
    SimpleUser simpleUser = new SimpleUser("theForumUser");

    //When
    String result = simpleUser.getUsername();

    String expectedResult = "theForumUser";

    //Then
    Assertions.assertEquals(expectedResult, result);



    }
}
