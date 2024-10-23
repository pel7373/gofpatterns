package org.gofpatterns.visitor.pizza;

import org.gofpatterns.visitor.visitor.Visitor;

public class UkrainianPizza extends AbstractPizza {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
