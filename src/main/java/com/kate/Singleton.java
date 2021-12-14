package com.kate;

public class Singleton {
    private static Singleton instance;
    private String word;
    private Singleton(){}

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public static Singleton create(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
