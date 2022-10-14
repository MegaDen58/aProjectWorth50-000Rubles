package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends Game {
	SpriteBatch batch;
	Character character;
	OrthogonalTiledMapRenderer orthogonalTiledMapRenderer;
	KeyboardAdapter inputProcessor = new KeyboardAdapter();
	Play play = new Play();


	
	@Override
	public void create () {
		Gdx.input.setInputProcessor(inputProcessor);
		batch = new SpriteBatch();
		character = new Character(100, 200);
	}

	@Override
	public void render () {
		super.render();
		batch.begin();
		character.render(batch);
		character.moveTo(inputProcessor.getDirection());
		batch.end();
	}
	
	@Override
	public void dispose () {
		character.dispose();
		batch.dispose();
	}

	@Override
	public void resize(int width, int height){
		super.resize(width, height);
	}

	@Override
	public void pause(){
		super.pause();
	}

	@Override
	public void resume(){
		super.resume();
	}
}
