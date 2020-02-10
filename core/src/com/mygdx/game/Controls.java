package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Controls {
    //Mover Atras && Bloquear Ataques
    public static boolean backwardKeyPressed(){
        return Gdx.input.isKeyPressed(Input.Keys.LEFT) || Gdx.input.isKeyPressed(Input.Keys.A);
    }

    //Mover Adelante
    public static boolean forwardKeyPressed(){
        return Gdx.input.isKeyPressed(Input.Keys.RIGHT) || Gdx.input.isKeyPressed(Input.Keys.D);
    }

    //Saltar
    public static boolean jumpKeyPressed(){
        return Gdx.input.isKeyJustPressed(Input.Keys.UP) || Gdx.input.isKeyJustPressed(Input.Keys.W );
    }

    //Agacharse
    public static boolean crouchKeyPressed(){
        return Gdx.input.isKeyPressed(Input.Keys.DOWN) || Gdx.input.isKeyPressed(Input.Keys.S);
    }

    //Ataque Puñetazo
    public static boolean punchKeyPressed(){
        return Gdx.input.isKeyJustPressed(Input.Keys.V) || Gdx.input.isKeyPressed(Input.Keys.K);
    }

    //Ataque Patada
    public static boolean kickKeyPressed(){
        return Gdx.input.isKeyJustPressed(Input.Keys.B) || Gdx.input.isKeyPressed(Input.Keys.L);
    }

    //Lanzar Habilidad
    public static boolean skillKeyPressed(){
        return Gdx.input.isKeyJustPressed(Input.Keys.F) || Gdx.input.isKeyPressed(Input.Keys.O);
    }
}
