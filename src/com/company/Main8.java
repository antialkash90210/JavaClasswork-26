package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main8 {
    public static void main(String[] args) {

        Cat[] cats = new Cat[]{
                new Cat("Мурзик", 15),
                new Cat("Иван", 3),
                new Cat("Lena", 4)
        };

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("outputCatsS2.txt")))
        {
            outputStream.writeObject(cats);
        }
        catch(Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}