package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class World {
    Character character;

    int WORLD_WIDTH, WORLD_HEIGHT;

    public World(int WORLD_WIDTH, int WORLD_HEIGHT){
        this.WORLD_WIDTH = WORLD_WIDTH;
        this.WORLD_HEIGHT = WORLD_HEIGHT;

        character = new Character(WORLD_WIDTH/2);
    }

    public void render(float delta, SpriteBatch batch, Assets assets){

        update(delta, assets);

        batch.begin();
        character.render(batch);
        batch.end();
    }

    void update(float delta, Assets assets){
        character.update(delta, assets);

    }
}
