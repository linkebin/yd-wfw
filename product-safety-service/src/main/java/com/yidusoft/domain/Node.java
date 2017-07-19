package com.yidusoft.domain;

import java.util.List;

/**
 * Created by Administrator on 2017/7/8.
 */
public class Node {

    private Long id;
    private String text;
    private String title;
    private List<Tree> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tree> getChildren(){ return children; }

    public void setChildren(List<Tree> children){ this.children=children; }
}
