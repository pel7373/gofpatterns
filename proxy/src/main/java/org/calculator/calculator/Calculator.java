package org.calculator.calculator;

import org.calculator.config.Operation;

public interface Calculator <T extends Number> {
    T calculate(Operation operation, T... operands);
}
