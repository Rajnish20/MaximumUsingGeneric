package com.magic.generic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Maximum<E extends Comparable<E>> {

    E x;
    E y;
    E z;

    public Maximum(E x, E y, E z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public E testMaximum() {
        return maximum(x, y, z);
    }


    public static <E extends Comparable<E>> E maximum(E x, E y, E z) {
        E max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        printMax(x, y, z, max);
        return max;
    }

    @SafeVarargs
    public static <E extends Comparable<E>> E maximumValue(E... values) {
        List<E> sortedValues = Arrays.stream(values).sorted().collect(Collectors.toList());
        return sortedValues.get(sortedValues.size() - 1);
    }

    public static <E> void printMax(E x, E y, E z, E max) {
        System.out.println("Maximum in given values " + x + " " + y + " " + z + " is " + max);
    }

    public static void main(String[] args) {
        Integer xInt = 8, yInt = 10, zInt = 5;
        Float xFlt = 1.1f, yFlt = 3.4f, zFlt = 9.0f;
        String xStr = "Apple", yStr = "Banana", zStr = "Peach";
        Maximum.maximum(xInt, yInt, zInt);
        new Maximum(xInt, yInt, zInt).testMaximum();
        new Maximum(xFlt, yFlt, zFlt).testMaximum();
        new Maximum(xStr, yStr, zStr).testMaximum();
    }
}
