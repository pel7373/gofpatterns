package org.gofpatterns.composite.tree;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class Node implements Component {
    private final List<Component> componentList;

    public Node() {
        componentList = new ArrayList<>();
    }

    public Node(List<Component> componentList) {
        this.componentList = componentList;
    }

    public Node(Component... components) {
        componentList = new ArrayList<>(List.of(components));
    }

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        if(componentList != null && componentList.contains(component)) {
            componentList.remove(component);
        }
    }

    @Override
    public void incrementValue() {
        componentList.stream().forEach(Component::incrementValue);
    }

    @Override
    public void decrementValue() {
        componentList.stream().forEach(Component::decrementValue);
    }

    @Override
    public void outputInfo() {
        componentList.stream().forEach(Component::outputInfo);
    }
}
