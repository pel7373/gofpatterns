package org.gofpatterns.chainOfResponsibility.config;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Config {
    public final static Set<String> POLICE_ACCIDENT_SET = new HashSet<>(Arrays.asList(
            "Car accident", "Robbery", "Shooting", "Fire", "Fraud"));

    public final static Set<String> FIREFIGHTER_ACCIDENT_SET = new HashSet<>(Arrays.asList(
            "Fire", "Flood"));

    public final static Set<String> AMBULANCE_ACCIDENT_SET = new HashSet<>(Arrays.asList(
            "Car accident", "Shooting", "Fire"));
}
