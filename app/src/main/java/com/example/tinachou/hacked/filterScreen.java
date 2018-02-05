package com.example.tinachou.hacked;

/**
 * Created by tinachou on 10/28/17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


public class filterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filter);
    }

    public void quietClick(View view){
        Log.i("info","quiet");
        Intent intent = new Intent(this, MapsActivity.class);
        for(Location l:places.getCheck())
        {
            if(l.getQuiet())
            {
                places.showPlaces.add(l);
            }
        }
        startActivity(intent);
    }

    public void cafeClick(View view){
        Log.i("info","cafe");
        Intent intent = new Intent(this, MapsActivity.class);
        for(Location l:places.getCheck())
        {
            if(l.getFood())
            {
                places.showPlaces.add(l);
            }
        }
        startActivity(intent);
    }

    public void outdoorClick(View view){
        Log.i("info","outdoor");
        Intent intent = new Intent(this, MapsActivity.class);
        for(Location l:places.getCheck())
        {
            if(l.getPlace())
            {
                places.showPlaces.add(l);
            }
        }
        startActivity(intent);
    }

    public void showAllClick(View view){
        Log.i("info","outdoor");
        Intent intent = new Intent(this, MapsActivity.class);
        for(Location l:places.getCheck())
        {
            places.showPlaces.add(l);
        }
        startActivity(intent);
    }



}

