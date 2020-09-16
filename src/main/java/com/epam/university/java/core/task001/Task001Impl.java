package com.epam.university.java.core.task001;

public class Task001Impl implements Task001 {

    @Override
    public double addition(String firstNumber, String secondNumber) {
        if (firstNumber == null || firstNumber.isEmpty() || secondNumber == null || secondNumber.isEmpty())
            throw new IllegalArgumentException("input parameters are not set");

        try {
            Double.parseDouble(firstNumber);
            Double.parseDouble(secondNumber);
        } catch (NumberFormatException e) {
            System.out.println("can't convert input values to numbers");
        }
        return Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
    }

    @Override
    public double subtraction(String firstNumber, String secondNumber) {
        if (firstNumber == null || firstNumber.isEmpty() || secondNumber == null || secondNumber.isEmpty())
            throw new IllegalArgumentException("input parameters are not set");

        try {
            Double.parseDouble(firstNumber);
            Double.parseDouble(secondNumber);
        } catch (NumberFormatException e) {
            System.out.println("can't convert input values to numbers");
        }
        return Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
    }

    @Override
    public double multiplication(String firstNumber, String secondNumber) {
        if (firstNumber == null || firstNumber.isEmpty() || secondNumber == null || secondNumber.isEmpty())
            throw new IllegalArgumentException("input parameters are not set");

        try {
            Double.parseDouble(firstNumber);
            Double.parseDouble(secondNumber);
        } catch (NumberFormatException e) {
            System.out.println("can't convert input values to numbers");
        }
        return Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
    }

    @Override
    public double division(String firstNumber, String secondNumber) throws IllegalArgumentException {
        if (firstNumber == null || firstNumber.isEmpty() || secondNumber == null || secondNumber.isEmpty())
            throw new IllegalArgumentException("input parameters are not set");

        try {
            Double.parseDouble(firstNumber);
            Double.parseDouble(secondNumber);
        } catch (NumberFormatException e) {
            System.out.println("can't convert input values to numbers");
        }
        if (Double.parseDouble(firstNumber) == 0 && Double.parseDouble(secondNumber) == 0) return Double.NaN;
        else if (Double.parseDouble(firstNumber) < 0 && Double.parseDouble(secondNumber) == 0)
            return Double.NEGATIVE_INFINITY;
        else if (Double.parseDouble(firstNumber) > 0 && Double.parseDouble(secondNumber) == 0)
            return Double.POSITIVE_INFINITY;

        else return Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
    }
}