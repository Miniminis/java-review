package com.javareview.player;

public class Player {
    PlayerLevel playerLevel;

    Player() {
        playerLevel = new BeginnerLevel();
        playerLevel.showLevel();
    }

    public void levelUp(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
        this.playerLevel.showLevel();
    }

    public void play(int cnt) {
        this.playerLevel.run();
        for (int i=0; i<cnt; i++) {
            this.playerLevel.jump();
        }
        this.playerLevel.turn();
    }
}
