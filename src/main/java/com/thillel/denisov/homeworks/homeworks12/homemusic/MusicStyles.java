package com.thillel.denisov.homeworks.homeworks12.homemusic;

abstract class MusicStyles {
    String groupName;

    public MusicStyles(String groupName) {
        this.groupName = groupName;
    }

    abstract void playMusic();
}
