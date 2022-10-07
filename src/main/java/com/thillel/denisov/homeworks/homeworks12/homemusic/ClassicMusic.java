package com.thillel.denisov.homeworks.homeworks12.homemusic;

public class ClassicMusic extends MusicStyles {

    public ClassicMusic(String groupName) {
        super(groupName);
    }

    @Override
    void playMusic() {
        System.out.println("Playing classic music, group: " + groupName);

    }
}

