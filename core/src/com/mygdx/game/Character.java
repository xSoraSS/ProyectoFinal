package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class Character {
    //CREAR LÓGICA DE LOS PERSONAJES


    enum State {
        IDLE;
    }

    Vector2 position;
    State state;
    float stateTime;

    TextureRegion frame;

    Character(int initialPosition){
        position = new Vector2(initialPosition, 10);
        state = State.IDLE;
        stateTime = 0;
    }

    void setFrame(Assets assets){
        switch (state){
            case IDLE:
                frame = assets.idle.getKeyFrame(stateTime, true);
                break;
//            default:
//                frame = assets.idle.getKeyFrame(stateTime, true);
//                break;
        }
    }

    void render(SpriteBatch batch){
        batch.draw(frame, position.x, position.y);
    }

    public void update(float delta, Assets assets) {
        stateTime += delta;

        setFrame(assets);
    }
}
