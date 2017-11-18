package com.example.muslix.santa;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;

public class GameView extends SurfaceView implements Runnable {

    //boolean variable to track if the game is playxing or not
    volatile boolean playing;

    //the game thread
    private Thread gameThread = null;

    public GameView(Context context) {
        super(context);
    }


    @Override
    public void run() {
        while(playing) {

            //to update the frame
            update();
            //to draw the frame
            draw();
            //to control
            control();
        }
    }

    private void update(){

    }

    private void draw(){

    }

    private void control(){
        try{
            gameThread.sleep(17);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    public void pause(){
        playing = false;
        try {
            gameThread.join();
        }catch(InterruptedException e){

        }
    }

    public void resume(){
        playing = true;
        gameThread = new Thread(this);
        gameThread.start();
    }

}
