package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main7 {
    public static void main(String[] args) {
        Cat cat = null;

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("outputCatsS.txt"))) {
            cat = (Cat) inputStream.readObject();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }

        System.out.println(cat.Name + " -- " + cat.Age);
    }
}