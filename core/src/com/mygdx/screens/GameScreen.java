package com.mygdx.screens;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.gameworld.GameRender;
import com.mygdx.gameworld.GameWorld;
import com.mygdx.zbhelpers.InputHandler;

/**
 * Created by Ayman on 5/16/2015.
 */
public class GameScreen implements Screen{

    private GameWorld world;
    private GameRender renderer;
    public GameScreen(){

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth/gameWidth);

        int midpOintY = (int)(gameHeight/2);

        world = new GameWorld(midpOintY);
        renderer = new GameRender(world);

        Gdx.input.setInputProcessor(new InputHandler(world.getBird()));

    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render();
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "Resizing");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");
    }

    @Override
    public void dispose() {
        Gdx.app.log("GameScreen", "dispose called");
    }
}
