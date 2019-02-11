package com.smelk;

import java.util.Scanner;

public class Multiplication {

    public static void multiplicateRomeNumbers(Scanner num) {

        System.out.print("Print first value: ");
        String firstSymbolValue = num.next();
        RomanToDecimal.romanToDecimal(firstSymbolValue);
        int firstValue = RomanToDecimal.decimal;
        RomanToDecimal.decimal = 0;

        System.out.print("Print second value: ");
        String secondSymbolValue = num.next();
        RomanToDecimal.romanToDecimal(secondSymbolValue);
        int secondValue = RomanToDecimal.decimal;

        int result = firstValue * secondValue;

        DecimalToRoman.decimalToRoman(result);

    }

    public static void multiplicateArabicNumbers(Scanner num) {

        System.out.print("Print first value: ");
        Integer firstSymbolValue = num.nextInt();
        int firstValue = firstSymbolValue;

        System.out.print("Print second value: ");
        Integer secondSymbolValue = num.nextInt();
        int secondValue = secondSymbolValue;

        int result = firstValue * secondValue;
        System.out.print("Result: " + result);
    }
}