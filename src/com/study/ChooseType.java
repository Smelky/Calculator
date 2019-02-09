package com.study;

import java.util.Scanner;

class ChooseType {

    static void chooseType() {

        System.out.print("Choose Rome (Press 1) or Arabian (Press 2) numbers  ? \n: ");
        Scanner num = new Scanner(System.in);
        String chooseType = num.next();

        if (chooseType.equals("1")) {
            ChooseOperation.chooseOperation(num, 1);
        }

        if (chooseType.equals("2")) {
            ChooseOperation.chooseOperation(num, 2);
        }

    }
}
