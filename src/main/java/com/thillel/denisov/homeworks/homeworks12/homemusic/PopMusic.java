package com.thillel.denisov.homeworks.homeworks12.homemusic;

public class PopMusic extends MusicStyles {

    public PopMusic(String groupName) {
        super(groupName);
    }

    @Override
    void playMusic() {
        System.out.println("Playing pop music, group: " + groupName);
    }
}
