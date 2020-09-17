package com.epam.university.java.core.task002;

public class Task002Impl implements Task002 {

    private static IllegalArgumentException mistake(String text) {
        return new IllegalArgumentException(text);
    }

    private static boolean checkString(String input) {
        return input == null;
    }

    private static boolean checkNumber(int input) {
        return input < 0;
    }

    @Override
    public boolean isEquals(String firstString, String secondString) {
        if (checkString(firstString) || (checkString(secondString))) {
            throw mistake("string not provided");
        }
        return firstString.equals(secondString);
    }

    @Override
    public String left(String sourceString, int number) {
        if (checkString(sourceString)) {
            throw mistake("string not provided");
        }
        if (checkNumber(number)) {
            throw mistake("number less then zero");
        }
        if (sourceString.length() < number) {
            number = sourceString.length();
        }

        return sourceString.substring(0, number);
    }

    @Override
    public String left(String sourceString, String separator) {
        if (checkString(sourceString)) {
            throw mistake("string not provided");
        }
        if (checkString(separator)) {
            throw mistake("string not provided");
        }
        return sourceString.substring(0, sourceString.indexOf(separator));
    }

    @Override
    public String right(String sourceString, int number) {
        if (checkString(sourceString)) {
            throw mistake("string not provided");
        }
        if (checkNumber(number)) {
            throw mistake("number less then zero");
        }
        if (sourceString.length() < number) {
            number = sourceString.length();
        }

        return sourceString.substring(sourceString.length() - number);
    }

    @Override
    public String right(String sourceString, String separator) {
        if (checkString(sourceString)) {
            throw mistake("string not provided");
        }
        if (checkString(separator)) {
            throw mistake("string not provided");
        }
        if (sourceString.length() < separator.length()) {
            throw mistake("string not provided");
        }
        return sourceString.substring(sourceString.indexOf(separator) + separator.length());
    }

    @Override
    public String[] split(String sourceString, String split) {
        if (checkString(sourceString)) {
            throw mistake("string not provided");
        }
        if (checkString(split)) {
            throw mistake("string not provided");
        }
        return sourceString.split(split);
    }

    @Override
    public String join(String[] sourceCollection, String glue) {
        StringBuilder glued = new StringBuilder();
        if (checkString(glue)) {
            throw mistake("string not provided");
        }
        if (sourceCollection == null) {
            throw mistake("string not provided");
        }

        if (sourceCollection.length == 0) {
            throw mistake("string not provided");
        }
        for (int i = 0; i < sourceCollection.length; i++) {
            if (checkString(sourceCollection[i])) {
                throw mistake("string not provided");
            }
            glued.append(sourceCollection[i]);
            if (i == sourceCollection.length - 1) {
                break;
            }
            glued.append(glue);
        }
        return glued.toString();
    }
}
