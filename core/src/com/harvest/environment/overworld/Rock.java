package com.harvest.environment.overworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.harvest.scenes.SceneOverWorld;

/**
 * Created by Patty on 1/24/2016.
 */
public class Rock extends Actor {

    Sprite sprite;
    Body body;

    public Rock(SceneOverWorld scene){
        sprite = new Sprite(new Texture(Gdx.files.internal(EnvironmentVars.ROCK_IMG_PATH)));
        sprite.setPosition(this.getX(),this.getY());
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyDef.BodyType.StaticBody;
        bodyDef.position.set(this.getX(), this.getY());
        body = scene.world.createBody(bodyDef);
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(sprite,this.getX(),this.getY());
    }

    @Override
    public Actor hit(float x, float y, boolean touchable) {
        return super.hit(x, y, touchable);
    }

}
