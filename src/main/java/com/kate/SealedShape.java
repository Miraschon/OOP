package com.kate;

public class SealedShape {
    private String name;
    private int x,y;
    private String color;
    private String property;

    public SealedShape(String name, String color, String property){
        this.name=name;
        this.color=color;
        this.property=property;
    }

    public void printState(){
        printName();
        printColor();
        System.out.println(property);
    }

    private void printName(){
        System.out.println(name);
    }

    void printColor(){
        System.out.println(color);
    }
}
