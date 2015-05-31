package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.ZBGame;
import com.mygdx.game.ZombieBirdGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Zombie Bird";
        config.width = 272;
        config.height = 408;
        config.title = "Zeombie Bird";
        new LwjglApplication(new ZBGame(), config);
	}
}
