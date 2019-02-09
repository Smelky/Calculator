package com.smelk;

public class RomanToDecimal {

    static int decimal = 0;

    public static void romanToDecimal(java.lang.String romanNumber) {
        String romanNumeral = romanNumber.toUpperCase();
        for (int x = romanNumeral.length() - 1; x >= 0; x--) {
            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {
                case 'M':
                    decimal = decimal + 1000;
                    break;

                case 'D':
                    decimal = decimal + 500;
                    break;

                case 'C':
                    decimal = decimal + 100;
                    break;

                case 'L':
                    decimal = decimal + 50;
                    break;

                case 'X':
                    decimal = decimal + 10;
                    break;

                case 'V':
                    decimal = decimal + 5;
                    break;

                case 'I':
                    decimal = decimal + 1;
                    break;
            }
        }
    }
}

