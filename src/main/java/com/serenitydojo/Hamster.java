package com.serenitydojo;

public class Hamster extends Pet{

    private int age;
    private String favoriteGame;

    public Hamster(String name, String favoriteGame, int age){
        super(name);
        this.favoriteGame = favoriteGame;
        this.age = age;
    }

}
