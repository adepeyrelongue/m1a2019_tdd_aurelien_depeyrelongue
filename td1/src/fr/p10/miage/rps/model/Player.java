package fr.p10.miage.rps.model;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<RPSEnum> movments;
    private int score;

    public Player(String name, ArrayList<RPSEnum> movments, int score) {
        this.name = name;
        this.movments = movments;
        this.score = score;
    }

    public Player(String name) {
        this.name = name;
        this.movments = new ArrayList<RPSEnum>();
        for(int i = 0 ; i < 20 ; i++){
          int n = (int)(Math.random() * 3);
          movments.add(RPSEnum.values()[n]);
        }
        this.score = 0;
    }
}
