package com.epam.university.java.core.task003;

import java.util.*;

public class Task003Impl implements Task003 {

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

    private static IllegalArgumentException mistake(String text) {
        return new IllegalArgumentException(text);
    }

    @Override
    public String[] invert(String[] source) {
        if (checkStringArray(source)) {
            throw mistake("array not provided");
        }
        for (int i = 0; i < source.length / 2; i++) {
            String temp = source[i];
            source[i] = source[source.length - 1 - i];
            source[source.length - 1 - i] = temp;
        }
        return source;
    }

    @Override
    public String[] join(String[] first, String[] second) {
        if (checkStringArray(first) || checkStringArray(second)) {
            throw mistake("array not provided");
        }
        String[] joined = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, joined, first.length, second.length);
        return joined;
    }

    @Override
    public int findMax(int[] source) {
        if (source == null || source.length == 0) {
            throw mistake("array not provided");
        }
        int maxValue = source[0];
        for(int i=1;i < source.length;i++){
            if(source[i] > maxValue){
                maxValue = source[i];
            }
        }
        return maxValue;
    }

    @Override
    public String[] filter(String[] source, FilteringCondition condition) {
        if (checkStringArray(source)) {
            throw mistake("array not provided");
        }
        if (condition == null) {
            throw mistake("condition not provided");
        }
        ArrayList<String> target = new ArrayList<>();
        for (String s: source) {
            if (condition.isValid(s)) {
                target.add(s);
            }
        }

        return target.toArray(new String[0]);
    }

    @Override
    public String[] removeElements(String[] source, String[] toRemove) {
        if (checkStringArray(source) || checkStringArray(toRemove)) {
            throw mistake("parameters not provided");
        }
        List<String> list = new ArrayList<>(Arrays.asList(source));
        for (String s:toRemove) {
            list.removeIf(s::equals);
        }
        return list.toArray(new String[0]);
    }

    @Override
    public String[] map(String[] source, MappingOperation operation) {
        if (checkStringArray(source)) {
            throw mistake("parameters not provided");
        }
        if (operation == null) {
            throw mistake("parameters not provided");
        }
        ArrayList <String> target = new ArrayList<>();
        for (String s: source) {
            target.add(operation.map(s));
        }
        return target.toArray(new String[0]);
    }

    @Override
    public String[] flatMap(String[] source, FlatMappingOperation operation) {
        if (checkStringArray(source)) {
            throw mistake("parameters not provided");
        }
        if (operation == null) {
            throw mistake("parameters not provided");
        }
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        for (String s : source) {
            for (String s1 : operation.flatMap(s)) {
                Collections.addAll(integerTreeSet, Integer.parseInt(s1));
            }
        }
            List<String> strings = new LinkedList<>();
            for (Integer integer : integerTreeSet) {
                strings.add(integer.toString());
            }
            Collections.reverse(strings);
            return strings.toArray(new String[0]);
        }
    }