package com.kate;

public abstract class Animal {
    private final String name;
    protected String color;

    public Animal(String name, String color){
        this.name=name;
        this.color=color;
    }

    public abstract void say();

    public void printState(){
        printName();
        printColor();
    }

    private void printName(){
        System.out.println(name);
    }

    void printColor(){
        System.out.println(color);
    }
}
