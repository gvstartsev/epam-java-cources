package com.epam.university.java.core.task003;

public class FlatMappingOperationImpl implements FlatMappingOperation {
    @Override
    public String[] flatMap(String source) {
        String withoutSpaces = source.replaceAll(" ", "").trim();
        return withoutSpaces.split(",");
    }
}
