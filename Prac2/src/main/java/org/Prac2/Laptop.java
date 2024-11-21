package org.Prac2;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop created");
    }
    public void compile(){
        System.out.println("Compiling @ laptop");
    }
}
