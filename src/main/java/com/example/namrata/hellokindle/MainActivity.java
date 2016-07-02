package com.example.namrata.hellokindle;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.nfc.Tag;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class  MainActivity extends Activity {
    Button button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        //Log.v(Tag, "Initializing sounds...");

        AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 20, 0);
        final MediaPlayer mp = MediaPlayer.create(this,R.raw.musicbox);
       // playMusic(View view);

        //Button play_button = (Button)this.findViewById(R.id.realbutton);
        //play_button.setOnClickListener(new View.OnClickListener() {
           // public void onClick(View v) {
               // Log.v(TAG, "Playing sound...");

         //   }
       // });

        // Locate the button in activity_main.xml
        button = (Button) findViewById(R.id.realbutton);

        // Capture button clicks
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {
                mp.start();

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        NewActivity.class);
                startActivity(myIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

  /*  public void playMusic(View view) {
        mp.start();
    } */
}