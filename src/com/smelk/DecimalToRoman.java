package com.smelk;

public class DecimalToRoman {

    static void decimalToRoman(int result) {
        String resultInRoman = "";

        if (result == 0){
            resultInRoman = resultInRoman + "Zero";
        }

        if (result >= 1000) {
            do {
                resultInRoman = resultInRoman + "M";
                result = result - 1000;
            } while (result >= 1000);
        }

        if (result >= 500) {
            do {
                resultInRoman = resultInRoman + "D";
                result = result - 500;
            } while (result >= 500);
        }

        if (result >= 100) {
            do {
                resultInRoman = resultInRoman + "C";
                result = result - 100;
            } while (result >= 100);
        }

        if (result >= 50) {
            do {
                resultInRoman = resultInRoman + "L";
                result = result - 50;
            } while (result >= 50);
        }

        if (result >= 10) {
            do {
                resultInRoman = resultInRoman + "X";
                result = result - 10;
            } while (result >= 10);
        }

        if (result >= 5) {
            do {
                resultInRoman = resultInRoman + "V";
                result = result - 5;
            } while (result >= 5);
        }

        if (result >= 1) {
            do {
                resultInRoman = resultInRoman + "I";
                result = result - 1;
            } while (result >= 1);
        }
        System.out.println("Result: " + resultInRoman);
    }
}
