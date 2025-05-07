package com.iut.as2021.mathematics;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.interfaces.IMaths;

public class Maths implements IMaths {

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int soustraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int multiplication2(int a, int b) {
        int product = 0;
        if(b==0){
            return 0;
        }
        for (int i = 1; i <= Math.abs(b); i++) {
            product += a;
        }
        return b<0 ? -product : product;
    }

    @Override
    public double division(int a, int b) throws MathsExceptions {
        if (b == 0) {
            throw new MathsExceptions("Division par zero impossible");
        }
        try {
            return (double)a / b;
        } catch (Exception e) {
            throw new MathsExceptions(e.getMessage());
        }
    }
}
