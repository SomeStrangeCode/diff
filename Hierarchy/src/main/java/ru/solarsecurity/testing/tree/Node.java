package ru.solarsecurity.testing.tree;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String id;
    private String parentId;
    private boolean alive;
    private List<Node> children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public List<Node> getChildren() {
        if (children == null)
            children = new ArrayList<Node>();
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }
}
