package com.kate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        App app=new App();
        app.playShape();
    }

    public void playShape() {

        Dog dog=new Dog("Spot","brown");
        dog.say();
        dog.printState();
        dog.setColor("green");
        dog.printState();
        Cat cat=new Cat("Zuma","brown");
        cat.say();
        cat.printState();

     /*   Singleton singleton=Singleton.create();
        singleton.setWord("word1");
        System.out.println(singleton.getWord());
        Singleton singleton2=Singleton.create();
        System.out.println(singleton2.getWord());*/
    }
}
