package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.FileVisitResult;

public class Main2 {
    public static void main(String[] args) throws Exception {
        int[] number = null;
        try {
            FileReader fileReader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int length = Integer.parseInt(bufferedReader.readLine());
            number = new int[length];

            for (int i = 0; i < number.length; i++) {
                number[i] = Integer.parseInt(bufferedReader.readLine());
            }

            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}