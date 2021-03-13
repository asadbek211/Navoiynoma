package com.example.navoiynoma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class Hayoti extends Activity {
    private Animation animation1;
    private Button back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayoti);
        back1 = findViewById(R.id.back);
        animation1 = AnimationUtils.loadAnimation(this,R.anim.animatsiya_bir);
    }

    public void HayotiOnclick(View v) {
        switch (v.getId()){
            case R.id.back:
                startActivity(new Intent(Hayoti.this,MainActivity.class));
        }
    }


}