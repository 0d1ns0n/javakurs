package com.thillel.denisov.homeworks.homeworks12.homemusic;

public class RockMusic extends MusicStyles {


    public RockMusic(String groupName) {
        super(groupName);
    }

    @Override
    void playMusic() {
        System.out.println("Playing rock music, group : " + groupName);

    }
}
