package com.company;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) throws Exception {
        int[] number = null;
        try {
            Scanner input = new Scanner(new FileInputStream("output.txt"));

            int length = Integer.parseInt(input.nextLine());
            number = new int[length];

            for (int i = 0; i < number.length; i++) {
                number[i] = Integer.parseInt(input.nextLine());
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

    }
}