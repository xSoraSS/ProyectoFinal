package com.mygdx.game;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Timer;

public class PlayerController {
    SpriteBatch batch;
    Character character;
    int speed = 5, jumpForce = 20;
    boolean isJumping = false, overFloor = true, punch = false, kick = false;

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

        if (Controls.jumpKeyPressed() && !isJumping && overFloor){


            float delay = 1/2; // seconds
            character.position.y += jumpForce;

            Timer.schedule(new Timer.Task(){
                @Override
                public void run() {
                    character.position.y -= jumpForce;
                }
            }, delay);
        }

        if (Controls.punchKeyPressed() && !punch){
            System.out.println("PUÑETAZO");
            character.state = Character.State.PUNCH;
            punch = true;
        } else {
            punch = false;
            character.state = Character.State.IDLE;
        }

        if (Controls.kickKeyPressed() && !kick){
            System.out.println("PATADA");
            character.state = Character.State.KICK;
            kick = true;
        } else {
            kick = false;
            character.state = Character.State.IDLE;
        }


    }

    public void dispose() {
        batch.dispose();
    }
}