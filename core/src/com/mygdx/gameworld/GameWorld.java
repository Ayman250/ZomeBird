package com.mygdx.gameworld;
import com.mygdx.gameobjects.Bird;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.math.Rectangle;

/**
 * Created by Ayman on 5/22/2015.
 */
public class GameWorld {
    private Bird bird;

    public GameWorld(int midPointY){
        bird = new Bird(33, midPointY - 5, 17, 12);
    }

    public void update(float delta){
        bird.update(delta);
    }

    public Bird getBird(){
        return bird;
    }
}
