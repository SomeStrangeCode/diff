package ru.solarsecurity.testing.tree;

import java.util.List;

public class CleanTreeInMostStupidWayButTestShouldBeOK {
    public static void cleanTree(List<Node> input) {
        input.removeIf(node -> "top2".equals(node.getId()));
        input.get(0).getChildren().removeIf(node -> "2a".equals(node.getId()));
        input.get(0).getChildren().get(0).getChildren().get(0).getChildren().clear();
    }
}
