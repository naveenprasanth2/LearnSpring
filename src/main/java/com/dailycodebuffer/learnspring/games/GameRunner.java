package com.dailycodebuffer.learnspring.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private final GamingConsole gamingConsole;
    @Autowired
    public GameRunner(@Qualifier("pacMan") GamingConsole gamingConsole) {
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
