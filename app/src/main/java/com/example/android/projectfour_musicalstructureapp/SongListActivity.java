package com.example.android.projectfour_musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_list);

        TextView songlist1 = (TextView) findViewById(R.id.playlist_first);
        TextView songlist2 = (TextView) findViewById(R.id.playlist_second);
        TextView songlist3 = (TextView) findViewById(R.id.playlist_third);
        TextView songlist4 = (TextView) findViewById(R.id.playlist_fourth);
        TextView songlist5 = (TextView) findViewById(R.id.playlist_fifth);
        if (songlist1 != null) {
            songlist1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent songlistIntent = new Intent(SongListActivity.this, SongActivity.class);
                    startActivity(songlistIntent);
                }
            });
        }

        if (songlist2 != null) {
            songlist2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent songlistIntent = new Intent(SongListActivity.this, SongActivity.class);
                    startActivity(songlistIntent);
                }
            });
        }

        if (songlist3 != null) {
            songlist3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent songlistIntent = new Intent(SongListActivity.this, SongActivity.class);
                    startActivity(songlistIntent);
                }
            });
        }

        if (songlist4 != null) {
            songlist4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent songlistIntent = new Intent(SongListActivity.this, SongActivity.class);
                    startActivity(songlistIntent);
                }
            });
        }

        if (songlist5 != null) {
            songlist5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent songlistIntent = new Intent(SongListActivity.this, SongActivity.class);
                    startActivity(songlistIntent);
                }
            });
        }
    }
}
