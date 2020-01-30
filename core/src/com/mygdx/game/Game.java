package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.Player.Player;

public class Game extends ApplicationAdapter {
	Player player;
	@Override
	public void create () {

		player = new Player();

		player.create();

	}

	@Override
	public void render () {

		Gdx.gl.glClearColor(0.5f,0.5f, 0.5f, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		update();

		player.render();
	}

	void update(){
		player.update();
	}


	@Override
	public void dispose () {
		player.dispose();
	}
}