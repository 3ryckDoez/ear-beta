package com.tests.calculator1;

import java.util.Arrays;

public class Calculator1 {
    public static enum operators{
        suma,
        resta,
        mult,
        div
    };

    public double doOperation(double[] vals, operators op){
        double result = 0.0;
        switch(op){
            case suma:
                for(double r : vals) result += r;
                return result;
            case resta:
                result = 2*vals[0];
                for(double r : vals) result -= r;
                return result;
            case mult:
                result = 1.0;
                for(double r : vals) result *= r;
                return result;
            default:
                System.out.println("Operación no disponible.");
                break;
        }
        return result;
    }
}
