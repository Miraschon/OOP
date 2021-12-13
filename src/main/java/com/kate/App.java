package com.kate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       playShape();
    }

    public static void playShape() {
        SealedShape triangle = new SealedShape("triangle", "blue", "word");
        Shape circle = new Shape();
        circle.setName("circle");
        circle.setColor("red");
        circle.setProperty("word");
        triangle.printState();
        circle.printState();

    }
}
