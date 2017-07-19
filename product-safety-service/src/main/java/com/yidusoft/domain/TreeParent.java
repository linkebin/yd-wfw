package com.yidusoft.domain;

import java.util.List;

/**
 * Created by L on 2017/7/12.
 */
public class TreeParent {

        private String id;
        private String text;
        private List<Tree> children;

        public TreeParent(String id,String text){
            this.id=id;
            this.text=text;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public List<Tree> getChildren() {
            return children;
        }

        public void setChildren(List<Tree> children) {
            this.children = children;
        }
    }

