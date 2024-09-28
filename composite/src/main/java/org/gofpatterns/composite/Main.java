package org.gofpatterns.composite;

import org.gofpatterns.composite.tree.Component;
import org.gofpatterns.composite.tree.Leaf;
import org.gofpatterns.composite.tree.Node;

public class Main {
    public static void main(String[] args) {
        Component leaf1 = new Leaf(1);
        Component node1 = new Node(leaf1);
        Component leaf2 = new Leaf(10);
        Component leaf3 = new Leaf(20);
        Component node2 = new Node(node1, leaf2, leaf3);

        node2.outputInfo();

        System.out.println();
        node2.incrementValue();
        node2.outputInfo();

        System.out.println();
        node2.decrementValue();
        node2.decrementValue();
        node2.outputInfo();
    }
}