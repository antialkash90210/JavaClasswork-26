package com.company;

import java.io.Serializable;

public class Cat implements Serializable {
    public String Name;
    public int Age;

    public Cat(String name, int age) {
        Name = name;
        Age = age;
    }
}