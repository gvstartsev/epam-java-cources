package com.epam.university.java.core.task004;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task004Impl implements Task004 {
    private static boolean checkString(String input) {
        return input == null;
    }

    private static boolean checkStringArray(String[] array) {
        if (array == null) {
            return true;
        }
        for (String s : array) {
            if (checkString(s)) {
                return true;
            }
        }
        return false;
    }

    private static IllegalArgumentException mistake() {
        return new IllegalArgumentException("parameters not provided");
    }

    @Override
    public String[] intersection(String[] first, String[] second) {
        if (checkStringArray(first) || checkStringArray(second)) {
            throw mistake();
        }
        HashSet<String> set = new HashSet<>(Arrays.asList(first));
        set.retainAll(Arrays.asList(second));
        System.out.println(set);
        String[] intersection = {};
        intersection = set.toArray(intersection);
        return intersection;
    }

    @Override
    public String[] union(String[] first, String[] second) {
        if (checkStringArray(first) || checkStringArray(second)) {
            throw mistake();
            }
        Set<String> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(first));
        set.addAll(Arrays.asList(second));
        return set.toArray(new String[0]);
    }
}
