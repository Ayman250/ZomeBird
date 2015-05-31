package com.mygdx.screens;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.mygdx.gameworld.GameRender;
import com.mygdx.gameworld.GameWorld;

/**
 * Created by Ayman on 5/16/2015.
 */
public class GameScreen implements Screen{

    private GameWorld world;
    private GameRender renderer;
    public GameScreen(){
        Gdx.app.log("GameScreen", "Attached");
        world = new GameWorld();
        renderer = new GameRender(world);

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
