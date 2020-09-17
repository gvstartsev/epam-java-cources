package com.epam.university.java.core.task001;

public class Task001Impl implements Task001 {

    private static boolean checkInput (String firstNumber, String secondNumber) {
        return firstNumber == null || firstNumber.isEmpty() || secondNumber == null || secondNumber.isEmpty();
    }

    private static boolean checkConvert (String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public double addition(String firstNumber, String secondNumber) {
        if (checkInput(firstNumber, secondNumber)) {
            throw new IllegalArgumentException("input parameters are not set");
        }
        if (!checkConvert(firstNumber) || !checkConvert(secondNumber)) {
            throw new NumberFormatException("can't convert input values to numbers");
        }
        else {
            return Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
        }
    }

    @Override
    public double subtraction(String firstNumber, String secondNumber) {
        if (checkInput(firstNumber, secondNumber)) {
            throw new IllegalArgumentException("input parameters are not set");
        }
        if (!checkConvert(firstNumber) || !checkConvert(secondNumber)) {
            throw new NumberFormatException("can't convert input values to numbers");
        }
        else {
            return Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
        }
    }

    @Override
    public double multiplication(String firstNumber, String secondNumber) {
        if (checkInput(firstNumber, secondNumber)) {
            throw new IllegalArgumentException("input parameters are not set");
        }
        if (!checkConvert(firstNumber) || !checkConvert(secondNumber)) {
            throw new NumberFormatException("can't convert input values to numbers");
        }
        else {
            return Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
        }
    }

    @Override
    public double division(String firstNumber, String secondNumber) {
        if (checkInput(firstNumber, secondNumber)) {
            throw new IllegalArgumentException("input parameters are not set");
        }
        else if (!checkConvert(firstNumber) || !checkConvert(secondNumber)) {
            throw new NumberFormatException("can't convert input values to numbers");
        }
        if (Double.parseDouble(firstNumber) == 0 && Double.parseDouble(secondNumber) == 0) {
            return Double.NaN;
        }
        else if (Double.parseDouble(firstNumber) < 0 && Double.parseDouble(secondNumber) == 0) {
            return Double.NEGATIVE_INFINITY;
        }
        else if (Double.parseDouble(firstNumber) > 0 && Double.parseDouble(secondNumber) == 0) {
            return Double.POSITIVE_INFINITY;
        }
        else {
            return Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
        }
    }
}