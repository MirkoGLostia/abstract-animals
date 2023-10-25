package org.lessons.java.farm.methods;

import org.lessons.java.farm.animals.charateristics.CanFly;
import org.lessons.java.farm.animals.charateristics.CanSwim;

public class UsefulMethods {
    public static void makeItFly(CanFly arg) {
        arg.fly();
    }

    public static void makeItSwim(CanSwim arg) {
        arg.swim();
    }
}
