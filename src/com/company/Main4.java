package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main4 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Мурзик", 15),
                new Cat("Иван", 3),
                new Cat("Lena", 4)
        };

        try {
            FileWriter fileWriter = new FileWriter("outputCats.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(cats.length + "\n");

            for (int i = 0; i < cats.length; i++) {
                bufferedWriter.write(cats[i].Name + "\n");
                bufferedWriter.write(cats[i].Age + "\n");
            }

            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}