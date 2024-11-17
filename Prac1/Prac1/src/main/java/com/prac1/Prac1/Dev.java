package com.prac1.Prac1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    Computer comp;

    public void build(){
        comp.compile();

        System.out.println("Working on this awesome project");
    }
    public void nonStatic(){
        System.out.println("Non static");
    }
}
