package com.dailycodebuffer.learnspring.games;

public class GameRunner {
    private final GamingConsole gamingConsole;
    public GameRunner(GamingConsole gamingConsole) {
        this.gamingConsole = gamingConsole;
    }

    public void run() {
        gamingConsole.up();
        gamingConsole.down();
        gamingConsole.left();
        gamingConsole.right();
    }

    public static void main(String[] args) {
        GameRunner gameRunner = new GameRunner(new PacMan());
        gameRunner.run();
    }
}
