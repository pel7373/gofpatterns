package org.gofpatterns.visitor.pizza;

import org.gofpatterns.visitor.visitor.Visitor;

public interface Pizza extends Cloneable {
    void accept(Visitor visitor);
}
