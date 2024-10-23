package org.gofpatterns.visitor.visitor;

import org.gofpatterns.visitor.pizza.AmericanPizza;
import org.gofpatterns.visitor.pizza.JapanesePizza;
import org.gofpatterns.visitor.pizza.UkrainianPizza;

public interface Visitor {
    void visit(AmericanPizza pizza);
    void visit(JapanesePizza pizza);
    void visit(UkrainianPizza pizza);
}
