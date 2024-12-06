package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gamer [] gamers = new Gamer[5];
        gamers[0]= new Gamer("Aaliyah", true);
        gamers[1]= new Gamer("Abby", false);
        gamers[2]= new Gamer("Brooklyn", true);
        gamers[3]= new Gamer("Bryn", false);
        gamers[4]= new Gamer("Bri", true);
        for (int i = 0; i<gamers.length; i++ ){
            System.out.println(gamers[i].getNickname());
        }
    }
}