package org.Prac2;

public class Dev {
    public Dev(){
        System.out.println("Constructing");
    }
    public Laptop laptop;
    int age;

    public Dev(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){
        System.out.println("Working on this project");
        laptop.compile();
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
