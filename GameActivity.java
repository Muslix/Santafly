package com.example.muslix.santa;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;

public class GameActivity extends AppCompatActivity {

    private GameView gameView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //getting display object
        Display display = getWindowManager().getDefaultDisplay();

        //gettting the screen resolution into point object
        Point size = new Point();
        display.getSize(size);

        //Initializing game view object
        gameView = new GameView(this, size.x, size.y);

        //adding it to contentview
        setContentView(gameView);

    }
    //pausing the game when activity is paused
    @Override
    protected void onPause(){
        super.onPause();
        gameView.pause();
    }
    //running the game when activity is resumed
    @Override
    protected void onResume(){
        super.onResume();
        gameView.resume();
    }
}

