package com.vnatures.emenu.vending.ugo;

import android.graphics.Color;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;

public class MapsActivity extends FragmentActivity
        implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Circle circle;

    @Override
    public void onMapReady(GoogleMap map) {
        mMap = map;
      //  map.


    }
}