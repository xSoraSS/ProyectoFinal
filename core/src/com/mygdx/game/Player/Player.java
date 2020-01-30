package com.mygdx.game.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Controls;

public class Player {
    SpriteBatch batch;
    Texture idle, walk;
    Sprite player;

    public void create () {
        batch = new SpriteBatch();
        idle = new Texture("idle.gif");
        walk = new Texture("walk.gif");
        player = new Sprite(idle);
        player.setPosition(0,0);
        player.setSize(idle.getWidth(), idle.getHeight());
    }

    public void render () {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        player.draw(batch);
        batch.end();
    }

    public void update() {

        if (Controls.backwardKey()){
            player.setRegion(walk);
            player.translateX(-1);
        }

        if (Controls.forwardKey()){
            player.setRegion(walk);
            player.translateX(1);
        }
    }

    public void dispose () {
        batch.dispose();
        idle.dispose();
        walk.dispose();
    }
}
