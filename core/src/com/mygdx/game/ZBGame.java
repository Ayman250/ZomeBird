package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.mygdx.screens.GameScreen;

/**
 * Created by Ayman on 5/16/2015.
 */
public class ZBGame extends Game{

    @Override
    public void create(){
       Gdx.app.log("ZBGame", "created");
       setScreen(new GameScreen());
    }
}
