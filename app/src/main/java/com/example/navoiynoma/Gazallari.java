package com.example.navoiynoma;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class Gazallari extends Activity {
    private Animation animation1;
    private Button back1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gazallari);
        back1 = findViewById(R.id.back);
        animation1 = AnimationUtils.loadAnimation(this,R.anim.animatsiya_bir);
    }

    @SuppressLint("NonConstantResourceId")
    public void GazalOnclick(View v) {
        switch (v.getId()){
            case R.id.back:
                startActivity(new Intent(Gazallari.this,MainActivity.class));break;
            case R.id.button1:
                Intent fayl1 = new Intent(Gazallari.this,gazal.class);
                fayl1.putExtra("Title","button1");
                startActivity(fayl1);break;
            case R.id.button2:
                Intent fayl2= new Intent(Gazallari.this,gazal.class);
                fayl2.putExtra("Title","button2");
                startActivity(fayl2);break;
            case R.id.button3:
                Intent fayl3 = new Intent(Gazallari.this,gazal.class);
                fayl3.putExtra("Title","button3");
                startActivity(fayl3);break;
            case R.id.button4:
                Intent fayl4 = new Intent(Gazallari.this,gazal.class);
                fayl4.putExtra("Title","button4");
                startActivity(fayl4);break;
            case R.id.button5:
                Intent fayl5 = new Intent(Gazallari.this,gazal.class);
                fayl5.putExtra("Title","button5");
                startActivity(fayl5);break;
            case R.id.button6:
                Intent fayl6 = new Intent(Gazallari.this,gazal.class);
                fayl6.putExtra("Title","button6");
                startActivity(fayl6);break;
            case R.id.button8:
                Intent fayl8 = new Intent(Gazallari.this,gazal.class);
                fayl8.putExtra("Title","button8");
                startActivity(fayl8);break;
            case R.id.button9:
                Intent fayl9 = new Intent(Gazallari.this,gazal.class);
                fayl9.putExtra("Title","button9");
                startActivity(fayl9);break;
            case R.id.button11:
                Intent fayl11 = new Intent(Gazallari.this,gazal.class);
                fayl11.putExtra("Title","button11");
                startActivity(fayl11);break;
            case R.id.button12:
                Intent fayl12 = new Intent(Gazallari.this,gazal.class);
                fayl12.putExtra("Title","button12");
                startActivity(fayl12);break;
        }
    }

}