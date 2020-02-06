package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class World {
    Character playerCharacter;
    PlayerController playerController;

    int WORLD_WIDTH, WORLD_HEIGHT;

    public World(int WORLD_WIDTH, int WORLD_HEIGHT, SpriteBatch batch){
        this.WORLD_WIDTH = WORLD_WIDTH;
        this.WORLD_HEIGHT = WORLD_HEIGHT;

        playerCharacter = new Character(WORLD_WIDTH/2);
        playerController = new PlayerController(batch, playerCharacter);
    }

    public void render(float delta, SpriteBatch batch, Assets assets){

        update(delta, assets);

        batch.begin();
        playerCharacter.render(batch);
        batch.end();
    }

    void update(float delta, Assets assets){
       playerController.character.update(delta, assets);
       playerController.update();

    }
}
