package com.example.navoiynoma;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class Lison extends Activity {
    private Animation animation1;
    private Button back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lison);
        back1 = findViewById(R.id.back);
        animation1 = AnimationUtils.loadAnimation(this,R.anim.animatsiya_bir);
    }

    public void LisonOnclick(View view) {
        switch (view.getId()) {
            case R.id.back:
                startActivity(new Intent(Lison.this, MainActivity.class));
                break;
            case R.id.button1:
                Intent intent1 = new Intent(Lison.this, Lison_matn.class);
                intent1.putExtra("button", "button1");
                startActivity(intent1);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(Lison.this, Lison_matn.class);
                intent2.putExtra("button", "button2");
                startActivity(intent2);
                break;
            case R.id.button3:
                Intent intent3 = new Intent(Lison.this, Lison_matn.class);
                intent3.putExtra("button", "button3");
                startActivity(intent3);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(Lison.this, Lison_matn.class);
                intent4.putExtra("button", "button4");
                startActivity(intent4);
                break;
            case R.id.button5:
                Intent intent5 = new Intent(Lison.this, Lison_matn.class);
                intent5.putExtra("button", "button5");
                startActivity(intent5);
                break;
            case R.id.button6:
                Intent intent6 = new Intent(Lison.this, Lison_matn.class);
                intent6.putExtra("button", "button6");
                startActivity(intent6);
                break;
            case R.id.button7:
                Intent intent7 = new Intent(Lison.this, Lison_matn.class);
                intent7.putExtra("button", "button7");
                startActivity(intent7);
                break;
            case R.id.button8:
                Intent intent8 = new Intent(Lison.this, Lison_matn.class);
                intent8.putExtra("button", "button8");
                startActivity(intent8);
                break;
            case R.id.button9:
                Intent intent9 = new Intent(Lison.this, Lison_matn.class);
                intent9.putExtra("button", "button9");
                startActivity(intent9);
                break;
            case R.id.button10:
                Intent intent10 = new Intent(Lison.this, Lison_matn.class);
                intent10.putExtra("button", "button10");
                startActivity(intent10);
                break;
            case R.id.button11:
                Intent intent11 = new Intent(Lison.this, Lison_matn.class);
                intent11.putExtra("button", "button11");
                startActivity(intent11);
                break;
            case R.id.button12:
                Intent intent12 = new Intent(Lison.this, Lison_matn.class);
                intent12.putExtra("button", "button12");
                startActivity(intent12);
                break;
        }

    }

}