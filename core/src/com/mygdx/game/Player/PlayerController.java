package com.mygdx.game.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Controls;

public class PlayerController {
    SpriteBatch batch;


    public void create() {
        batch = new SpriteBatch();

    }

    public void render() {
//        batch.begin();
//        batch.draw();
//        batch.end();
    }

    public void update() {

        if (Controls.backwardKey()) {

        }

        if (Controls.forwardKey()) {

        }
    }

    public void dispose() {
        batch.dispose();
    }
}