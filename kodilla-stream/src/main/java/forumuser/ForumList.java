package forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class ForumList {
    public List<ForumUser> userList;
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
        return userList;
    }
}
