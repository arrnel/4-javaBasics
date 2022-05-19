package com.arrnel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimitiveTests {

    @Test
    void testOverheadMin() {
        int value = Integer.MAX_VALUE * 2;
        Assertions.assertNotEquals((long) Integer.MAX_VALUE * 2, value);
    }

    @Test
    void testOverheadMax() {
        short value = Short.MAX_VALUE;
        Assertions.assertEquals(Long.valueOf(Short.MAX_VALUE + 1), value + 1);
    }

    @Test
    void mathOperations(){

        char sim = 'S';
        boolean boolFlag = true;
        byte sByte = 111;
        short sShort = 250;
        int sInt = 1000;
        long sLong = 500505;
        float sFloat = 13.215f;
        double sDouble = 7.3566557;
        String sText = "Click. Clack. Boom!!!";

        System.out.println("Сложение " + sByte + " и " + sInt + " = " + sum(sByte, sInt));
        System.out.println("Умножение " + sShort + " на " + sByte + " = " +  multiplication(sShort, sByte));
        System.out.println("Деление " + sLong + " на " + sByte + " = " + divide((int) sLong, sByte));
        System.out.println("Остаток " + sInt + " на " + 20 + " = " + ost(sInt, 20));
        System.out.println("Результат сложения " + sFloat + " и " + sDouble + " = " + sum(sFloat, sDouble));
        System.out.println(sText);

        System.out.println((++sByte) + 20);
        System.out.println((--sByte) + 20);
        System.out.println(sByte++);
        System.out.println(sByte);

    }

    int sum(int a, int b) {
        return a + b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    int ost(int a, int b) {
        return a % b;
    }

    double sum(double a, double b) {
        return a + b;
    }

}
