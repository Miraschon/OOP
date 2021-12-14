package com.kate;

public class Dog extends Animal{
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void say(){
        System.out.println("woof");
    }

    public void setColor(String color){
        this.color=color;
    }
}
