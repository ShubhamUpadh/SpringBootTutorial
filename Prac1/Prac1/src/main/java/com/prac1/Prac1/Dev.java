package com.prac1.Prac1;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    public static void build(){
        System.out.println("Working on this awesome project");
    }
    public void nonStatic(){
        System.out.println("Non static");
    }
}
