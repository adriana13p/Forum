package org.fasttrackit.forum.domain;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private String name;
    private List<Post> posts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        if (posts == null) {
            throw new IllegalArgumentException("You are not allowed to set the list to null1");
        }
        this.posts = posts;
    }
}
