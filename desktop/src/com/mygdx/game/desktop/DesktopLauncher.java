package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.ZBGame;
import com.mygdx.game.ZombieBirdGame;

public class DesktopLauncher {
    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "ZombieBird";
        cfg.useGL30 = false;
        cfg.width = 272;
        cfg.height = 408;

        new LwjglApplication(new ZBGame(), cfg);
    }
}
