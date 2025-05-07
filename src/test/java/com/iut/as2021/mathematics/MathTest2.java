package com.iut.as2021.mathematics;

import com.iut.as2021.exceptions.MathsExceptions;
import com.iut.as2021.interfaces.IMaths;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest2 {

    private IMaths iMaths;
    @Before
    public void setUp() {
       iMaths = new Maths();
    }

    @Test
    public void testDivision() throws MathsExceptions {
        //Given
        final int a = 20;
        final int b = 10;
        //When
        double result = iMaths.division(a, b);
        //The
        Assert.assertEquals(2.0, result);
    }

    @Test
    public void testShouldThrowDivisionParZeroImpossible() {
        final String message = "Division par zero impossible";
        MathsExceptions exception = org.junit.Assert.assertThrows(MathsExceptions.class, () -> {
            //Given
            final int a = 20;
            final int b = 0;
            //When
            double result2 = iMaths.division(a, b);
            Assert.assertEquals(2.0, result2);
        });
        //Then
        org.junit.Assert.assertNotNull(exception);
        org.junit.Assert.assertEquals(message, exception.getMessage());
    }

    @Test
    public void testMultiplication_a_et_b_positifs() {
        //Given
        int a = 20;
        int b = 10;
        //When
        double result = iMaths.multiplication2(a, b);
        //Then
        Assert.assertEquals(200.0, result);
    }
    @Test
    public void testMultiplication_a_positif_et_b_negatif() {
        //Given
        int a = 20;
        int b = -10;
        //When
        double result = iMaths.multiplication2(a, b);
        //Then
        Assert.assertEquals(-200.0, result);
    }

    @Test
    public void testMultiplication_a_et_b_zero() {
        //Given
        int a = 20;
        int b = 0;
        //When
        double result = iMaths.multiplication2(a, b);
        //Then
        Assert.assertEquals(0.0, result);
    }

    @Test
    public void testMultiplication_a_negatif_et_b_positifs() {
        //Given
        int a = -20;
        int b = 10;
        //When
        double result = iMaths.multiplication2(a, b);
        //Then
        Assert.assertEquals(-200.0, result);
    }

    @Test
    public void testMultiplication_a_et_b_negatifs() {
        //Given
        int a = -20;
        int b = -10;
        //When
        double result = iMaths.multiplication2(a, b);
        //Then
        Assert.assertEquals(200.0, result);
    }


}
