package com.example.android.projectfour_musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LinearLayout playing = (LinearLayout) findViewById(R.id.now_playing_layout);
        LinearLayout playlist = (LinearLayout) findViewById(R.id.playlist_layout);
        LinearLayout stream = (LinearLayout) findViewById(R.id.stream_layout);
        LinearLayout favorite_songs = (LinearLayout) findViewById(R.id.favorite_songs_layout);
        TextView playing2 = (TextView) findViewById(R.id.bottom_player_text);


        if (playing != null) {
            playing.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent playingNow = new Intent(MainActivity.this, SongActivity.class);
                    startActivity(playingNow);
                }
            });
        }

        if (playlist != null) {
            playlist.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent playlist = new Intent(MainActivity.this, PlaylistActivity.class);
                    startActivity(playlist);
                }
            });
        }

        if (stream != null) {
            stream.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent stream = new Intent(MainActivity.this, Stream.class);
                    startActivity(stream);
                }
            });
        }

        if (favorite_songs != null) {
            favorite_songs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent favoriteSongs = new Intent(MainActivity.this, SongListActivity.class);
                    startActivity(favoriteSongs);
                }
            });
        }
        if (playing2 != null) {
            playing2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent playingNow = new Intent(MainActivity.this, SongActivity.class);
                    startActivity(playingNow);
                }
            });
        }

    }
}
