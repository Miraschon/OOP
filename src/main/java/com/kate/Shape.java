package com.kate;

public class Shape {
    public String name="shape"; //Доступен снаружи
    private int x,y; //доступен только внутри класса
    protected String color; //Доступен внутри класса и его потомков  и всех других классов в этом package
    String property; //доступно внутри класса и всех других классов в этом package

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

    public void setName(String name) {
        this.name = name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
