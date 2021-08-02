package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        int[] numbers = new int[]{3, 5, 7, 11};

        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(numbers.length+"\n");

            for (int i = 0; i < numbers.length; i++) {
                bufferedWriter.write(numbers[i]+"\n");
            }

            bufferedWriter.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}