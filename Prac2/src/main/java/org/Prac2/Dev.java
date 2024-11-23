package org.Prac2;

public class Dev {
    public Dev(){
        System.out.println("Constructing");
    }
    public Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void build(){
        System.out.println("Working on this project");
        //laptop.compile();
    }
}
