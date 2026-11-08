package com.example.game_hub;

public class Game {
    private String name;
    private int coverImage;

    public Game(String name, int coverImage) {
        this.name = name;
        this.coverImage = coverImage;
    }

    public String getName() {
        return name;
    }

    public int getCoverImage() {
        return coverImage;
    }
}