package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Controls;

public class PlayerController {
    SpriteBatch batch;
    Character character;
    int speed = 5;

    public PlayerController(SpriteBatch batch, Character character) {
        this.batch = batch;
        this.character = character;
    }

    public void create() {
        batch = new SpriteBatch();

    }

    public void render() {
//        batch.begin();
//        batch.draw(batch);
//        batch.end();
    }

    public void update() {

        if (Controls.backwardKeyPressed()) {
            character.position.x -= speed;
        }

        if (Controls.forwardKeyPressed()) {
            character.position.x += speed;
        }
    }

    public void dispose() {
        batch.dispose();
    }
}