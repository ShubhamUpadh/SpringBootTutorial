package org.Prac2;

public class Dev {
    public Dev(){
        System.out.println("Constructing");
    }
    public Computer com;
    int age;

    public Dev(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build(){
        System.out.println("Working on this project");
        //laptop.compile();
    }
}
