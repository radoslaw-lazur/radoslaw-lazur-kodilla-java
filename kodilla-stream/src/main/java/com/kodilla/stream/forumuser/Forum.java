package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum(){
        theForumUserList.add(new ForumUser(1, "user1", 'M',
                100, 1990, 2, 18));
        theForumUserList.add(new ForumUser(2, "user2", 'F',
                1406, 1988, 4, 8));
        theForumUserList.add(new ForumUser(3, "user3", 'M',
                110, 1990, 12, 18));
        theForumUserList.add(new ForumUser(4, "user4", 'F',
                2, 1978, 8, 22));
        theForumUserList.add(new ForumUser(5, "user5", 'M',
                10, 2011, 2, 18));
        theForumUserList.add(new ForumUser(6, "user6", 'F',
                146, 2009, 4, 8));
        theForumUserList.add(new ForumUser(7, "user7", 'M',
                0, 1982, 2, 18));
        theForumUserList.add(new ForumUser(8, "user8", 'F',
                60, 1977, 8, 22));
        theForumUserList.add(new ForumUser(9, "user9", 'M',
                100, 1990, 10, 18));
        theForumUserList.add(new ForumUser(10, "user10", 'F',
                1406, 1988, 4, 8));
        theForumUserList.add(new ForumUser(11, "user11", 'M',
                110, 1990, 2, 18));
        theForumUserList.add(new ForumUser(12, "user12", 'M',
                2, 1978, 8, 22));
        theForumUserList.add(new ForumUser(13, "user13", 'M',
                0, 2011, 2, 18));
        theForumUserList.add(new ForumUser(14, "user14", 'F',
                16, 2009, 4, 8));
        theForumUserList.add(new ForumUser(15, "user15", 'M',
                0, 1982, 2, 18));
        theForumUserList.add(new ForumUser(16, "user16", 'M',
                60, 1977, 8, 22));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theForumUserList);
    }
}
