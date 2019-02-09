package com.smelk;

import java.util.Scanner;

class ChooseOperation {

    static void chooseOperation(Scanner num, int RomeOrArabic) {

        System.out.println("Choose operation: + - * /");
        String chooseOperation = num.next();

        if (chooseOperation.equals("+") & RomeOrArabic == 1) {
            Addition.additionRomeNumbers(num);
        } else if (chooseOperation.equals("+") & RomeOrArabic == 2) {
            Addition.additionArabicNumbers(num);
        }

        if (chooseOperation.equals("-") & RomeOrArabic == 1) {
            Divide.divideRomeNumbers(num);
        } else if (chooseOperation.equals("-") & RomeOrArabic == 2) {
            Divide.divideArabicNumbers(num);
        }

        if (chooseOperation.equals("*") & RomeOrArabic == 1) {
            Multiplication.multiplicateRomeNumbers(num);
        } else if (chooseOperation.equals("*") & RomeOrArabic == 2) {
            Multiplication.multiplicateArabicNumbers(num);
        }

        if (chooseOperation.equals("/") & RomeOrArabic == 1) {
            Subtraction.substractionRomeNumbers(num);
        } else if (chooseOperation.equals("/") & RomeOrArabic == 2) {
            Subtraction.substractArabicNumbers(num);
        }
    }
}
