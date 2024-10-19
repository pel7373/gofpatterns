package org.gofpatterns.visitor.pizza;

import org.gofpatterns.visitor.visitor.Visitor;

public class AmericanPizza extends AbstractPizza {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
