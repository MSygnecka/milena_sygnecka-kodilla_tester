package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("ordinary", 4.3, 3.1, true));
        stamps.add(new Stamp("priority", 3.8, 3.1, true));
        stamps.add(new Stamp("registered", 5.1, 4.2, true));
        stamps.add(new Stamp("foreign", 2.1, 5.4, true));
        stamps.add(new Stamp("priority", 3.8, 3.1, true));
        stamps.add(new Stamp("foreign", 2.1, 5.4, true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
