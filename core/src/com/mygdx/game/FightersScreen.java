package com.mygdx.game;

import com.badlogic.gdx.Screen;

public class FightersScreen implements Screen {
    FightersGame game;
    Assets assets;

    public FightersScreen(FightersGame game){
        this.game = game;
        this.assets = game.assets;
    }

    void setScreen(Screen screen){
        game.setScreen(screen);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
