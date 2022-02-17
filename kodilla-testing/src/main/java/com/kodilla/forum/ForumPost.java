package com.kodilla.forum;

import java.util.Objects;

public class ForumPost {
    private String postBody;
    private String author;

    @Override
    public String toString() {
        return "ForumPost{" +
                "postBody='" + postBody + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public ForumPost(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumPost)) return false;
        ForumPost forumPost = (ForumPost) o;
        return postBody.equals(forumPost.postBody) && author.equals(forumPost.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postBody, author);
    }
}
