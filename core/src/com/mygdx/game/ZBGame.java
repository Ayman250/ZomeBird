package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.screens.GameScreen;
import com.mygdx.zbhelpers.AssetLoader;

/**
 * Created by Ayman on 5/16/2015.
 */
public class ZBGame extends Game{

    @Override
    public void create(){
       Gdx.app.log("ZBGame", "created");
        AssetLoader.load();
       setScreen(new GameScreen());
    }

    @Override
    public void dispose(){
        super.dispose();
        AssetLoader.dispose();
    }
}
