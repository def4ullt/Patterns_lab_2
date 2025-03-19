package StructuralPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Integer, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(int intrinsicState, String type) {
        if (!flyweights.containsKey(intrinsicState)) {
            if (type.equals("A")) {
                flyweights.put(intrinsicState, new ConcreteFlyweightA(intrinsicState));
            } else if (type.equals("B")) {
                flyweights.put(intrinsicState, new ConcreteFlyweightB(intrinsicState));
            }
        }
        return flyweights.get(intrinsicState);
    }
}
