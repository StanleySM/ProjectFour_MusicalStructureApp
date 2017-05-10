package com.example.android.projectfour_musicalstructureapp;


// Based on manual for ArrayAdapter from AbhiAndroid web
public class Item {

    String streamName;
    int streamImage;

    public Item(String streamName,int streamImage)
    {
        this.streamImage=streamImage;
        this.streamName=streamName;
    }
    public String getStreamName()
    {
        return streamName;
    }
    public int getStreamImage()
    {
        return streamImage;
    }
}