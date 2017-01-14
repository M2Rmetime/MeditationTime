package com.meditation.metime;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;
import android.widget.ToggleButton;

import com.john.waveview.WaveView;


public class Music extends BaseActivityWithDrawer {

    // enables drawer
    @Override
    public boolean shouldEnableDrawer() {
        return true;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // sets the progress layout to the BaseActivityWithDrawer
        LayoutInflater.from(this).inflate(R.layout.activity_music, getFrame());

        // title 1
        RelativeLayoutButton m1_btn = new RelativeLayoutButton(this,R.id.M1_btn);
        m1_btn.setText(R.id.button_text, getResources().getText(R.string.title_1));
        m1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), darbari.class);
                startActivity(intent);
            }
        });

        // title 2
        RelativeLayoutButton m2_btn = new RelativeLayoutButton(this,R.id.M2_btn);
        m2_btn.setText(R.id.button_text, getResources().getText(R.string.title_2));
        m2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), jaijaivanti.class);
                startActivity(intent);
            }
        });

        // title 3
        RelativeLayoutButton m3_btn = new RelativeLayoutButton(this,R.id.M3_btn);
        m3_btn.setText(R.id.button_text, getResources().getText(R.string.title_3));
        m3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), freeforever.class);
                startActivity(intent);
            }
        });

        // title 4
        RelativeLayoutButton m4_btn = new RelativeLayoutButton(this,R.id.M4_btn);
        m4_btn.setText(R.id.button_text, getResources().getText(R.string.title_4));
        m4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), hiddenwings.class);
                startActivity(intent);
            }
        });

        // title 5
        RelativeLayoutButton m5_btn = new RelativeLayoutButton(this,R.id.M5_btn);
        m5_btn.setText(R.id.button_text, getResources().getText(R.string.title_5));
        m5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), highernature1.class);
                startActivity(intent);
            }
        });

        // title 6
        RelativeLayoutButton m6_btn = new RelativeLayoutButton(this,R.id.M6_btn);
        m6_btn.setText(R.id.button_text, getResources().getText(R.string.title_6));
        m6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), highernature2.class);
                startActivity(intent);
            }
        });

        // title 7
        RelativeLayoutButton m7_btn = new RelativeLayoutButton(this,R.id.M7_btn);
        m7_btn.setText(R.id.button_text, getResources().getText(R.string.title_7));
        m7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), innocencebeyond.class);
                startActivity(intent);
            }
        });

        // title 8
        RelativeLayoutButton m8_btn = new RelativeLayoutButton(this,R.id.M8_btn);
        m8_btn.setText(R.id.button_text, getResources().getText(R.string.title_8));
        m8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), origintruth1.class);
                startActivity(intent);
            }
        });

        // title 9
        RelativeLayoutButton m9_btn = new RelativeLayoutButton(this,R.id.M9_btn);
        m9_btn.setText(R.id.button_text, getResources().getText(R.string.title_9));
        m9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), origintruth2.class);
                startActivity(intent);
            }
        });
    }

}