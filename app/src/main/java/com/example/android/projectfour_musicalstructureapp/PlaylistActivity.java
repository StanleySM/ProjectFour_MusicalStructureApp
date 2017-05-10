package com.example.android.projectfour_musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);



        ImageView group1 = (ImageView) findViewById(R.id.group_1);
        ImageView group2 = (ImageView) findViewById(R.id.group_2);
        ImageView group3 = (ImageView) findViewById(R.id.group_3);
        ImageView group4 = (ImageView) findViewById(R.id.group_4);
        ImageView group5 = (ImageView) findViewById(R.id.group_5);
        ImageView group6 = (ImageView) findViewById(R.id.group_6);
        ImageView group7 = (ImageView) findViewById(R.id.group_7);
        ImageView group8 = (ImageView) findViewById(R.id.group_8);
        ImageView group9 = (ImageView) findViewById(R.id.group_9);
        ImageView group10 = (ImageView) findViewById(R.id.group_10);
        ImageView group11 = (ImageView) findViewById(R.id.group_11);

        if (group1 != null) {
            group1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent top80 = new Intent(PlaylistActivity.this, SongActivity.class);
                    startActivity(top80);
                }
            });
        }

        if (group2 != null) {
            group2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent top80 = new Intent(PlaylistActivity.this, SongActivity.class);
                    startActivity(top80);
                }
            });
        }

        if (group3 != null) {
            group3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent top80 = new Intent(PlaylistActivity.this, SongActivity.class);
                    startActivity(top80);
                }
            });
        }

        if (group4 != null) {
            group4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent top80 = new Intent(PlaylistActivity.this, SongActivity.class);
                    startActivity(top80);
                }
            });
        }

        if (group5 != null) {
            group5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent top90 = new Intent(PlaylistActivity.this, SongActivity.class);
                    startActivity(top90);
                }
            });
        }

        if (group6 != null) {
            group6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent top90 = new Intent(PlaylistActivity.this, SongActivity.class);
                    startActivity(top90);
                }
            });
        }
        if (group7 != null) {
            group7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent top90 = new Intent(PlaylistActivity.this, SongActivity.class);
                    startActivity(top90);
                }
            });
        }

        if (group8 != null) {
            group8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent top90 = new Intent(PlaylistActivity.this, SongActivity.class);
                    startActivity(top90);
                }
            });
        }

        if (group9 != null) {
            group9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent chill = new Intent(PlaylistActivity.this, SongActivity.class);
                    startActivity(chill);
                }
            });
        }

        if (group10 != null) {
            group10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent chill = new Intent(PlaylistActivity.this, SongActivity.class);
                    startActivity(chill);
                }
            });
        }

        if (group11 != null) {
            group11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent chill = new Intent(PlaylistActivity.this, SongActivity.class);
                    startActivity(chill);
                }
            });
        }

    }
}
