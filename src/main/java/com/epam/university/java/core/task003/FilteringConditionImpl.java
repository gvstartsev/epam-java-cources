package com.epam.university.java.core.task003;

public class FilteringConditionImpl implements FilteringCondition {
    @Override
    public boolean isValid(String element) {
        return element.equals("Three") || element.equals("Four");
    }
}
