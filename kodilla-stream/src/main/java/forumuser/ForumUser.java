package forumuser;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class ForumUser {
    int userID;
    String userName;
    char sex;
    Date birthDate;
    int postsSharedCounter;
    static int userCounter = 0;

    public ForumUser(String userName, char sex, Date birthDate, int postsSharedCounter) {
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsSharedCounter = postsSharedCounter;
        userCounter++;
        userID = hashCode();
    }


    @Override
    public int hashCode() {
        return Objects.hash(2077 + (1000 + userCounter));
    }

    @Override
    public String toString() {
        return userName + " have ID: " + userID;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public int getPostsSharedCounter() {
        return postsSharedCounter;
    }
}
