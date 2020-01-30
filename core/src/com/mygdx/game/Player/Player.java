package com.mygdx.game.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.Controls;
import com.mygdx.game.GifDecoder;

public class Player {
    SpriteBatch batch;
    Sprite player;
    Animation<TextureRegion> animationIdle, animationWalk;
    float elapsed;

    public void create () {
        batch = new SpriteBatch();
        animationIdle = GifDecoder.loadGIFAnimation(Animation.PlayMode.LOOP, Gdx.files.internal("idle.gif").read());
        animationWalk = GifDecoder.loadGIFAnimation(Animation.PlayMode.LOOP, Gdx.files.internal("walk.gif").read());
    }

    public void render () {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(animationIdle.getKeyFrame(elapsed), 20.0f, 20.0f);
        batch.end();
    }

    public void update() {

        if (Controls.backwardKey()){
            player.setRegion();
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
