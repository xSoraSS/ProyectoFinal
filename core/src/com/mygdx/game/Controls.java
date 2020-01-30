package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Controls {
    //Mover Atras && Bloquear Ataques
    static boolean backwardKey(){
        return Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A);
    }

    //Mover Adelante
    static boolean forwardKey(){
        return Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D);
    }

    //Saltar
    static boolean jumpKey(){
        return Gdx.input.isKeyPressed(Input.Keys.UP) || Gdx.input.isKeyPressed(Input.Keys.W );
    }

    //Agacharse
    static boolean crouchKey(){
        return Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S);
    }

    //Ataque Puñetazo
    static boolean punchKey(){
        return Gdx.input.isKeyPressed(Input.Keys.F) || Gdx.input.isKeyPressed(Input.Keys.K);
    }

    //Ataque Patada
    static boolean kickKey(){
        return Gdx.input.isKeyPressed(Input.Keys.G) || Gdx.input.isKeyPressed(Input.Keys.L);
    }

    //Lanzar Habilidad
    static boolean skillKey(){
        return Gdx.input.isKeyPressed(Input.Keys.T) || Gdx.input.isKeyPressed(Input.Keys.O);
    }
}