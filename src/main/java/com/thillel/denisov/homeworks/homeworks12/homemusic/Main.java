package com.thillel.denisov.homeworks.homeworks12.homemusic;

public class Main {
    public static void main(String[] args) {
        MusicStyles[] musicStyles = {new PopMusic("Eminem"), new RockMusic("ACDC"), new ClassicMusic("Bah")};
        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();

        }


    }

}

