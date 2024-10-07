package org.calculator.config;

public enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
    SQRT;

    public boolean isCommutative() {
        switch (this) {
            case ADD:
            case MULTIPLY:
                return true;
            default: return false;
        }
    }
}
