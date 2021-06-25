package com.example.feelman;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import net.daum.android.map.MapViewEventListener;
import net.daum.mf.map.api.*;

public class Activity_route extends AppCompatActivity implements MapView.POIItemEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("오시는 길");

        MapView mapView = new MapView(this);

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);

        MapPOIItem marker = new MapPOIItem();
        marker.setItemName("충북대학교 박물관");
        marker.setTag(0);
        marker.setMapPoint(MapPoint.mapPointWithGeoCoord(36.62775104579331, 127.45535206324857));
        marker.setMarkerType(MapPOIItem.MarkerType.BluePin);
        marker.setSelectedMarkerType(MapPOIItem.MarkerType.RedPin);
        mapView.addPOIItem(marker);
        mapView.setMapCenterPointAndZoomLevel(MapPoint.mapPointWithGeoCoord(36.62775104579331, 127.45535206324857),3,true);
        mapView.setPOIItemEventListener(this);

        Button button1 = findViewById(R.id.direction_phone); //전화로 연결
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:" + "043-261-2902"));
                startActivity(intent);
//                Intent intent = new Intent(getApplicationContext(), Activity_route.class);
//                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.direction_car); //자동차로 연결
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "kakaomap://route?sp= &ep=36.62775104579331, 127.45535206324857"+ "&by=CAR";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        Button button3 = findViewById(R.id.direction_bus); //대중교통으로 연결
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "kakaomap://route?sp= &ep=36.62775104579331, 127.45535206324857"+ "&by=PUBLICTRANSIT";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        Button button4 = findViewById(R.id.direction_walk); //도보로 연결
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "kakaomap://route?sp= &ep=36.62775104579331, 127.45535206324857"+ "&by=FOOT";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }

    @Override
    public void onPOIItemSelected(MapView mapView, MapPOIItem mapPOIItem) {

    }

    @Override
    public void onCalloutBalloonOfPOIItemTouched(MapView mapView, MapPOIItem mapPOIItem) {
        String url = "kakaomap://place?id=8117063";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    @Override
    public void onCalloutBalloonOfPOIItemTouched(MapView mapView, MapPOIItem mapPOIItem, MapPOIItem.CalloutBalloonButtonType calloutBalloonButtonType) {

    }

    @Override
    public void onDraggablePOIItemMoved(MapView mapView, MapPOIItem mapPOIItem, MapPoint mapPoint) {

    }
}