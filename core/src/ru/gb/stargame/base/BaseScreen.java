package ru.gb.stargame.base;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class BaseScreen implements Screen, InputProcessor {
    protected SpriteBatch batch;


    @Override
    public void show() {
        System.out.println("show");
        batch = new SpriteBatch();
        Gdx.input.setInputProcessor(this);

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(Color.MAROON);

    }

    @Override
    public void resize(int width, int height) {
        System.out.println("resize: " + width + " " + height);

    }

    @Override
    public void pause() {
        System.out.println("pause");

    }

    @Override
    public void resume() {
        System.out.println("resume");

    }

    @Override
    public void hide() {
        System.out.println("hide");
        dispose();
    }

    @Override
    public void dispose() {
        System.out.println("dispose");
        batch.dispose();

    }

    @Override
    public boolean keyDown(int keycode) {
        System.out.println("pressed KeyCode: " + keycode);
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        System.out.println("released KeyCode: " + keycode);

        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        System.out.println("typed KeyCode: " + character);

        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("touchDown pessed KeyCode: " + screenX + " " + screenY);

        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        System.out.println("touchup released KeyCode: " + screenX + " " + screenY);

        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        System.out.println("touchDragged drag KeyCode: " + screenX + " " + screenY);

        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        System.out.println("touchDown pessed KeyCode: " + amountX + " " + amountY);

        return false;
    }


}
