package com.example.navoiynoma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Lison_matn extends Activity {
private String intent;
    private Animation animation1;
    private Button back1;
private ImageButton orqaga,oldinga;
private TextView matn,bet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lison_matn);
        back1 = findViewById(R.id.back);
        animation1 = AnimationUtils.loadAnimation(this,R.anim.animatsiya_bir);
        matn = findViewById(R.id.doston_matni1);
        bet = findViewById(R.id.bet_soni);
        orqaga = findViewById(R.id.oldingi);
        oldinga = findViewById(R.id.keyingi);
        intent = getIntent().getStringExtra("button");
        switch (intent){
            case "button1":
                matn.setText(R.string.lison);
                orqaga.setEnabled(false);
                orqaga.setBackgroundResource(R.drawable.shape_knopka4);
                bet.setText(R.string.qism1);
                break;
            case "button2":
                matn.setText(R.string.lison2);
                bet.setText(R.string.qism2);
                orqaga.setEnabled(true);
                break;
            case "button3":
                matn.setText(R.string.lison3);
                bet.setText(R.string.qism3);
                orqaga.setEnabled(true);
                break;
            case "button4":
                matn.setText(R.string.lison4);
                bet.setText(R.string.qism4);
                orqaga.setEnabled(true);
                break;
            case "button5":
                matn.setText(R.string.lison5);
                bet.setText(R.string.qism5);
                orqaga.setEnabled(true);
                break;
            case "button6":
                matn.setText(R.string.lison6);
                bet.setText(R.string.qism6);
                orqaga.setEnabled(true);
                break;
            case "button7":
                matn.setText(R.string.lison7);
                bet.setText(R.string.qism7);
                orqaga.setEnabled(true);
                break;
            case "button8":
                matn.setText(R.string.lison8);
                bet.setText(R.string.qism8);
                orqaga.setEnabled(true);
                break;
            case "button9":
                matn.setText(R.string.lison9);
                bet.setText(R.string.qism9);
                orqaga.setEnabled(true);
                break;
            case "button10":
                matn.setText(R.string.lison10);
                bet.setText(R.string.qism10);
                orqaga.setEnabled(true);
                break;
            case "button11":
                matn.setText(R.string.lison11);
                bet.setText(R.string.qism11);
                orqaga.setEnabled(true);
                break;
            case "button12":
                matn.setText(R.string.lison12);
                bet.setText(R.string.qism12);
                oldinga.setEnabled(true);
                orqaga.setEnabled(true);
                oldinga.setBackgroundResource(R.drawable.shape_knopka4);
                break;
        }
    }

    public void Lison_matnOnclick(View view) {
        switch (view.getId()){
            case R.id.oldingi:
                switch (bet.getText().toString()){
                    case "1-qism": break;
                    case "2-qism":
                        matn.setText(R.string.lison);
                        bet.setText(R.string.qism1);
                        orqaga.setEnabled(false);
                        orqaga.setBackgroundResource(R.drawable.shape_knopka4);break;
                    case "3-qism":
                        matn.setText(R.string.lison2);
                        bet.setText(R.string.qism2); break;
                    case "4-qism":
                        matn.setText(R.string.lison3);
                        bet.setText(R.string.qism3);break;
                    case "5-qism":
                        matn.setText(R.string.lison4);
                        bet.setText(R.string.qism4);break;
                    case "6-qism":
                        matn.setText(R.string.lison5);
                        bet.setText(R.string.qism5);break;
                    case "7-qism":
                        matn.setText(R.string.lison6);
                        bet.setText(R.string.qism6);break;
                    case "8-qism":
                        matn.setText(R.string.lison7);
                        bet.setText(R.string.qism7);break;
                    case "9-qism":
                        matn.setText(R.string.lison8);
                        bet.setText(R.string.qism8);break;
                    case "10-qism":
                        matn.setText(R.string.lison9);
                        bet.setText(R.string.qism9);break;
                    case "11-qism":
                        matn.setText(R.string.lison10);
                        bet.setText(R.string.qism10);
                        break;
                    case "12-qism":
                        matn.setText(R.string.lison11);
                        bet.setText(R.string.qism11);
                        oldinga.setEnabled(true);
                        oldinga.setBackgroundResource(R.drawable.shape_knopka3);break;


                }break;
            case R.id.keyingi:
                switch (bet.getText().toString()){
                    case "1-qism":
                        matn.setText(R.string.lison2);
                        bet.setText(R.string.qism2);
                        orqaga.setEnabled(true);
                        orqaga.setBackgroundResource(R.drawable.shape_knopka3);break;
                    case "2-qism":
                        matn.setText(R.string.lison3);
                        bet.setText(R.string.qism3);
                        break;
                    case "3-qism":
                        matn.setText(R.string.lison4);
                        bet.setText(R.string.qism4);break;
                    case "4-qism":
                        matn.setText(R.string.lison5);
                        bet.setText(R.string.qism5);break;
                    case "5-qism":
                        matn.setText(R.string.lison6);
                        bet.setText(R.string.qism6);break;
                    case "6-qism":
                        matn.setText(R.string.lison7);
                        bet.setText(R.string.qism7);break;
                    case "7-qism":
                        matn.setText(R.string.lison8);
                        bet.setText(R.string.qism8);break;
                    case "8-qism":
                        matn.setText(R.string.lison9);
                        bet.setText(R.string.qism9);break;
                    case "9-qism":
                        matn.setText(R.string.lison10);
                        bet.setText(R.string.qism10);
                        break;
                    case "10-qism":
                        matn.setText(R.string.lison11);
                        bet.setText(R.string.qism11);
                        break;
                    case "11-qism":
                        matn.setText(R.string.lison12);
                        bet.setText(R.string.qism12);
                        oldinga.setEnabled(false);
                        oldinga.setBackgroundResource(R.drawable.shape_knopka4);
                        break;
                    case "12-qism":break;


                }break;
            case R.id.back:
                startActivity(new Intent(Lison_matn.this,Lison.class));break;
        }
    }

}