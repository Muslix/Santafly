package com.example.muslix.santa;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Muslix on 18.11.2017.
 */

public class Player {

    private Bitmap bitmap;

    private int x;
    private int y;
    private boolean start =false;

    private int speed = 0;
    private float gravity = 0.5f;

    //Controlling y coordinate so that santa wont get outside of the screen
    private int maxY;
    private int minY;

    public Player(Context context, int screenX, int screenY){

        x=75;
        y=50;
        speed = 1;

        bitmap = BitmapFactory.decodeResource(context.getResources(),R.drawable.player);

        //calculating maxY

        maxY = screenY - bitmap.getHeight();

        //top edge's point is 0 so imn y will be zero
        minY = 0;
    }

    public void update(){
        //updateing y coordinate
        if (start=true){

            y -= speed + gravity;

        }
    }

    public Bitmap getBitmap(){
        return bitmap;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getSpeed(){
        return speed;
    }
}
