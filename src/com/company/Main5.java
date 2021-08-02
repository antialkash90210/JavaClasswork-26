package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Cat[] cats = null;
        try {
            FileReader fileReader = new FileReader("outputCats.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            int length = Integer.parseInt(bufferedReader.readLine());
            cats = new Cat[length];

            for (int i = 0; i < cats.length; i++) {
                String name = bufferedReader.readLine();
                int age = Integer.parseInt(bufferedReader.readLine());

                cats[i] = new Cat(name, age);
            }

            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].Name + " -- " + cats[i].Age);
        }
    }
}