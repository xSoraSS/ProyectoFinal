package com.mygdx.game.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.mygdx.game.Controls;
import com.mygdx.game.GifDecoder;

public class Player {
    SpriteBatch batch;
    Animation<TextureRegion> animationIdle, animationWalk;
    float elapsed, playablePosition, currentPosition = 0;

    public void create () {
        batch = new SpriteBatch();
        animationIdle = GifDecoder.loadGIFAnimation(Animation.PlayMode.LOOP, Gdx.files.internal("idle.gif").read());
        animationWalk = GifDecoder.loadGIFAnimation(Animation.PlayMode.LOOP, Gdx.files.internal("walk.gif").read());
        elapsed += (Gdx.graphics.getDeltaTime()) * 2;
        playablePosition = (Gdx.graphics.getWidth()) / 2 - 200;
    }

    public void render () {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(animationIdle.getKeyFrame(elapsed), currentPosition, 0, 80.0f, 80.0f);
        batch.end();
    }

    public void update() {

        if (Controls.backwardKey()){
            currentPosition -= 1;
            batch.begin();
            batch.draw(animationWalk.getKeyFrame(elapsed), currentPosition, 1);
            batch.end();
        }

        if (Controls.forwardKey()){
            currentPosition += 1;
            batch.begin();
            batch.draw(animationWalk.getKeyFrame(elapsed), currentPosition, 1);
            batch.end();
        }
    }

    public void dispose () {
        batch.dispose();
    }
}
