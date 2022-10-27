package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector3;

public class Character {


    private Vector3 position = new Vector3();
    private Vector3 angle = new Vector3();
    private Texture texture;
    private TextureRegion textureRegion;


    public Character(float x, float y) {
        texture = new Texture("character.png");
        textureRegion = new TextureRegion(texture);
        position.set(x,y,0);
    }

    public void render(Batch batch){
        batch.draw(textureRegion, position.x, position.y);
    }

    public void dispose(){
        texture.dispose();
    }

    public void moveTo(Vector3 direction) {
        position.add(direction);
    }

}
