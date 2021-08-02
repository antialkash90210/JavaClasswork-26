package com.company;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main9 {
    public static void main(String[] args) {
        Cat[] cats = null;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("outputCatsS2.txt"))) {
            cats = (Cat[]) inputStream.readObject();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].Name + " -- " + cats[i].Age);
        }
    }
}