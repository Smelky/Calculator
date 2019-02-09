package com.study;

import java.util.Scanner;

class ChooseOperation {

    static void chooseOperation(Scanner num, int RomeOrArabic){

        System.out.println("Choose operation: + - * /");
        String chooseOperation = num.next();
        if (chooseOperation.equals("+") & RomeOrArabic == 1) {
            Addition.additionRomeNumbers(num);
        }else {
            Addition.additionArabicNumbers(num);
        }
    }
}
