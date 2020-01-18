package com.example.quakereportt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<EarthQuake> quakes = new ArrayList<>();
        quakes.add(new EarthQuake("7.1", "San-Francisco", "Feb 12, 2019"));

        EarthQuakeAdapter adapter = new EarthQuakeAdapter(this,quakes);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
