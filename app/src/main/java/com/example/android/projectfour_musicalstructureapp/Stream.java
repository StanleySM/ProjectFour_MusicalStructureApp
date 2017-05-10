package com.example.android.projectfour_musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Stream extends AppCompatActivity {


    // Based on manual for ArrayAdapter from AbhiAndroid web
    ListView simpleList;
    ArrayList<Item> streams = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stream);
        simpleList = (ListView) findViewById(R.id.list);
        streams.add(new Item("Name of Stream1 \nDescription of stream radio.", R.drawable.ic_radio_white_48dp));
        streams.add(new Item("Name of Stream2 \nDescription of stream radio.", R.drawable.ic_radio_white_48dp));
        streams.add(new Item("Name of Stream3 \nDescription of stream radio.", R.drawable.ic_radio_white_48dp));
        streams.add(new Item("Name of Stream4 \nDescription of stream radio.", R.drawable.ic_radio_white_48dp));
        streams.add(new Item("Name of Stream5 \nDescription of stream radio.", R.drawable.ic_radio_white_48dp));
        streams.add(new Item("Name of Stream6 \nDescription of stream radio.", R.drawable.ic_radio_white_48dp));
        streams.add(new Item("Name of Stream7 \nDescription of stream radio.", R.drawable.ic_radio_white_48dp));
        streams.add(new Item("Name of Stream8 \nDescription of stream radio.", R.drawable.ic_radio_white_48dp));


        MyAdapter myAdapter=new MyAdapter(this,R.layout.list_view_items,streams);
        simpleList.setAdapter(myAdapter);


    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }
}
