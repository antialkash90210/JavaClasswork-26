package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Андрей", 15);

        try(ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("outputCatsS.txt")))
        {
            outputStream.writeObject(cat);
        }
        catch(Exception e){
            System.out.println("error: " + e.getMessage());
        }
    }
}