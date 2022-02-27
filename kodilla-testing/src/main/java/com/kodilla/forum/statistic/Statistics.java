package com.kodilla.forum.statistic;

import com.kodilla.library.LibraryUser;

import java.util.ArrayList;
import java.util.List;

public interface Statistics {
    List<String> userNames();
    int postCount();
    int commentsCount();
}
