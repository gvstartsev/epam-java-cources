package com.epam.university.java.core.task003;

public class MappingOperationImpl implements MappingOperation{
    @Override
    public String map(String source) {
        StringBuilder temp = new StringBuilder();
        temp.append(source);
        temp = temp.reverse();
        return temp.toString();
    }
}
