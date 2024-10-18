package org.gofpatterns.observer.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Level {
    LOW (0),
    MEDIUM (10),
    HIGH (20);

    @Getter
    private final int value;
}
