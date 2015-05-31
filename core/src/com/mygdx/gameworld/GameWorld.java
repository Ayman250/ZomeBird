package com.mygdx.gameworld;

import com.badlogic.gdx.Gdx;

import java.awt.Rectangle;

/**
 * Created by Ayman on 5/22/2015.
 */
public class GameWorld {

    private Rectangle rect = new Rectangle(0, 0, 17, 12);

    public void update(float delta){
        Gdx.app.log("GameWorld", "update");
        rect.x++;
        if(rect.x>137){
            rect.x=0;
        }
    }
    public Rectangle getRect(){
        return rect;
    }
}