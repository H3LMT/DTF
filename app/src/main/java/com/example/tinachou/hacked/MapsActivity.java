package com.example.tinachou.hacked;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;


public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap=googleMap;
        // Add a marker in Sydney and move the camera'
        String listString = "";

        for (Location l : places.showPlaces)
        {
            listString +=l.getName()+", ";
        }
        Log.i("allplaces",listString);
        for(int i=0;i<places.showPlaces.size();i++)
        {
            //int i=0;
            Log.i("info",places.showPlaces.get(i).getName());
            LatLng temp = new LatLng(places.showPlaces.get(i).getLat(), places.showPlaces.get(i).getLongi());
            mMap.addMarker(new MarkerOptions().position(temp).title(places.showPlaces.get(i).getName()));

        }
        LatLng temp = findAvg(places.showPlaces);
        //java time delay

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(temp, (float) 15));
        /*for(int i = 4; i <= 50; i++)
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(temp, (float) 15 * i / 50));
            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        places.showPlaces.clear();
    }


    public LatLng findAvg(ArrayList<Location> locations)
    {
        double latSum = 0;
        double longSum = 0;
        double len = (double) places.showPlaces.size();
        Log.i("value",String.valueOf(len));
        for(int i=0;i<len;i++)
        {
            latSum+=places.showPlaces.get(i).getLat();
            longSum+=places.showPlaces.get(i).getLongi();

        }
        Log.i("lat",String.valueOf(latSum));
        Log.i("long",String.valueOf(longSum));

        return new LatLng(latSum/len,longSum/len);

    }
}

