package com.core.newfeatures.java8.functionalprogramming;

public class CalculatorImpl {
    /**
     * Calculator is a function and the function script is being returned here.
     * Calculator.operation() method is being overridden
     */
    public Calculator getCalculator(){
        Calculator calculator = (operation, i, j) -> {
            if (operation.equals("add")) {
                return i + j;
            } else if (operation.equals("substract")) {
                return i - j;
            } else if (operation.equals("multiply")) {
                return i * j;
            }
            return i + j;
        };
        return calculator;
    }

    /**
     * Here 'calculator' function is being passed as a simple parameter to a different method along with other simple primitive variables.
     * This is functional programming
     */
    public int add(Calculator calculator, int i, int j) {
        return calculator.operation("add", i, j);
    }

    /**
     * Here 'calculator' function is being passed as a simple parameter to a different method along with other simple primitive variables.
     * This is functional programming
     */
    public int substract(Calculator calculator,int i, int j){
        return calculator.operation("substract",i,j);
    }

    /**
     * Here 'calculator' function is being passed as a simple parameter to a different method along with other simple primitive variables.
     * This is functional programming
     */
    public int multiply(Calculator calculator, int i, int j){
        return calculator.operation("multiply",i,j);
    }


}
