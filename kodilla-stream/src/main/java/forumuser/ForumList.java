package forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ForumList {
    List<ForumUser> userList;
    public void usersGenerator(int count) {
        Random r = new Random();
        for (int i = 0; i < count; i++) {
            int ran = r.nextInt(1);
            int ran2 = r.nextInt(50);
            int ran3 = r.nextInt(10);
            char whatIsSex;
            if(ran == 1)
                whatIsSex = 'm';
            else
                whatIsSex = 'f';
            ForumUser newUser = new ForumUser(
                "username" + count, whatIsSex, new Date(1970 + ran2, 01, 01),
                    ran3);
            userList.add(newUser);
        }
    }

    public List<ForumUser> getUserList() {
        List<ForumUser> theList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ForumUser newUser = new ForumUser("Poland", 'm',
                new Date(2000, 3, 1), 10);
            theList.add(newUser);

        }
        {
            ForumUser user1 = new ForumUser("Germany", 'f',
                    new Date(2000, 3, 1), 10);
            theList.add(user1);
            ForumUser user2 = new ForumUser("France", 'f',
                    new Date(2008, 3, 1), 10);
            theList.add(user1);
            ForumUser user3 = new ForumUser("Russia", 'f',
                    new Date(2000, 3, 1), 0);
            theList.add(user1);
        }

        return theList;
    }
}
