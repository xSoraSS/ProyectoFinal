package com.mygdx.game;

public class LoadingScreen extends FightersScreen {

    public LoadingScreen(FightersGame si) {
        super(si);
    }

    @Override
    public void render(float delta) {
        if(!assets.update()){
            return;
        }

        setScreen(new GameScreen(game));
    }
}
