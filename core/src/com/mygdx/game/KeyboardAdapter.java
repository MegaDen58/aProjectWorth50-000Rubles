package com.mygdx.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector3;

public class KeyboardAdapter extends InputAdapter {
    boolean leftPassed;
    boolean rightPassed;
    boolean upPassed;
    boolean downPassed;

    Vector3 direction = new Vector3();

    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.A) leftPassed = true;
        if(keycode == Input.Keys.D) rightPassed = true;
        if(keycode == Input.Keys.W) upPassed = true;
        if(keycode == Input.Keys.S) downPassed = true;

        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if(keycode == Input.Keys.A) leftPassed = false;
        if(keycode == Input.Keys.D) rightPassed = false;
        if(keycode == Input.Keys.W) upPassed = false;
        if(keycode == Input.Keys.S) downPassed = false;

        return false;
    }

    public Vector3 getDirection(){
        direction.set(0,0,0);

        if(leftPassed) direction.add(-5,0,0);
        if(rightPassed) direction.add(5,0,0);
        if(upPassed) direction.add(0,5,0);
        if(downPassed) direction.add(0,-5,0);

        return direction;
    }
}
