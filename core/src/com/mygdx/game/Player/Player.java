package com.mygdx.game.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.Controls;
import com.mygdx.game.GifDecoder;

public class Player extends Actor {
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
        batch.draw(animationIdle.getKeyFrame(Gdx.graphics.getDeltaTime(), true), currentPosition, 0, 80.0f, 80.0f);
        batch.end();
    }

    public void update() {

        if (Controls.backwardKey()){
            currentPosition -= 1;
            batch.begin();
            batch.draw(animationWalk.getKeyFrame(Gdx.graphics.getDeltaTime(), true), currentPosition, 0);
            batch.end();
        }

        if (Controls.forwardKey()){
            currentPosition += 1;
            batch.begin();
            batch.draw(animationWalk.getKeyFrame(Gdx.graphics.getDeltaTime(), true), currentPosition, 0);
            batch.end();
        }
    }

    public void dispose () {
        batch.dispose();
    }

//        private static final int FRAME_COLS = 10, FRAME_ROWS = 1;
//        Animation<TextureRegion> walkAnimation;
//        Texture walkSheet;
//        private final static int STARTING_X = 50;
//        private final static int STARTING_Y = 50;
//        TextureRegion reg;
//        float stateTime;
//    public Player(){
//        createIdleAnimation();
//        this.setPosition(STARTING_X, STARTING_Y);
//    }
//
//    private void createIdleAnimation() {
//        walkSheet = new Texture(Gdx.files.internal("Skeleton_Walk.png"));
//
//        TextureRegion[][] tmp = TextureRegion.split(walkSheet,
//                walkSheet.getWidth() / FRAME_COLS,
//                walkSheet.getHeight() / FRAME_ROWS);
//
//        TextureRegion[] walkFrames = new TextureRegion[FRAME_COLS * FRAME_ROWS];
//        int index = 0;
//        for (int i = 0; i < FRAME_ROWS; i++) {
//            for (int j = 0; j < FRAME_COLS; j++) {
//                walkFrames[index++] = tmp[i][j];
//            }
//        }
//
//        walkAnimation = new Animation<TextureRegion>(0.025f, walkFrames);
//        stateTime = 0f;
//        reg=walkAnimation.getKeyFrame(0);
//    }
//
//
//    @Override
//    public void act(float delta) {
//        super.act(delta);
//
//        stateTime += delta;
//        reg = walkAnimation.getKeyFrame(stateTime,true);
//    }
//
//    @Override
//    public void draw(Batch batch, float parentAlpha) {
//        super.draw(batch, parentAlpha);
//
//        Color color = getColor();
//        batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
//        batch.draw(reg,getX(),getY(),getWidth()/2,getHeight()/2,getWidth(),getHeight(),getScaleX(),getScaleY(),getRotation());
//    }
}