package ru.gb.stargame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

import ru.gb.stargame.screen.MainScreen;

public class StarGame extends Game {
//	SpriteBatch batch;
//	Texture img;
//	int x;
//	int y;

	@Override
	public void create () {
		setScreen(new MainScreen());
//		batch = new SpriteBatch();
//		img = new Texture("badlogic.jpg");
//
//		Vector2 v1 = new Vector2(5, 5);
//		Vector2 v2 = new Vector2();
//		v2.set(7, -3);
//		v1.add(v2);
//
//		System.out.println("log add: " + v1.x + " " + v1.y);
//
//		v1.set(3,7);
//		v2.set(6,2);
//		v1.sub(v2);
//
//		System.out.println("log sub: " + v1.x + " " + v1.y);
//
////		System.out.println("log len: " + v1.len());
////
////		v1.setLength(100);
////		System.out.println("log setLength: " + v1.x + " " + v1.y);
////
////		v1.scl(0.95f);
////		System.out.println("log len scl: " + v1.len());
////
////		v1.nor();
////		System.out.println("log len scl normal: " + v1.len());
////
////		Vector2 v3 = v1.cpy().add(v2);
////
////		System.out.println();
////		System.out.println("log v1: " + v1.x + " " + v1.y);
////		System.out.println("log v3: " + v3.x + " " + v3.y);
////
////		v1.set(1,1);
////		v2.set(-1,1);
////		v1.nor();
////		v2.nor();
////		System.out.println("log angle: " + Math.acos(v1.dot(v2)));
	}

//	@Override
//	public void render () {
//		ScreenUtils.clear(Color.MAROON);
//		batch.begin();
//		batch.draw(img, x, y);
//		batch.end();
//	}
//
//	@Override
//	public void dispose () {
////		batch.dispose();
////		img.dispose();
//	}
}
