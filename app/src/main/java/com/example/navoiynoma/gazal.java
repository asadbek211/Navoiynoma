package com.example.navoiynoma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class gazal extends Activity {
    private TextView gazal_matni;
    private Animation animation1;
    private Button ortga1;
    Boolean aniqla = false;
    String intent;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gazal);
        ortga1 = findViewById(R.id.ortga);
        animation1 = AnimationUtils.loadAnimation(this, R.anim.animatsiya_bir);
        gazal_matni = findViewById(R.id.gazal_matni);
        intent = getIntent().getStringExtra("Title");
        ortga1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer==null){
                    startActivity(new Intent(gazal.this,Gazallari.class));

                }else {
                    mediaPlayer.stop();
                    startActivity(new Intent(gazal.this,Gazallari.class));
                }
            }
        });
        switch (intent) {
            case "button1":
                gazal_matni.setText(R.string.qaro);

                break;
            case "button2":
                gazal_matni.setText(R.string.orazin);
                break;
            case "button3":
                gazal_matni.setText(R.string.hayratlar);
                break;
            case "button4":
                gazal_matni.setText(R.string.vafokim);
                break;
            case "button5":
                gazal_matni.setText(R.string.oshiq);
                break;
            case "button6":
                gazal_matni.setText(R.string.istadim);
                break;
            case "button8":
                gazal_matni.setText(R.string.men_istagan);
                break;
            case "button9":
                gazal_matni.setText(R.string.kecha_kelgum);
                break;
            case "button11":
                gazal_matni.setText(R.string.xilatin_aylamish);
                break;
            case "button12":
                gazal_matni.setText(R.string.istangiz);
                break;
        }
    }

    public void gazalOnclick(View v) {
        if (v.getId() == R.id.qoshiq) {
            switch (intent) {
                case "button1":
                    if (mediaPlayer == null) {
                        mediaPlayer = MediaPlayer.create(this, R.raw.qora_kozim);
                    }
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();

                    } else {
                        mediaPlayer.start();

                    }
                    break;
                case "button2":
                    if (mediaPlayer == null) {
                        mediaPlayer = MediaPlayer.create(this, R.raw.orazin_yopqach);
                    }
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                    } else {
                        mediaPlayer.start();
                    }
                    break;
                case "button3":
                    if (mediaPlayer == null) {
                        mediaPlayer = MediaPlayer.create(this, R.raw.on_sakkiz_ming_olam);
                    }
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                    } else {
                        mediaPlayer.start();
                    }
                    break;
                case "button4":
                    if (mediaPlayer == null) {
                        mediaPlayer = MediaPlayer.create(this, R.raw.vafokim);
                    }
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                    } else {
                        mediaPlayer.start();
                    }
                    break;
                case "button5":
                    if (mediaPlayer == null) {
                        mediaPlayer = MediaPlayer.create(this, R.raw.oshiq_oldim);
                    }
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                    } else {
                        mediaPlayer.start();
                    }
                    break;
                case "button6":
                    if (mediaPlayer == null) {
                        mediaPlayer = MediaPlayer.create(this, R.raw.qon_yutub);
                    }
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                    } else {
                        mediaPlayer.start();
                    }
                    break;
                case "button8":
                    if (mediaPlayer == null) {
                        mediaPlayer = MediaPlayer.create(this, R.raw.meni_men_istagan);
                    }
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                    } else {
                        mediaPlayer.start();
                    }
                    break;
                case "button9":
                    if (mediaPlayer == null) {
                        mediaPlayer = MediaPlayer.create(this, R.raw.kecha_kelgum);
                    }
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                    } else {
                        mediaPlayer.start();
                    }
                    break;
                case "button11":
                    if (mediaPlayer == null) {
                        mediaPlayer = MediaPlayer.create(this, R.raw.xilatin);
                    }
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                    } else {
                        mediaPlayer.start();
                    }
                    break;
                case "button12":
                    if (mediaPlayer == null) {
                        mediaPlayer = MediaPlayer.create(this, R.raw.istangiz);
                    }
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.pause();
                    } else {
                        mediaPlayer.start();
                    }
                    break;
            }
        }
    }

    @Override
    public void onBackPressed() {
        if (mediaPlayer==null){
            startActivity(new Intent(gazal.this,Gazallari.class));

        }else {
            mediaPlayer.stop();
            startActivity(new Intent(gazal.this,Gazallari.class));
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        if (mediaPlayer!=null) {
            mediaPlayer.stop();}
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}