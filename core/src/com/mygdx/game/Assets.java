package com.mygdx.game;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets extends AssetManager {
    public TextureAtlas atlas;
    public Animation<TextureRegion> idle, punch, kick;

    public void load(){
        load("fighters.atlas", TextureAtlas.class);
    }


    @Override
    public synchronized boolean update() {
        boolean update = super.update();

        if(update){
            atlas = get("fighters.atlas", TextureAtlas.class);

            loadAnimations();
        }
        return update;
    }

    void loadAnimations(){
        idle = new Animation<TextureRegion>(0.1f, atlas.findRegions("Idle"));
        punch = new Animation<TextureRegion>(0.1f, atlas.findRegions("Attack"));
        kick = new Animation<TextureRegion>(1f, atlas.findRegions("kick"));

    }
}
