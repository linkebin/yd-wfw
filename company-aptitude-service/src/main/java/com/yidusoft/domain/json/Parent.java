package com.yidusoft.domain.json;

import java.util.List;

/**
 * Created by Administrator on 2017/7/8.
 */
public class Parent {

    private Long id;
    private String text;
    private List<Node> children;

    public Parent(Long id,String text){
        this.id=id;
        this.text=text;
    }

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

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }
}
