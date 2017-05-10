package com.example.android.projectfour_musicalstructureapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


// Based on manual for ArrayAdapter from AbhiAndroid web

public class MyAdapter extends ArrayAdapter<Item> {

    ArrayList<Item> streams = new ArrayList<>();

    public MyAdapter(Context context, int textViewResourceId, ArrayList<Item> objects) {
        super(context, textViewResourceId, objects);
        streams = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.list_view_items, null);
        TextView textView = (TextView) v.findViewById(R.id.textView_list);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView_list);
        textView.setText(streams.get(position).getStreamName());
        imageView.setImageResource(streams.get(position).getStreamImage());
        return v;

    }

}